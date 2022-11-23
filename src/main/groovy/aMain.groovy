static void main(String[] args) {

    println("LEARN GROOVY")
    println("")

    process(new g100_Hello())
    process(new g110_Second())
    process(new g120_DataTypes())

}

static void process(aGroovyLesson lesson) {

    println("===============================================================")
    println(lesson.class.toString().replace("class", "lesson"))
    println("===============================================================")

    lesson.lesson();

    println("")
}