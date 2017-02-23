package com.davidgjm.oss.g11n.oxq.domain.support;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by david on 2017/2/22.
 */
@MappedSuperclass
public abstract class BaseNamedEntity extends BaseDescriptionEntity {

    @NotBlank
    @Length(min = 1, max = 255)
    @Column(length = 255)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
