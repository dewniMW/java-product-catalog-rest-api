package com.wso2.choreo.sample.springboot.controller;

import com.wso2.choreo.sample.springboot.model.AsgardeoUserCreationCompleted;
import com.wso2.choreo.sample.springboot.model.GetNorthStarClaims;
import com.wso2.choreo.sample.springboot.service.AsgardeoUserCreationCompletedService;
import com.wso2.choreo.sample.springboot.service.GetNorthStarClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/isAsgardeoUserCreationCompleted")
public class AsgardeoUserCreationCompletedController {

    @Autowired
    private AsgardeoUserCreationCompletedService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AsgardeoUserCreationCompleted addProduct(@RequestBody AsgardeoUserCreationCompleted creationCompleted) {
        return service.saveProduct(creationCompleted);
    }
}