import org.springframework.cloud.contract.spec.Contract


Contract.make {
    description "should return a low level of risk"

    request {
        url "/risk-level/"
        headers {
            contentType applicationJson()
        }
        body(
                "cardNumber": "4242424242424242"
        )
        method POST()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                "risk": "LOW"
        )
    }
}
