class Student{
    private String name;
    private int age;

        //constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //method
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class School{
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        student1.display();
    }   
}