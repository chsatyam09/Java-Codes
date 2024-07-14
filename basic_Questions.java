// https://www.youtube.com/playlist?list=PLsjUcU8CQXGGX_f8J-72CS8ikTjl-6qKJ
// QAFox youtube channel 


//Q. 1 What is the output for System.out.println(-6+4*2);

// priority in java 
// 1.bracket
// 2.pre,post increment and decrement 
// 3.* multi
// 4./ division
// 5.% modulud
// 6.+ added
// 7.- sub 

// public class basic_Questions {
    
//     public static void main(String[] args) {
//         System.out.println(-6+4*8);
//     }
// }

// Another method 

// public class basic_Questions {

//     static int calculate(){
//         return(-6+4*8);
//     }

//     public static void main (String[] args){

//    System.out.println( calculate());    // Call the calculate method and print the result
// }
// }

// Q.2 What is the output for System.out.println((2+3)*4)

// public class basic_Questions {

//     public static void main(String[] args) {
//         System.out.println((2+3)*4);
//     }
// }

//Q.3  What is the output for System.out.println(9+6-3*4/2%5);

// public class basic_Questions {

//     static int calculate(){
//         return(9+6-3*4/2%5);
//     }

//     public static void main(String[] args) {
//         System.out.println(calculate());
        
//     }
// }

// Q. 4 Java Program for intaking two numbers using Scanner and printing their sum

// import java.util.Scanner;
// // java.util is a package, while Scanner is a class of the java.util package 
// public class basic_Questions {

//     public static void main(String[] args) {
//         int a ,b,sum ;
//         System.out.println("enter two number:");
//         Scanner r = new Scanner(System.in);  // object is created here (r is the object name )
//         a=r.nextInt();   // These lines use the nextInt() method of the Scanner class to read two integer values from the user and store them in the variables a and b.
//         b=r.nextInt();
//         sum=a+b;
//         System.out.println(sum);


//     }
// }

// Q.5 Java program to check whether the given input number is even or odd

// import java.util.*;
// public class basic_Questions{

//     public static void main(String[] args) {
//         int a ,b,sum ;
//         System.out.println("enter two numbers:");
//         Scanner r = new Scanner(System.in);
//         a=r.nextInt();
//         b=r.nextInt();
//         sum=a+b ;
//         if (sum % 2 == 0) {
//             System.out.println("sum is even ");
            
//         }
//         else{
//             System.out.println(" sum is odd ");
//         }
       
        
//     }
// }

//Q.6  Java program which prints the multiplication table of the given input number

// import java.util.*;
// public class basic_Questions {

//     public static void main(String[] args) {
//         int x ;
//         System.out.println("Enter a number for which you want the table: ");
//         Scanner r = new Scanner(System.in);
//         x = r.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             int result = x * i;
//             System.out.print(result + " ");
//         }

//     }
// }


//Q.6.1  Java program which prints the addition of  table of the given input number

// import java.util.*;
// public class basic_Questions {

//     public static void main(String[] args) {
//         int x ;
//         int result = 0 ;
//         System.out.println("Enter a number for which you want the table: ");
//         Scanner r = new Scanner(System.in);
//         x = r.nextInt();
//         for (int i = 1; i <= 10; i++) {
//              result = x * i + result;
//             System.out.print(result + " ");
//         }

//     }
// }

// Q.6.2 Java program which prints the  final addition of  table of the given input number

// import java.util.Scanner;
// public class basic_Questions {

//     public static int calculateTableSum(int x) {
//         int sum = 0;

//         for (int i = 1; i <= 10; i++) {
//             sum += x * i;
//         }

//         return sum;
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter a number for which you want the table sum: ");
//         int x = 0 ;
//         Scanner r = new Scanner(System.in);
//          x = r.nextInt();

//          System.out.println(calculateTableSum());
//     }

// }

// Q.7 Java program to check whether the given year is a Leap Year
// leap year = 366 Days 
// year / 4 = 0 ;
// year / 100 != 0 ;

// import java.util.*;
// public class basic_Questions{
//     public static void main(String[] args) {
//         int year ;
//         System.out.println("enter the year");
//         Scanner r = new Scanner(System.in);
//         year= r.nextInt() ;

//         if(year % 4 == 0 && year % 100 != 0){
//             System.out.println("this is a  leap year which has 366 Days  ");
//         }
//         else{
//             System.out.println("this is not a leap year which has 365 Days");
//         }
//     }
// }


// Q.8  What is the output for System.out.println(7+(3*5)*(4/2)+(5%3)-1)

// public class basic_Questions {

//     public static void main(String[] args) {
//         System.out.println(7+(3*5)*(4/2)+(5%3)-1);
//     }
// }

// import java.util.Scanner;  
// public class QuadraticEquation
// {  
// public static void main(String[] Strings)   
// {  
// Scanner input = new Scanner(System.in);  
// System.out.print("Enter the value of a: ");  
// double a = input.nextDouble();  
// System.out.print("Enter the value of b: ");  
// double b = input.nextDouble();  
// System.out.print("Enter the value of c: ");  
// double c = input.nextDouble();  
// double d= b * b - 4.0 * a * c;  
// if (d> 0.0)   
// {  
// double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
// double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
// System.out.println("The roots are " + r1 + " and " + r2);  
// }   
// else if (d == 0.0)   
// {  
// double r1 = -b / (2.0 * a);  
// System.out.println("The root is " + r1);  
// }   
// else   
// {  
// System.out.println("Roots are not real.");  
// }  
// }  }

// Q.9 Java program to check whether the given character is a Vowel


// import java.util.Scanner;
// public class basic_Questions {

//     public static boolean isVowel(char ch) {
//         // Convert the character to lowercase for case-insensitive check
//         ch = Character.toLowerCase(ch);

//         // Check if the character is one of the vowels
//         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//     }
// public static void main(String[] args) {
//         System.out.println("Enter a character: ");
//         char ch;
//         Scanner scanner = new Scanner(System.in);
//         ch = scanner.next().charAt(0);

//         if (isVowel(ch)) {
//             System.out.println("Character is a vowel");
//         } else {
//             System.out.println("Character is not a vowel");
//         }
//     }
// }

// ANOTHER METHOD 

// import java.util.Scanner;
// public class basic_Questions {
// public static void main(String[] args) {
//         System.out.println("Enter a character: ");
//         char ch;
//         Scanner r = new Scanner(System.in);
//         ch = r.next().charAt(0);
//         if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//             System.out.println("this is a vowel");
//         }
//         else {
//             System.out.println("this is not a vowel");
//         }
//     }
// }

// Q.10 Java program which intakes two numbers and finds the quotient and reminder


// import java.util.Scanner;

// public class basic_Questions {

//     public static void main(String[] args) {
//         int dividend;
//         int divisor;

//         System.out.println("Enter the number for division: ");
//         Scanner scanner = new Scanner(System.in);
//         dividend = scanner.nextInt();

//         System.out.println("Enter the divisor: ");
//         divisor = scanner.nextInt();

//         if (divisor != 0) {
//             // Perform division and print the result
//             System.out.println("Quotient: " + (dividend / divisor));
//             System.out.println("Remainder: " + (dividend % divisor));
//         } else {
//             System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
//         }
//     }
// }

// Q.11 Java program to find the power of a number

// import java.util.Scanner;

// public class basic_Questions{
//     public static void main(String[] args) {

//         System.out.println("ennter the Number");
//         Scanner r =new Scanner(System.in);
//         int number= r.nextInt() ;
//         int initial_number = number ;

//         System.out.println("enter the power");
//         int power = r.nextInt();

//         // now logic 

//         for (int i = 1; i < power; i++) {
//             number = initial_number*number ;
            
//         }
//         System.out.println(number);
//     }
// }

// Q.12 Java program to find the sum of first 100 numbers

// import java.util.*;
// public class basic_Questions {

//     static int addition(int sum){

//         for(int i=1;i<=100;i++){
//             sum += i;
//         }
//         return sum ;
//     }
//     public static void main(String[] args) {
        
//         int sum=0;

//         System.out.println(addition(sum));

//     }
 
// }

// Q.13 Java program which intakes 6 numbers as input and prints their average ;

// import java.util.Scanner;

// public class basic_Questions {

//     public static void main(String[] args) {
//         Scanner r = new Scanner(System.in);
//         System.out.println("enetr the FIRST number");
//         int num1=r.nextInt();
//         System.out.println("enetr the  SECOND number");
//         int num2=r.nextInt();
//         System.out.println("enetr the THIRD  number");
//         int num3=r.nextInt();
//         System.out.println("enetr the fourth number");
//         int num4=r.nextInt();
//         System.out.println("enetr the FIFTH number");
//         int num5=r.nextInt();
//         System.out.println("enetr the SIXTH number");
//         int num6=r.nextInt();
//         int average = (num1+num2+num3+num4+num5+num6)/6 ;
//         System.out.println("YOUR AVERAGE OF ALL SIXTH NUMBER IS " + average);
//     }
// }



// Q.14 Java program to find the SEPRATE of all even AND ODD  numbers from 1 to 100 ; AND FIND THEIR TOTAL SUM ALSO ;

// public class basic_Questions {

//     public static void main(String[] args) {
//         int evenCount = 0;
//         int oddCount = 0;
//         int evenSum = 0;
//         int oddSum = 0;

//         System.out.println("Even Numbers:");

//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//                 evenCount++;
//                 evenSum += i;
//             }
//         }

//         System.out.println("\nOdd Numbers:");

//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 != 0) {
//                 System.out.println(i);
//                 oddCount++;
//                 oddSum += i;
//             }
//         }

//         System.out.println("\nTotal Count of even numbers: " + evenCount);
//         System.out.println("Total Sum of even numbers: " + evenSum);
//         System.out.println("\nTotal Count of odd numbers: " + oddCount);
//         System.out.println("Total Sum of odd numbers: " + oddSum);
//     }
// }



// Another Mehtod  

// public class basic_Questions {
//     static  int evencount ;
//     static int oddcount ;
//     static void seprate(int i ){
    
//         if (i % 2 == 0) {
//             System.out.println(" it is even :"+ i);
//             evencount++ ;
//         }
//         else{
//             System.out.println(" it is odd : " + i);
//             oddcount++;
//         }
//     }
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             seprate(i);
//         }
//         System.out.println("total number of evencount : " +evencount);
//         System.out.println("total number of oddcount : " +oddcount);
 
//     }
// }


// Q.15 Java program to Swap two numbers 
// public class basic_Questions {

//     public static void main(String[] args) {
//        int x= 20 ;
//        int  y=40 ;
//        int  temp=0 ;
//         temp =x ;
//         x=y;
//         y=temp;

//         System.out.println(x);
//         System.out.println(y);
       
//     }
    
// }


// Q.16 Java program to convert a String to integer

// public class basic_Questions {

//     public static void main(String[] args) {
//         String str="99";
//         int x =Integer.parseInt(str);
//         System.out.println(x);

//     }
// }

// Q.16.2 Java program to convert a  integer to string ;

// public class basic_Questions {

//     public static void main(String[] args) {
//         int x = 100 ;
//         String str=" ";
//         str=Integer.toString(x);
//         System.out.println(x);
//     }
// }



//=========================================  After lecture 23 =======================================================
// https://www.youtube.com/playlist?list=PLsjUcU8CQXGGX_f8J-72CS8ikTjl-6qKJ

// Q.17 Java program which intakes String and prints the duplicate characters along with number of times
// public class basic_Questions {

//     public static void main(String[] args) {
//         int count=0 ;
//         String str="arun motoori";
//         for (int i = 0; i < str.length(); i++) {
//             for (int j = i+1; j < str.length(); j++) {
   
//                 if(charAt(i)==charAt(j)){
//                     count++ ;
//                 }
                
//             }

            
//         }
//     }
// }

// import java.util.Scanner;
// public class basic_Questions {

//     public static void Duplicates(String inputString) {
//         int[] charCount = new int[256]; // Assuming ASCII characters

//         // Count occurrences of each character
//         // for (char ch : inputString.toCharArray()) {
//         //     charCount[ch]++;
//         // }

//               // Count occurrences of each character
//         for (int i = 0; i < inputString.length(); i++) {
//             char ch = inputString.charAt(i);
//             charCount[ch]++;
//         }
        

//         // Print duplicate characters and their counts
//         for (int i = 0; i < charCount.length; i++) {
//             if (charCount[i] > 1 && Character.isDefined((char) i)) {
//                 System.out.println((char) i + ": " + charCount[i] + " times");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner r = new Scanner(System.in);

//         System.out.println("Enter a string: ");
//         String inputString = r.nextLine();

//         System.out.println("Duplicate characters and their counts:");
//         Duplicates(inputString);
//     }

 
// }


// Q.18 Java program to print number of letters, digits, spaces and other things in the inputted statement

// import java.util.*;
// public class basic_Questions {

//     public static void main(String[] args) {
          
//           Scanner scanner = new Scanner(System.in);
          
//           System.out.println("Enter any statement having characters,numbers,spaces and symbols:");
          
//           String str = scanner.nextLine();
          
//            int letterCount = 0;
//            int digitCount = 0;
//            int spaceCount = 0;
//            int otherCount = 0;
          
//            char[] ca = str.toCharArray();
          
//            for(Character c : ca) {
                 
//                   if(Character.isLetter(c)) {
                       
//                         letterCount++;             
                       
//                  } else if(Character.isDigit(c)) {
                       
//                         digitCount++;
                       
//                  } else if(Character.isSpaceChar(c)) {
                       
//                         spaceCount++;
                       
//                  } else {
                       
//                         otherCount++;
                       
//                  }
          
//           }
          
//           System.out.println("Number of letters is: "+letterCount);
//           System.out.println("Number of digits is: " +digitCount);
//           System.out.println("Number of spaces is: " +spaceCount);
//           System.out.println("Number of other things is: "+otherCount);
   
//            scanner.close();
          
//    }

// }

