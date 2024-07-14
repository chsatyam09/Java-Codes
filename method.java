// A method is a block of code which only runs when it is called.

// You can pass data, known as parameters, into a method.

// Methods are used to perform certain actions, and they are also known as functions.

// Why use methods? To reuse code: define the code once, and use it many times

// A method must be declared within a class. It is defined with the name of the method, 
// followed by parentheses ().


// myMethod() is the name of the method
// static means that the method belongs to the Main class and not an object of the Main class.
// void means that this method does not have a return value.

// public class method {
//    static void myMethod(){  //static means that the method belongs to the Method class
//                            // and not an object of the Method class
//         System.out.println("Hello-World");
//     }
//     public static void main(String[] args) {
//         myMethod();
//     }
// }


// =========================================================================================

// Parameters and Arguments



// public class method {

//     static void myMethod( String fname){
//         System.out.println(fname + "  " + "satyam");
//     }

//     public static void main(String[] args) {
//         myMethod("Hello");
//     }

    
// }

// public class method {

//     static void myMethod(String fname ){
//         System.out.println(fname);
//     }

//     public static void main(String[] args) {
//         myMethod("Hello");
//     }

    
// }

// =========================================================================================
// Access Methods With an Object
// Example
// Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:

// // Create a Main class
// public class Main {
 
//   // Create a fullThrottle() method
//   public void fullThrottle() {
//     System.out.println("The car is going as fast as it can!");
//   }

//   // Create a speed() method and add a parameter
//   public void speed(int maxSpeed) {
//     System.out.println("Max speed is: " + maxSpeed);
//   }

//   // Inside main, call the methods on the myCar object
//   public static void main(String[] args) {
//     Main myCar = new Main();   // Create a myCar object
//     myCar.fullThrottle();      // Call the fullThrottle() method
//     myCar.speed(200);          // Call the speed() method
//   }
// }

// // The car is going as fast as it can!
// // Max speed is: 200