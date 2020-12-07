package lesson8.students;

public class Demo {
    public Student createHighestParent() {
//       Course[] coursesTaken = new Course[7];

        Student student = new Student("Yanina", "Kovalenko", 5, createHighestParent().coursesTaken);
        return student;
    }

    public SpecialStudent createLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent("Vladislav", "Luchko", 6, createLowestChild().coursesTaken, 1234567, "vlad@gmail.com");
        return specialStudent;
    }
}
