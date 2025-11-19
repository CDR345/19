package org.example.demo1init.controller;

package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello API", description = "Simple greeting endpoints")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Say hello", description = "Returns a simple greeting")
    public String sayHello() {
        return "Hello World!";
    }
}
