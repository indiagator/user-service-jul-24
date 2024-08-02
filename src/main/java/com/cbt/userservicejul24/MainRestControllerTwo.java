package com.cbt.userservicejul24;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class MainRestControllerTwo {

    @GetMapping("/get/response/for/auth-service")
    public ResponseEntity<String> generateResponseForAdminService()
    {
        return ResponseEntity.ok("New Logic");
    }
}
