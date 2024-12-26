/*
 * Terraform-Boot API
 * RESTful Services to interact with Terraform-Boot runtime
 *
 * The version of the OpenAPI document: 1.0.15-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** TerraformAsyncDeployFromDirectoryRequest */
@JsonPropertyOrder({
    TerraformAsyncDeployFromDirectoryRequest.JSON_PROPERTY_REQUEST_ID,
    TerraformAsyncDeployFromDirectoryRequest.JSON_PROPERTY_TERRAFORM_VERSION,
    TerraformAsyncDeployFromDirectoryRequest.JSON_PROPERTY_IS_PLAN_ONLY,
    TerraformAsyncDeployFromDirectoryRequest.JSON_PROPERTY_VARIABLES,
    TerraformAsyncDeployFromDirectoryRequest.JSON_PROPERTY_ENV_VARIABLES,
    TerraformAsyncDeployFromDirectoryRequest.JSON_PROPERTY_WEBHOOK_CONFIG
})
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.10.0")
public class TerraformAsyncDeployFromDirectoryRequest {
    public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
    @jakarta.annotation.Nullable private UUID requestId;

    public static final String JSON_PROPERTY_TERRAFORM_VERSION = "terraformVersion";
    @jakarta.annotation.Nonnull private String terraformVersion;

    public static final String JSON_PROPERTY_IS_PLAN_ONLY = "isPlanOnly";
    @jakarta.annotation.Nonnull private Boolean isPlanOnly;

    public static final String JSON_PROPERTY_VARIABLES = "variables";
    @jakarta.annotation.Nonnull private Map<String, Object> variables = new HashMap<>();

    public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
    @jakarta.annotation.Nullable private Map<String, String> envVariables = new HashMap<>();

    public static final String JSON_PROPERTY_WEBHOOK_CONFIG = "webhookConfig";
    @jakarta.annotation.Nonnull private WebhookConfig webhookConfig;

    public TerraformAsyncDeployFromDirectoryRequest() {}

    public TerraformAsyncDeployFromDirectoryRequest requestId(
            @jakarta.annotation.Nullable UUID requestId) {

        this.requestId = requestId;
        return this;
    }

    /**
     * Id of the request
     *
     * @return requestId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_REQUEST_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getRequestId() {
        return requestId;
    }

    @JsonProperty(JSON_PROPERTY_REQUEST_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRequestId(@jakarta.annotation.Nullable UUID requestId) {
        this.requestId = requestId;
    }

    public TerraformAsyncDeployFromDirectoryRequest terraformVersion(
            @jakarta.annotation.Nonnull String terraformVersion) {

        this.terraformVersion = terraformVersion;
        return this;
    }

    /**
     * The required version of the terraform which will execute the scripts.
     *
     * @return terraformVersion
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TERRAFORM_VERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTerraformVersion() {
        return terraformVersion;
    }

    @JsonProperty(JSON_PROPERTY_TERRAFORM_VERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTerraformVersion(@jakarta.annotation.Nonnull String terraformVersion) {
        this.terraformVersion = terraformVersion;
    }

    public TerraformAsyncDeployFromDirectoryRequest isPlanOnly(
            @jakarta.annotation.Nonnull Boolean isPlanOnly) {

        this.isPlanOnly = isPlanOnly;
        return this;
    }

    /**
     * Flag to control if the deployment must only generate the terraform or it must also apply the
     * changes.
     *
     * @return isPlanOnly
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_PLAN_ONLY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getIsPlanOnly() {
        return isPlanOnly;
    }

    @JsonProperty(JSON_PROPERTY_IS_PLAN_ONLY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsPlanOnly(@jakarta.annotation.Nonnull Boolean isPlanOnly) {
        this.isPlanOnly = isPlanOnly;
    }

    public TerraformAsyncDeployFromDirectoryRequest variables(
            @jakarta.annotation.Nonnull Map<String, Object> variables) {

        this.variables = variables;
        return this;
    }

    public TerraformAsyncDeployFromDirectoryRequest putVariablesItem(
            String key, Object variablesItem) {
        this.variables.put(key, variablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be used to execute the Terraform request.
     *
     * @return variables
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Map<String, Object> getVariables() {
        return variables;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVariables(@jakarta.annotation.Nonnull Map<String, Object> variables) {
        this.variables = variables;
    }

    public TerraformAsyncDeployFromDirectoryRequest envVariables(
            @jakarta.annotation.Nullable Map<String, String> envVariables) {

        this.envVariables = envVariables;
        return this;
    }

    public TerraformAsyncDeployFromDirectoryRequest putEnvVariablesItem(
            String key, String envVariablesItem) {
        if (this.envVariables == null) {
            this.envVariables = new HashMap<>();
        }
        this.envVariables.put(key, envVariablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be injected as environment variables to terraform
     * process.
     *
     * @return envVariables
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ENV_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, String> getEnvVariables() {
        return envVariables;
    }

    @JsonProperty(JSON_PROPERTY_ENV_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnvVariables(@jakarta.annotation.Nullable Map<String, String> envVariables) {
        this.envVariables = envVariables;
    }

    public TerraformAsyncDeployFromDirectoryRequest webhookConfig(
            @jakarta.annotation.Nonnull WebhookConfig webhookConfig) {

        this.webhookConfig = webhookConfig;
        return this;
    }

    /**
     * Get webhookConfig
     *
     * @return webhookConfig
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIG)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public WebhookConfig getWebhookConfig() {
        return webhookConfig;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIG)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setWebhookConfig(@jakarta.annotation.Nonnull WebhookConfig webhookConfig) {
        this.webhookConfig = webhookConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TerraformAsyncDeployFromDirectoryRequest terraformAsyncDeployFromDirectoryRequest =
                (TerraformAsyncDeployFromDirectoryRequest) o;
        return Objects.equals(this.requestId, terraformAsyncDeployFromDirectoryRequest.requestId)
                && Objects.equals(
                        this.terraformVersion,
                        terraformAsyncDeployFromDirectoryRequest.terraformVersion)
                && Objects.equals(
                        this.isPlanOnly, terraformAsyncDeployFromDirectoryRequest.isPlanOnly)
                && Objects.equals(
                        this.variables, terraformAsyncDeployFromDirectoryRequest.variables)
                && Objects.equals(
                        this.envVariables, terraformAsyncDeployFromDirectoryRequest.envVariables)
                && Objects.equals(
                        this.webhookConfig, terraformAsyncDeployFromDirectoryRequest.webhookConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                requestId, terraformVersion, isPlanOnly, variables, envVariables, webhookConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerraformAsyncDeployFromDirectoryRequest {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    terraformVersion: ").append(toIndentedString(terraformVersion)).append("\n");
        sb.append("    isPlanOnly: ").append(toIndentedString(isPlanOnly)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
        sb.append("    webhookConfig: ").append(toIndentedString(webhookConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
