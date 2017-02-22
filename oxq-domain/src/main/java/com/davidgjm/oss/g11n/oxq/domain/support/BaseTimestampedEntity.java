package com.davidgjm.oss.g11n.oxq.domain.support;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

/**
 * Created by david on 2017/2/22.
 */
@MappedSuperclass
public abstract class BaseTimestampedEntity extends BaseEntity {
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;
    private LocalDateTime updated;

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    @PrePersist
    private void onPersist() {
        if (created == null) {
            created = LocalDateTime.now();
        }
        updated=created;
    }

    @PreUpdate
    private void onUpdate() {
        updated = LocalDateTime.now();
    }
}
