package com.qa.main.tag.utils;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {
	
	private final Logger log = LogManager.getLogger();
	
	public static Scanner input = new Scanner(System.in);
	
	public Utils(Scanner input) {
		super();
		this.input = input;
	}
	
	public Utils() {
		
	}
	
	public String getString() {
		return input.nextLine();
	}
	

}
