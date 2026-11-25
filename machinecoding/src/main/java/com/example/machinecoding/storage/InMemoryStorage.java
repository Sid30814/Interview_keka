package com.example.machinecoding.storage;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryStorage {

    private final Map<String, Object> store = new ConcurrentHashMap<>();

    public void save(String id, Object data) {
        store.put(id, data);
    }

    public Optional<Object> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public Map<String, Object> findAll() {
        return Map.copyOf(store);
    }

    public boolean exists(String id) {
        return store.containsKey(id);
    }

    public void clear() {
        store.clear();
    }
}