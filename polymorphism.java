
// class Animal {   // Parent class
//     public void makeSound() {
//         System.out.println("Some sound");
//     }
// }

// // Child class inheriting from Animal
// class Dog extends Animal {
//     // Overriding makeSound method of parent class
//     @Override
//     public void makeSound() {
//         System.out.println("Woof");
//     }
// }

// // Another child class inheriting from Animal
// class Cat extends Animal {
//     // Overriding makeSound method of parent class
//     @Override
//     public void makeSound() {
//         System.out.println("Meow");
//     }
// }

// // Main class
// public class polymorphism {
//     public static void main(String[] args) {
//         // Creating objects of different classes
//         Animal animal1 = new Animal();
//         Animal animal2 = new Dog();
//         Animal animal3 = new Cat();

//         // Calling makeSound method of each object
//         animal1.makeSound(); // Output: Some sound  // method will be callled on the basis of object created 
//         animal2.makeSound(); // Output: Woof
//         animal3.makeSound(); // Output: Meow
//     }
// }

// ========================================================================================
// // polymorphism ka best example hai 

// class AeroPlane1
// {
//     public void takeOff() // method 1 
//     {
//         System.out.println("AeroPlane is taking off");
//     }
//     public void fly() // method 2 
//     {
//         System.out.println("AeroPlane is Flying");
//     }
// }
// class CargoPlane1 extends AeroPlane1  // ( inheritance )
// {
//     public void takeOff()  // method 1 
//     {
//         System.out.println("CargoPlane requires longer runway");   // overriding
//     }
//    public void fly()  // method 2 
//    {
//     System.out.println("Cargoplane flies at lower height");   // overriding
//    }  
// }
// class PassengerPlane1 extends AeroPlane1     // ( inheritance )
// {
//     public void takeOff()  // method 1 
//     {
//         System.out.println("PassengerPlane requires medium size runway");  // overriding
//     }
//     public void fly()  // method 2 
//     {
//     System.out.println("PassengerPlane flies at medium height");   // overriding
//     }
// }

// public class polymorphism 
// {
//     public static void main(String[] args) 

//     {

//         CargoPlane1 cp=new CargoPlane1();  // object Created 
//         PassengerPlane1 pp=new PassengerPlane1();
//         AeroPlane1  dp = new AeroPlane1();


//         cp.takeOff();   // method will be callled on the basis of object created 
//         cp.fly();

//         pp.takeOff(); // method will be callled on the basis of object created 
//         pp.fly();

//         dp.takeOff() ; // method will be callled on the basis of object created 
//         dp.fly(); 


// // // or 



//         // CargoPlane1 cp=new CargoPlane1();

//         // // cp.takeOff();
//         // // cp.fly();
        
//         // PassengerPlane1 pp=new PassengerPlane1();
//         // // pp.takeOff();
//         // // pp.fly();


//         // // AeroPlane1  dp = new AeroPlane1();
//         // // dp.takeOff() ;
//         // // dp.fly(); 


       
//         AeroPlane1 ref;

//         ref=cp;

//         ref.takeOff();   // same thing exist in multiple form called polymorphism
//         ref.fly();

//         System.out.println("------------------------------------------------");

//         ref=pp;

//         ref.takeOff();  // same thing exist in multiple form called polymorphism
//         ref.fly();

//        // pp=cp; not possible 

//     }
    
// }

// ========================================================================================
// polymorphism ka 2nd example 


// class AeroPlane2
// {
//     public void takeOff() // method 1 
//     {
//         System.out.println("AeroPlane is taking off");
//     }
//     public void fly() // method 2 
//     {
//         System.out.println("AeroPlane is Flying");
//     }
// }
// class CargoPlane2 extends AeroPlane2  // method overriding
// {
//     public void takeOff()  // method 1 
//     {
//         System.out.println("CargoPlane requires longer runway");   // overriding
//     }
//    public void fly()  // method 2 
//    {
//     System.out.println("Cargoplane flies at lower height");   // overriding
//    }  
// }
// class PassengerPlane2 extends AeroPlane2   // method overriding
// {
//     public void takeOff()
//     {
//         System.out.println("PassengerPlane requires medium size runway");  // overriding
//     }
//     public void fly()
//     {
//     System.out.println("PassengerPlane flies at medium height");   // overriding
//     }
// }

// class FighterPlane2 extends AeroPlane2   // method overriding
// {
//     public void takeOff()
//     {
//         System.out.println("PassengerPlane requires medium size runway");  // overriding
//     }
//     public void fly()
//     {
//     System.out.println("PassengerPlane flies at medium height");   // overriding
//     }
// }

// class Airport{

//     public void poly(AeroPlane2 ref){


//         ref.fly();
//         ref.takeOff();
//         System.out.println("====================================");
//     }
// }


// public class polymorphism 
// {
//     public static void main(String[] args) 
//     {
//         CargoPlane2 cp=new CargoPlane2();


//         PassengerPlane2 pp=new PassengerPlane2();

//         FighterPlane2 fp=new FighterPlane2() ;


//       Airport r =new Airport();
//       r.poly(cp);
//       r.poly(pp);
//       r.poly(fp);


//     }
// }


// ========================================================================================
// Java Program for Method overloading
// By using Different Types of Arguments 
 
// Class 1
class Helper {
 
    // Method 1 with 2 integer parameters
    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }
 
    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}
 
// Class 2
// Main class
class polymorphism {
    // Main driver method
    public static void main(String[] args)
    {
        // Calling method by passing
        // input as in arguments
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
    }
}

// ============================================================================================================

// Java Program for Method Overriding
// method_overriding = inheritance ka concept hai 
// parameter or method dono same hoga 
// class different hoga super and sub class 
// Ex- class human , class boy extends human

// If subclass (child class) has the same method as declared in the parent class, 
// it is known as method overriding in Java.

// // Class 1
// class Parent {

// 	// Method of parent class
// 	void Print()
// 	{
// 		System.out.println("parent class");
// 	}
// }

// // Class 2
// class subclass1 extends Parent {

// 	// Method
// 	void Print() { System.out.println("subclass1"); }  // If subclass (child class) has the same method as declared in the parent class,
//                                                           // it is known as method overriding in Java.
// }

// // Class 3
// class subclass2 extends Parent {

// 	// Method
// 	void Print()
// 	{
// 		System.out.println("subclass2");           
// 	}
// }

// // Class 4
// // Main class
// class polymorphism {

// 	// Main driver method
// 	public static void main(String[] args)
// 	{
// 		// Creating object of class 1
// 		Parent a;

// 		// Now we will be calling print methods
// 		// inside main() method

// 		a = new subclass1();
// 		a.Print();

// 		a = new subclass2();
// 		a.Print();
// 	}
// }














































// In method overloading,
//  methods must have the same name and different parameter.

//  In method overriding, 
//  methods must have the same name and parameter but difeerent class i.e paarent and sub class .


//  In method overloading, 
//  the return type can or can not be the same, but we just have to change the parameter.

// In method overriding, 
// the return type must be the same or co-variant.






















