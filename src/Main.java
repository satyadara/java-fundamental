public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Satya");
        student1.setStudentId("1001");

        System.out.println("name : " + student1.getName());
        System.out.println("std_ID : " + student1.getStudentId());

        Student student2 = new Student("Megan", "2002");

        student2.setName("Megan Update");

        System.out.println("name : " + student2.getName());
        System.out.println("std_ID : " + student2.getStudentId());
    }
}