class g150_Methods implements aGroovyLesson {

    @Override
    def lesson() {
        method(1, 2);

        println "No signature of method: g150_Methods.method() is applicable for argument types: (String, String)"
        //method(  "string ", "string")

        println "Cannot cast object 'null' with class 'null' to class 'int' "
        //int ii = method2("string", 1)
    }


    def method(def parameter1, int parameter2) {
        println "method " + parameter1 + " " + parameter2
        return 1
    }

    int method2(def parameter1, int parameter2) {
    }
}
