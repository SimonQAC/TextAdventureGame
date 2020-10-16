package com.qa.main.tag.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.utils.*;

public class Runner {
	

	public static void main(String[] args) {
		
		final Logger log = LogManager.getLogger();

			Game game = new Game();
			game.gameSystem();

			log.info("\n Thanks for Playing!");
			Utils.input.close();
		

	}

}
