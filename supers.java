// The super keyword refers to superclass (parent) objects.
// The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

// ek hii object me 2 class ka kaam ho jata hai 



// class Animal { // Superclass (parent)
//     public void animalSound() {
//        System.out.println("The animal makes a sound");
//     }
//   }
  
//   class Dog extends Animal { // Subclass (child)
//     public void animalSound() {
//       super.animalSound(); // Call the superclass method
//       System.out.println("The dog says: bow wow");
//     }
//   }
  
//   public class supers {
//     public static void main(String args[]) {
//       Animal myDog = new Dog(); // Create a Dog object
//       myDog.animalSound(); // Call the method on the Dog object
//     }
//   }


class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void show(int a) {
        System.out.println(a);         // Parameter 'a'
        System.out.println(this.a);    // Instance variable 'a' of class B
        System.out.println(super.a);   // Instance variable 'a' of class A
    }

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show(30);
    }
}
