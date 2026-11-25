package com.example.machinecoding.storage;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import com.example.machinecoding.model.SampleRequest;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryStorage {

    private final Map<Integer,Integer > total = new ConcurrentHashMap<>();

    SampleRequest.menu={"menu": { "itm-1": { "name": "Masala Dosa", "price": 60 },
        "itm-2": { "name": "Filter Coffee", "price": 25 },
        "itm-3": { "name": "Samosa", "price": 15 } };
 SampleRequest.wallets="wallets": { "emp-101": 500, "emp-102": 100 };

      public boolean isvalid( Integer Empid ){

        }
//    public void save(String id, Object data) {
//        store.put(id, data);
//    }
//
//    public Optional<Object> findById(String id) {
//        return Optional.ofNullable(store.get(id));
//    }
//
//    public Map<String, Object> findAll() {
//        return Map.copyOf(store);
//    }
//
//    public boolean exists(String id) {
//        return store.containsKey(id);
//    }
//
//    public void clear() {
//        store.clear();
//    }
}