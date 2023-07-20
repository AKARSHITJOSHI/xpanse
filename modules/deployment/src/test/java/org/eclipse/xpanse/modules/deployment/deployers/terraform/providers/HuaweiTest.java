/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.modules.deployment.deployers.terraform.providers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.eclipse.xpanse.modules.deployment.deployers.terraform.Provider;
import org.eclipse.xpanse.modules.models.service.common.enums.Csp;
import org.junit.jupiter.api.Test;

/**
 * Test of Huawei.
 */
class HuaweiTest {

    private static Provider huaweiProvider;

    @Test
    void setUp() {
        huaweiProvider = new Huawei();
    }

    @Test
    void testGetProvider() {
        String region = "us-west-2";

        String providerInfo = huaweiProvider.getProvider(">= 1.52.1", region);
        String expectedProviderInfo = """
                terraform {
                  required_providers {
                    huaweicloud = {
                      source = "huaweicloud/huaweicloud"
                      version = ">= 1.52.1"
                    }
                  }
                }
                            
                provider "huaweicloud" {
                  region = "us-west-2"
                }
                """;

        assertEquals(expectedProviderInfo, providerInfo);
    }

    @Test
    void testGetCsp() {
        Csp csp = huaweiProvider.getCsp();

        assertEquals(Csp.HUAWEI, csp);
    }
}
