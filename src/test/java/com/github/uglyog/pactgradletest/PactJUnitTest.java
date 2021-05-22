//  package com.github.uglyog.pactgradletest;
//
//  import au.com.dius.pact.provider.junit.PactRunner;
//  import au.com.dius.pact.provider.junit.target.HttpTarget;
//  import au.com.dius.pact.provider.junitsupport.Provider;
//  import au.com.dius.pact.provider.junitsupport.State;
//  import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
//  import au.com.dius.pact.provider.junitsupport.loader.PactBrokerAuth;
//  import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
//  import au.com.dius.pact.provider.junitsupport.target.Target;
//  import au.com.dius.pact.provider.junitsupport.target.TestTarget;
//  import org.junit.runner.RunWith;
//
//  @RunWith(PactRunner.class)
//  @Provider("multicookie_provider")
//  @PactBroker(host = "test.pact.dius.com.au", tags = {"test"}, scheme = "https",
//    authentication = @PactBrokerAuth(username = "dXfltyFMgNOFZAxr8io9wJ37iUpY42M", password = "O5AIZWxelWbLvqMd8PkAVycBJh2Psyg1"))
////  @PactFolder("pacts")
//  public class PactJUnitTest {
//
//    @TestTarget
//    public final Target target = new HttpTarget(5050);
//
//  @State("many activities exist")
//  public void state() { }
//}
