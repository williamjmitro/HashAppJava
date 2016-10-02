package com.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */

@Entity
@Table(name = "neighborhood")
public class Neighborhood {

    @Id
    @Column(name = "neighborhood_id")
    private Long neighborhoodId;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNeighborhoodId() {
        return neighborhoodId;
    }

    public void setNeighborhoodId(Long neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
    }
}
