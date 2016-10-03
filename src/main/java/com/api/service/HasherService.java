package com.api.service;

import com.api.domain.Hasher;

import java.util.List;

/**
 * Created by Porn Again Christian PRATH3 on 10/3/2016.
 */
public interface HasherService {

    /**
     * Gets all hashers on record
     * @return - List of hashers
     */
    public List<Hasher> getAllHashers();
}
