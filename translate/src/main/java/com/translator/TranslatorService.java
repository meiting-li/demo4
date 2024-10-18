package com.translator;


import com.model.TranslationRequest;
import com.model.TranslationResponse;

public interface TranslatorService {
    TranslationResponse translate(TranslationRequest request);
}