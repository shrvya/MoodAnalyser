package com.moodanalyser.moodanalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/*
 * unit test for MoodAnalyser
 */

public class MoodAnalyserTest {

	@Test
	public void givenSadMoodReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("this is sad");
		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
	@Test
	public void givenHappyMoodReturnHappy() {
		MoodAnalyser moodAnalysers = new MoodAnalyser("this is happy ");
		String mood = moodAnalysers.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("Happy"));
	}
	@Test
	public void givenNullMoodReturnHappy() {
		MoodAnalyser moodAnalysers = new MoodAnalyser(null);
		String mood = moodAnalysers.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	
}