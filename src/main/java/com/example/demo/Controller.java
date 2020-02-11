package com.example.demo;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Test API", description = " ", tags = {"Test API"})
public class Controller {

    @PostMapping("/api/test")
    public Response test(@RequestBody Request request) {
        return null;
    }
}
