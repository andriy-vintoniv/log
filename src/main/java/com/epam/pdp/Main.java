package com.epam.pdp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	final static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		logger.info("Info");
		logger.debug("debug");
		logger.error("error");
		logger.trace("trace");
		logger.warn("warning");
	}
}
