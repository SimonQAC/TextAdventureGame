package com.qa.main.tag.utils;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.main.tag.character.Character;


public class CutsceneUtils {
	
	private final Logger log = LogManager.getLogger();
	private Character character = new Character();

	public void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException{
		for (char ch : data.toCharArray()) {
			log.info(ch);
			unit.sleep(delay);
		}
	}
}
