package com.github.uglyog.pactgradletest;

import au.com.dius.pact.provider.PactVerifyProvider;

public class MessageTest {
  @PactVerifyProvider("a hello message")
  public String helloMessage() {
    return "\"Hello\"";
  }
}
