package com.qa.main.tag.character;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.utils.Utils;


public class Character {
	
	public final Logger log = LogManager.getLogger();
	private String name;

	public void character() {
		name = getName();
	}
	


	public void create() {

	}
	
	public void reset() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
