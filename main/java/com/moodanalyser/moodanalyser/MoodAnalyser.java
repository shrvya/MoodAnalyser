package com.moodanalyser.moodanalyser;

/*
 * class has a method to analyse the mood
 */
public class MoodAnalyser {
	String message;
	public MoodAnalyser(){
		
	}
	public MoodAnalyser(String message){
		this.message=message;
	}
	/*
	 * analyseMood method returns a string it takes a parameter message,if message
	 * has sad then it returns SAD else it returns HAPPY
	 */
	public String analyseMood() {
		if (message.contains("sad"))
			return "SAD";
		else
			return "Happy";
	}

}
