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

    get('activities') {
      response.contentType('application/json')
      render(JsonOutput.toJson([
        activities: [
          [name: "Bob", "description": "Description of bob"],
          [name: "Fred", "description": "Description of Fred"],
        ]
      ]))
    }

    get('api/broker/add') {
      println "path=${request.path}"
      println "query=${request.query}"
      render "Ok"
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
          [name: "Bob", "description": "Description of bob"],
          [name: "Fred", "description": "Description of Fred"],
        ]
      ]))
    }

    post('tasks/pactStateChange') {
      println "path=${request.path}"
      println "contentType=${request.contentType}"
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
