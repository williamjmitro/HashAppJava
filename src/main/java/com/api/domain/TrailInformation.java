package com.api.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */
@Entity
@Table(name = "trail_information")
public class TrailInformation {

    @Id
    @Column(name = "trail_number")
    private Long trailNumber;

    @Column(name =  "trail_description")
    private String trailDescription;

    private Date date;

    @Column(name = "off_week")
    private Boolean offWeek;

    @OneToOne
    @JoinColumn(name = "neighborhood_id", referencedColumnName = "neighborhood_id")
    private Neighborhood neighborhood;

    @OneToOne
    @JoinColumn(name = "bar_id", referencedColumnName = "bar_id")
    private Bar bar;

    @Column(name = "total_on_trail")
    private Long totalOnTrail;

    @Column(name = "total_paid")
    private Long totalPaid;

    public Long getTrailNumber() {
        return trailNumber;
    }

    public void setTrailNumber(Long trailNumber) {
        this.trailNumber = trailNumber;
    }

    public String getTrailDescription() {
        return trailDescription;
    }

    public void setTrailDescription(String trailDescription) {
        this.trailDescription = trailDescription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getOffWeek() {
        return offWeek;
    }

    public void setOffWeek(Boolean offWeek) {
        this.offWeek = offWeek;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Long getTotalOnTrail() {
        return totalOnTrail;
    }

    public void setTotalOnTrail(Long totalOnTrail) {
        this.totalOnTrail = totalOnTrail;
    }

    public Long getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Long totalPaid) {
        this.totalPaid = totalPaid;
    }
}
