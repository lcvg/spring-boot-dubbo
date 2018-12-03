package com.hcy.springbootdubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hcy.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by 黄重杨 on 2018/11/30.
 * ClassName: DemoServiceImpl
 */
@Service(version = "1.0")
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        System.out.println("hello, I am is provider 1");
    }
}
