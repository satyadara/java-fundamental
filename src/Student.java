public class Student extends People {
    private String name;
    private String studentId;

    public Student() {
    }

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public Student(double height, double weight, String address, String name, String studentId) {
        super(height, weight, address);
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
