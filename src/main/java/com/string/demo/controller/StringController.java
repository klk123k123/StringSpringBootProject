package com.string.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.string.demo.Exception.StringPalindromException;
import com.string.demo.service.StringService;

@RestController
@RequestMapping("/api")
public class StringController {
	
	@Autowired
	public StringService stringService;
	
	@GetMapping("/isPalindrom")
	public boolean CheckPalindrom(@RequestParam String  name)
	{
		try
		{
		return stringService.isPalindrom(name);
		}
		catch (StringPalindromException e)
		{
		 	e.printStackTrace();
		 	return false;
		}
		//return false;
	}

}
