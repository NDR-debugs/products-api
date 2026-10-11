package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return "Products API - OOP Tutorial 1. "
                + "A Spring Boot REST application documented with springdoc-openapi.";
    }

}
