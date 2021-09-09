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
	 * has sad then it returns SAD else it returns HAPPY when mood is empty it
	 * throws an exception
	 */
	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("sad"))
				return "SAD";
			if (message.contains("happy"))
				return "HAPPY";
			if (message.contains(" ")) {
				throw new MoodAnalysisException("This is an Empty mood!!!!");
			}
			
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("This is an Exception!!!!");

		}

	}

}
