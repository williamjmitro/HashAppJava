package com.api.dto.frontend;

import com.api.dto.HasherDto;

import java.util.List;

/**
 * Created by Porn Again Christian PRATH3 on 10/10/2016.
 */
public class HashersResponse {

    List<HasherDto> hasherDtos;

    public List<HasherDto> getHasherDtos() {
        return hasherDtos;
    }

    public void setHasherDtos(List<HasherDto> hasherDtos) {
        this.hasherDtos = hasherDtos;
    }
}
