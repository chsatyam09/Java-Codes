// Generics in Java

// Generics in java was introduced in java  version 5 ;
// Generics Specifies the class or method for differnt types  ;
// GENERICS ARE MAINLY USED FOR COLLECTIONS ;
//  It makes the code stable by detecting the bugs at compile time.

// Before generics, we can store any type of objects in the collection, i.e., non-generic. 
// Now generics force the java programmer to store a specific type of objects.

// Advantage of Java Generics
// There are mainly 3 advantages of generics. They are as follows:
// 1) TYPE SAFETY ;
// 2) RESOLVE TYPE CASTING ;
// 3) Compile-Time Checking;

// 1) Type-safety: We can hold only a single type of objects in generics. It doesn?t allow to store other objects.

// Arrays are type safe ;  Without Generics, also it can store only one type of object ;

//  collection are not typeSafe ; Without Generics, we can store any type of objects in collection.

// example- 
// List list = new ArrayList();    
// list.add(10);  
// list.add("10");  

// now collection are type safe with the help of Generics 
// With Generics, it is required to specify the type of object we need to store.  
// List<Integer> list = new ArrayList<Integer>();    
// list.add(10);  
// list.add("10");// compile-time error   

// 2) Type casting 

// Array do not require type catsing while accesing the elements of an Array ;

// collection require type casting while accesing the elements of aaray ;

// Before Generics, we need to type cast.

// List list = new ArrayList();    
// list.add("hello");    
// String s = (String) list.get(0);         //  see here we have done typecasting   

// After Generics, we don't need to typecast the object.  
// List<String> list = new ArrayList<String>();    
// list.add("hello");    
// String s = list.get(0); 

// 3) Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. 
// The good programming strategy says it is far better to handle the problem at compile time than runtime.

// List<String> list = new ArrayList<String>();    
// list.add("hello");    
// list.add(32);//Compile Time Error 

// Full Example of Generics in Java
// Here, we are using the ArrayList class, but you can use any collection class such as ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.

// import java.util.*;  
// class Generics{  
// public static void main(String args[]){  
// ArrayList<String> list=new ArrayList<String>();  
// list.add("rahul");  
// list.add("jai");  
// //list.add(32);//compile time error  

// String s=list.get(1);//type casting is not required  
// System.out.println("element is: "+s);  

// Iterator<String> itr=list.iterator();  
// while(itr.hasNext()){  
// System.out.println(itr.next());  
// }  
// }  
// }  

// =================================================================================================================================================

// Generic class

// import java.util.*;

// class BankAccount<T> { // Corrected class name to adhere to Java naming conventions // this is genric
//                        // class T is the type which you have to specify in main class
//     T t1;

//     BankAccount(T obj) { // Constructor with parameter
//         this.t1 = obj;
//     }

//     public void display() { // Method to display the value of the generic type
//         System.out.println(t1);
//     }
// }

// public class Generics {
//     public static void main(String[] args) {
//         BankAccount<String> b1 = new BankAccount<>("hello");
//         BankAccount<Integer> b2 = new BankAccount<>(3);
//         b1.display();
//         b2.display();
//     }
// }

// =================================================================================================================================================

// Generic class

// A class that can refer to any type is known as a generic class. Here, we are
// using the T type parameter to create the generic class of specific type.

// Let's see a simple example to create and use the generic class.

// The T type indicates that it can refer to any type (like String, Integer, and
// Employee).
// The type you specify for the class will be used to store and retrieve the
// data.

// class MyGen <T> { // Define a generic class

// private T value; // Use the generic type for the field

// public void add(T value) {
// this.value = value;
// }

// public T get() {
// return value;
// }
// }

// public class Generics {

// public static void main(String args[]) {
// MyGen<Integer> m = new MyGen<>(); // Use generics when creating an instance
// m.add(2);
// // m.add("vivek"); // Compile-time error
// System.out.println(m.get());
// }
// }

// Another Example

// // Java program to show working of user defined
// // Generic classes

// // We use < > to specify Parameter type
// class Test<T> {
// // An object of type T is declared
// T obj;
// Test(T obj) { this.obj = obj; } // constructor
// public T getObject() { return this.obj; }
// }

// // Driver class to test above
// class Main {
// public static void main(String[] args)
// {
// // instance of Integer type
// Test<Integer> iObj = new Test<Integer>(15);
// System.out.println(iObj.getObject());

// // instance of String type
// Test<String> sObj
// = new Test<String>("GeeksForGeeks");
// System.out.println(sObj.getObject());
// }
// }

// =================================================================================================================================================
