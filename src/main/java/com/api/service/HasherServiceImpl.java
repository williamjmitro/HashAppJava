package com.api.service;

import com.api.data.HasherRepository;
import com.api.domain.Hasher;
import com.api.dto.HasherDto;
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
    public List<HasherDto> getAllHashers() {
        List<Hasher> results = hasherRepository.findAll();
        List<HasherDto> response = new ArrayList<HasherDto>();
        for(Hasher hasher : results){
            HasherDto hasherDto = new HasherDto();
            hasherDto.setHashId(hasher.getHasherId());
            hasherDto.setHashName(hasher.getHashName());
            response.add(hasherDto);
        }

        return response;
    }
}
