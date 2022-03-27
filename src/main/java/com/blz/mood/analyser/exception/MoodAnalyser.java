package com.blz.mood.analyser.exception;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {

        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.contains("SAD"))
                return "SAD";
            }
            catch (Exception e) {
                return "HAPPY";
            }
        return "HAPPY";
    }
}
