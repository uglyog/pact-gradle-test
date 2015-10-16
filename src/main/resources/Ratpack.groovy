import groovy.json.JsonOutput

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
  }

}
