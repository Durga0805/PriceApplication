package com.example.demo.pricecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pricecontroller {
	
	@GetMapping("/getdata")
	public Integer getPrice()
	{
		return 10000;
	}

}
