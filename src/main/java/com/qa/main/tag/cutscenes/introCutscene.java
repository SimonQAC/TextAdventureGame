package com.qa.main.tag.cutscenes;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.utils.CutsceneUtils;

public class introCutscene {
	
	private final Logger log = LogManager.getLogger();

	CutsceneUtils csu = new CutsceneUtils();
	

	public void play(String name) throws InterruptedException {
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
		csu.printWithDelays("You, " + name + " wake up, in a new scary place, upon further\n"+
							"inspection, you notice that you are in a", TimeUnit.MILLISECONDS, 100);
		csu.printWithDelays("... \n", TimeUnit.MILLISECONDS, 1000);
		log.info(".d8888b 888  888  888 8888b. 88888b.d88b. 88888b.  \r\n" + 
							"88K     888  888  888    \"88b888 \"888 \"88b888 \"88b \r\n" + 
							"\"Y8888b.888  888  888.d888888888  888  888888  888 \r\n" + 
							"     X88Y88b 888 d88P888  888888  888  888888 d88P \r\n" + 
							" 88888P' \"Y8888888P\" \"Y888888888  888  88888888P\"  \r\n" + 
							"                                          888      \r\n" + 
							"                                          888      \r\n" + 
							"                                          888      \n");
		log.info("                      _____\r\n" + 
				"                   ,-'     `._\r\n" + 
				"                 ,'           `.        ,-.\r\n" + 
				"               ,'               \\       ),.\\\r\n" + 
				"     ,.       /                  \\     /(  \\;\r\n" + 
				"    /'\\\\     ,o.        ,ooooo.   \\  ,'  `-')\r\n" + 
				"    )) )`. d8P\"Y8.    ,8P\"\"\"\"\"Y8.  `'  .--\"'\r\n" + 
				"   (`-'   `Y'  `Y8    dP       `'     /\r\n" + 
				"    `----.(   __ `    ,' ,---.       (\r\n" + 
				"           ),--.`.   (  ;,---.        )\r\n" + 
				"          / \\O_,' )   \\  \\O_,'        |\r\n" + 
				"         ;  `-- ,'       `---'        |\r\n" + 
				"         |    -'         `.           |\r\n" + 
				"        _;    ,            )          :\r\n" + 
				"     _.'|     `.:._   ,.::\" `..       |\r\n" + 
				"  --'   |   .'     \"\"\"         `      |`.\r\n" + 
				"        |  :;      :   :     _.       |`.`.-'--.\r\n" + 
				"        |  ' .     :   :__.,'|/       |  \\\r\n" + 
				"        `     \\--.__.-'|_|_|-/        /   )\r\n" + 
				"         \\     \\_   `--^\"__,'        ,    |\r\n" + 
				"         ;  `    `--^---'          ,'     |\r\n" + 
				"          \\  `                    /      /\r\n" + 
				"           \\   `    _ _          /\r\n" + 
				"            \\           `       /\r\n" + 
				"             \\           '    ,'\r\n" + 
				"              `.       ,   _,'\r\n" + 
				"                `-.___.---'\r\n" + 
				"\r\n" + 
				"------------------------------------------------\r\n" + 
				"");
		csu.printWithDelays("You hear a rumble coming from behind you.\n" +
				"As you look up, its clear that you have\n" +
					"two paths ahead of you, which do you take? \n", TimeUnit.MILLISECONDS, 75);
	}
	

	
	
	


}
