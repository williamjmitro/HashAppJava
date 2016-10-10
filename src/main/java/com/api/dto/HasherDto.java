package com.api.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Porn Again Christian PRATH3 on 10/10/2016.
 */
@XmlRootElement
@XmlType
public class HasherDto {

    private Long hasherId;

    private String hashName;

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
