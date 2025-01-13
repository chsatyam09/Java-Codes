


// ======================================================================================================================================================================================

// example -

// interface A {  // interface class
//     int num = 6 ;  // public static final  by default 
//     void show() ;  //  no need to write public void abstract show() bcz method are public and abstract by default 
// }

// public class Interfacee {

//     public static void main(String[] args) {
//         System.out.println(A.num);   // object nhi bananana pdta  without object access kar skte hai
//     }
// }
// ======================================================================================================================================================================

// example-1

// interface Animal {  // interface class 
//   public void animalSound(); // interface method (does not have a body)  //  no need to write public void abstract animalSound() bcz method are public and abstract by default 
//   public void sleep(); // interface method (does not have a body)  //  no need to write public void abstract sleep() bcz method are public and abstract by default 
// }

// // Pig "implements" the Animal interface
// class Pig implements Animal {  // sub class or extended class 
//   public void animalSound() {
//     // The body of animalSound() is provided here
//     System.out.println("The pig says: wee wee");
//   }
//   public void sleep() {
//     // The body of sleep() is provided here
//     System.out.println("Zzz");
//   }
// }

// class Interface {
//   public static void main(String[] args) {
//     Pig myPig = new Pig();  // Create a Pig object
//     myPig.animalSound();
//     myPig.sleep();
//   }
// }
// ======================================================================================================================================================================================

// interface ka orginal or best examole 

import java.util.Scanner;

interface client{
    void input(); // public + abstract  interface method must be override by sub-class.
    void output(); // public + abstract  interface method must be override by sub-class.

}
class Interfacee implements client{  // Interfacee class name as file name 
    String name ;
    double Salary ;
    public void input(){   // compulsory ,interface method must be override by sub-class.
        Scanner  r = new Scanner(System.in);
        System.out.println("enter user name ");
        name = r.nextLine();

        System.out.println("enter Salary ");
        Salary = r.nextDouble();
    }

    public void output(){  // // compulsory , interface method must be override by sub-class.
        System.out.println(name + " " + Salary);
    }
    public static void main(String[] args) {
        client  c = new Interfacee();
        c.input();
        c.output();
    }

}

// ======================================================================================================================================================================================
// multiple inheritance using interface
// We can achieve multiple inheritance thorugh interface bcz interface contains only abstract method , which implementation is provided by Sub classes.
//  class c extends a , b ==== worng 
//  class c implement a,b === right 

//  not working 
 // class A{  
// void msg(){System.out.println("Hello");}  
// }  
// class B{  
// void msg(){System.out.println("Welcome");}  
// }  
// class C extends A,B{//suppose if it were  
   
//  public static void main(String args[]){  
//    C obj=new C();  
//    obj.msg();//Now which msg() method would be invoked?  
// }  
// } 

// working 
// interface A {
//   }
  
//   interface B {
//   }
  
//   class C implements A, B {

//   }


// working 

// interface A{

//     void show();   // public + abstract 
// }
// interface B{

//     void show(); // public + abstrcat
// }

// class Interfacee implements A,B {

//     public void show(){
//         System.out.println(" hello satyam ");
//     }
//     public static void main(String[] args) {
//         Interfacee m = new Interfacee();
//         m.show();
//     }
// }

// ======================================================================================================================================================================================
// Extending an Interface
// uisng inheritance in interface 

// interface aman{
//     void add();
// }
// interface Satyam extends aman {
//     void sub();
// }
// class Hiamnshu implements Satyam{

//     public void add(){
//         int a =20,  b=10 , c ;
//         c=a+ b;
//         System.out.println("addition : "+ c);
//     }
    
//     public void sub(){
//         int a =20,  b=10 , c ;
//         c=a- b;
//         System.out.println("substraction : "+ c);
//     }
// }

// public class Interfacee {
// public static void main(String[] args) {
    
//    Satyam r  = new Hiamnshu();
//    r.add();
//    r.sub();
// }
    
// }


// ======================================================================================================================================================================================
// ======================================================================================================================================================================================
// 
// Difference between abstract class and interface
// 1) Abstract class can have abstract and non-abstract methods.
// Interface can have only abstract methods. Since Java 8, it can have default and static methods also.

// 2) Abstract class doesn't support multiple inheritance.
// Interface supports multiple inheritance.

// 4) Abstract class can provide the implementation of interface.
// nterface can't provide the implementation of abstract class.


// 5) The abstract keyword is used to declare abstract class.
// The interface keyword is used to declare interface.

// 7) An abstract class can be extended using keyword "extends".
// An interface can be implemented using keyword "implements"


// ======================================================================================================================================================================================
// MArker intrface 



//============================================================= Cloneable Interface ==========================================================

// Point to Note: If a class has not implemented the Cloneable Interface, and its objects call the clone() method,
//  then it throws an exception named as CloneNotSupportedException.

// Example 1: In the below example, we are going to notice that a class that has not implemented the Cloneable interface, 
// and the objects of such a class invoke the clone() method, then JVM throws an exception at the runtime.
// import java.io.*;
// import java.util.*;
// import java.lang.Cloneable;

// public class Plant {
//     String name;
//     int height;
//     int leaves;

//     public Plant(String s, int h, int l) {
//         name = s;
//         height = h;
//         leaves = l;
//     }

//     public String toString() {
//         return "Name: " + name + ", Height: " + height + ", Leaves: " + leaves;
//     }

//     public static void main(String[] args) throws CloneNotSupportedException{
//         // Creating an object
//         Plant p1 = new Plant("Tree", 10, 100);
//         System.out.println("Plant p1: " + p1);

//         // Creating clone of the object p1
//         Plant p2 = (Plant) p1.clone();
//         System.out.println("Clone of p1: " + p2);
//     }
//  }
// Explanation:
// Here, we have a Plant class, and we have created an object p1 of the Plant class. And we are trying to clone the object p1 with another name as p2. 
// But since the Plant class has not implemented the Cloneable Marker Interface, the execution stops at runtime with CloneNotSupportedException.

// Example 2:
// The below example is the same as the previous example only. Just that this time the Plant class has implemented the Cloneable Interface.
//  And so the objects of the Plant class can invoke the clone() function without any problem.

//  import java.io.*;
// import java.util.*;
// import java.lang.Cloneable;

// public class Plant implements Cloneable {
//     String name;
//     int height;
//     int leaves;

//     public Plant(String s, int h, int l) {
//         name = s;
//         height = h;
//         leaves = l;
//     }

//     public String toString() {
//         return "Name: " + name + ", Height: " + height + ", Leaves: " + leaves;
//     }

//     public static void main(String[] args) throws CloneNotSupportedException{
//         // Creating an object
//         Plant p1 = new Plant("Tree", 10, 100);
//         System.out.println("Plant p1: " + p1);
        
//         // Creating clone of the object p1
//         Plant p2 = (Plant) p1.clone();
//         System.out.println("Clone of p1: " + p2);
//     }
// }
// Explanation: Here, we have a Plant class, and we have created an object p1 of the Plant class. And we are trying to clone the object p1 with another name as p2.

// Since the plant class has implemented the Cleanable Marker Interface in Java, so clone of p1 is made and stored in p2.

// ==========================================================Serializable Interface==========================================================
// Example:  we are demonstrating that a class that implements the Serializable marker interface, makes its objects eligible to be serialized and deserialized.

// import java.io.*;    
// import java.io.Serializable;  

// public class Student implements Serializable{  
// 	int id;  
// 	String name;  
// 	int marks;

// 	public Student(int id, String name, int marks) {  
// 		this.id = id;  
// 		this.name = name; 
// 		this.marks = marks; 
// 	}  


// 	public static void main(String args[]){    
// 		try{    
// 			// Serialization:
// 			Student s1 = new Student(1,"Einstein", 95);    
// 			FileOutputStream fos = new FileOutputStream("S1_Info.txt");    
// 			ObjectOutputStream oos = new ObjectOutputStream(fos);    
// 			oos.writeObject(s1);    
// 			oos.flush();    
   
// 			oos.close();    
// 			System.out.println("Student Object s1 State saved in File Successfully.");    

// 			// Deserialization:
// 			FileInputStream fis = new FileInputStream("S1_Info.txt");
// 			ObjectInputStream ois = new ObjectInputStream(fis);  
// 			Student s2 = (Student) ois.readObject();  
// 			System.out.println("Student Object State retrieved from File Successfully in Student Object s2.");    		
// 			System.out.println(s2.id + " " + s2.name + " " + s2.marks);  
// 			ois.close();  
// 		}
// 		catch(Exception e){
// 			System.out.println(e);
// 		}    
// 	}   

// }  
// Explanation:
// Here, we have created a Student class that is implementing the Serializable Interface. This allows the objects of the Student class to be serialized and deserialized. 
// In the main function, we have created an object s1 of the class Student and stored it on the disk in a file named S1_Info.txt.

// And just after that we have retrieved the same s1 object from the file named S1_Info.txt and stored it in s2.

//========================================================== Remote Interface ==========================================================