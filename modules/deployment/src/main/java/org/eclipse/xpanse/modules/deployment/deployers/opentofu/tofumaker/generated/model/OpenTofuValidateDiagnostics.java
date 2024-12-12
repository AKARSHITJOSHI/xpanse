/*
 * Tofu-Maker API
 * RESTful Services to interact with Tofu-Maker runtime
 *
 * The version of the OpenAPI document: 1.0.10-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.eclipse.xpanse.modules.deployment.deployers.opentofu.tofumaker.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** List of validation errors. */
@JsonPropertyOrder({OpenTofuValidateDiagnostics.JSON_PROPERTY_DETAIL})
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator " + "version: 7.10.0")
public class OpenTofuValidateDiagnostics {
    public static final String JSON_PROPERTY_DETAIL = "detail";
    @jakarta.annotation.Nullable private String detail;

    public OpenTofuValidateDiagnostics() {}

    public OpenTofuValidateDiagnostics detail(@jakarta.annotation.Nullable String detail) {

        this.detail = detail;
        return this;
    }

    /**
     * Detail of validation error.
     *
     * @return detail
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDetail() {
        return detail;
    }

    @JsonProperty(JSON_PROPERTY_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDetail(@jakarta.annotation.Nullable String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenTofuValidateDiagnostics openTofuValidateDiagnostics = (OpenTofuValidateDiagnostics) o;
        return Objects.equals(this.detail, openTofuValidateDiagnostics.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenTofuValidateDiagnostics {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
