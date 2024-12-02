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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * TerraformBootSystemStatus
 */
@JsonPropertyOrder({
        TerraformBootSystemStatus.JSON_PROPERTY_HEALTH_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator " +
        "version: 7.10.0")
public class TerraformBootSystemStatus {
    /**
     * The health status of Xpanse api service.
     */
    public enum HealthStatusEnum {
        OK(String.valueOf("OK")),

        NOK(String.valueOf("NOK"));

        private String value;

        HealthStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HealthStatusEnum fromValue(String value) {
            for (HealthStatusEnum b : HealthStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_HEALTH_STATUS = "healthStatus";
    @jakarta.annotation.Nonnull
    private HealthStatusEnum healthStatus;

    public TerraformBootSystemStatus() {
    }

    public TerraformBootSystemStatus healthStatus(@jakarta.annotation.Nonnull HealthStatusEnum healthStatus) {

        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * The health status of Xpanse api service.
     *
     * @return healthStatus
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_HEALTH_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public HealthStatusEnum getHealthStatus() {
        return healthStatus;
    }

    @JsonProperty(JSON_PROPERTY_HEALTH_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHealthStatus(@jakarta.annotation.Nonnull HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TerraformBootSystemStatus terraformBootSystemStatus = (TerraformBootSystemStatus) o;
        return Objects.equals(this.healthStatus, terraformBootSystemStatus.healthStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerraformBootSystemStatus {\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

