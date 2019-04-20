package com.homomatch.client.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import com.netflix.client.config.CommonClientConfigKey;
/**
 * @author Nick Yuan
 * @date 2019/2/12
 * @mood shitty
 */
@FeignClient(name="demo",fallback = Handler.class)
@Component
public interface ServiceApi {
    @GetMapping("/show")
    String show();
}

