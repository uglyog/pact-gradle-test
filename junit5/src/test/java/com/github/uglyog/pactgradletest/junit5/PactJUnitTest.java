package com.github.uglyog.pactgradletest.junit5;

import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
import au.com.dius.pact.provider.junitsupport.loader.PactBrokerAuth;
import au.com.dius.pact.provider.junitsupport.loader.VersionSelector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@Provider("Activity Service")
@PactBroker(url = "https://test.pact.dius.com.au",
  authentication = @PactBrokerAuth(username = "dXfltyFMgNOFZAxr8io9wJ37iUpY42M", password = "O5AIZWxelWbLvqMd8PkAVycBJh2Psyg1"),
  consumerVersionSelectors = { @VersionSelector(consumer = "Foo Web Client", tag = "tag/with/slash") }
)
public class PactJUnitTest {

  @BeforeEach
  void setup(PactVerificationContext context) {
    context.setTarget(new HttpTestTarget("127.0.0.1", 5050));
  }

  @TestTemplate
  @ExtendWith(PactVerificationInvocationContextProvider.class)
  void testTemplate(PactVerificationContext context) {
    context.verifyInteraction();
  }

  @State("many activities exist")
  void manyActivitiesExist() {

  }
}
