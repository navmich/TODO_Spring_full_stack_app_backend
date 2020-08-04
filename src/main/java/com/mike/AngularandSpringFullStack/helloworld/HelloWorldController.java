package com.mike.AngularandSpringFullStack.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.mike.AngularandSpringFullStack.Constants.CROSS_ORIGIN_URL;

@CrossOrigin(origins=CROSS_ORIGIN_URL)
@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    // NOT USED
//    @GetMapping("/hello-world-bean")
//    public HelloWorldBean helloWorldBean() {
//        return new HelloWorldBean("Hello World");
//    }

    @GetMapping("hello-world-bean/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
