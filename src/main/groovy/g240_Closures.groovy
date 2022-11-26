class g240_Closures implements  aGroovyLesson{

    @Override
    def lesson() {
        def outer= "Outer"

        //Caught: groovy.lang.MissingMethodException: No signature of method: g240_Closures$_lesson_closure1.call() is..
        //def clos1 = { (int param1, int param2) -> println "closure  ${param1}   ${param2}" }
        //clos1.call(100,200)

        def clos2 = { int param1, int param2 -> { println "closure2  ${param1}   ${param2}" } }
        clos2.call(100,200)

        def clos3 = { int param1, int param2 -> println "closure3  ${param1}   ${param2}" }
        clos3.call(300,400 )

        def clos4 = { int param1, int param2 -> println "closure4  ${param1}   ${param2} ${outer}" }
        clos4.call(500,600 )

    }
}
