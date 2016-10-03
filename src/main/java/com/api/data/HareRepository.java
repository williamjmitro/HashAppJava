package com.api.data;

import com.api.domain.Hare;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */
public interface HareRepository extends JpaRepository<Hare,Long> {

    public List<Hare> getByTrailNumber(Long trailNumber);
}
