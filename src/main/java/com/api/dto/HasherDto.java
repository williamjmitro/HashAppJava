package com.api.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by Porn Again Christian PRATH3 on 10/10/2016.
 */
@XmlRootElement
@XmlType
public class HasherDto {

    private Long hasherId;

    private String hashName;

    private String nerdFirst;

    private String nerdLast;

    private Date birthday;

    private Date anniversary;

    private String emailAddress;

    private String gender;

    private Long age;

    private Long yearsHashing;

    private KennelDto kennelDto;

    private Long trailCount;

    private Long haredCount;

    public String getNerdFirst() {
        return nerdFirst;
    }

    public void setNerdFirst(String nerdFirst) {
        this.nerdFirst = nerdFirst;
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

    public KennelDto getKennelDto() {
        return kennelDto;
    }

    public void setKennelDto(KennelDto kennelDto) {
        this.kennelDto = kennelDto;
    }

    public Long getTrailCount() {
        return trailCount;
    }

    public void setTrailCount(Long trailCount) {
        this.trailCount = trailCount;
    }

    public Long getHaredCount() {
        return haredCount;
    }

    public void setHaredCount(Long haredCount) {
        this.haredCount = haredCount;
    }



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
}
