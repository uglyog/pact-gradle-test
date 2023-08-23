package com.github.uglyog.pactgradletest.junit5;

import au.com.dius.pact.core.pactbroker.ConsumerVersionSelectors;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.loader.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;

@Provider("Activity Service")
@PactBroker(url = "https://test.pactflow.io",
  authentication = @PactBrokerAuth(username = "dXfltyFMgNOFZAxr8io9wJ37iUpY42M", password = "O5AIZWxelWbLvqMd8PkAVycBJh2Psyg1")
)
public class PactJUnitTest {


  @PactBrokerConsumerVersionSelectors
  public static List<ConsumerVersionSelectors.Selector> selectors() {
    return Arrays.asList(new ConsumerVersionSelectors.Selector("tag/with/slash", true, "Foo Web Client"));
  }

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
