package com.github.uglyog.pactgradletest;

import au.com.dius.pact.provider.junit.Consumer;
import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.runner.RunWith;

@RunWith(PactRunner.class)
@PactFolder("pacts")
@Provider("zoo-ws")
@Consumer("zoo-client")
public class ZookeeperPactTest {
  @TestTarget
  public final Target target = new HttpTarget(5050);

  @State("grizzly bear can be added to zoo")
  public void grizzlyBearCanBeAddedToZoo() {

  }
}
