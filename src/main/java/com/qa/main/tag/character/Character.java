package com.qa.main.tag.character;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.utils.Utils;


public class Character {
	
	public final Logger log = LogManager.getLogger();
	private String name = null;

	public void character() {
		name = getName();
	}
	


	public void create() {
		Utils.input.nextLine();
		log.info("Pleae enter a name: ");
		setName(Utils.input.nextLine());
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
