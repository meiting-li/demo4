package com.model;


public class TranslationResponse {
    private String translatedText;

    // Constructors, getters, and setters
    public TranslationResponse() {}

    public TranslationResponse(String translatedText) {
        this.translatedText = translatedText;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }
}