package com.api.service;

import com.api.data.HasherRepository;
import com.api.domain.Hasher;
import com.api.dto.HasherDto;
import com.api.dto.frontend.HashersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Porn Again Christian PRATH3 on 10/3/2016.
 */

@Component
public class HasherServiceImpl implements HasherService {

    @Autowired
    HasherRepository hasherRepository;

    @Override
    public HashersResponse getAllHashers() {
        List<Hasher> results = hasherRepository.findAll();
        List<HasherDto> responseList = new ArrayList<HasherDto>();
        for(Hasher hasher : results){
            responseList.add(mapHasherDto(hasher));
        }
        HashersResponse response = new HashersResponse();
        response.setHasherDtos(responseList);
        return response;
    }

    private HasherDto mapHasherDto(Hasher hasher){
        HasherDto hasherDto = new HasherDto();
        hasherDto.setHasherId(hasher.getHasherId());
        hasherDto.setHashName(hasher.getHashName());
        hasherDto.setNerdFirst(hasher.getNerdFirst());
        hasherDto.setNerdLast(hasher.getNerdLast());
        hasherDto.setAge(hasher.getAge());
        hasherDto.setAnniversary(hasher.getAnniversary());
        hasherDto.setEmailAddress(hasher.getEmailAddress());
        hasherDto.setHaredCount(hasher.getHaredCount());
        hasherDto.setTrailCount(hasher.getTrailCount());
        hasherDto.setKennelName(hasher.getKennel().getName());

        return hasherDto;
    }
}
