package com.ortsevlised.providerService;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static com.ortsevlised.providerService.ProviderRiskResponse.Risk.HIGH;
import static com.ortsevlised.providerService.ProviderRiskResponse.Risk.LOW;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BaseContractTest {

    @Before
    public void setup() {
       /* final ProviderRiskService providerRiskService = mock(ProviderRiskService.class);
        when(providerRiskService.doRiskCheck("400000000000000")).thenReturn(new ProviderRiskResponse(HIGH));
        when(providerRiskService.doRiskCheck("4242424242424242")).thenReturn(new ProviderRiskResponse(LOW));
*/
        RestAssuredMockMvc.standaloneSetup(new ProviderRiskController(new ProviderRiskService()));
    }

}