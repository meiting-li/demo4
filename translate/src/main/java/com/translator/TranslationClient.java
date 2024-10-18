package com.translator;

import com.model.TranslationRequest;
import com.model.TranslationResponse;

public class TranslationClient {
    private TranslatorService translatorService;

    public TranslationClient(TranslatorService translatorService) {
        this.translatorService = translatorService;
    }

    public TranslationResponse translate(TranslationRequest request) {
        return translatorService.translate(request);
    }
}