package com.string.demo.service;

import org.springframework.stereotype.Service;

import com.string.demo.Exception.StringPalindromException;

@Service
public class StringService {
	
	public boolean isPalindrom(String name) throws StringPalindromException
	{
		String rev="";
		char[] ch=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		} 
		
		//if(rev.equals(name)) give error while name is Madam so we can use below one
		if(rev.equalsIgnoreCase(name))
			return true;
		else
			//return false;
	   throw new StringPalindromException("You are not eligible");
		}
		
	}


