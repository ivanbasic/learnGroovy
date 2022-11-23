class g140_Numbers implements aGroovyLesson {

    @Override
    def lesson() {
        int i1 = 1_000_000_000
        Integer i2 = 1_000_000_000
        def i3 = 1_000_000_000

        def d1 = i1 * i2
        def d2 = i1 * i2 * 1.0
        def d3 = 1.0 * i1 * i2

        println(""+ i1.class + " " + i1)
        println(""+i2.class + " " + i2)
        println(""+i3.class + " " + i3)
        println( )
        println(""+d1.class + " " + d1)
        println(""+d2.class + " " + d2)
        println(""+d3.class + " " + d3)

    }
}
