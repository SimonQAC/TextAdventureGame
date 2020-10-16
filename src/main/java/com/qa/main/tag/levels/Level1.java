package com.qa.main.tag.levels;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.encounters.Encounters;
import com.qa.main.tag.utils.CutsceneUtils;
import com.qa.main.tag.utils.Utils;

public class Level1 {
	
	private final Logger log = LogManager.getLogger();
	private int selection;
	private String output;
	Encounters state = Encounters.NULL;

	
	public void play(String name) {

		log.info(" ------CHOOSE A PATH-----\n");
	    log.info(
	            "Select an option: \n" +
	            "  1) Go Left\n" +
	            "  2) Go right\n" 
	        );
	    selection = Utils.input.nextInt();
	         
	    switch (selection) {
	    case 1:
	    	log.info("Going left... \n");
	    	encounterNumber();
	    	output = checkState();
	    	break;
	    case 2:
	    	log.info("Going right...\n");
	    	encounterNumber();
	    	output = checkState();
	      break;
	    default:
	    	log.info("Invalid Selection");
	    	break;
	    }
		log.info(output);
	}
	
	private int encounterNumber() {
		int randomNum = (int) ((Math.random() * (3 - 1))+1);
		log.info(randomNum);
		switch (randomNum) {
		case (1):
			state = Encounters.TREASURE;
			break;
		case (2):
			state = Encounters.DANGER;
			break;
		case (3):
			state = Encounters.EMPTY;
			break;
		}
		return randomNum;	
	}
	
	private String checkState() {
		switch (state) {
		case TREASURE:
			return "You found treasure!";
		case DANGER:
			return "You found danger!";
		case EMPTY:
			return "You found nothing!";
		default:
			return "Nothing found!";
		}
	}
}
