package com.tutorialspoint.test;

import javax.faces.bean.ManagedBean;

import org.apache.log4j.Logger;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

	private static final Logger logger = Logger.getLogger(HelloWorld.class);

	public HelloWorld() {
		System.out.println("HelloWorld started!");
		if (logger.isDebugEnabled()) {
			logger.debug("Inside HelloWorld Constructor");
		}
	}

	public String getMessage() {
		if (logger.isDebugEnabled()) {
			logger.debug("Inside getMessage");
		}
		return "Hello World!";
	}
}