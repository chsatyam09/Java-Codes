
// A class is an entity that detemines how an object will behave and what the object will contain  ;''



// There cannot be two public classes in a single Java program. Additionally, the name of the public class should be the same as the name of the Java file.

// example -1
// class example{   // class banaya
//     int a,b,total ; // variable define kara 
//     void Add(){    // method banaya 
//         total=a+b;
//     }
// }

// public class Multiple_class {        // Main class banaya
//     public static void main(String args[]){

//         example r = new example(); // object banaya 

//         r.a=10 ;
//         r.b=20 ;
//         r.Add();
//         System.out.println(r.total);
//     }
    
    
// }

// example -2
// class example{   // class banaya
//     int a=10;
//     int b=30 ;
//     int total=0 ; // variable define kara 
//     void Add(){    // method banaya 
//         int total=a+b;
//         System.out.println(total);
//     }
// }

// public class Multiple_class {        // Main class banaya 
//     public static void main(String args[]){

//         example r = new example(); // object banaya  class ka 
        
//         r.Add(); // method ko call karaya 
//     }
    
    
// }


// example -3

// // Non-public class
// class AnotherClass {
//     void display() {
//         System.out.println("This is another class.");
//     }
// }
// // Public class with the same name as the file
// public class MainClass {
//     public static void main(String[] args) {
//         System.out.println("This is the main class.");
        
//         // Creating an instance of another class
//         AnotherClass obj = new AnotherClass();
//         obj.display();
//     }
// }



// example -4

//  class Person {
//     private String name;
//     private int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }
// public class Multiple_class {
//     public static void main(String[] args) {
//         // Creating an instance of the Person class
//         Person r = new Person("John Doe", 25);

//         // Calling the displayInfo method of the Person class
//         r.displayInfo();
//     }
// }

