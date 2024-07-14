// Types of inheritance
// 1.single-level inheritance 
// 2.multi-level  inheritance 
// 3.hierarichal inheritance 
// 4.multiple inheritance 

// 1.single-level inheritance 
// when one class inherit the property of another class is called single-level inheritance .
// In single-level inheritance  private members or variables and constructor can not inherit outside the class ..

// example -1

// Relationship - student IS-A human 

// class human1 { 

//     void sleep()  // ye method hai 
//     {
//        int  age=18;
//         System.out.println("human needs good amount of sleeep");
//         System.out.println(age);
//     }

// }

// class student extends human1  // child class // sub class //derived class // inherit class 

// {

// }
// public class inheritance {
//     public static void main(String[] args) {

//         student st1=new student();
//         st1.sleep();

//     }
// }

// // example -2 ;

// class human1 {

//     private String name  ; // private property inherit nhi hoti 
//     int age ; 

//          human1(){  // this is constructor (same name as class name ) 
//     System.out.println("human class constructor");  // constructor  inherit nhi hota hai 
//        }

//     void sleep()  // ye method hai 
//     {
//         age=18;
//         System.out.println("human needs good amount of sleeep");
//         System.out.println(age);
//     }
// }

// class student extends human1 {  // child class // sub class //derived class // inherit class  
//     // Student class has everything that was conatained by human1 CLASS  

//     void disp(){
//         System.out.println("the new age is : " + age );
// //   System.out.println("the  name is : " + name  );     //  private property inherit nhi hoti 
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {

//         // student st1=new student();  // ek object se dono class ke method ko acess kar lia 
//         // st1.sleep();
//         // st1.disp();
//         human1 st1=new human1();  // ek object se dono class ke method ko acess kar lia 
//         st1.sleep();
//         st1.disp();

//     }
// }

// example-2
// constructor  inherit nhi hota hai  parent class se child class me 
// phir ye print kaise ho raha hai ?
// reason  -
// humne jo object banya hai usse child class ka constructor call ho raha hai ..
// child class me constructor hai nhi 
// tohh default constructor hoga.
// default constructor me by default pheli line super () method include rehta hai 
// super() method parent class ke constructor ko call karta hai ...

// 2.multi-level inheritance 

// When there is a chain of inheritance, it is known as multilevel inheritance.
//  As you can see in the example given below, BabyDog class inherits the Dog class
//   which again inherits the Animal class, so there is a multilevel inheritance.

// class Animal{  
// void eat(){System.out.println("eating...");}  
// }  
// class Dog extends Animal{  
// void bark(){System.out.println("barking...");}  
// }  
// class BabyDog extends Dog{  
// void weep(){System.out.println("weeping...");}  
// }  
// class inheritance{  
// public static void main(String args[]){  
// BabyDog d=new BabyDog();  
// d.weep();  
// d.bark();  
// d.eat();  
// }}  

// another example

// class demo1{
//     void disp(){
//         System.out.println("display written in dem01 classs");
//     }
// }
// class demo2 extends demo1{
// }
// class demo3 extends demo2{
// }
// public class inheritance {
//     public static void main(String[] args) {

//         demo3 obj =new demo3();
//         obj.disp();

//          demo2 obj1 =new demo2();
//         obj1.disp();

//          demo1 obj2 =new demo1();
//         obj2.disp();
//     }
// }

// 3.Hierarchical Inheritance

// When two or more classes inherits a single class, it is known as hierarchical inheritance.
//  In the example given below, Dog and Cat classes inherits the Animal class, 
//  so there is hierarchical inheritance.

// class Animal{  
// void eat(){System.out.println("eating...");}  
// }  
// class Dog extends Animal{  
// void bark(){System.out.println("barking...");}  
// }  
// class Cat extends Animal{  
// void meow(){System.out.println("meowing...");}  
// }  
// class inheritance{  
// public static void main(String args[]){  
// Cat c=new Cat();   
// c.eat();  

// Dog c1=new Dog();   
// c.eat();  

// }
// } 
// --------------------------------------------------------------------------------------------------------------------------------------

// Q) Why multiple inheritance is not supported in java?
// ek class inherit karna chhati hai  2class ke property ko 

// To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

// Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, 
// there will be ambiguity to call the method of A or B class.

// Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, 
// there will be compile time error.

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
// ==================================================================================================
// 

// Types of method in inheritance java..
// 1.inherited.
// Inherit method voo hote Hain Jo parents class se child class mein inherit hote Hain aur child class mein unn methods ko modify nahin kiya jata hai..
// Orr 
//  Jo parent class ki body hai vahi as it is child class mein bhi use hogi

// 2.overridden-

// If  (parent  class) has the same method as declared in 
// the child class,it is known as method overridden in Java.

// 2. overriding- 
// Overwriding method voo method hai jo ki parent class se child class mein aata hai same method hota hai but child class mein thoda bahut usmein modification Kiya jata 
// If subclass (child class) has the same method as declared in 
// the parent class,it is known as method overriding in Java.

// 3.specialized- such methods that are present in only child class
//  not in parent class that is called specialized method. 

// example -1

// class aeroplane
// {
//     public void takeoff(){

//         System.out.println("areoplane is taking off");
//     }

//     
//     public void fly(){
//         System.out.println("areoplane is flying");
//     }

// }

// class cargoplane extends aeroplane{

//  // this is override or  overriding method kyuki ye same method parent class me bhi tha or child class me bhi hai with some modification 
//     public void fly(){
//         System.out.println("areoplane is flying at lower height ");
//     }

//        //  this is specialized methods -- such methods that are present in only child class
//     //  not in parent class that is called specialized methos 
//      public void carryGoods(){
//         System.out.println("areoplane is carrying goods also ");
//     }

// }
// class passengerplane extends aeroplane{
//     // this is   override or  overriding method
//     public void takeoff(){

//         System.out.println("areoplane is taking off in few minutes ");
//     }
//     //  this is specialized methods -- such methods that are present in only child class
//     //  not in parent class that is called specialized methos 
//          public void carryPassenger(){
//         System.out.println("areoplane is carrying passengers  ");
//     }

// }

// class inheritance {
//     public static void main(String[] args) {

//         cargoplane cp = new cargoplane() ;
//         cp.takeoff();
//         cp.fly();

//            passengerplane pp = new passengerplane() ;
//         pp.takeoff();
//         pp.fly();
//     }
// }
// ==================================================================================================
// Rules to override method in Child class

// 1.override karte time child class me different data-type nhi use kar skte..
// use same data-type in child class which is used in parrent class

// 2.override karte time child class me different access modifier nhi use kar skte..
// use same modifier in child class which is used in parrent class

// ek class me multiple method ho skte hai with different parameter 
// parameter different hai tooh dono method aalg aalg ho ayega ..
// or
// ek method  me x parameter hai 
// ek method  me y parameter hai 
// thooh method  override nhi hoga 

// class Animal{
//     public void eat(){
//         System.out.println("animal is eating");
//     }
// }

// class tiger extends Animal {
//     public void eat(){

//         System.out.println("animal hunt and eat everday");
//     }

// }

// public class inheritance {

//     public static void main(String[] args) {
//         Animal r = new Animal();
//         r.eat();
//     }
// }

// ==================================================================================================
// example -1 

// // Constructor execution in case of Inheritance

// class Base {

//     Base() {
//         System.out.println("Base class constructor is called ");
//     }
// }

// class Derived extends Base {
//     Derived() {
// System.out.println("Derived class constructor is called ");
//     }

// }

// public class inheritance {

//     public static void main(String[] args) {
//         Derived d = new Derived() ;   //  when we call the child class constructor  to create object ,
//                                       //   then  constructor of base class with no argument gets automatically called in derived class constructor  
//     }
// }


// // ==================================================================================================
// // example -2 

// // Constructor execution in case of Inheritance

// class Base {

//     Base(int b) {  // maine yaha pe parametrized constructor bana dia islie default constructor jo ban raha tha wo delete hogaya islie error show ho raha hai  ;
//         System.out.println("Base class constructor is called " + b);
//     }
// }

// class Derived extends Base {

//     Derived() {
// System.out.println("Derived class constructor is called ");
//     }

// }

// public class inheritance {

//     public static void main(String[] args) {
//         Derived d = new Derived() ;   //  when we call the child class constructor  to create object ,
//                                       //   then  constructor of base class with no argument gets automatically called in derived class constructor  
//     }
// }

// ==================================================================================================
// example -2  ka solution 

// Constructor execution in case of Inheritance

// class Base {

//     Base(int b) {  // main yaha pe parametrized constructor bana dia islie default constructor jo ban raha tha wo delete hogaya  ;
//         System.out.println("Base class constructor is called " + b);
//     }
// }

// class Derived extends Base {

//     Derived() {
//         super(100);
// System.out.println("Derived class constructor is called ");
//     }

// }

// public class inheritance {

//     public static void main(String[] args) {
//         Derived d = new Derived() ;  // but when we call the parametrized constructor of base class ,then we call it  using super();
//         // the point to note is base class constructor call must be the first line in the derived class constructor  ;
//     }
// }

// ==================================================================================================


