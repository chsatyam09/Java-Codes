//  instance_vs_local_variable 

// An instance variable is a variable which is declared in a class but outside of constructors, methods, or blocks.
// An loacl_variable is a variable which is declared in a method and that method is in class .
// A variable id declared static is called static variable .


// variable:
// A variable is a name given to a memory location. It is the basic unit of storage in a program.

// The value stored in a variable can be changed during program execution.
// A variable is only a name given to a memory location. All the operations are done on the variable effects of a memory location.
// In Java, all the variables must be declared before use.


// Instance Variable: 
// These variables are declared within a class but outside a method, constructor, or block and always get a default value.

// These variables are usually created when we create an object and are destroyed when the object is destroyed.
// We may use an access specifier, for instance, variable, and if no access specifier is specified, then the default access specifier is used.
// Each and every object will have its own copy of instance variables.

// example - 
// // class Taxes  
// {  
//    int count; // Count is an Instance variable  
//    /*...*/  
// }  


// Local Variable:
//  These variables are declared within a method but do not get any default value.

// They are usually created when we enter a method or constructor and are destroyed 
// after exiting the block or when the call returns from the method.
// Its scope is generally limited to a method and its scope starts from the line they are declared.
//  Their scope usually remains there until the closing curly brace of the method comes.
// The initialization of the local variable is mandatory.

// int area()   // method    
// {    
//         int length = 10; // Local variable          
//         int breadth = 5; // Local variable          
//         int rectarea = length*breadth; // Local variable          
//         return rectarea;          
// }




// Static variables.
// A variable id declared static is called static variable .

// Whenever a variable is declared as static, this means there is only one copy of it for the entire class,
//  rather than each instance having its own copy.
//   A static method means it can be called without creating an instance of the class.





//   public class A  
// {  
//     static int m=100;//static variable  ( declared as static)
//     void method()  
//     {    
//         int n=90;//local variable ( inside the method + class)   
//     }  
//     public static void main(String args[])  
//     {  
//         int data=50;//instance variable    (inside the class)
//     }  
// }