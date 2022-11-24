class g160_Strings implements aGroovyLesson {

    @Override
    def lesson() {
        String sample = "012345";

        println sample

        println("[4] = "+  sample[4])
        println("[-2] = "+ sample[-2])
        println("[1..2] = "+ sample[1..2])
        println("[4..2] = "+ sample[4..2])
    }
}
