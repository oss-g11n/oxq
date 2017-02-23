package com.davidgjm.oss.g11n.oxq.persistence.repository.support;

import com.davidgjm.oss.g11n.oxq.domain.EntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by david on 2017/2/23.
 */

public interface BaseRepository<T extends EntityModel> extends JpaRepository<T, Long>{

}
