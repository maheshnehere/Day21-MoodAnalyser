package com.bridgelabs.day21_mood_analyser;

public class MoodAnalysisException extends Exception {
    public enum ExceptionType {
        MoodEmpty, MoodNull;
    }
    final ExceptionType type;
    public MoodAnalysisException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
