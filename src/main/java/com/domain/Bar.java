package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Porn Again Christian PRATH3 on 9/27/2016.
 */
@Entity
@Table(name = "bar")
public class Bar {

    @Column(name = "bar_id")
    @Id
    private Long barId;

    private String name;

    public Long getBarId() {
        return barId;
    }

    public void setBarId(Long barId) {
        this.barId = barId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "barId=" + barId +
                ", name='" + name + '\'' +
                '}';
    }
}
