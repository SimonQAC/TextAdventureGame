package com.qa.main.tag.character;

import com.qa.main.tag.utils.Utils;


public class Character {
	
	private String name = "empty";

	public void character() {
		this.name = name;
	}
	


	public void create() {
		Utils.log.info("Pleae enter a name: ");
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
