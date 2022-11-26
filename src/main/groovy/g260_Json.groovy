import groovy.json.JsonSlurper

class g260_Json implements aGroovyLesson {

    @Override
    def lesson() {
        parsingText()
        restClientGet()
        restClientPost()
    }


    def parsingText() {
        println "parsing text"

        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')

        println object.name
        println object.ID
    }

    def restClientGet() {
        println "GET rest api "

        def get = new URL("http://worldclockapi.com/api/json/utc/now").openConnection()
        def getRC = get.getResponseCode()
        println(getRC)
        if (getRC.equals(200)) {
            println(get.getInputStream().getText())
        }
    }

    def restClientPost() {
        println "POST rest api "

        def post = new URL("http://worldclockapi.com/api/json/utc/now").openConnection()
        def message = '{"message":"this is a message"}'
        post.setRequestMethod("POST")
        post.setDoOutput(true)
        post.setRequestProperty("Content-Type", "application/json")
        post.getOutputStream().write(message.getBytes("UTF-8"))
        def postRC = post.getResponseCode()
        println(postRC)
        if (postRC.equals(200)) {
            println(post.getInputStream().getText())
        }
        if (postRC.equals(405)) {
            println "405 = Method Not Allowed"
        }
    }

}

