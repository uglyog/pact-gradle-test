package com.github.uglyog.pactgradletest;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.loader.PactBrokerAuth;
import au.com.dius.pact.provider.junit.loader.PactUrl;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.runner.RunWith;

@RunWith(PactRunner.class)
@Provider("Activity Service")
@PactUrl(urls = "file:/home/ronald/Development/Projects/Pact/pact-gradle-test/src/test/resources/wild-card-key-pact.json")
public class WildcardJUnitTest {

  @TestTarget
  public final Target target = new HttpTarget(5050);

  @State("there are Hostess Fruit pies available")
  public void state() { }
}
