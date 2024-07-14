
// There are four types of Java access modifiers:

// Private:
//  The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

// Default:
//  The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
//  If you do not specify any access level, it will be the default.

// Protected:
//  The access level of a protected modifier is within the package and outside the package through child class.
//  If you do not make the child class, it cannot be accessed from outside the package.

// Public:
//  The access level of a public modifier is everywhere.
//  It can be accessed from within the class, outside the class, within the package and outside the package.






// For classes, you can use either public or default:

// public	The class is accessible by any other class
// ex-
// public class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello World");
//   }
// }


// default	The class is only accessible by classes in the same package.
//  This is used when you don't specify a modifier. 
// ex-
// class MyClass {
//   public static void main(String[] args) {
//     System.out.println("Hello World");
//   }
// }


// ---------------------------------------------------------------------------------
// For attributes, methods and constructors, you can use the one of the following:
// 1.private
// 2.protected
// 3.public
// 4.default


// Modifier	Description	Try it

// public The code is accessible for all classes	

// public class Main {
//   public String fname = "John";
//   public String lname = "Doe";
//   public String email = "john@doe.com";
//   public int age = 24;
// }

// private	   The code is only accessible within the declared class	

// public class Main {
//   private String fname = "John";
//   private String lname = "Doe";
//   private String email = "john@doe.com";
//   private int age = 24;
  
//   public static void main(String[] args) {
//     Main myObj = new Main();
//     System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//     System.out.println("Email: " + myObj.email);
//     System.out.println("Age: " + myObj.age);
//   }
// }

// default	   The code is only accessible in the same package. 
//            This is used when you don't specify a modifier.
//             You will learn more about packages in the Packages chapter	

// class Person {
//   String fname = "John";
//   String lname = "Doe";
//   String email = "john@doe.com";
//   int age = 24;
  
//   public static void main(String[] args) {
//     Person myObj = new Person();
//     System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//     System.out.println("Email: " + myObj.email);
//     System.out.println("Age: " + myObj.age);
//   }
// }


// protected	The code is accessible in the same package and subclasses. 
//             You will learn more about subclasses and superclasses in the Inheritance chapter

// class Person {
//   protected String fname = "John";
//   protected String lname = "Doe";
//   protected String email = "john@doe.com";
//   protected int age = 24;
// }

// class Student extends Person {
//   private int graduationYear = 2018;
//   public static void main(String[] args) {
//     Student myObj = new Student();
//     System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//     System.out.println("Email: " + myObj.email);
//     System.out.println("Age: " + myObj.age);
//     System.out.println("Graduation Year: " + myObj.graduationYear);
//   }
// }