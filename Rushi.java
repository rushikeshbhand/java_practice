//parent class Person
class Person {
    // Attributes of the Person class
    String name;
    int age;

    // Constructor is used to initialize name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make the person speak
    void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

// child class Student that inherits from Person class
class Student extends Person {
           // Additional attribute of the Student class
    int grade;

 // Constructor to initialize name, age, and grade
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

          // Method for the student to study
    void study() {
        System.out.println(name + " is studying in grade " + grade + ".");
    }
}

public class Rushi {
    public static void main(String[] args) { //main statement
        // Create an object of the Student class
        Student student = new Student("John", 15, 9);

        // Call the speak and study methods
        student.speak();
        student.study();
    }
}
