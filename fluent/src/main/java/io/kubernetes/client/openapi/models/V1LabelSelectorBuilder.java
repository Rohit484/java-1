package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1LabelSelectorBuilder extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LabelSelector,io.kubernetes.client.openapi.models.V1LabelSelectorBuilder> {

    io.kubernetes.client.openapi.models.V1LabelSelectorFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1LabelSelectorBuilder() {
        this(true);
    }

    public V1LabelSelectorBuilder(java.lang.Boolean validationEnabled) {
        this(new V1LabelSelector(), validationEnabled);
    }

    public V1LabelSelectorBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorFluent<?> fluent) {
        this(fluent, true);
    }

    public V1LabelSelectorBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1LabelSelector(), validationEnabled);
    }

    public V1LabelSelectorBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1LabelSelector instance) {
        this(fluent, instance, true);
    }

    public V1LabelSelectorBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1LabelSelector instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMatchExpressions(instance.getMatchExpressions());
        
        fluent.withMatchLabels(instance.getMatchLabels());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1LabelSelectorBuilder(io.kubernetes.client.openapi.models.V1LabelSelector instance) {
        this(instance,true);
    }

    public V1LabelSelectorBuilder(io.kubernetes.client.openapi.models.V1LabelSelector instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMatchExpressions(instance.getMatchExpressions());
        
        this.withMatchLabels(instance.getMatchLabels());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1LabelSelector build() {
        V1LabelSelector buildable = new V1LabelSelector();
        buildable.setMatchExpressions(fluent.getMatchExpressions());
        buildable.setMatchLabels(fluent.getMatchLabels());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1LabelSelectorBuilder that = (V1LabelSelectorBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
