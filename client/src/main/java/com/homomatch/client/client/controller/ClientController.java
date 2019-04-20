package com.homomatch.client.client.controller;

import com.homomatch.client.client.api.ServiceApi;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nick Yuan
 * @date 2019/2/12
 * @mood shitty
 */
@RestController
public class ClientController {
    @Autowired
    ServiceApi api;
    @GetMapping("show")
    public String show(){
        return api.show();
    }
}
