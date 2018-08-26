package com.tutorialspoint.test;

import org.apache.log4j.Logger;

public class Author {
	private static final Logger logger = Logger.getLogger(Author.class);
	int id;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (logger.isDebugEnabled()) {
			logger.debug("Inside setName");
		}
		this.name = name;
	}

	public int getId() {
		if (logger.isDebugEnabled()) {
			logger.debug("Inside getId::" + id);
		}
		return id;
	}

	public void setId(int id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Inside setId::" + id);
		}
		this.id = id;
	}
}