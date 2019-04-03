package com.ortsevlised.providerService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderRiskController {
    private final ProviderRiskService providerRiskService;

    public ProviderRiskController(ProviderRiskService providerRiskService) {
        this.providerRiskService = providerRiskService;
    }

    @PostMapping("/risk-level/")
    public ProviderRiskResponse doRiskCheck(@RequestBody ProviderRiskRequest providerRiskRequest) {
        return providerRiskService.doRiskCheck(providerRiskRequest.getCardNumber());
    }

}
