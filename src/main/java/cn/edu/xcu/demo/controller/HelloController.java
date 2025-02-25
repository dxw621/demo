package cn.edu.xcu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//标识该程序为controller层
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index(String name,Integer age){
        System.out.println(name+""+age);
        return "Hello World";
    }


}
