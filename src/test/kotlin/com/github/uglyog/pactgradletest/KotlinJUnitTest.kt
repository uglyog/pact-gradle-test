package com.github.uglyog.pactgradletest

import au.com.dius.pact.provider.junit.PactRunner
import au.com.dius.pact.provider.junit.Provider
import au.com.dius.pact.provider.junit.State
import au.com.dius.pact.provider.junit.loader.PactBroker
import au.com.dius.pact.provider.junit.loader.PactBrokerAuth
import au.com.dius.pact.provider.junit.target.HttpTarget
import au.com.dius.pact.provider.junit.target.TestTarget
import org.junit.runner.RunWith

@RunWith(PactRunner::class)
@Provider("Activity Service")
@PactBroker(host = "test.pact.dius.com.au", tags = ["test"], scheme = "https",
  authentication = PactBrokerAuth(username = "test", password = "test"))
class KotlinJUnitTest {

  @TestTarget
  val target = HttpTarget(5050)

  @State("many activities exist")
  fun state() {
  }
}
