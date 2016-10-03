package com.api.data;

import com.api.domain.Hasher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */

@Repository
public interface HasherRepository extends JpaRepository<Hasher,Long>{
}
