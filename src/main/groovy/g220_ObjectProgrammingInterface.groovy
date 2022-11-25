class g220_ObjectProgrammingInterface implements aGroovyLesson {

    @Override
    def lesson() {
        def groovyImplemented = new GroovyImplemented()
        groovyImplemented.doIt()
        groovyImplemented.defaultMethod()
        println GroovyImplemented.staticString


    }
}

interface GroovyInterface {
    static String staticString="Grooooovy staticString"

    def doIt()

    default def defaultMethod() {
        println "default method"
    }

}
class GroovyImplemented implements GroovyInterface {

    @Override
    def doIt() {
        println "doIt method is implemented!"
    }
}