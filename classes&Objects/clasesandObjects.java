public class clasesandObjects{
    static class Student{
        String name;
        int age;

        Student(String name, int age){
            this.age = age;
            this.name = name;
        }

        void display(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        void study(){
            System.out.println(name + " is studying.");
        }
    }

    public static void main(String[] args){
        Student s1 = new Student("Alice", 20);
        s1.display();
        s1.study();
    }
}