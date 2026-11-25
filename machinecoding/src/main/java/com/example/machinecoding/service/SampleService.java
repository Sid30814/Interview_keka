package com.example.machinecoding.service;

import com.example.machinecoding.model.SampleRequest;
import com.example.machinecoding.model.SampleResponse;
import com.example.machinecoding.storage.InMemoryStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class SampleService {

    private static final Logger log = LoggerFactory.getLogger(SampleService.class);
    private final InMemoryStorage storage;

    public SampleService(InMemoryStorage storage) {
        this.storage = storage;
    }
        public SampleRequest placeorder(SampleRequest request ){
        if(request == null || request.empid()==null || request.items()==null){
throw new IllegalArgumentException("invalid null value");
        }
        if(Storage(menuvalid(empid,itemsid))) return menuvalid(empid,itemsid), ,""
        String empid = request.empid();
        ArrayList<String> itemsid = request.itemsid();
        return itemsid , Storage.map.of((total(empid,itemsid),Storage.map.of(menu(empid,itemsid)),Storage.map.of(iforderplaces(status))
        }


//    public SampleResponse processRequest(SampleRequest request) {
//        if (request == null || request.name() == null || request.name().isBlank()) {
//            throw new IllegalArgumentException("Name must not be empty");
//        }
//        if (request.value() < 0) {
//            throw new IllegalArgumentException("Value must be non-negative");
//        }
//
//        String id = UUID.randomUUID().toString();
//        storage.save(id, request);
//        log.info("Saved record with id={} to in-memory storage", id);
//
//        return new SampleResponse("OK", "Saved " + request.name() + " with ID: " + id);
//    }
}