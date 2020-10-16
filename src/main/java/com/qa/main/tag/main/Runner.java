package com.qa.main.tag.main;

import com.qa.main.tag.utils.*;

public class Runner {
	

	public static void main(String[] args) {

			Game game = new Game();
			game.gameSystem();

			Utils.log.info("Good bye!");
			Utils.input.close();
		

	}

}
