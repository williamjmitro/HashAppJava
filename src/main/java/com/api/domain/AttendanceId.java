package com.api.domain;

import java.io.Serializable;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */

public class AttendanceId implements Serializable {

    private static final long serialVersionUID = 7050712567955042993L;

    public AttendanceId(){
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
        } else if (!(obj instanceof AttendanceId)) {
            same = false;
        } else if (obj != null) {
            AttendanceId pk = (AttendanceId) obj;
            return pk.trailNumber.equals(trailNumber) && pk.hasherId.equals(hasherId);
        }
        return same;
    }

}
