package com.homomatch.client.client.api;

import org.springframework.stereotype.Component;

/**
 * @author Nick Yuan
 * @date 2019/2/14
 * @mood shitty
 */
@Component
public class Handler implements ServiceApi{
    @Override
    public String show() {
        return "broken";
    }
}
