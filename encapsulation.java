
// not an example of encapsulation 

// class Student {
//     public void show (){      //  Declare the  method  with name show  as a public
//     int age=18;
//     String name="Rahul";
//     System.out.println(name + " " + age );
// }
// }

// // ye ke aalg duniya hai 
// // aagr tumhe kuch chaiye student ki duniya se tooh tumhe object ka use karna hoga ;

// public class encapsulation {
//     public static void main(String[] args) {
//         Student obj=new Student();
//         obj.show();   // method private nhi hai islie acess kar pa rahe ho ;
//     }
// }



// ==========================================================================================
// Another  not an example of encapsulation 

// class Student {

//      int age;
//     String name;

//     public void show(){
//         System.out.println(name + " " + age );
//     }
// }

// // ye neeche waala student ke aalg duniya hai 
// // aagr tumhe kuch chaiye student ki duniya se tooh tumhe object ka use karna hoga ;

// public class encapsulation {
//     public static void main(String[] args) {

//  Student obj = new Student();
//  obj.age=18;
// obj.name="Rahul";
//  obj.show();       // method private nhi hai islie acess kar pa rahe ho ;
//     }
// }

// =====================================================================================================================================

//  an example of encapsulation yes 

// public class encapsulation {

//     private int balance ;

//     public void setBalance(int balance){

//         this.balance =  balance ;
//     }

//     public int getBalance(){
//         return balance ;

//     }
//     public static void main(String[] args) {
//         encapsulation r = new encapsulation() ;
//         r.setBalance(100);
//       System.out.println(r.getBalance());
        
//     }
// }
// ==========================================================================================
// Same with another technique 

// public class encapsulation {

//     private int balance ;

//     public void setBalance(int balance1){
//         balance = balance1 ;
//     }
//     public int getBalance(){
//         return balance ;
//     }
//         public static void main(String[] args) {
//       encapsulation r = new encapsulation();
//         r.setBalance(10000000);
//         System.out.println(r.getBalance());  
//     }
// }

// =========================================================================// =========================================================================


// class Student {

//     // // private kar dene se sirf issi duniya me show orr aceessable hoga 
//     private int age;
//     private String name;

//     public void show(){
//         System.out.println(name + " " + age );
//     }
// }

// // ye neeche waala student ke  lie aalg duniya hai 
// // aagr tumhe kuch chaiye student ki duniya se tooh tumhe object ka use karna hoga ;

// public class encapsulation {
//     public static void main(String[] args) {

//  // If the variable was declared as public, we would expect the following output:
// //  However, as we try to access a private variable, we get an error:
// //  Instead, we use the getName() and setName() methods to access and update the variable:

//  Student obj = new Student();
// obj.age=18;          //  priavte kar dia uppar islie print nhi hoga 
// obj.name="Rahul";
//  obj.show();       
//     }
// }

// =====================================================================================================================================

// uss private ka solution  hai { geter and setter }
// Best example of get and set 

// class Student {
//     private int age;
//     private String name;

//     // Setter methods to set the values of age and name
//     public void setAge(int age) {
//         this.age = age;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     // Getter methods to get the values of age and name
//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void show() {
//         System.out.println(name + " " + age);
//     }
// }

// public class encapsulation {
//     public static void main(String[] args) {
//         Student obj = new Student();
//         // Setting values using public setter methods
//         obj.setName("Rahul");
//         obj.setAge(18);

//         // Displaying values using public method
//         obj.show();
//     }
// }

// =====================================================================================================================================

// uss private ka solution  hai { geter and setter }
// Best example of get and set 


// class Student {

//     // private kar dene se sirf issi duniya me show orr aceessable hoga 
//         private int age;
//         private String name;
    
//         public void setData (){
//         age=18;
//         name="Rahul";
//         System.out.println(name + " " + age );
    
//     }

    
//     }
//     // ye ke aalg duniya hai 
//     // aagr tumhe kuch chaiye student ki duniya se tooh tumhe object ka use karna hoga ;
//     public class encapsulation {
    
//         public static void main(String[] args) {
//             Student obj=new Student(); // class ka object 
//             obj.setData();
    
//         }
//     }
    


// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


// public class encapsulation {
//     // Private variables (attributes)
//     private String name;
//     private int age;

//     // Getter method for 'name'
//     public String getName() {
//         return name;
//     }

//     // Setter method for 'name'
//     public void setName(String name1) {
//         name = name1;
//     }

//     // Getter method for 'age'
//     public int getAge() {
//         return age;
//     }

//     // Setter method for 'age'
//     public void setAge(int age1) {
//         // Add validation if needed
//         age = age1;
//     }
//     public static void main(String[] args) {
//         // Create an instance of the Person class
//        encapsulation person = new encapsulation();

//         // Use setter methods to set values
//         person.setName("John");
//         person.setAge(30);

//         // Use getter methods to retrieve values
//         System.out.println("Name: " + person.getName());
//         System.out.println("Age: " + person.getAge());
//     }
// }

