class g230_Traits implements aGroovyLesson {

    @Override
    def lesson() {
        def clazz = new Clazz()

        //Caught: groovy.lang.MissingMethodException: No signature of method: Clazz.defaultMethod()
        //clazz.defaultMethod()

        //Caught: groovy.lang.MissingMethodException: No signature of method: Clazz.interfaceMethod()
        //clazz.interfaceMethod()


        clazz.defaultMethod(1000)
        clazz.interfaceMethod(2000, 3000)
        clazz.firstTrait()
        clazz.secondTrait()
        println clazz.firstTrait
        println clazz.secondTrait
        println clazz.clazz
    }
}

class Clazz implements TraitFirst, TraitSecond {
    String clazz = "clazz property"
}


trait TraitSecond {
    //Groovyc: The return type of java.lang.String getTraitProperty() in Clazz is incompatible with int in TraitFirst
    //String traitProperty="string"

    String secondTrait = "second trait property"

    void secondTrait() {
        println "second trait method"
    }
}

trait TraitFirst implements Interface {
    String firstTrait = "first trait property"

    void interfaceMethod(int a, int b) {
        println "interface method implemented " + a + " " + b
    }

    void firstTrait() {
        println "first trait method"
    }
}

interface Interface {
    void interfaceMethod(int a, int b)

    default void defaultMethod(int d) {
        println "interface default method " + d
    }
}

