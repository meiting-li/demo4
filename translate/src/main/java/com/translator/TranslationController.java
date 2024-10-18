package com.translator;

import com.model.TranslationRequest;
import com.model.TranslationResponse;

public class TranslationController {
    private TranslationClient translationClient;

    public TranslationController(TranslationClient translationClient) {
        this.translationClient = translationClient;
    }

    public TranslationResponse translate(String text, String sourceLang, String targetLang) {
        TranslationRequest request = new TranslationRequest(text, sourceLang, targetLang);
        return translationClient.translate(request);
    }
}