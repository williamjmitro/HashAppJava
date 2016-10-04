package com.api.endpoint;

import com.api.base.BaseEndpoint;
import com.api.domain.Hasher;
import com.api.service.HasherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Porn Again Christian PRATH3 on 10/3/2016.
 */

@RestController
@RequestMapping("hasher")
@Api("hasher")
public class HasherEndpoint extends BaseEndpoint {

    @Autowired
    HasherService hasherService;

    @RequestMapping(value = "/all",method = RequestMethod.GET,produces = "application/json")
    @ApiOperation(value = "Returns all hashers")
    public List<Hasher> getHashers(){
        log.info("test");
        return hasherService.getAllHashers();
    }
}
