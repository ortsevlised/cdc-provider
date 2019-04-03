package com.ortsevlised.providerService;

public class ProviderRiskResponse {

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public ProviderRiskResponse(Risk risk) {
        this.risk = risk;
    }

    Risk risk;

    public enum Risk {
        HIGH,
        LOW
    }
}
