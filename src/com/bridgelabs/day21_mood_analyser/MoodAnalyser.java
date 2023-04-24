package com.bridgelabs.day21_mood_analyser;

import org.jetbrains.annotations.Nullable;

public class MoodAnalyser {
    @Nullable
    String message = null;
    @Nullable
    String analysedResult = null; //taking an empty string to store the result
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() throws MoodAnalysisException{
        try {
UC2_ExceptionIfStringEmpty
            if(message.equals("")) {
                throw new Exception("The string is empty, please enter something");

            if(this.message.isEmpty()) {
                analysedResult = "";
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.MoodEmpty, "Mood must not be empty");
 master
            }
            else if(message.toUpperCase().contains("SAD")) {
                analysedResult = "SAD"; //if analyse is true sad will be stored
            }
            else {
                analysedResult = "HAPPY"; //else happy will be stored and returned
            }
        }
        catch (MoodAnalysisException moodAnalysisException) {
            System.out.println(moodAnalysisException);
        }
        catch (NullPointerException nullPointerException) {
            try {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.MoodNull, "Mood must not be null");
            }
            catch (MoodAnalysisException e) {
                analysedResult = null;
                System.out.println(e.getMessage());
            }
        }
        return analysedResult;
    }
}
