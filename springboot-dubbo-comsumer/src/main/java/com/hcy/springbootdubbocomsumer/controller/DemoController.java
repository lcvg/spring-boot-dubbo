package com.hcy.springbootdubbocomsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hcy.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 黄重杨 on 2018/11/30.
 * ClassName: DeomController
 */
@RestController
public class DemoController {

    @Reference(version = "1.0")
    private DemoService demoService;

    @GetMapping("/sayHello")
    public String sayHello(){
        demoService.sayHello();
        return "success";
    }
}
