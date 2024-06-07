package com.wso2.choreo.sample.springboot.repository;

import com.wso2.choreo.sample.springboot.model.AsgardeoUserCreationCompleted;
import com.wso2.choreo.sample.springboot.model.GetNorthStarClaims;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class AsgardeoUserCreationCompletedRepository {

    private Map<Integer, String> map = new ConcurrentHashMap<>();

    public AsgardeoUserCreationCompletedRepository() {

        map.put(1, "str1");
        map.put(2, "str2");
        map.put(3, "str3");
    }

    public AsgardeoUserCreationCompleted find(String userName, String correlationID) {

        return new AsgardeoUserCreationCompleted("---status--");
    }

    public String find2(String userName, String correlationID) {

        if (map.size() == 7) {
            return "true";
        }
        else {
            map.put(map.size() + 1, "str");
            return "false";
        }
    }
}