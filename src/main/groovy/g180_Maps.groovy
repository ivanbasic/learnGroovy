class g180_Maps implements aGroovyLesson {

    def lesson() {
        def map1 = ['key1': "value", "key2": "value"]
        def map2 = [:]

        def mapElement =  MapElement.newElement("element3")
        def map3 = [1:mapElement, 2: "string"]
    }
}

class MapElement {
    def element1
    def element2
    String element3
    int element4

    static MapElement newElement(String element3) {
        def toReturn = new MapElement()
        toReturn.setElement1("1")
        toReturn.setElement2("2")
        toReturn.setElement3(element3)
        toReturn.setElement4(1)
        return toReturn
    }
}
