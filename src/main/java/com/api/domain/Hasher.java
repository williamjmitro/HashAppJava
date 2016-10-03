package com.api.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */

@Entity
@Table(name = "hasher")
public class Hasher {

    @Id
    @Column(name = "hasher_id")
    private Long hasherId;

    @Column(name = "hash_name")
    private String hashName;

    @Column(name = "nerd_first")
    private String nerdName;

    @Column(name = "nerd_last")
    private String nerdLast;

    private Date birthday;

    private Date anniversary;

    @Column(name = "email_address")
    private String emailAddress;

    private String gender;

    private Long age;

    @Column(name = "years_hashing")
    private Long yearsHashing;

    @OneToOne
    @JoinColumn(name = "kennel_id", referencedColumnName = "kennel_id")
    private Kennel kennel;

    @Column(name = "trail_count")
    private Long trailCount;

    @Column(name = "hared_count")
    private Long hardCount;

    public Long getHasherId() {
        return hasherId;
    }

    public void setHasherId(Long hasherId) {
        this.hasherId = hasherId;
    }

    public String getHashName() {
        return hashName;
    }

    public void setHashName(String hashName) {
        this.hashName = hashName;
    }

    public String getNerdName() {
        return nerdName;
    }

    public void setNerdName(String nerdName) {
        this.nerdName = nerdName;
    }

    public String getNerdLast() {
        return nerdLast;
    }

    public void setNerdLast(String nerdLast) {
        this.nerdLast = nerdLast;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(Date anniversary) {
        this.anniversary = anniversary;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getYearsHashing() {
        return yearsHashing;
    }

    public void setYearsHashing(Long yearsHashing) {
        this.yearsHashing = yearsHashing;
    }

    public Kennel getKennel() {
        return kennel;
    }

    public void setKennel(Kennel kennel) {
        this.kennel = kennel;
    }

    public Long getTrailCount() {
        return trailCount;
    }

    public void setTrailCount(Long trailCount) {
        this.trailCount = trailCount;
    }

    public Long getHardCount() {
        return hardCount;
    }

    public void setHardCount(Long hardCount) {
        this.hardCount = hardCount;
    }
}
