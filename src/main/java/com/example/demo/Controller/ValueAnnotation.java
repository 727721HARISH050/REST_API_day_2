package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	@Value("${name}")
private String name;
	@GetMapping("day2name")
	
public String display()
{
	return "My Name is "+name;
}
}
