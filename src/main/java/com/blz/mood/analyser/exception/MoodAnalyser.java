package com.blz.mood.analyser.exception;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {

        this.message = message;
    }

    public String analyseMood() {
            if (this.message.toUpperCase().contains("SAD"))
                return "SAD";
            return "HAPPY";

    }
}
