
// Q.1
// can we have multiple main() method in java class ?
// can we overload main() method in java class ?
// yes,
// HOW?
// with the concept of overloading 
// or
// BY  changing the data-type and CALLING THE SECOND MAIN( ) METHOD IN FIRST MAIN() MEHTOD only ;

// public class array {

//     public static void main(String[] args) {
//         System.out.println(" first main method");
//         main( " ");
//           main(1);

//     }
//     public static void main(String args) {
//         System.out.println(" second main method ");
//     }
//      public static void main(int args) {
//         System.out.println(" third main method ");
//     }
  
// }

// Q.2
// can we  call the mian() method of a class ?
// yes,we can call the main() method  from another class using classname.mian()

//--------------------------------------------------------------------------------
// EXECPTION ArrayIndexOutOfBoundsException

// public class array {

//     public static void main(String[] args) {
//         int num[]={ 12,13,15,16};
//         System.out.println(num[num.length-1]);
//         }
//     }




// Q. 1 What is the output for System.out.println(-6+4*2);

// priority in java
// 1.bracket
// 2.pre,post increment and decrement
// 3.* multi
// 4./ division
// 5.% modulud
// 6.+ added
// 7.- sub

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println(-6+4*8);
// }
// }

// Another method

// public class basic_Questions {

// static int calculate(){
// return(-6+4*8);
// }

// public static void main (String[] args){

// System.out.println( calculate()); // Call the calculate method and print the
// result
// }
// }

// Q.2 What is the output for System.out.println((2+3)*4)

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println((2+3)*4);
// }
// }

// Q.3 What is the output for System.out.println(9+6-3*4/2%5);

// public class basic_Questions {

// static int calculate(){
// return(9+6-3*4/2%5);
// }

// public static void main(String[] args) {
// System.out.println(calculate());

// }
// }

// Q. 4 Java Program for intaking two numbers using Scanner and printing their
// sum

// import java.util.Scanner;
// // java.util is a package, while Scanner is a class of the java.util package
// public class basic_Questions {

// public static void main(String[] args) {
// int a ,b,sum ;
// System.out.println("enter two number:");
// Scanner r = new Scanner(System.in); // object is created here (r is the
// object name )
// a=r.nextInt(); // These lines use the nextInt() method of the Scanner class
// to read two integer values from the user and store them in the variables a
// and b.
// b=r.nextInt();
// sum=a+b;
// System.out.println(sum);

// }
// }

// import java.util.Scanner;
// public class basic_Questions {

// public static void main(String[] args) {
// int num1 =0;
// int num2 =0;
// int result =0;
// String num3 =" ";
// Scanner r = new Scanner(System.in);
// System.out.print("Enter the First numbers: ");
// num1=r.nextInt();
// System.out.print("Enter the Second numbers: ");
// num2 =r.nextInt();
// result=num1+num2;
// System.out.println(result);
// System.out.println("Enter your name: ");
// System.out.println(r.nextLine());
// }
// }

// import java.util.Scanner;

// public class basic_Questions {
// public static void main(String[] args) {
// // Create a Scanner object to read input
// Scanner scanner = new Scanner(System.in);

// // Prompt the user to enter an integer
// System.out.print("Enter an integer: ");
// int number = scanner.nextInt(); // Read the integer

// // Consume the leftover newline character
// // a newline character (\n) often remains in the input buffer after reading
// the input.
// scanner.nextLine();

// // Prompt the user to enter a line of text
// System.out.print("Enter a line of text: ");
// String line = scanner.nextLine(); // Read the full line of text

// // Output the results
// System.out.println("You entered the integer: " + number);
// System.out.println("You entered the line: " + line);

// // Close the scanner
// scanner.close();
// }
// }

// Q.5 Java program to check whether the given input number is even or odd

// import java.util.*;
// public class basic_Questions{

// public static void main(String[] args) {
// int a ,b,sum ;
// System.out.println("enter two numbers:");
// Scanner r = new Scanner(System.in);
// a=r.nextInt();
// b=r.nextInt();
// sum=a+b ;
// if (sum % 2 == 0) {
// System.out.println("sum is even ");

// }
// else{
// System.out.println(" sum is odd ");
// }

// }
// }

// Another one

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("enter the first number: ");
// int x =sc.nextInt();
// System.out.println("enter the Second number: ");
// int y = sc.nextInt();
// if (x%2==0) {
// System.out.println(" first number " + x +"is Even");
// }
// else{
// System.out.println(" first number"+ x +"is Odd");
// }
// int result = x+y;
// System.out.println("the sum of both given number is " + result);
// }
// }

// Another one
// import java.util.Scanner;

// public class basic_Questions {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the first number: ");
// int x = sc.nextInt();

// System.out.println("Enter the second number: ");
// int y = sc.nextInt();

// // Determine if the first number is even or odd using switch
// switch (x % 2) {
// case 0:
// System.out.println("The first number " + x + " is Even");
// break;
// case 1:
// case -1: // in case of negative odd numbers
// System.out.println("The first number " + x + " is Odd");
// break;
// }

// // Determine if the second number is even or odd using switch
// switch (y % 2) {
// case 0:
// System.out.println("The second number " + y + " is Even");
// break;
// case 1:
// case -1: // in case of negative odd numbers
// System.out.println("The second number " + y + " is Odd");
// break;
// }

// int result = x + y;
// System.out.println("The sum of both given numbers is " + result);
// }
// }

// Q.6 Java program which prints the multiplication table of the given input
// number

// import java.util.*;
// public class basic_Questions {

// public static void main(String[] args) {
// int x ;
// System.out.println("Enter a number for which you want the table: ");
// Scanner r = new Scanner(System.in);
// x = r.nextInt();
// for (int i = 1; i <= 10; i++) {
// int result = x * i;
// System.out.print(result + " ");
// }

// }
// }

// Q.6.1 Java program which prints the addition of table of the given input
// number

// import java.util.*;
// public class basic_Questions {

// public static void main(String[] args) {
// int x ;
// int result = 0 ;
// System.out.println("Enter a number for which you want the table: ");
// Scanner r = new Scanner(System.in);
// x = r.nextInt();
// for (int i = 1; i <= 10; i++) {
// result = x * i + result;
// System.out.print(result + " ");

// }

// }
// }

// Q.6.2 Java program which prints the final addition of table of the given
// input number

// import java.util.Scanner;
// public class basic_Questions {

// public static int calculateTableSum(int x) {
// int sum = 0;

// for (int i = 1; i <= 10; i++) {
// sum += x * i; // // sum = sum + (x * i);.
// }

// return sum;
// }
// public static void main(String[] args) {
// System.out.println("Enter a number for which you want the table sum: ");
// int x = 0 ;
// Scanner r = new Scanner(System.in);
// x = r.nextInt();

// System.out.println(calculateTableSum(x));
// }

// }

// Q.7 Java program to check whether the given year is a Leap Year
// leap year = 366 Days
// if the year is divisible by 4 and not divisible by 100 , then it is a leap
// year ;
// year / 4 = 0 ;
// year / 100 != 0 ;

// import java.util.*;
// public class basic_Questions{
// public static void main(String[] args) {
// int year ;
// System.out.println("enter the year");
// Scanner r = new Scanner(System.in);
// year= r.nextInt() ;

// if(year % 4 == 0 && year % 100 != 0){
// System.out.println("this is a leap year which has 366 Days ");
// }
// else{
// System.out.println("this is not a leap year which has 365 Days");
// }
// }
// }

// Q.8 What is the output for System.out.println(7+(3*5)*(4/2)+(5%3)-1)

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println(7+(3*5)*(4/2)+(5%3)-1);
// }
// }

// Q.8.1 Roots are real or not

// import java.util.Scanner;
// public class basic_Questions
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
// } }

// Q.9 Java program to check whether the given character is a Vowel

// import java.util.Scanner;
// public class basic_Questions {

// public static boolean isVowel(char ch) {
// // Convert the character to lowercase for case-insensitive check
// ch = Character.toLowerCase(ch);

// // Check if the character is one of the vowels
// return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
// }
// public static void main(String[] args) {
// System.out.println("Enter a character: ");
// char ch;
// Scanner scanner = new Scanner(System.in);
// ch = scanner.next().charAt(0);

// if (isVowel(ch)) {
// System.out.println("Character is a vowel");
// } else {
// System.out.println("Character is not a vowel");
// }
// }
// }

// ANOTHER METHOD

// import java.util.Scanner;
// public class basic_Questions {
// public static void main(String[] args) {
// char ch;
// System.out.println("Enter a character: ");
// Scanner r = new Scanner(System.in);
// ch = r.next().charAt(0);
// ch = Character.toLowerCase(ch);
// if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
// System.out.println("this is a vowel");
// }
// else {
// System.out.println("this is not a vowel");
// }
// }
// }

// Q.10 Java program which intakes two numbers and finds the quotient and
// reminder .
// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// int dividend;
// int divisor;

// System.out.println("Enter the number for division: ");
// Scanner sc = new Scanner(System.in);
// dividend = sc.nextInt();

// System.out.println("Enter the divisor: ");
// divisor = sc.nextInt();

// if (divisor != 0) {
// // Perform division and print the result
// System.out.println("Quotient: " + (dividend / divisor));
// System.out.println("Remainder: " + (dividend % divisor));
// } else {
// System.out.println("Cannot divide by zero. Please enter a non-zero
// divisor.");
// }
// }
// }

// Q. find the perimeter of the circle

// perimeter of the circle = Cirumference
// Cirumference of circle = pi* diameter
// diameter = 2*radius
// / Cirumference of circle = 2*pi*radius
// Area of circle = pi*r^2

// We have to input the radius to the Program.
// - Radius is the center of the circle to the border of the circle.
// Perimeter of the circle is 2 * Pi * r

// import java.util.*;
// public class Demo {

// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter the Radius of the Circle:");

// int radius = scanner.nextInt();

// System.out.println("Perimeter of the circle is: "+(2*Math.PI*radius));

// scanner.close();

// }

// }

// Q.11 Java program to find the power of a number

// import java.util.Scanner;

// public class basic_Questions{
// public static void main(String[] args) {

// System.out.println("ennter the Number");
// Scanner r =new Scanner(System.in);
// int number= r.nextInt() ;
// int initial_number = number ;

// System.out.println("enter the power");
// int power = r.nextInt();

// // now logic

// for (int i = 1; i < power; i++) {
// number = number*initial_number ;

// }
// System.out.println(number);
// }
// }

// Q.12 Java program to find the sum of first 100 numbers

// import java.util.*;
// public class basic_Questions {

// static int addition(int sum){

// for(int i=1;i<=100;i++){
// sum += i;
// }
// return sum ;
// }
// public static void main(String[] args) {

// int sum=0;

// System.out.println(addition(sum));

// }

// }

// public class basic_Questions {

// public static void main(String[] args) {
// int sum=0;
// for (int i = 1; i <=100; i++) {
// sum =i+sum ;
// System.out.println(sum);

// }
// }
// }

// Q.12.1 Java program to find the sum of first 100 numbers start from where the
// user given the input ;

// import java.util.*;
// public class basic_Questions {

// static int addition(int sum , int input){

// for(int i=input;i<=100;i++){
// sum += i;
// }
// return sum ;
// }
// public static void main(String[] args) {
// int sum=0;
// System.out.println("Input a number between 1 to 99- ");
// Scanner sc = new Scanner(System.in);
// int input = sc.nextInt();

// System.out.println(addition(sum,input));

// }

// }

// Q.13 Java program which intakes 6 numbers as input and prints their average ;

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// Scanner r = new Scanner(System.in);
// System.out.println("enetr the FIRST number");
// int num1=r.nextInt();
// System.out.println("enetr the SECOND number");
// int num2=r.nextInt();
// System.out.println("enetr the THIRD number");
// int num3=r.nextInt();
// System.out.println("enetr the fourth number");
// int num4=r.nextInt();
// System.out.println("enetr the FIFTH number");
// int num5=r.nextInt();
// System.out.println("enetr the SIXTH number");
// int num6=r.nextInt();
// int average = (num1+num2+num3+num4+num5+num6)/6 ;
// System.out.println("YOUR AVERAGE OF ALL SIXTH NUMBER IS " + average);
// }
// }

// Q.14 Java program to find the SEPRATE of all even AND ODD numbers from 1 to
// 100 ; AND FIND THEIR TOTAL SUM ALSO ;

// public class basic_Questions {

// public static void main(String[] args) {
// int evenCount = 0;
// int oddCount = 0;
// int evenSum = 0;
// int oddSum = 0;

// System.out.println("Even Numbers:");

// for (int i = 1; i <= 100; i++) {
// if (i % 2 == 0) {
// System.out.println(i);
// evenCount++;
// evenSum += i;
// }
// }

// System.out.println("\nOdd Numbers:");

// for (int i = 1; i <= 100; i++) {
// if (i % 2 != 0) {
// System.out.println(i);
// oddCount++;
// oddSum += i;
// }
// }

// System.out.println("\nTotal Count of even numbers: " + evenCount);
// System.out.println("Total Sum of even numbers: " + evenSum);
// System.out.println("\nTotal Count of odd numbers: " + oddCount);
// System.out.println("Total Sum of odd numbers: " + oddSum);
// }
// }

// Another Mehtod

// public class basic_Questions {
// static int evencount ;
// static int oddcount ;
// static void seprate(int i ){

// if (i % 2 == 0) {
// System.out.println(" it is even :"+ i);
// evencount++ ;
// }
// else{
// System.out.println(" it is odd : " + i);
// oddcount++;
// }
// }
// public static void main(String[] args) {
// for (int i = 1; i <= 100; i++) {
// seprate(i);
// }
// System.out.println("total number of evencount : " +evencount);
// System.out.println("total number of oddcount : " +oddcount);

// }
// }

// Q.15 Java program to Swap two numbers

// public class basic_Questions {

// public static void main(String[] args) {
// int x= 20 ;
// int y=40 ;
// int temp=0 ;
// temp =x ;
// x=y;
// y=temp;

// System.out.println(x);
// System.out.println(y);

// }

// }

// Q.16 Java program to convert a String to integer

// public class basic_Questions {

// public static void main(String[] args) {
// String str="99";
// int x =Integer.parseInt(str);
// System.out.println(x);

// }
// }

// Q.16.1 Java program to convert a Double to integer

// public class basic_Questions {
// public static void main(String[] args) {
// double x = 22.34 ;
// int y = (int) x ;
// System.out.println(y);

// }
// }

// Q.16.2 Java program to convert a integer to string ;

// public class basic_Questions {

// public static void main(String[] args) {
// int x = 100 ;
// String str=" ";
// str=Integer.toString(x);
// System.out.println(x);
// }
// }

// Q.17 Java program which intakes width and height of a Rectangle and there by
// print its area
// Area=Length × Width

// import java.util.Scanner;

// public class basic_Questions {

// public static int RectangleArea(int width , int height, int Area){

// Area = height*width ;

// return Area ;
// }
// public static void main(String[] args) {
// int width =0;
// int height =0;
// int Area =0 ;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the Width of Rectangle ");
// width = sc.nextInt();
// System.out.println("Enter the Height of Rectangle ");
// height = sc.nextInt();

// System.out.println(RectangleArea(width, height, Area));

// }
// }

// // Q.18 Java program to intake width and height of a Rectangle and find its
// perimeter

// // Perimeter=2×(Length+Width)

// import java.util.Scanner;

// public class basic_Questions {

// public static int RectangleArea(int width , int height, int Area){

// Area = 2*(height*width) ;

// return Area ;
// }
// public static void main(String[] args) {
// int width =0;
// int height =0;
// int Area =0 ;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the Width of Rectangle ");
// width = sc.nextInt();
// System.out.println("Enter the Height of Rectangle ");
// height = sc.nextInt();

// System.out.println(RectangleArea(width, height, Area));

// }
// }

// Q. 20 Java program to find the sum of all the digits in the inputted number

// import java.util.*;
// public class Demo {

// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter any number:");

// int number = scanner.nextInt();

// int sum = 0;

// while(number != 0) {

// sum = sum + number % 10; // sum = 4 , 2 ,1,5

// number = number / 10; // 512, 51 ,5

// }

// System.out.println("Sum of all digits in the given number is "+sum);

// scanner.close();

// }

// }

// Q. 21 Program to Check Whether A Number is Prime or Not
// 2 is a prime number because it is only divisible by 1 and 2.
// 3 is a prime number because it is only divisible by 1 and 3.
// 5, 7, 11, 13, and 17 are other examples of prime numbers.

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("Enter any number :");
// Scanner sc = new Scanner(System.in);
// int number =sc.nextInt();
// int temp = 0 ;
// for (int i = 2; i < number; i++) {
// if(number%i==0 ){
// temp++ ;
// }
// }
// if (temp>=1) {
// System.out.println("Number is not a prime number ");
// }
// else{
// System.out.println("Number is a prime number ");
// }
// }
// }

// Q. 22 Program to Print All Prime Numbers between 1 to 100

// public class basic_Questions {

// public static void main(String[] args) {
// int temp =0 ;
// for (int i = 1; i <=100; i++) {
// for (int j = 2; j <=i-1; j++) {
// if (i%j==0) {
// temp ++ ;
// }

// }
// if(temp==0){
// System.out.println(i);
// }
// else{
// temp =0;
// }

// }
// }
// }

// ========================================= After lecture 23
// =========================
// https://www.youtube.com/playlist?list=PLsjUcU8CQXGGX_f8J-72CS8ikTjl-6qKJ

// Q.23 Java program which intakes String and prints the duplicate characters
// along with number of times ;

// public class basic_Questions {
// public static void main(String[] args) {
// int count = 0;
// String str = "arun motoori";

// // Convert the string to lowercase to handle case insensitivity
// str = str.toLowerCase();

// for (int i = 0; i < str.length(); i++) {
// for (int j = i + 1; j < str.length(); j++) {
// // Check if characters are equal and not a space
// if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
// count++;
// break; // Avoid counting duplicates for the same character
// }
// }
// }

// System.out.println("Number of duplicate characters: " + count);
// }
// }

// // Aother Mehtod
// import java.util.*;
// public class basic_Questions {

// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter any English statement:");

// String str = scanner.nextLine();

// Map<Character,Integer> m = new HashMap<Character,Integer>(); // Hashmap
// created here

// char[] ca = str.toCharArray(); // converted string to char array , so it can
// iterate over every charatcter

// for(Character c : ca) { // for each loop ca se lia or c me store karwaya

// if(m.containsKey(c)) { // a is already there then

// m.put(c, m.get(c)+1); // key,vlaue+1

// } else { // a is not there then

// m.put(c, 1); // key,vlaue

// }

// }

// for(Character c : m.keySet()) {

// if(m.get(c) > 1) {
// System.out.println("Character "+c+" is repeated: "+m.get(c)+" times");
// }

// }

// scanner.close();
// }

// }

// Aother Mehtod

// Enter a string: SatyamSinmm
// Duplicate characters and their counts:
// S: 2 times
// a: 2 times
// m: 3 times

// import java.util.Scanner;
// public class basic_Questions {

// public static void Duplicates(String inputString) {
// int[] charCount = new int[256]; // Assuming ASCII characters

// // Count occurrences of each character
// for (int i = 0; i < inputString.length(); i++) {
// char ch = inputString.charAt(i);
// charCount[ch]++;
// }
// // Print duplicate characters and their counts
// for (int i = 0; i < charCount.length; i++) {
// if (charCount[i] > 1 && Character.isDefined((char) i)) {
// System.out.println((char) i + ": " + charCount[i] + " times");
// }
// }
// }
// public static void main(String[] args) {
// Scanner r = new Scanner(System.in);

// System.out.println("Enter a string: ");
// String inputString = r.nextLine();

// System.out.println("Duplicate characters and their counts:");
// Duplicates(inputString);
// }
// }

// Q.24 Java program to print number of letters, digits, spaces and other things
// in the inputted statement

// import java.util.*;
// public class basic_Questions {

// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter any statement having characters,numbers,spaces and
// symbols:");

// String str = scanner.nextLine();

// int letterCount = 0;
// int digitCount = 0;
// int spaceCount = 0;
// int otherCount = 0;

// char[] ca = str.toCharArray();

// for(Character c : ca) {

// if(Character.isLetter(c)) {

// letterCount++;

// } else if(Character.isDigit(c)) {

// digitCount++;

// } else if(Character.isSpaceChar(c)) {

// spaceCount++;

// } else {

// otherCount++;

// }

// }

// System.out.println("Number of letters is: "+letterCount);
// System.out.println("Number of digits is: " +digitCount);
// System.out.println("Number of spaces is: " +spaceCount);
// System.out.println("Number of other things is: "+otherCount);

// scanner.close();

// }

// }

// Q. 24 Program to Print Fibonacci Series

// The Fibonacci series is a sequence of numbers where each number is the sum of
// the two preceding ones, usually starting with 0 and 1.
// The sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.print("Enter a Number : ");
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();

// int a =1 ;
// int b=1;
// System.out.println(a+" ");
// System.out.println(b+" ");
// int f=0;

// while(f<=number){
// f =a+b;
// if (a+b>number) {
// break;

// }
// System.out.println(f+" ");
// a=b ; // 1
// b=f; // 2
// }

// }
// }

// Q.25 Java program to reverse a String

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.print("Enetr a string ");

// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// char[] ch = str.toCharArray();

// for (int i = ch.length-1; i>= 0; i--) {
// System.out.print(ch[i]+ " ");

// }
// }
// }

// Q.26 Java program to check whether the given String text is a Palindrome .

// A palindrome is a word, number, phrase, or sequence of characters that reads
// the same backward as forward,
// ignoring spaces, punctuation, and capitalization.
// Racecar , Level , Madam, Rotator , Civic , MOM , MADAM

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("Enetr a String : ");
// Scanner sc = new Scanner(System.in);
// String ch = sc.nextLine();

// char[] orginalString = ch.toCharArray();

// String reversedString =" ";
// int size = orginalString.length ;

// for (int i = size-1 ; i>=0; i--) {
// reversedString = reversedString + orginalString[i] ;

// }

// if (ch.equals(reversedString)) {
// System.out.println(" This is a Palindrome");

// }
// else{
// System.out.println(" This is a not Palindrome");
// }
// }
// }

// Anoter Mehtod

// import java.util.*;
// public class basic_Questions {

// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter any text:");

// String orginalText = scanner.nextLine();

// char[] ca = orginalText.toCharArray();

// String reversedText = "";

// for(int i=ca.length-1;i>=0;i--) {

// reversedText = reversedText + ca[i];

// }

// if(orginalText.equals(reversedText)) {

// System.out.println("Given Text is a palindrome");

// } else {

// System.out.println("Given Text is not a palindrome");

// }

// scanner.close();

// }

// }

// Q. 28 Java Program to check whether the given number is a palindrome
// ex- 1991
// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("Enter the number :");
// Scanner sc = new Scanner(System.in);
// long originalnumber = sc.nextInt();
// long number = originalnumber ;
// long reversedNumber =0 ;

// // logic for reversing the number

// while (number!=0) {

// long remainder = number %10 ; // 1 , 9 , 9 ,1
// reversedNumber = (reversedNumber * 10) + remainder ; // 1 , 9, 9, 1
// number = number/10 ; // 199 , 19, 1, 0

// }

// // comaprison
// if(originalnumber == reversedNumber){
// System.out.println("Given number is a palindrome");
// }
// else{
// System.out.println("Given number is not a palindrome");
// }
// }
// }

// Q.29 An anagram is a word or phrase formed by rearranging the letters of
// another word or phrase, typically using all the original letters exactly
// once. For example:

// Same length after removing Spaces
// Characters in both the String Should be the same dspite of having differnet
// orders .

// "listen" and "silent" are anagrams.
// "evil" and "vile" are anagrams.
// "anagram" and "nag a ram" are anagrams.

// import java.util.* ;
// public class basic_Questions {

// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter first String:");

// String str1 = scanner.nextLine();

// System.out.println("Enter second String:");

// String str2 = scanner.nextLine();

// str1 = str1.replaceAll( "\\s","").toLowerCase();

// str2 = str2.replaceAll( "\\s","").toLowerCase();

// if(isAnagram(str1,str2)) {

// System.out.println("Strings " +str1+" and "+str2 +" are Anagrams");

// } else {

// System.out.println("Strings "+str1 +" and "+str2 +" are not Anagrams");
// }

// scanner.close();

// }

// public static boolean isAnagram(String str1,String str2) {

// Map<Character,Integer> str1Map = new HashMap<Character,Integer>();
// Map<Character,Integer> str2Map = new HashMap<Character,Integer>();

// Character ch;

// for(int i=0;i<str1.length();i++) {

// ch = str1.charAt(i);

// if(str1Map.get(ch)==null) {

// str1Map.put(ch,1);

// } else {

// str1Map.put(ch,str1Map.get(ch)+1);

// }

// }

// for(int i =0;i<str2.length();i++) {

// ch = str2.charAt(i);

// if(str2Map.get(ch)==null) {

// str2Map.put(ch,1);

// } else {

// str2Map.put(ch,str2Map.get( ch)+1);

// }

// }

// return str1Map.equals(str2Map);
// }

// }

// Q.30 Java Program to find the Square of the given number

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("Enter the Number ");
// Scanner sc = new Scanner(System.in);
// int num =sc.nextInt();

// if(num!=0){
// System.out.println( "Square of given number "+ num + " is: " +num*num);
// }
// }
// }

// Q. 30 Java program to find the Cube of the given number

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("Enter the Number ");
// Scanner sc = new Scanner(System.in);
// int num =sc.nextInt();

// if(num!=0){
// System.out.println( "Square of given number "+ num + " is: " +num*num*num);

// }
// }
// }

// Q. 31 Java program to find whether the given number is an Armstrong number
// If you cube every digit of the number and add them.
// If this sum is equal to the actual number, then we can call the number as
// Armstrong number.
// ex- 153
// 1*1*1 + 5*5*5 + 3*3*3 = 153

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("Enter the Number "); // 153
// Scanner sc = new Scanner(System.in);
// int originalnumber =sc.nextInt();
// int cubednum = 0 ;

// int num=originalnumber ;
// while (num>0) { //153,15,3
// int remainder = num%10 ; // 3 ,5,1
// cubednum = cubednum + (remainder*remainder*remainder); // 27 + 125 + 1
// num= num /10 ; //15 ,1
// }
// if(originalnumber == cubednum ){
// System.out.println("Given number is Armstrong");

// }
// else{
// System.out.println("Given number is not Armstrong");
// }

// }
// }

// Q.32 Java program to find the factorial of the given number
// Formula
// n! = n × (n-1) × (n-2) × ... × 3 × 2 × 1

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("Enter the Number ");
// Scanner sc = new Scanner(System.in);
// int num =sc.nextInt();
// int fact = factorial(num);
// System.out.println(fact);
// }

// public static int factorial(int num){
// if(num==0){
// return 1 ;
// }
// else{
// return num* factorial(num-1); // 5 * factorial(4) , 5 * 4 * factorial(3) , 5
// * 4* factorial(3), 5 * 4 * 3 * factorial(2) , 5 * 4 * 3 * 2 *factorial(1), 5
// * 4 * 3 * 2 *factorial(0)= 5 * 4 * 3 * 2 *1*1
// }
// }

// }

// Q.37 Java program to count the number of digits in the given number .
// ex- 7673 = 4

// import java.util.Scanner;

// public class basic_Questions {
// public static void main(String[] args) {
// System.out.println("Enter the Number: ");
// Scanner sc = new Scanner(System.in);
// int num =sc.nextInt();
// int count =0 ;

// while (num>0) {
// count++ ;
// num = num / 10;

// }
// System.out.println(count);

// }
// }

// Q.38 Java program to count the sum of digits in the given number
// ex- 7673 = 7+6+7+3 = 23

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("enter the number :");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int reaminder =0;

// while (num!=0) {
// reaminder += num % 10 ;
// num = num / 10 ;
// }
// System.out.println(reaminder);
// }

// }

// Q.49 Java program to count the number of even and odd digits in the given
// number
// ex- 5412
// even digits -2
// odd digits - 2

// import java.util.Scanner;

// public class basic_Questions {

// public static void main(String[] args) {
// System.out.println("enter the number :");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int remainder =0;
// int evencount =0;
// int oddcount =0;

// while (num!=0) {
// remainder = num % 10 ;
// if(remainder%2==0){
// evencount++ ;
// }
// else{
// oddcount++ ;
// }

// num= num/10 ;
// }

// System.out.println("Total number of odd digits:"+ evencount);
// System.out.println("Total number of Even digits:"+ oddcount);

// }

// }

// Q.50 Java program to find the largest of given any numbers

// import java.util.Scanner;

// public class basic_Questions {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the number of elements: ");
// int n = scanner.nextInt();

// int[] numbers = new int[n];

// System.out.println("Enter the numbers:");
// for (int i = 0; i < n; i++) {
// numbers[i] = scanner.nextInt();
// }

// int largest = numbers[0];
// for (int i = 1; i < n; i++) {
// if (numbers[i] > largest) {
// largest = numbers[i];
// }
// }

// System.out.println("The largest number is: " + largest);
// }
// }
