package com.qa.main.tag.main;

import com.qa.main.tag.utils.Utils;

import com.qa.main.tag.character.Character;

public class Game {
	
	private Character character;
	private int selection;
	
	
	public Game() {
		this.character = new Character();
	}
	
	public void gameSystem() {
		
		mainMenu();
		
		if (character.getName() != "empty") {
			Utils.log.info("Hello " + character.getName());
		}

	}

	
	
	public void mainMenu() {
		
		Utils.log.info(" ------TEXT ADVENTURE GAME-----");
	    Utils.log.info(
	            "Select an option: \n" +
	            "  1) New Game\n" +
	            "  2) Quit\n" 
	        );
	    selection = Utils.input.nextInt();
	         
	    switch (selection) {
	    case 1:
	    	Utils.log.info("Creating Character");
	    	character.create();
	    	break;
	    case 2:
	    	Utils.log.info("Exiting...");
	    	System.exit(1);
	      break;
	    default:
	    	Utils.log.info("Invalid Selection");
	    	break;
	    }

	}
}


