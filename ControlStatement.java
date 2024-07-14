// ============================================ 1) Simple if statement:

// if(condition) {
// statement 1; //executes when condition is true
// }

// ============================================ 2) if-else statement

// if(condition) {
// statement 1; //executes when condition is true
// }
// else{
// statement 2; //executes when condition is false
// }

// ============================================ 3) if-else-if ladder:

// public class Student {
// public static void main(String[] args) {
// String city = "Delhi";
// if(city == "Meerut") {
// System.out.println("city is meerut");
// }else if (city == "Noida") {
// System.out.println("city is noida");
// }else if(city == "Agra") {
// System.out.println("city is agra");
// }else {
// System.out.println(city);
// }
// }
// }

// ============================================
// ============================================ 4. Nested if-statement

// public class Student {
// public static void main(String[] args) {
// String address = "Delhi, India";

// if(address.endsWith("India")) {
// if(address.contains("Meerut")) {
// System.out.println("Your city is Meerut");
// }else if(address.contains("Noida")) {
// System.out.println("Your city is Noida");
// }else {
// System.out.println(address.split(",")[0]);
// }
// }else {
// System.out.println("You are not living in India");
// }
// }
// }

// Switch Statement:

// public class Student implements Cloneable {
// public static void main(String[] args) {
// int num = 2;
// switch (num) {
// case 0:
// System.out.println("number is 0");
// break;
// case 1:
// System.out.println("number is 1");
// break;
// default:
// System.out.println(num);
// }
// }
// }

// Java break statement

// public class BreakExample {

// public static void main(String[] args) {

// for(int i = 0; i<= 10; i++) {
// System.out.println(i);
// if(i==6) {
// break;
// }
// }
// }
// }

// Java continue statement

// public class ControlStatement {  
  
//     public static void main(String[] args) {   
      
 
      
//     for (int j = 0; j<=10; j++) {  
      
//     if(j == 4) {  
//     continue;  
//     }  
//     System.out.println(j);  

//     }  
//     }  
      
//     } 