package com.tutorial.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Beware of the wolfin theep's clothing",
			"Diligance is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a ramdom number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune  = data[index];
		
		return theFortune;
	}

}
