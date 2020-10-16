package com.qa.main.tag.main;

import com.qa.main.tag.utils.Utils;

import com.qa.main.tag.character.Character;

public class Game {
	
	private Character character;
	
	
	public Game() {
		this.character = new Character();
	}
	
	public void gameSystem() {
		Utils.log.info("Welcome to Text Adventure Game");
		
		character.create();
		
		Utils.log.info("Hello " + character.getName());
	}

}
