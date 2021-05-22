package com.github.uglyog.pactgradletest.junit5;

import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.IgnoreNoPactsToVerify;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
import au.com.dius.pact.provider.junitsupport.loader.PactBrokerAuth;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@Provider("foo")
@PactBroker(url = "https://test.pact.dius.com.au",
  authentication = @PactBrokerAuth(username = "dXfltyFMgNOFZAxr8io9wJ37iUpY42M", password = "O5AIZWxelWbLvqMd8PkAVycBJh2Psyg1")
)
@IgnoreNoPactsToVerify
public class FooPactTest {

  @TestTemplate
  @ExtendWith(PactVerificationInvocationContextProvider.class)
  void pactVerificationTestTemplate(PactVerificationContext context) {
    if (context != null) {
      context.verifyInteraction();
    }
  }
}
