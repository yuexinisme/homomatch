package com.homomatch.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nick Yuan
 * @date 2019/2/12
 * @mood shitty
 */
@RestController
public class ServiceController {
    @GetMapping("/show")
    public String show(){
        System.out.println("service");
        return "bitch";
    }
}
