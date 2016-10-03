package com.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */
@Entity
@Table(name = "kennel")
public class Kennel {

    @Id
    @Column(name = "kennel_id")
    private Long kennelId;

    private String name;

    public Long getKennelId() {
        return kennelId;
    }

    public void setKennelId(Long kennelId) {
        this.kennelId = kennelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
