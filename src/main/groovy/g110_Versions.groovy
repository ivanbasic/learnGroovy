class g110_Versions implements aGroovyLesson {

    @Override
    def lesson() {
        println "Groovy version = "+ GroovySystem.version
        println "Java version = "+ System.getProperty("java.version")
    }
}
