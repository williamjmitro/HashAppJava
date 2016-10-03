package com.api.service;

import com.api.data.HasherRepository;
import com.api.domain.Hasher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Porn Again Christian PRATH3 on 10/3/2016.
 */

@Component
public class HasherServiceImpl implements HasherService {

    @Autowired
    HasherRepository hasherRepository;

    @Override
    public List<Hasher> getAllHashers() {
        return hasherRepository.findAll();
    }
}
