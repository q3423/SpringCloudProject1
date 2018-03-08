package com.lm.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *@Title: SchedualServiceHi
 *@Author:LiMan
 *@Date:2018/3/8 14:08
 *@Description: 
 */
@Service
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
