package com.latte.matcha.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
public class LoginController {

    @GetMapping(path = "/list")
    public List<String> getProducts() {
        log.info("Login success");
        return Arrays.asList("Mazda","Toyota","Audi");
    }
}
