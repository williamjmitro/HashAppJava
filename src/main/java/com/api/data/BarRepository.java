package com.api.data;

import com.api.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Porn Again Christian PRATH3 on 9/27/2016.
 */

@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {

    public Bar findByName(String name);

}
