package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1TokenReviewStatusBuilder extends io.kubernetes.client.openapi.models.V1TokenReviewStatusFluentImpl<io.kubernetes.client.openapi.models.V1TokenReviewStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1TokenReviewStatus,io.kubernetes.client.openapi.models.V1TokenReviewStatusBuilder> {

    io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1TokenReviewStatusBuilder() {
        this(true);
    }

    public V1TokenReviewStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1TokenReviewStatus(), validationEnabled);
    }

    public V1TokenReviewStatusBuilder(io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1TokenReviewStatusBuilder(io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1TokenReviewStatus(), validationEnabled);
    }

    public V1TokenReviewStatusBuilder(io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenReviewStatus instance) {
        this(fluent, instance, true);
    }

    public V1TokenReviewStatusBuilder(io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenReviewStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAudiences(instance.getAudiences());
        
        fluent.withAuthenticated(instance.getAuthenticated());
        
        fluent.withError(instance.getError());
        
        fluent.withUser(instance.getUser());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1TokenReviewStatusBuilder(io.kubernetes.client.openapi.models.V1TokenReviewStatus instance) {
        this(instance,true);
    }

    public V1TokenReviewStatusBuilder(io.kubernetes.client.openapi.models.V1TokenReviewStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAudiences(instance.getAudiences());
        
        this.withAuthenticated(instance.getAuthenticated());
        
        this.withError(instance.getError());
        
        this.withUser(instance.getUser());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1TokenReviewStatus build() {
        V1TokenReviewStatus buildable = new V1TokenReviewStatus();
        buildable.setAudiences(fluent.getAudiences());
        buildable.setAuthenticated(fluent.getAuthenticated());
        buildable.setError(fluent.getError());
        buildable.setUser(fluent.getUser());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1TokenReviewStatusBuilder that = (V1TokenReviewStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
