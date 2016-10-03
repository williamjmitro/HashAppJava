package com.api.data;

import com.api.domain.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long> {

    public List<Attendance> getByTrailNumber(Long trailId);
}
