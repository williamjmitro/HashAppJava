package com.api.domain;

import java.io.Serializable;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */
public class HareId implements Serializable{


    private static final long serialVersionUID = -8660152866684734399L;

    public HareId(){
    }

    private Long trailNumber;

    private Long hasherId;

    @Override
    public int hashCode(){
        return  trailNumber.hashCode() + hasherId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean same = false;
        if (obj == this) {
            same = true;
        } else if (!(obj instanceof HareId)) {
            same = false;
        } else if (obj != null) {
            HareId pk = (HareId) obj;
            return pk.trailNumber.equals(trailNumber) && pk.hasherId.equals(hasherId);
        }
        return same;
    }
}
