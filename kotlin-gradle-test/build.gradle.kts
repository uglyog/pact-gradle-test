plugins {
    id("au.com.dius.pact")
}

pact {
    
    serviceProviders {
        "Activity Service" {
            port = 5050
        } 
    }
    
    publish {
        pactBrokerUrl = "http://localhost:80"
    }
}
