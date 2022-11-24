static void main(String[] args) {

    println("LEARN GROOVY")
    println("")

    process(new g100_Hello())
    process(new g110_Versions())
    process(new g120_DataTypes())
    process(new g130_RangeOperators() )
    process(new g140_Numbers() )
    process(new g150_Methods())
    process(new g_160_Strings())


}

static void process(aGroovyLesson lesson) {

    println("===============================================================")
    println(lesson.class)
    println("===============================================================")

    lesson.lesson()

    println("")
}