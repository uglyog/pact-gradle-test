//package com.github.uglyog.pactgradletest;
//
//import au.com.dius.pact.provider.junit.MessagePactRunner;
//import au.com.dius.pact.provider.junit.target.AmqpTarget;
//import au.com.dius.pact.provider.junitsupport.Provider;
//import au.com.dius.pact.provider.junitsupport.State;
//import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
//import au.com.dius.pact.provider.junitsupport.target.Target;
//import au.com.dius.pact.provider.junitsupport.target.TestTarget;
//import org.junit.runner.RunWith;
//
//import java.util.Collections;
//
//@RunWith(MessagePactRunner.class)
//@Provider("Message Service")
////@PactBroker(host = "${pactbroker.url:localhost}", port = "1234", tags = {"latest", "prod", "dev"},
////  failIfNoPactsFound = false, authentication = @PactBrokerAuth(username = "test", password = "test"))
//@PactFolder("src/test/resources")
//public class MessageJUnitTest {
//
//  @TestTarget
//  public final Target target = new AmqpTarget(Collections.singletonList("com.github.uglyog.pactgradletest.*"));
//
//  @State("message exists")
//  public void state() { }
//}
