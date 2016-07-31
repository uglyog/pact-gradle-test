import groovy.json.JsonOutput
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ratpack.handling.RequestLogger
import ratpack.http.TypedData

import static ratpack.groovy.Groovy.ratpack

final Logger logger = LoggerFactory.getLogger(Ratpack.class)

ratpack {

  handlers {

    all RequestLogger.ncsa(logger)

    get {
      response.contentType('application/json')
      render(JsonOutput.toJson([
        _links: [:]
      ]))
    }

    get('activities') {
      response.contentType('application/json')
      render(JsonOutput.toJson([
        activities: [
//          [name: "Bob", "description": "Description of bob"],
          [name: "Fred", "description": 100],
        ]
      ]))
    }

    get('api/broker/add') {
      println "path=${request.path}"
      println "query=${request.query}"
      render "Ok"
    }

    put('unfriendMe') {
      println "path=${request.path}"
      println "query=${request.query}"
      response.contentType('application/json')
      render JsonOutput.toJson("Ok")
    }

    post('query') {
      println "path=${request.path}"
      println "contentType=${request.contentType}"
      println "headers:"
      request.headers.names.each {
        println "    $it=[${request.headers.get(it)}]"
      }
      request.getBody().then { TypedData data ->
        println "body=[${data.text}]"
      }

      response.contentType('application/json')
      render(JsonOutput.toJson([
        activities: [
//          [name: "Bob", "description": "Description of bob"],
          [name: "Fred", "description": 100],
        ]
      ]))
    }

    post('tasks/pactStateChange') {
      println "path=${request.path}"
      println "contentType=${request.contentType}"
      println "query=${request.query}"
      println "headers:"
      request.headers.names.each {
        println "    $it=[${request.headers.get(it)}]"
      }
      request.getBody().then { TypedData data ->
        println "body=[${data.text}]"
      }
      render('OK')
    }
  }

}
