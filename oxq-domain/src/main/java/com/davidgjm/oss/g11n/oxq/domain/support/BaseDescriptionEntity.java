package com.davidgjm.oss.g11n.oxq.domain.support;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by david on 2017/2/22.
 */
@MappedSuperclass
public abstract class BaseDescriptionEntity extends BaseTimestampedEntity{
    @Length(max = 255)
    @Column(length = 255)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
