package com.wso2.choreo.sample.springboot.repository;

import com.wso2.choreo.sample.springboot.model.NorthStar;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class NorthStarRepository {

    private Map<Integer, NorthStar> map = new ConcurrentHashMap<>();

    public NorthStarRepository() {

        map.put(1, new NorthStar(1, "email1", "objectId1", "correlationID1"));
        map.put(2, new NorthStar(2, "email2", "objectId2", "correlationID2"));
        map.put(3, new NorthStar(3, "email3", "objectId3", "correlationID3"));
    }

    public NorthStar save(NorthStar p) {

        NorthStar copy = new NorthStar(map.size() + 1, p.email(), p.objectId(), p.correlationID());
        System.out.println("size     ==     " + map.size());
        int size = map.size();
        map.put(size + 1, copy);
        return copy;
    }
}