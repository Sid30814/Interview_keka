package com.example.machinecoding.controller;

import com.example.machinecoding.model.SampleRequest;
import com.example.machinecoding.model.SampleResponse;
import com.example.machinecoding.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SampleController {

    private static final Logger log = LoggerFactory.getLogger(SampleController.class);
    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/test")
    public ResponseEntity<SampleResponse> testGet() {
        log.info("Received GET /api/test");
        return ResponseEntity.ok(new SampleResponse("OK", "GET works yes"));
    }

    @PostMapping("/test")
    public ResponseEntity<SampleResponse> testPost(@RequestBody SampleRequest request) {
        log.info("Received POST /api/test with body: {}", request);
        SampleResponse response = sampleService.processRequest(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}