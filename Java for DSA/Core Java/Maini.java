import java.util.*;

record Student(String name, int id, int marks) {}
class Records {
    List<Student> students = new ArrayList<>();
    void add(Student s) {students.add(s);}
    void remove(int id) {students.removeIf(s->s.id() == id);}
    void display() {students.forEach(System.out::println);}
}
public class Maini {
    public static void main(String[] args) {
        Records r = new Records();
        r.add(new Student("Anik", 302, 95));
        r.add(new Student("Anumnik", 89, 59));
        r.add(new Student("Swabin", 109, 85));
        System.out.println("All Students: ");
        r.display();
        System.out.println("\nStudents after removal: ");
        r.remove(302);
        r.display();
    }
}