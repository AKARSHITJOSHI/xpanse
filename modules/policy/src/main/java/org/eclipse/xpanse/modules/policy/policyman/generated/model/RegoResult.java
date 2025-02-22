/*
 * OpenAPI of policy-man
 * OpenAPI of policy-man server
 *
 * The version of the OpenAPI document: 1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.eclipse.xpanse.modules.policy.policyman.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** RegoResult */
@JsonPropertyOrder({RegoResult.JSON_PROPERTY_BINDINGS, RegoResult.JSON_PROPERTY_EXPRESSIONS})
@JsonTypeName("rego.Result")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegoResult {
    public static final String JSON_PROPERTY_BINDINGS = "bindings";
    private Map<String, Object> bindings = new HashMap<>();

    public static final String JSON_PROPERTY_EXPRESSIONS = "expressions";
    private List<RegoExpressionValue> expressions;

    public RegoResult() {}

    public RegoResult bindings(Map<String, Object> bindings) {

        this.bindings = bindings;
        return this;
    }

    public RegoResult putBindingsItem(String key, Object bindingsItem) {
        if (this.bindings == null) {
            this.bindings = new HashMap<>();
        }
        this.bindings.put(key, bindingsItem);
        return this;
    }

    /**
     * Get bindings
     *
     * @return bindings
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BINDINGS)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, Object> getBindings() {
        return bindings;
    }

    @JsonProperty(JSON_PROPERTY_BINDINGS)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public void setBindings(Map<String, Object> bindings) {
        this.bindings = bindings;
    }

    public RegoResult expressions(List<RegoExpressionValue> expressions) {

        this.expressions = expressions;
        return this;
    }

    public RegoResult addExpressionsItem(RegoExpressionValue expressionsItem) {
        if (this.expressions == null) {
            this.expressions = new ArrayList<>();
        }
        this.expressions.add(expressionsItem);
        return this;
    }

    /**
     * Get expressions
     *
     * @return expressions
     */
    @jakarta.annotation.Nullable
    @Valid
    @JsonProperty(JSON_PROPERTY_EXPRESSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<RegoExpressionValue> getExpressions() {
        return expressions;
    }

    @JsonProperty(JSON_PROPERTY_EXPRESSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExpressions(List<RegoExpressionValue> expressions) {
        this.expressions = expressions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegoResult regoResult = (RegoResult) o;
        return Objects.equals(this.bindings, regoResult.bindings)
                && Objects.equals(this.expressions, regoResult.expressions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindings, expressions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegoResult {\n");
        sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
        sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
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
