class Student {
    private int studentId = 200;
    private char studentType;
    private String studentName;

    public Student() {
        this.studentId++;
    }

    public Student(char StudentType, String firstname, String lastname) {
        this();
        this.studentType = studentType;
        this.studentName = firstname+lastname;
    }

    public void displayDetails(Student obj) {
        System.out.println(obj.studentId+" "+obj.studentType+" "+ obj.studentName);
    }
}

public class number2 {
    
}
