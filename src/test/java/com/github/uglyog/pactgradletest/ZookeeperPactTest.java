//package com.github.uglyog.pactgradletest;
//
//import au.com.dius.pact.provider.junit.PactRunner;
//import au.com.dius.pact.provider.junit.target.HttpTarget;
//import au.com.dius.pact.provider.junitsupport.Consumer;
//import au.com.dius.pact.provider.junitsupport.Provider;
//import au.com.dius.pact.provider.junitsupport.State;
//import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
//import au.com.dius.pact.provider.junitsupport.target.Target;
//import au.com.dius.pact.provider.junitsupport.target.TestTarget;
//import org.junit.runner.RunWith;
//
//@RunWith(PactRunner.class)
//@PactFolder("pacts")
//@Provider("zoo-ws")
//@Consumer("zoo-client")
//public class ZookeeperPactTest {
//  @TestTarget
//  public final Target target = new HttpTarget(5050);
//
//  @State("grizzly bear can be added to zoo")
//  public void grizzlyBearCanBeAddedToZoo() {
//
//  }
//}
