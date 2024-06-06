package com.wso2.choreo.sample.springboot.repository;

import com.wso2.choreo.sample.springboot.model.GetNorthStarClaims;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class GetNorthStarClaimsRepository {

    private Map<Integer, GetNorthStarClaims> map = new ConcurrentHashMap<>();

    public GetNorthStarClaimsRepository() {

        map.put(1, new GetNorthStarClaims(1, "email1", "objectId1", "correlationID1"));
        map.put(2, new GetNorthStarClaims(2, "email2", "objectId2", "correlationID2"));
        map.put(3, new GetNorthStarClaims(3, "email3", "objectId3", "correlationID3"));
    }

    public GetNorthStarClaims save(GetNorthStarClaims p) {

        GetNorthStarClaims copy = new GetNorthStarClaims(map.size() + 1, p.email(), p.objectId(), p.correlationID());
        System.out.println("size     ==     " + map.size());
        int size = map.size();
        map.put(size + 1, copy);
        return copy;
    }
}