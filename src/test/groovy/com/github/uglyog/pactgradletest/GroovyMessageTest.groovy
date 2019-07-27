package com.github.uglyog.pactgradletest

import au.com.dius.pact.provider.MessageAndMetadata
import au.com.dius.pact.provider.PactVerifyProvider
import groovy.json.JsonOutput
import org.apache.commons.lang3.tuple.Pair

class GroovyMessageTest {
  @PactVerifyProvider("a hello message")
  String helloMessage() {
    "\"Hello\""
  }

  @PactVerifyProvider("a test message")
  Pair<String, Map> testMessage() {
    Pair.of(JsonOutput.toJson([
      testParam1: 'valueX',
      testParam2: 'value2'
    ]), [
      "destination": "001X",
      "Content-Type": "application/json; charset\u003dUTF-8"
    ])
  }

  @PactVerifyProvider("a test message with metadata")
  MessageAndMetadata testMessageWithMetadata() {
    new MessageAndMetadata(JsonOutput.toJson([
      testParam1: 'value1',
      testParam2: 'value2'
    ]).bytes, [
      "metadata2": "metadataValue2",
      "metadata1": "metadataValue1",
      "Content-Type": "application/json; charset\u003dUTF-8"
    ])
  }
}
