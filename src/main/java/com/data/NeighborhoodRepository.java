package com.data;

import com.domain.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */
@Repository
public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {

    public Neighborhood getByName(String name);


}
