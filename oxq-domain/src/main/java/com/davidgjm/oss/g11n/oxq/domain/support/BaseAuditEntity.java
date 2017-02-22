package com.davidgjm.oss.g11n.oxq.domain.support;

/**
 * Created by david on 2017/2/23.
 */
public abstract class BaseAuditEntity extends BaseTimestampedEntity{

    private String createdBy;
    private String updatedBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
