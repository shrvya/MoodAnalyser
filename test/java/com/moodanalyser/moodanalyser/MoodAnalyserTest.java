package com.moodanalyser.moodanalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/*
 * unit test for MoodAnalyser
 */

public class MoodAnalyserTest {

	@Test
	public void givenSadMoodReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("this is sad");
		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
	@Test
	public void givenHappyMoodReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodAnalysers = new MoodAnalyser("this is happy ");
		String mood = moodAnalysers.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
	@Test
	public void givenNullMoodReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodAnalysers = new MoodAnalyser(null);
		try {
			
		String mood = moodAnalysers.analyseMood();
		Assert.assertEquals("Happy", mood);
	}
		catch(MoodAnalysisException e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenEmptyMoodReturnThrowException() throws MoodAnalysisException {
		MoodAnalyser moodAnalysers = new MoodAnalyser(" ");
		try {
			
		String mood = moodAnalysers.analyseMood();
		Assert.assertEquals(" ", mood);
	}
		catch(MoodAnalysisException e)
		{
			e.printStackTrace();
		}
	}
	
	
}