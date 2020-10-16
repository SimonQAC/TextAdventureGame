package com.qa.main.tag.main;

import com.qa.main.tag.utils.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.character.Character;
import com.qa.main.tag.cutscenes.*;

public class Game {
	
	private Character character = new Character();
	private int selection;
	public String name;
	
	public final Logger log = LogManager.getLogger();
	
	introCutscene ics = new introCutscene();
	
	
	public Game() {
		this.name = name;
	}
	
	public void gameSystem() {
		
		mainMenu();
		
		if (name == null) {
			mainMenu();
		}
		log.info(name);
		try {
			ics.play();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(name);

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
			Utils.input.nextLine();
			log.info("Pleae enter a name: ");
			setName(Utils.input.nextLine());
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


