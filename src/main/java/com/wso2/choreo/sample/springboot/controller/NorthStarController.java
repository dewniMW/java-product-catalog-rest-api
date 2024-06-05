package com.wso2.choreo.sample.springboot.controller;

import com.wso2.choreo.sample.springboot.model.NorthStar;
import com.wso2.choreo.sample.springboot.model.Product;
import com.wso2.choreo.sample.springboot.service.NorthStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxyGetNorthStarClaims")
public class NorthStarController {

    @Autowired
    private NorthStarService service;

    @PostMapping
    public NorthStar addProduct(@RequestBody NorthStar northStar) {
        return service.saveProduct(northStar);
    }
}