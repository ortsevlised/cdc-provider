import org.springframework.cloud.contract.spec.Contract


Contract.make {
    description "should return a high level of risk"

    request {
        url "/risk-level/"
        method POST()
        body(
                "cardNumber": "400000000000000"
        )
        headers {
            contentType applicationJson()
        }
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                "risk": "HIGH"
        )
    }
}


