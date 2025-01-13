// Static variables

// public class Static {
//     // Static variable
//     public static int static Variable = 10;

//     public static void main(String[] args) {
//         // Accessing static variable without creating an object
//         System.out.println(Example.staticVariable);

//         // You can also access it using an object, but it's not necessary
//         Example obj = new Example();
//         System.out.println(obj.staticVariable); // This is not conventional for static variables
//     }
// }

// local variable

// public class Example {
//     public void myMethod() {
//         int x = 10; // This is a local variable

//         // You can use x within this method
//         System.out.println(x);
//     }

//     public static void main(String[] args) {
//         // Uncommenting the following line would result in a compilation error
//         // System.out.println(x); // Error: cannot find symbol 'x'

//         Example obj = new Example();
//         obj.myMethod(); // This will print the value of x within the myMethod
//     }
// }

// instance variable

// public class Static {
//     // Static variable
//     static int staticVar = 5;

//     // Instance variables
//     String instanceVar = "Instance Variable";
//     int instanceNumber;

//     // Constructor with parameters to initialize instance variables
//     public Static(int number) {
//         this.instanceNumber = number;
//     }

//     // Method with a local variable
//     public void exampleMethod() {
//         // Local variable
//         int localVar = 10;

//         System.out.println("Static Variable: " + staticVar);
//         System.out.println("Instance Variable: " + instanceVar);
//         System.out.println("Instance Number: " + instanceNumber);
//         System.out.println("Local Variable: " + localVar);
//     }

//     public static void main(String[] args) {
//         // Creating an instance of VariableExample
//         Static myObject = new Static(20);

//         // Accessing instance method that uses all three types of variables
//         myObject.exampleMethod();
//     }
// }


