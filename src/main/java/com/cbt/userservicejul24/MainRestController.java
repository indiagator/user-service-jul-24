package com.cbt.userservicejul24;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainRestController {

    private final Logger logger = LoggerFactory.getLogger(MainRestController.class);


    @Value("${spring.application.name}")
    public String spring_application_name;


    @GetMapping("/get/response/for/auth-service")
    public ResponseEntity<String> generateResponseForAdminService()
    {
        logger.info("Response Generated for Admin Service");
        return ResponseEntity.ok("Hello World from "+spring_application_name);
    }
}
