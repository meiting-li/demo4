package com.translator;

import com.model.TranslationRequest;
import com.model.TranslationResponse;

public class TranslatorServiceImpl implements TranslatorService {
    @Override
    public TranslationResponse translate(TranslationRequest request) {
        // Here you would call the actual web service
        // For demonstration, we're just returning the input as output
        return new TranslationResponse(request.getText());
    }
}