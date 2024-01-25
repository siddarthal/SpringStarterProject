package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Data2;
@Service
public class Service2 {
	@Autowired
	private Data2 data2;
	
	public String callFromDb() {
		return data2.retreiveSomething();
	}
	
}
