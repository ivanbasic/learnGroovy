static void main(String[] args) {

    println("LEARN GROOVY")
    println("")

    process new g100_Hello()
    process new g110_Versions()
    process new g120_DataTypes()
    process new g130_RangeOperators()
    process new g140_Numbers()
    process new g150_Methods()
    process new g160_Strings()
    process new g170_Lists()
    process new g180_Maps()
    process new g190_RegularExpressions()
    process new g200_ObjectProgrammingClass()
    process new g210_ObjectProgrammingAbstractClass()
    process new g220_ObjectProgrammingInterface()
    process new g230_Traits()
    process new g240_Closures()
    process new g250_ClosuresInCollections()
}

static void process(aGroovyLesson lesson) {

    println("===============================================================")
    println(lesson.class)
    println("===============================================================")

    lesson.lesson()

    println("")
}