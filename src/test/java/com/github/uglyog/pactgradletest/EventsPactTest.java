package com.github.uglyog.pactgradletest;

import au.com.dius.pact.provider.junit.Consumer;
import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.loader.PactUrl;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.runner.RunWith;

@RunWith(PactRunner.class)
@PactFolder("pacts")
@Provider("EventsProvider")
@Consumer("EventsConsumerDictionaryNestedArray")
public class EventsPactTest {
  @TestTarget
  public final Target target = new HttpTarget(5050);

  @State("initialStateForEventsTest")
  public void initialStateForEventsTest() {

  }
}
