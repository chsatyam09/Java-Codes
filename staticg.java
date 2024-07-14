// https://www.simplilearn.com/tutorials/java-tutorial/static-keyword-in-java

// The most important reason why static keywords are heavily used in Java is to efficiently manage memory.
//  Generally, if you want to access variables or methods inside a class, you first need to create an instance or object of that class.
//   However, there might be situations where you want to access only a couple of methods or variables of a class 
//   and you don’t want to create a new instance for that class just for accessing these members. This is where you can use the static keyword in Java.

// Table of Contents
// Static Variables in Java
// Static Methods in Java
// Static vs Non-Static
// Static Blocks in Java

// 1. Static keyword 
// he static keyword in Java is used to create members (variables or methods) that belong to the class rather than instances of the class.
// it does not need object to execute 

// The static keyword in Java is used for memory management mainly.
//  We can apply static keyword with variables, methods, blocks and nested classes. 
//  The static keyword is a property of class rather  than instance of the class.
// It makes your program memory efficient (i.e., it saves memory).



// Static vs. Public
//  we created a static method, which means that it can be accessed without creating an object of the class,
//  unlike public, which can only be accessed by objects:

// public class Main {

//   // Static method
//   static void myStaticMethod() {
//     System.out.println("Static methods can be called without creating objects");
//   }

//   // Public method
//   public void myPublicMethod() {
//     System.out.println("Public methods must be called by creating objects");
//   }

//   public static void main(String[] args) {
//     //static
//     myStaticMethod(); // Call the static method
//     // myPublicMethod(); This would compile an error


//     //public
//     Main myObj = new Main(); // Create an object of Main
//     myObj.myPublicMethod(); // Call the public method on the object

//   }
// }
// ======================================================================================================================


// Static variable 


//  class test {

//     static int a =10 ;

//     void m1 (){
//         static int b = 20  ; // local variable can’t be static 
//     }

//  }

// or  

// class test {

//     static int a =10 ;
//  }
// class Demo {
//  public static void main(String[] args) {
//  System.out.println(test.a); // static variable  class se access kar skte hai  directly no need of object ..

//    }
//  }
//  or 

// class employee {
//     int empid  ;
//     String name ;
//      String company ;

//      employee( int empid ,String name ,String company){
//         this.empid = empid ;
//         this.name =name ;
//        this.company = company;

//      }

//      void display(){
//         System.out.println(empid + " " + name + " " + company);
//      }
//      public static void main(String[] args) {
        
//         employee e1 = new employee(101 , "satyam" , "Google");
//         employee e2  = new employee(102 , "sam" , "Google");
//      }
// }

// o/p =  company name is same Every where which is memory wastage 

// same code hai uppar walla 

// class employee {
//     int empid  ;
//     String name ;
//      static String company = "Google" ;

//      employee( int empid ,String name ){
//         this.empid = empid ;
//         this.name =name ;
   

//      }

//      void display(){
//         System.out.println(empid + " " + name + " " + company);
//      }
//      public static void main(String[] args) {
        
//         employee e1 = new employee(101 , "satyam" );
//         e1.display();
//         employee e2  = new employee(102 , "sam"  );
//         e2.display();
//      }
// }

// When a variable  is declared as static then a single copy of variable is created and shade among all the objects at class level .
// thus, company name is Google will be shared among even and e2 and all the objects.


// =======================================================================================================================================

// Static block ;-

// A static block is a block of code inside a class that is executed when the class is loaded into memory.
// It is useful for initializing static variables or performing any one-time setup for the class.


// class Example {
//     static {
//         // Code in the static block
//         System.out.println("Static block executed");
//     }
// }



//  class staticg {
//     {
//         System.out.println("Namaste"); // isko object cchaiye for execution 
//     }

//     static{
//         System.out.println("hello ji "); // no need of object for execution
//     }
//     public static void main(String args[]){

//         staticg r= new staticg(); // class ka object 
  
//     }
    
// }

// ============================================================================================================================================

// Static method 

// A static method means that it can be accessed without creating an object of the class, unlike public:

// An example to demonstrate the differences between static and public methods:

// public class Main {
//   // Static method
//   static void myStaticMethod() {
//     System.out.println("Static methods can be called without creating objects");
//   }

//   // Public method
//   public void myPublicMethod() {
//     System.out.println("Public methods must be called by creating objects");
//   }

//   // Main method
//   public static void main(String[ ] args) {
//     myStaticMethod(); // Call the static method // Static method belongs to class , not object ;islie directlt call ho gaya ; no need to create object 
//     // myPublicMethod(); This would output an error   // reason -Simple method call Hota hai class ke through ; we have create object first



//     Main myObj = new Main(); // Create an object of Main
//     myObj.myPublicMethod(); // Call the public method
//   }
// }

//  or 

// class staticg {

//     void display (){
//         System.out.println("100000");
//     }
//     public static void main(String[] args) {
//         {
//             display(); // non-static method display() cannot be referenced from a static context

//              // staticg r = new staticg();
//             // r.display();
//         }
//     }
// }

// same code neeche walla jaise 

// class staticg {

//     static void display (){
//         System.out.println("1000000");
//     }
//     public static void main(String[] args) {
//         {
//             display(); 
//         }
//     }
// }

// =======================================================================================================================================


// Static vs Non-Static




