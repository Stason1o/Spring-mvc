package com.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Stanislav Bogdanschi on 09.04.2017.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String printHome(){
        return "test";
    }
}
