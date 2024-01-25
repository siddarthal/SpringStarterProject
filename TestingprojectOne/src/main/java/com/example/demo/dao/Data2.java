package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.aspect.TrackTime;

@Repository
public class Data2 {
	@TrackTime
	public String retreiveSomething() {
		return "data2";
	}
}
