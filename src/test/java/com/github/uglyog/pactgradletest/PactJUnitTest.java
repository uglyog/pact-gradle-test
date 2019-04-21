  package com.github.uglyog.pactgradletest;

  import au.com.dius.pact.provider.junit.PactRunner;
  import au.com.dius.pact.provider.junit.Provider;
  import au.com.dius.pact.provider.junit.State;
  import au.com.dius.pact.provider.junit.loader.PactFolder;
  import au.com.dius.pact.provider.junit.target.HttpTarget;
  import au.com.dius.pact.provider.junit.target.Target;
  import au.com.dius.pact.provider.junit.target.TestTarget;
  import org.junit.runner.RunWith;

  @RunWith(PactRunner.class)
  @Provider("multicookie_provider")
//  @PactBroker(host = "test.pact.dius.com.au", tags = {"test"}, scheme = "https",
//    authentication = @PactBrokerAuth(username = "test", password = "test"))
  @PactFolder("pacts")
  public class PactJUnitTest {

    @TestTarget
    public final Target target = new HttpTarget(5050);

  @State("many activities exist")
  public void state() { }
}
