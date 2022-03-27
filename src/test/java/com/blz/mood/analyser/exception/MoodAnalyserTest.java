package com.blz.mood.analyser.exception;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenNullMood_ShouldHandleException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actual = moodAnalyser.analyseMood();
        String expected = null;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenNullMood_ShouldHandleExceptionAndReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actual = moodAnalyser.analyseMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);
    }
}
