
//============================================= method_overriding ===========================================================
// class Human {
//     void eat() {
//         System.out.println("human is eating ");
//     }
// }

// class boy extends Human {
//     void eat() {
//         System.out.println("boy is eating ");
//     }
// }

// public class method_hiding {

//     public static void main(String[] args) {
//         Human obj = new boy(); //// method will be called on the basics of object created  
//         obj.eat();
//     }
// }

// ============================================= method_hiding   ===========================================================
// class Human {
// public static void eat (){
// System.out.println("human is eating ");
// }
// }

// class boy extends Human {
// public static void eat (){
// System.out.println("boy is eating ");
// }
// }

// public class method_hiding {

// public static void main(String[] args) {
// Human obj = new boy();  // method will be called on the basics of class decleration 
// obj.eat();
// }
// }