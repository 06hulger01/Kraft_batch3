package day_38_Static.staticVariables;

public class Student_Test {
    public static void main(String[] args) {
        Student_ student_1 = new Student_("Bülent");
        Student_ student_3 = new Student_("Ömer");
        Student_ student_2 = new Student_("Ferid");

        Student_.name="Cengiz";

        student_1.printName();
        student_2.printName();
        student_3.printName();

    }
}
