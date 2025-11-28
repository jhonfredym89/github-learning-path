package com.example.demo.service;

import com.example.demo.model.HealthCheckResponse;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public HealthCheckResponse checkHealth() {
        return new HealthCheckResponse("OK", System.currentTimeMillis());
    }
}
