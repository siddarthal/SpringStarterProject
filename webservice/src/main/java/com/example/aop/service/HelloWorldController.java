package com.example.aop.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@RequestMapping(method = RequestMethod.GET,path ="/helloworld" )
public String HelloWorld() {
	return "Hello world";
}
@GetMapping(path = "hello-world")
public String HelloWorld1() {
	return "hello world";
}
@GetMapping(path = "hello-world-1")
public HelloWorld HelloWorld12() {
	return new HelloWorld("hello world");
}
@GetMapping(path = "hello-world-1/path-variable/{name}")
public HelloWorld HelloWorld123(@PathVariable String name) {
	return new HelloWorld("hello world"+" "+name);
}
}
