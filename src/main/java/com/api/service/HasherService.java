package com.api.service;

import com.api.dto.frontend.HashersResponse;

/**
 * Created by Porn Again Christian PRATH3 on 10/3/2016.
 */
public interface HasherService {

    /**
     * Gets all hashers on record
     * @return - List of hashers
     */
    public HashersResponse getAllHashers();
}
