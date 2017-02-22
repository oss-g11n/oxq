package com.davidgjm.oss.g11n.oxq.domain.support;

import com.davidgjm.oss.g11n.oxq.domain.EntityModel;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Min;

/**
 * Created by david on 2017/2/22.
 */
@MappedSuperclass
public abstract class BaseEntity implements EntityModel{
    @Min(0)
    private Long id;

    private Boolean enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @PrePersist
    @PreUpdate
    private void onPersist() {
        if (enabled == null) {
            enabled = true;
        }
    }
}
