package com.github.uglyog.pactgradletest;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(PactRunner.class)
@Provider("Activity Service")
@PactBroker(host = "${pactbroker.url:localhost}", port = "8080", tags = {"prod", "dev"})
@Ignore
public class PactJUnitTest {

  @TestTarget
  public final Target target = new HttpTarget(5050);

}
