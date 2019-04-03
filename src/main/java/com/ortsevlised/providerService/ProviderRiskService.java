package com.ortsevlised.providerService;

import org.springframework.stereotype.Component;

@Component
public class ProviderRiskService {
    public ProviderRiskResponse doRiskCheck(String cardNumber) {
        if (cardNumber.equalsIgnoreCase("4242424242424242")) {
            return new ProviderRiskResponse(ProviderRiskResponse.Risk.LOW);
        } else if (cardNumber.equalsIgnoreCase("400000000000000")) {
            return new ProviderRiskResponse(ProviderRiskResponse.Risk.HIGH);
        } else return null;
    }
}
