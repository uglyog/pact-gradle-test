//package com.github.uglyog.pactgradletest.junit5;
//
//import io.pact.consumer.MockServer;
//import io.pact.consumer.dsl.PactDslWithProvider;
//import io.pact.consumer.junit5.PactConsumerTestExt;
//import io.pact.consumer.junit5.PactTestFor;
//import io.pact.core.model.RequestResponsePact;
//import io.pact.core.model.annotations.Pact;
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.entity.EntityBuilder;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.ContentType;
//import org.apache.http.impl.client.HttpClients;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//import java.io.IOException;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.Matchers.is;
//
//@ExtendWith(PactConsumerTestExt.class)
//@PactTestFor(providerName = "ArticlesProvider", port = "1234")
//public class PactCsvConsumerTest {
//
//  @Pact(consumer = "Consumer")
//  RequestResponsePact pact(PactDslWithProvider builder) {
//    return builder
////      .usingPlugin("pact-csv")
//      .uponReceiving("a request to save a CSV file")
//      .method("POST")
//      .path("/values")
//      .body("OrderNo,Value,Name\n1001,$100.20,Pete\n203,$22.6,Bob\n", "text/csv")
//      .willRespondWith()
//      .status(200)
//      .toPact();
//  }
//
//  @Test
//  void testFiles(MockServer mockServer) throws IOException {
//    HttpEntity body = EntityBuilder.create()
//      .setText("OrderNo,Value,Name\n1001,$200.20,Pete\n203,$22.6,Bob\n")
//      .setContentType(ContentType.create("text/csv"))
//      .gzipCompress()
//      .build();
//    HttpClient httpClient = HttpClients.createDefault();
//    HttpPost post = new HttpPost(mockServer.getUrl() + "/values");
//    post.setEntity(body);
//    HttpResponse httpResponse = httpClient.execute(post);
//    assertThat(httpResponse.getStatusLine().getStatusCode(), is(equalTo(200)));
//  }
//}
