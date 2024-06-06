package com.wso2.choreo.sample.springboot.repository;

import com.wso2.choreo.sample.springboot.model.AsgardeoUserCreationCompleted;
import com.wso2.choreo.sample.springboot.model.GetNorthStarClaims;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class AsgardeoUserCreationCompletedRepository {

    public AsgardeoUserCreationCompleted find(String userName, String correlationID) {

        return new AsgardeoUserCreationCompleted("---status--");
    }
}