package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	 /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    public String helloworld(){
        return "Hello World 呵呵";
    }
}
