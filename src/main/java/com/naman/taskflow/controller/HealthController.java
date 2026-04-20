package com.naman.taskflow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * HealthController provides a simple endpoint for monitoring the application status.
 * Platforms like Render use this to verify if the application is running correctly.
 */
@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<Map<String, String>> checkHealth() {
        return ResponseEntity.ok(Map.of(
            "status", "UP",
            "message", "TaskFlow API is running smoothly",
            "timestamp", java.time.LocalDateTime.now().toString()
        ));
    }
}
