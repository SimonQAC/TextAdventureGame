package com.qa.main.tag.cutscenes;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.character.Character;
import com.qa.main.tag.main.Game;
import com.qa.main.tag.utils.CutsceneUtils;

public class introCutscene {
	

	private final Logger log = LogManager.getLogger();
	private Character character = new Character();
	CutsceneUtils csu = new CutsceneUtils();
	
	public void play() throws InterruptedException {

		welcome();
		
	}
	
	public void welcome() throws InterruptedException {
		csu.printWithDelays("WELCOME TO TEXT ADVENTURE GAME\n", TimeUnit.MILLISECONDS, 100);
		log.info("          ___   ____\r\n" + 
				"        /' --;^/ ,-_\\     \\ | /\r\n" + 
				"       / / --o\\ o-\\ \\\\   --(_)--\r\n" + 
				"      /-/-/|o|-|\\-\\\\|\\\\   / | \\\r\n" + 
				"       '`  ` |-|   `` '\r\n" + 
				"             |-|\r\n" + 
				"             |-|O\r\n" + 
				"             |-(\\,__\r\n" + 
				"          ...|-|\\--,\\_....\r\n" + 
				"      ,;;;;;;;;;;;;;;;;;;;;;;;;,.\r\n" + 
				"~~,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" + 
				"~;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,  ______   ---------   _____     ------\n");
		csu.printWithDelays("You wake up, in a new scary place, upon further\n"+
							"inspection, you notice that you are in a \n", TimeUnit.MILLISECONDS, 100);
		csu.printWithDelays("... \n", TimeUnit.MILLISECONDS, 1000);
		csu.printWithDelays(".d8888b 888  888  888 8888b. 88888b.d88b. 88888b.  \r\n" + 
							"88K     888  888  888    \"88b888 \"888 \"88b888 \"88b \r\n" + 
							"\"Y8888b.888  888  888.d888888888  888  888888  888 \r\n" + 
							"     X88Y88b 888 d88P888  888888  888  888888 d88P \r\n" + 
							" 88888P' \"Y8888888P\" \"Y888888888  888  88888888P\"  \r\n" + 
							"                                          888      \r\n" + 
							"                                          888      \r\n" + 
							"                                          888      ", TimeUnit.MILLISECONDS, 1);
	}
	

	
	
	


}
