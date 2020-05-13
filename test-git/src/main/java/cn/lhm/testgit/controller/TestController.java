package cn.lhm.testgit.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
        public String q(){
            System.out.println("hello");
            return"ss";
        }
}
