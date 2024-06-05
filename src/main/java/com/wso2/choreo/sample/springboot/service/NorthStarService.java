package com.wso2.choreo.sample.springboot.service;

import com.wso2.choreo.sample.springboot.model.NorthStar;
import com.wso2.choreo.sample.springboot.model.Product;
import com.wso2.choreo.sample.springboot.repository.NorthStarRepository;
import com.wso2.choreo.sample.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NorthStarService {
    @Autowired
    private NorthStarRepository repository;

    public NorthStar saveProduct(NorthStar northStar) {
        System.out.println("---------------  NorthStarService.saveProduct");
        return repository.save(northStar);
    }
}