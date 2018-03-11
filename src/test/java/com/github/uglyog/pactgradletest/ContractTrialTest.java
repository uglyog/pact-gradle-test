package com.github.uglyog.pactgradletest;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.VerificationReports;
import au.com.dius.pact.provider.junit.TargetRequestFilter;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.loader.PactUrl;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.apache.http.HttpRequest;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.apache.commons.codec.binary.Base64;

@RunWith(PactRunner.class) // Say JUnit to run tests with custom Runner
@Provider("Hello Provider") // Set up name of tested provider
//@PactUrl(urls = {"file:///home/ronald/Development/Projects/Pact/pact-gradle-test/src/test/resources/pacts/hello_consumer-hello_provider.json"})
@PactFolder("src/test/resources/pacts")
//@VerificationReports({"console", "json", "markdown"})
@Ignore
public class ContractTrialTest {
  @TestTarget // Annotation denotes Target that will be used for tests
  public final Target target = new HttpTarget(5050);

  @TargetRequestFilter
  public void exampleRequestFilter(HttpRequest request) {
    request.addHeader("Authorization", "Basic " + base64StringOf("admin", "admin"));
  }

  private String base64StringOf(String username, String password) {
    return new Base64().encodeToString((username + ":" + password).getBytes());
  }
}
