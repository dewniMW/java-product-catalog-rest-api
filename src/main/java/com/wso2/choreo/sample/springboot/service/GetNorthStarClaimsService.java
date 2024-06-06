package com.wso2.choreo.sample.springboot.service;

import com.wso2.choreo.sample.springboot.model.GetNorthStarClaims;
import com.wso2.choreo.sample.springboot.repository.GetNorthStarClaimsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetNorthStarClaimsService {
    @Autowired
    private GetNorthStarClaimsRepository repository;

    public GetNorthStarClaims saveProduct(GetNorthStarClaims northStar) {
        System.out.println("---------------  NorthStarService.saveProduct");
        return repository.save(northStar);
    }
}