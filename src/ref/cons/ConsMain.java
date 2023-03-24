package ref.cons;

public class ConsMain {
    public static void main(String[] args) {
        System.out.println("Learning Constructor Reference");
//        Provider provider = () -> {
//            return new Student();
//        };

        // constructor reference
        // ClassName::new
        Provider provider = Student::new;
        Student student = provider.getStudent();
        student.display();
    }
}
