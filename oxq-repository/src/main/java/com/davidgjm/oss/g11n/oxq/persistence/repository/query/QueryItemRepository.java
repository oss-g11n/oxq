package com.davidgjm.oss.g11n.oxq.persistence.repository.query;

import com.davidgjm.oss.g11n.oxq.domain.model.QueryItem;
import com.davidgjm.oss.g11n.oxq.domain.model.QueryItemType;
import com.davidgjm.oss.g11n.oxq.persistence.repository.support.BaseRepository;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by david on 2017/2/23.
 */
public interface QueryItemRepository extends BaseRepository<QueryItem> {
    /**
     * Finds all query items with the given item type.
     * @param itemType The item type to be searched
     * @return A list of query items matching the specified type.
     */
    List<QueryItem> findByItemType(@NotNull @Valid QueryItemType itemType);
}
