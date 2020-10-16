package com.qa.main.tag.main;

import com.qa.main.tag.utils.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.character.Character;
import com.qa.main.tag.cutscenes.*;

public class Game {
	
	private Character character = new Character();
	private int selection;
	public String name = character.getName();
	
	public final Logger log = LogManager.getLogger();
	
	introCutscene ics = new introCutscene();
	
	
	public Game() {

	}
	
	public void gameSystem() {
		
		mainMenu();
		
		if (character.getName() == null) {
			mainMenu();
		}
		try {
			ics.play();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	public void mainMenu() {
		
		log.info(" ------TEXT ADVENTURE GAME-----\n");
	    log.info(
	            "Select an option: \n" +
	            "  1) New Game\n" +
	            "  2) Quit\n" 
	        );
	    selection = Utils.input.nextInt();
	         
	    switch (selection) {
	    case 1:
	    	log.info("Creating Character \n");
	    	character.create();
	    	break;
	    case 2:
	    	log.info("Exiting...");
	    	System.exit(1);
	      break;
	    default:
	    	log.info("Invalid Selection");
	    	break;
	    }

	}
}


