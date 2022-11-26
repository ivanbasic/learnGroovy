class g250_ClosuresInCollections implements  aGroovyLesson {

    @Override
    def lesson() {

        println "List"
        def list = [11, 12, 13, 14];
        list.each {  print it+" "}
        println " WITHOUT the parameters on the left"
        list.each { int it -> print it+" "}
        println " WITH the parameters on the left"

        println "Map"
        def map = ["1" : "ana", "2" : "bob"]
        map.each { print ""+it+" "   }
        println ""
        map.each { print "${it.key} maps to: ${it.value}   " }

    }
}
