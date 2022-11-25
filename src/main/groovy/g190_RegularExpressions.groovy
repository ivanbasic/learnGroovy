class g190_RegularExpressions implements aGroovyLesson {

    @Override
    def lesson() {
        def patternGroovy = ~"([Gg])roovy"
        def patternXroovy = ~".roovy"

        def patternOneDigit = ~"[0-9]"
        def patternOneDigitRest = ~"[0-9]rest"

        //Regular expressions can also include quantifiers.
        // The plus sign (+) represents one or more times, applied to the preceding element of the expression.
        // The asterisk (*) is used to represent zero or more occurrences.
        // The question mark (?) denotes zero or once.
        def patternOneDigitAndOneOrMore = ~"[0-9](.+)"
        def patternOneDigitAndZeroOrMore = ~"[0-9](.*)"
        def patternOneDigitAndZeroOrOnce = ~"[0-9](.?)"


        // Groovy regular expressions have a ==~ operator
        // which will determine if your string matches a given regular expression pattern.
        println "pattern Xroovy:"
        println "Groovy" ==~ patternGroovy
        println "groovy" ==~ patternGroovy
        println "Xroovy" ==~ patternXroovy
        println "Yroovy" ==~ patternXroovy


        println ""
        println "pattern digit and one or more"
        println "1" ==~ patternOneDigit
        println "9" ==~ patternOneDigit
        println "9rest" ==~ patternOneDigitRest
        println "1asdfGHjkl" ==~ patternOneDigitAndOneOrMore

        println ""
        println "pattern digit and zero or more"
        println "1" ==~ patternOneDigitAndZeroOrMore
        println "1abc" ==~ patternOneDigitAndZeroOrMore

        println ""
        println "pattern digit and zero-or-once"
        println "1" ==~ patternOneDigitAndZeroOrOnce
        println "1a" ==~ patternOneDigitAndZeroOrOnce


    }
}
