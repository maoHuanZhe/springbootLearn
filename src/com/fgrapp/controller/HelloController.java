package com.fgrapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author fan guang rui
 * @date 2020年09月16日 21:22
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "Hello World";
    }
}
