package com.davidgjm.oss.g11n.oxq.domain.model;

import com.davidgjm.oss.g11n.oxq.domain.support.BaseAuditEntity;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created by david on 2017/2/22.
 */
@Entity
public class QueryItem extends BaseAuditEntity {
    @NotBlank
    @Length(min = 5, max = 255)
    @Column(nullable = false, length = 255)
    private String summary;

    @Length(max = 1024)
    @Column(length = 1024)
    private String description;

    @Length(max = 255)
    @Column(length = 255)
    private String excerpt;

    @OneToOne
    @JoinColumn(name = "status_id", nullable = false)
    private QueryStatus status;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public QueryStatus getStatus() {
        return status;
    }

    public void setStatus(QueryStatus status) {
        this.status = status;
    }
}
