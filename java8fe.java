
// Oracle released a new version of Java as Java 8 in March 18, 2014.

// Java 8 provides following features for Java Programming:

// Lambda expressions,// 1.code optimization   // 2. to bring the functionaal programming features in java 


// Method references,
// Functional interfaces,
// Stream API,
// Default methods,
// Base64 Encode Decode,
// Static methods in interface,
// Optional class,
// Collectors class,
// ForEach() method,
// Nashorn JavaScript Engine,
// Parallel Array Sorting,
// Type and Repating Annotations,
// IO Enhancements,
// Concurrency Enhancements,
// JDBC Enhancements etc.

// java 8 features or JDK 1.8 (before)

// we can't add new method after some time before java 8 ;
// before JDk 1.8 , interface  can  only have abstract method and alll the abstract method of interface 
// // must be oveerirden in implementing class as well as methods are public and abstract  by default  ;
// After 2 years if we want to add new meethod to interface  class then it is compulsory to implement that new mehtod to all the existing classes.
// which is next to impossible bcz we can't make change in every classes seprately .
// if they don't implement then they are callled abstract classes .


// ==============================================================================================================================

// After JDK 1.8 

// After JDK 1.8 onwards interface can have default and static methods.
// you can define method in interface in java 8 with the help of " default " keyword 
// ypu can add new method any time with the help of default keyword ;
// default keywords says that you want  to implememnt then implememnt it other wise leave it .
// May or May oveerirde in sub classes  ;





// ==============================================================================================================================
// interface A{
//     void a1(); // public + Abstracct 
//     void a2();// public + Abstracct 
//     // JDK after 1.8
//     default void a3() {    // this created after 2 year   // JDK after 1.8   // May or May oveerirde in sub classes  ;

//         System.out.println("may or may not be overriden ");
//     }
    
// }

// class B implements A{

//     public void a1(){

//         System.out.println(" class B a1()");
//     }
//     public void a2(){
//         System.out.println(" class B a2()");
//     }

// }

// class C implements A{

//     public void a1(){

//         System.out.println(" class C a1()");
//     }
//     public void a2(){
//         System.out.println(" class C a2()");
//     }

// }
// class D implements A{

//     public void a1(){

//         System.out.println(" class D a1()");
//     }
//     public void a2(){
//         System.out.println(" class D a2()");
//     }

// }


// public class java8fe {

//     public static void main(String[] args) {
//         B b =new B();
//         b.a1();
//         b.a2();
//         b.a3();


//         C c = new C() ;
//         c.a1();
//         c.a2();

//         D d =new D();
//         d.a1();
//         d.a2();

//     }
// }
// ====================================================================================================================================================================================


// ====================================================================================================================================================================================
// ====================================================================================================================================================================================
// ====================================================================================================================================================================================
// ====================================================================================================================================================================================
// ====================================================================================================================================================================================
// ====================================================================================================================================================================================
// ====================================================================================================================================================================================