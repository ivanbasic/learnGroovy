class g210_ObjectProgrammingAbstractClass implements aGroovyLesson {

    @Override
    def lesson() {
        def concreteClass = new ConcreteClass()
        concreteClass.printName()

    }
}

abstract class AbstractClass {
    String name

    abstract def printName()

    AbstractClass() {
        this.name = "default name"
    }

}


class ConcreteClass extends AbstractClass {
    def printName() { println name }
}