package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.aspect.TrackTime;
import com.example.demo.dao.Data1;
@Service
public class Service1 {
	@Autowired
	private Data1 data1;
	@TrackTime
	public String callFromDb() {
		return data1.retreiveSomething();
	}
	
}
