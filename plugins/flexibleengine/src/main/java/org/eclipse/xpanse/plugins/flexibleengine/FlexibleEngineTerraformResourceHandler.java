/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 *
 */

package org.eclipse.xpanse.plugins.flexibleengine;

import static org.eclipse.xpanse.modules.deployment.deployers.terraform.TerraformDeployment.STATE_FILE_NAME;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.resource.TfOutput;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.resource.TfState;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.resource.TfStateResource;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.resource.TfStateResourceInstance;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.utils.TfResourceTransUtils;
import org.eclipse.xpanse.modules.models.service.deploy.DeployResource;
import org.eclipse.xpanse.modules.models.service.deploy.DeployResourceProperties;
import org.eclipse.xpanse.modules.models.service.deploy.DeployResult;
import org.eclipse.xpanse.modules.models.service.deploy.exceptions.TerraformExecutorException;
import org.eclipse.xpanse.modules.orchestrator.deployment.DeployResourceHandler;
import org.eclipse.xpanse.plugins.flexibleengine.models.FlexibleEngineTerraformResourceProperties;
import org.springframework.stereotype.Component;

/**
 * Terraform resource handler for FlexibleEngine.
 */
@Component
@Slf4j
public class FlexibleEngineTerraformResourceHandler implements DeployResourceHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Handler of FlexibleEngineCloud for the DeployResult.
     *
     * @param deployResult the result of the deployment.
     */
    @Override
    public void handler(DeployResult deployResult) {
        List<DeployResource> deployResourceList = new ArrayList<>();
        TfState tfState;
        try {
            var stateFile = deployResult.getPrivateProperties().get(STATE_FILE_NAME);
            tfState = objectMapper.readValue(stateFile, TfState.class);
        } catch (IOException ex) {
            log.error("Parse terraform state content failed.");
            throw new TerraformExecutorException("Parse terraform state content failed.", ex);
        }
        if (Objects.nonNull(tfState)) {
            if (Objects.nonNull(tfState.getOutputs()) && !tfState.getOutputs().isEmpty()) {
                for (String outputKey : tfState.getOutputs().keySet()) {
                    TfOutput tfOutput = tfState.getOutputs().get(outputKey);
                    deployResult.getProperties().put(outputKey, tfOutput.getValue());
                }
            }
            Set<String> supportTypes =
                    FlexibleEngineTerraformResourceProperties.getTerraformResourceTypes();
            for (TfStateResource tfStateResource : tfState.getResources()) {
                if (supportTypes.contains(tfStateResource.getType())) {
                    DeployResourceProperties deployResourceProperties =
                            FlexibleEngineTerraformResourceProperties.getDeployResourceProperties(
                                    tfStateResource.getType());
                    if (Objects.nonNull(deployResourceProperties)) {
                        for (TfStateResourceInstance instance : tfStateResource.getInstances()) {
                            DeployResource deployResource = new DeployResource();
                            deployResource.setKind(deployResourceProperties.getResourceKind());
                            TfResourceTransUtils.fillDeployResource(instance, deployResource,
                                    deployResourceProperties.getResourceProperties());
                            deployResourceList.add(deployResource);
                        }
                    }
                }
            }
        }
        deployResult.setResources(deployResourceList);
    }
}
