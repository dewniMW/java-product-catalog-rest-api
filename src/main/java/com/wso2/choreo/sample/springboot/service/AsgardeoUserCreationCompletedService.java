package com.wso2.choreo.sample.springboot.service;

import com.wso2.choreo.sample.springboot.model.AsgardeoUserCreationCompleted;
import com.wso2.choreo.sample.springboot.model.GetNorthStarClaims;
import com.wso2.choreo.sample.springboot.repository.AsgardeoUserCreationCompletedRepository;
import com.wso2.choreo.sample.springboot.repository.GetNorthStarClaimsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsgardeoUserCreationCompletedService {

    @Autowired
    private AsgardeoUserCreationCompletedRepository repository;

    public AsgardeoUserCreationCompleted find(String userName, String correlationID) {

        System.out.println("---------------  AsgardeoUserCreationCompletedService.find");
        return repository.find(userName, correlationID);
    }

    public String find2(String userName, String correlationID) {

        String status = repository.find2(userName, correlationID);
        System.out.println("---------------  AsgardeoUserCreationCompletedService.find2--- status: " + status);
        return status;
    }
}