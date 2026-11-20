public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Salman";
        student1.rollNumber = 101;

        Student student2 = new Student();
        student2.name = "Ali";
        student2.rollNumber = 102;

        student1.display();
        student2.display();
    }
}
