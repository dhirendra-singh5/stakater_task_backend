package com.example.demo;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StakaterController {
	
	@GetMapping("/getName")
	@ResponseBody
	public String getUserName() 
	{
		String name="Hello "+System.getenv("NAME");
		System.out.println(name);
		//LocalDateTime dateTime= LocalDateTime.now();
		return name;
		
	}

}
