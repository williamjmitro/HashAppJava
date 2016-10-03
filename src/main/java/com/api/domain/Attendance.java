package com.api.domain;

import javax.persistence.*;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */
@IdClass(AttendanceId.class)
@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @Column(name = "trail_number")
    private Long trailNumber;

    @Id
    @Column(name = "hasher_id")
    private Long hasherId;

    public Long getTrailNumber() {
        return trailNumber;
    }

    public void setTrailNumber(Long trailNumber) {
        this.trailNumber = trailNumber;
    }

    public Long getHasherId() {
        return hasherId;
    }

    public void setHasherId(Long hasherId) {
        this.hasherId = hasherId;
    }
}
