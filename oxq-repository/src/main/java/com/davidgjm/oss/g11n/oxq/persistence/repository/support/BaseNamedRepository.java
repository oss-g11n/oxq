package com.davidgjm.oss.g11n.oxq.persistence.repository.support;

import com.davidgjm.oss.g11n.oxq.domain.support.BaseNamedEntity;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Optional;

/**
 * Created by david on 2017/2/23.
 */
public interface BaseNamedRepository<T extends BaseNamedEntity> extends BaseRepository <T>{

    /**
     * Finds the entity by name by ignoring case.
     * @param name The name to be searched
     * @return The entity matching the name. Empty optional will be returned if not found.
     */
    Optional<T> findByNameIgnoreCase(@NotNull @NotBlank String name);

    default Optional<T> findByName(@NotNull @NotBlank String name) {
        return findByNameIgnoreCase(name);
    }
}
