package com.moodanalyser.moodanalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/*
 * unit test for MoodAnalyser
 */

public class MoodAnalyserTest {

	@Test
	public void testMoodAnalyser() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
		MoodAnalyser moodAnalysers = new MoodAnalyser("This is a happy message");
		String moods = moodAnalysers.analyseMood();
		Assert.assertThat(moods, CoreMatchers.is("Happy"));

	}

}