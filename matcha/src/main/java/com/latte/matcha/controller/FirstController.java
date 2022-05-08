package com.latte.matcha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FirstController {

    @GetMapping("/firstRequest")
    public Map firstRequest(){
        Map firstMap = new HashMap();
        firstMap.put("msg", "hello from BE");
        return firstMap;
    }

}
