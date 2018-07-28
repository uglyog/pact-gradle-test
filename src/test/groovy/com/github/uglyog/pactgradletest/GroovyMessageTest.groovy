package com.github.uglyog.pactgradletest

import au.com.dius.pact.provider.PactVerifyProvider

class GroovyMessageTest {
  @PactVerifyProvider("a hello message")
  String helloMessage() {
    println ">>>> hello"
    "\"Hello\""
  }
}
