package com.scaler.springbootdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallingService {

    @RequestMapping (value = "/hello",method = RequestMethod.GET)
    public String SayHello(){
        return "Welcome to suresh World";
    }
}
