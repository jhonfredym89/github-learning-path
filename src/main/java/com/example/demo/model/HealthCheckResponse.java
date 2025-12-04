package com.example.demo.model;

public class HealthCheckResponse {

    private String status;
    private long timestamp;

    public HealthCheckResponse(String status, long timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
