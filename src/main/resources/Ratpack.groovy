import groovy.json.JsonOutput
import ratpack.http.TypedData

import static ratpack.groovy.Groovy.ratpack

ratpack {

  handlers {

    get('activities') {
      response.contentType('application/json')
      render(JsonOutput.toJson([
        activities: [
          [name: "Bob", "description": "Description of bob"],
          [name: "Fred", "description": "Description of Fred"],
        ]
      ]))
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
  }

}
