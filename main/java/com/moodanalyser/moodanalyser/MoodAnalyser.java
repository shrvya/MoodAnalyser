package com.moodanalyser.moodanalyser;

import java.util.Scanner;

/*
 * class has a method to analyse the mood
 */
public class MoodAnalyser {
	static String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	/*
	 * analyseMood method returns a string it takes a parameter message,if message
	 * has sad then it returns SAD else it returns HAPPY
	 */
	public String analyseMood() {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "Happy";
		} catch (NullPointerException e) {

			return "HAPPY";
		}

	}

}
