package com.davidgjm.oss.g11n.oxq.domain.model;

import com.davidgjm.oss.g11n.oxq.domain.support.BaseUniqueNamedEntity;

import javax.persistence.Entity;

/**
 * Created by david on 2017/2/23.
 */
@Entity
public class QueryItemType extends BaseUniqueNamedEntity {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryItemType{");
        sb.append("id='").append(getId()).append('\'');
        sb.append("name='").append(getName()).append('\'');
        sb.append("description='").append(getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
