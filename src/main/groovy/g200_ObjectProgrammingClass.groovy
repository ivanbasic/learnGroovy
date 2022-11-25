class g200_ObjectProgrammingClass implements aGroovyLesson {

    @Override
    def lesson() {

        def publicStudent = new PublicStudent()
        publicStudent.setStudentID(1)
        publicStudent.setStudentName("John")
        publicStudent.studentID = -1
        publicStudent.studentName = "-John"
        println publicStudent


        def privateStudent = new PrivateStudent()
        // No signature of method:
        //privateStudent.setStudentID(1)
        //privateStudent.setStudentName("John")
        // No such property:
        //privateStudent.StudentID=-1
        //privateStudent.StudentName="-John"
        println privateStudent


    }
}

class PublicStudent {
    int studentID
    String studentName

    //The field StudentName and studentName on the class PublicStudent will result in duplicate JavaBean properties, which is not allowed
    //String StudentName

    String toString() { return "PublicStudent " + studentID + " " + studentName }
}

class PrivateStudent {
    private int studentID
    private String studentName
    private String StudentName

    String toString() { return "PrivateStudent " + studentID + " " + studentName + " " + StudentName }
}

