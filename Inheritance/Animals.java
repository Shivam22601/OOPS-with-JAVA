//Single inheritance

// class Animal {
//     void eat() {
//         System.out.println("Animal eats food");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// public class Animals{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat(); // inherited method from Animal class
//         d.bark(); // method of Dog class
//     }
// }



//multilevel inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class Animals {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // own
    }
}