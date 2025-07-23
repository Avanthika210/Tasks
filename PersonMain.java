class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void displayStudent() {
        displayInfo();
        System.out.println("Course: " + course);
    }
}


class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayTeacher() {
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}


public class PersonMain {
    public static void main(String[] args) {
        Student student = new Student("Kavitha", 20, "Computer Science");
        System.out.println("Student Details:");
        student.displayStudent();

        System.out.println();

        Teacher teacher = new Teacher("Mr. Ravi", 45, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayTeacher();
    }
}