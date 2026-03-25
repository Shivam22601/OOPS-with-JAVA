class Student {
    String name;
    int age;

    // 🔹 Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // 🔹 Parameterized Constructor (1 parameter)
    Student(String name) {
        this.name = name;
        this.age = 18;
        System.out.println("Parameterized Constructor (1 param) Called");
    }

    // 🔹 Parameterized Constructor (2 parameters)
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor (2 params) Called");
    }

    // 🔹 Method to display data
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class constructor {
    public static void main(String[] args) {

        // 🔥 Object 1 → Default Constructor
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // 🔥 Object 2 → Parameterized Constructor (1 param)
        Student s2 = new Student("Shivam");
        s2.display();

        System.out.println();

        // 🔥 Object 3 → Parameterized Constructor (2 params)
        Student s3 = new Student("Rahul", 22);
        s3.display();
    }
}