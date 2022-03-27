package com.blz.mood.analyser.exception;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadMood_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");
        String actual = moodAnalyser.analyseMood();
        String expected = "SAD";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void givenHappyMood_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy mood");
        String actual = moodAnalyser.analyseMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);
    }
}
