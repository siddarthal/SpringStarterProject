package com.example.aop.service;

public class HelloWorld {

	private String string;

	public HelloWorld(String string) {
		this.string =string;
	}

	public String getString() {
		return string;                                                                                                                                                                                                                         
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "HelloWorld [string=" + string + "]";
	}
	

}