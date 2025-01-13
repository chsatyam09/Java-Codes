
// ==========================================================================================================================================================
// Abstract class
// example -

// abstract class Animal{ // abstract class
// }
// class Demo{

// public static void main(String[] args) {
// Animal r = new Animal() ; // abstract class ka object nhi abn skta
// }
// }

// ==========================================================================================================================================================

// example -2 refrence bana skte hai object

// abstract class Animal{ // abstract class

// }
// class Dog extends Animal{

// }

// class Demo{

// public static void main(String[] args) {
// Animal r = new Dog() ; // abstract class ka object nhi abn skta lekin
//  refrence variable ka bann skta hai . Dog() yaha pe object variable hai and animal refrence varivble
// }
// }

// ==========================================================================================================================================================

// example -3
// example Abstract class


// abstract class Animal {   // Abstract class

// public abstract void animalSound();   // Abstract method (does not have a body)

// public void sleep() {     // Regular method
// System.out.println("Zzz");
// }
// }

// class Pig extends Animal { // If a regular class extends an abstract class then that regular class must
// // have to implement all the abstract method of parent abstract class .
// public void animalSound() {         // The body of animalSound() is provided here
// System.out.println("The pig says: wee wee");
// }
// }

// class Abstractss {
// public static void main(String[] args) {
// Pig myPig = new Pig(); // Create a Pig object
// myPig.animalSound();
// myPig.sleep();
// }
// }


// ==========================================================================================================================================================

// Another example-5

// abstract class animal {

// animal() { // normal mehtod in abstract class
// System.out.println(" all animal is eating ");
// }

// public abstract void eat(); //abstract method , isme kuch define hii nhi isse
// // call karne ki jarurat hii nhi hai tooh object kyu hii bananae ki jarurat hai
// }

// class Dog extends animal { // If a regular class extends an abstract class
// // then that regular class must have to implement all the abstract method of parent abstract class .

// public void eat(){ // ye likhna compulsory hai
// System.out.println(" Dog is eating slowly");}
// }

// class Tiger extends animal{ // If a regular class extends an abstract class
// // then that regular class must have to implement all the abstract method of parent abstract class .

// public void eat(){ // ye likhna compulsory hai
// System.out.println(" tiger is eating fast");
// }

// }

// class Abstractss {
// public static void main(String[] args) {
// Dog r = new Dog() ;
// r.eat();

// Tiger p = new Tiger() ;
// p.eat();
// }
// }

// ==========================================================================================================================================================

// best example - 6

// abstract class animal {

// public abstract void eat();  // isme kuch define hii nhi isse call karne ki jarurat hii nhi hai tooh object kyu hii bananae ki jarurat hai
// }

// class Dog extends animal { // If a regular class extends an abstract class then that regular class must have to implement all the abstract method of parent abstract class .
// public void eat(){ // ye likhna compulsory hai
// System.out.println(" Dog is eating slowly");

// }

// }

// class Tiger extends animal { // If a regular class extends an abstract class
// // then that regular class must have to implement all the abstract method of parent abstract class .
// public void eat(){ // ye likhna compulsory hai
// System.out.println(" tiger is eating fast");
// }

// }

// class Abstractss {

// public static void main(String[] args) {
// Dog r = new Dog() ;
// // animal r = new Dog() ; we can use this also ( super class ke pass itna
// // capability hota hai ki wo apne sub class ke object ko hold kar ske )
// r.eat();

// Tiger p = new Tiger() ;
// // animal r = new Tiger() ; we can use this also ( super class ke pass itna
// // capability hota hai ki wo apne sub class ke object ko hold kar ske )
// p.eat();
// }
// }

// ==========================================================================================================================================================

// // Abstraction ka best example

// abstract class AeroPlane3 // abstract class wo class hai jisme minimum ek
// class abstract method hota hai.
// // Agar kisi class ke andar abstract method aata hai too uss class abstract
// class banana pita hai
// {
// abstract public void takeOff(); // Abstract method wo method hai jiska koi
// body nhi hota .. no implementations only singnature

// abstract public void fly(); //Abstract method wo method hai jiska koi body
// nhi hota .. no implementations

// public void landing() // normal method
// {
// System.out.println("Aeroplane is landing");
// }
// }

// class CargoPlane3 extends AeroPlane3 // sub-class
// {
// public void takeOff() // override // ye likhna compulsory hai
// {
// System.out.println("CargoPlane requires longer runway");
// }
// public void fly() // override // ye likhna compulsory hai
// {
// System.out.println("Cargoplane flies at lower height");
// }
// public void alert() // normal method
// {
// System.out.println("Alert..");
// }
// }

// class PassengerPlane3 extends AeroPlane3 // sub-class
// {
// public void takeOff() // override
// {
// System.out.println("PassengerPlane requires medium size runway");
// }
// public void fly() // override
// {
// System.out.println("PassengerPlane flies at medium height");
// }
// }
// public class Abstractss
// {
// public static void main(String[] args)
// {
// AeroPlane3 ref1 = new CargoPlane3();
// ref1.takeOff();
// ref1.fly();
// ref1.landing();
// ((CargoPlane3) ref1).alert();

// AeroPlane3 ref3 = new PassengerPlane3();
// ref3.takeOff();
// ref3.fly();
// ref3.landing();

// // AeroPlane3 ref=new AeroPlane3(); // we can’t create object for abstract
// class
// // AeroPlane3.takeOff() ;
// // AeroPlane3.fly();

// }

// }

// ==========================================================================================================================================================

// abstract class Main { // abstract class
// public String fname = "John";
// public int age = 24;
// public abstract void study(); // abstract method only implementation no
// signature
// }

// class Student extends Main { // // Subclass (inherit from Main)
// public int graduationYear = 2018;
// public void study() { // override // ye likhna compulsory hai
// System.out.println("Studying all day long");
// }
// }

// // Code from filename: Second.java
// class Abstract {
// public static void main(String[] args) {
// // create an object of the Student class (which inherits attributes and
// methods from Main)
// Student myObj = new Student();

// System.out.println("Name: " + myObj.fname);
// System.out.println("Age: " + myObj.age);
// System.out.println("Graduation Year: " + myObj.graduationYear);
// myObj.study(); // call abstract method
// }
// }

// ==========================================================================================================================================================

// // Abstract class

// abstract class Animal {
// // Abstract method (does not have a body)
// public abstract void animalSound();
// // Regular method
// public void sleep() {
// System.out.println("Zzz");
// }
// }

// // Subclass (inherit from Animal)
// class Pig extends Animal {
// public void animalSound() {
// // The body of animalSound() is provided here
// System.out.println("The pig says: wee wee");
// }
// }

// class Abstractss {
// public static void main(String[] args) {
// Pig myPig = new Pig(); // Create a Pig object
// myPig.animalSound();
// myPig.sleep();
// }
// }
// ==========================================================================================================================================================
// ==========================================================================================================================================================
// ==========================================================================================================================================================

// Q .Can we create an abstract class without abstract method? If yes, then what
// is the use of such abstract class having no abstract method?

// // Abstract class without abstract methods
// Abstract class Animal {
// // Non-abstract method with default implementation
// public void eat() {
// System.out.println("Animal is eating...");
// }

// // Non-abstract method with default implementation
// public void sleep() {
// System.out.println("Animal is sleepings...");
// }
// }

// // Concrete subclass of Animal
// class Dog extends Animal {
// // No need to implement any methods since Animal provides default
// implementations
// }

// // Concrete subclass of Animal
// class Cat extends Animal {
// // No need to implement any methods since Animal provides default
// implementations
// }

// public class Abstractss {
// public static void main(String[] args) {
// Dog dog = new Dog();
// Cat cat = new Cat();

// // Call non-abstract methods inherited from Animal
// dog.eat();
// dog.sleep();

// cat.eat();
// cat.sleep();
// }
// }

// ==========================================================================================================================================================
