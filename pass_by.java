// Call-by-reference or pass-by-reference is not supported in Java. Java supports pass-by-value only.
// // pass/call_by_refrence and pass/call_by_value 

// Pass-by-reference: When a method is called, the method arguments reference the same variable in memory as the caller.
// Pass-by-value: When a method is called, the caller passes a copy of the argument variables to the method resulting in two values in memory.

// Pass by Value:

// In pass by value, the actual value of the argument is passed to the function or method.
// The function receives a copy of the argument's value, and any changes made to the parameter inside the function do not affect the original value outside of it.
// This is common for primitive data types like integers, floats, characters, etc.
// Java uses pass by value for both primitive types and object references. However, when passing an object reference, you're passing a copy of the reference, not the object itself.

// Pass by Reference:

// In pass by reference, instead of passing the actual value, a reference (memory address or pointer) to the variable is passed to the function or method.
// Any changes made to the parameter inside the function directly affect the original value outside of it.
// This is common in languages like C++ when using references or pointers.
// However, pure pass by reference is not supported in Java; Java uses pass by value even for object references.

// class Dog {
//     String name;

//     Dog(String name) {
//         this.name = name;
//     }
// }

// public class PassByValueReferenceExample {

//     // Pass-by-value for primitive types
//     static void modifyPrimitive(int x) {
//         x = 10;
//         System.out.println("Inside modifyPrimitive: x = " + x);
//     }

//     // Pass-by-value for object references
//     static void modifyObjectReference(Dog dog) {
//         dog = new Dog("Buddy");  // This won't change the original object outside the method
//         System.out.println("Inside modifyObjectReference: Dog name = " + dog.name);
//     }

//     // Pass-by-value for object attributes
//     static void modifyObjectAttribute(Dog dog) {
//         dog.name = "Buddy";  // This will change the original object outside the method
//         System.out.println("Inside modifyObjectAttribute: Dog name = " + dog.name);
//     }

//     public static void main(String[] args) {
//         // Pass-by-value for primitive types
//         int a = 5;
//         modifyPrimitive(a);
//         System.out.println("After modifyPrimitive: a = " + a);

//         // Pass-by-value for object references
//         Dog myDog = new Dog("Max");
//         modifyObjectReference(myDog);
//         System.out.println("After modifyObjectReference: Dog name = " + myDog.name);

//         // Pass-by-value for object attributes
//         modifyObjectAttribute(myDog);
//         System.out.println("After modifyObjectAttribute: Dog name = " + myDog.name);
//     }
// }
