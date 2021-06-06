package com.eatmans.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/5
 */
@RestController
public class TestController {

    @Value("${info}")
    private String info;

    @RequestMapping("/config/info")
    public String info() {
        return info;
    }


}
