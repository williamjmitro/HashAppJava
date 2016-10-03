package com.api.domain;

import java.io.Serializable;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */

public class AttedanceId implements Serializable {

    private static final long serialVersionUID = 7050712567955042993L;

    public AttedanceId(){
    }

    private Long trailId;

    private Long hasherId;

    @Override
    public int hashCode(){
        return  trailId.hashCode() + hasherId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean same = false;
        if (obj == this) {
            same = true;
        } else if (!(obj instanceof AttedanceId)) {
            same = false;
        } else if (obj != null) {
            AttedanceId pk = (AttedanceId) obj;
            return pk.trailId.equals(trailId) && pk.hasherId.equals(hasherId);
        }
        return same;
    }

}
