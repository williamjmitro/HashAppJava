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
            HasherDto hasherDto = new HasherDto();
            hasherDto.setHasherId(hasher.getHasherId());
            hasherDto.setHashName(hasher.getHashName());
            responseList.add(hasherDto);
        }
        HashersResponse response = new HashersResponse();
        response.setHasherDtos(responseList);
        return response;
    }
}
