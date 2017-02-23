package com.davidgjm.oss.g11n.oxq.domain.model;

import com.davidgjm.oss.g11n.oxq.domain.support.BaseAuditEntity;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.Valid;

/**
 * Created by david on 2017/2/22.
 */
@Entity
@Table(
        indexes = {
              @Index(name = "idx_summary", columnList = "summary"),
              @Index(name = "idx_description", columnList = "description"),
              @Index(name = "idx_excerpt", columnList = "excerpt"),
        }
)
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

    @Valid
    @OneToOne
    @JoinColumn(name = "status_id", nullable = false)
    private QueryStatus status;

    @Valid
    @OneToOne
    @JoinColumn(name = "type_id", nullable = false)
    private QueryItemType itemType;

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

    public QueryItemType getItemType() {
        return itemType;
    }

    public void setItemType(QueryItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QueryItem queryItem = (QueryItem) o;

        if (!getSummary().equals(queryItem.getSummary())) return false;
        if (getDescription() != null ? !getDescription().equals(queryItem.getDescription()) : queryItem.getDescription() != null)
            return false;
        if (getExcerpt() != null ? !getExcerpt().equals(queryItem.getExcerpt()) : queryItem.getExcerpt() != null)
            return false;
        if (!getStatus().equals(queryItem.getStatus())) return false;
        return getItemType().equals(queryItem.getItemType());
    }

    @Override
    public int hashCode() {
        int result = getSummary().hashCode();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getExcerpt() != null ? getExcerpt().hashCode() : 0);
        result = 31 * result + getStatus().hashCode();
        result = 31 * result + getItemType().hashCode();
        return result;
    }
}
