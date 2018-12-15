package cn.jxk.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HellowController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("welcome to spring boot");
        return "welcome to spring boot";
    }
}
