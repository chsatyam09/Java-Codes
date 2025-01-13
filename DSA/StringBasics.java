
// Q.1.1 How to find the ASCII value to any string

// public class StringBasics {
// public static void main(String[] args) {
// String str = "Hello, world!";

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// int asciiValue = (int) ch;
// System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
// }
// }
// }

// Another Mehtod

// public class StringBasics{
// public static void main(String[] args) {
// char ch = 'R';
// int asciiValue = (int) ch;
// System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
// }
// }

// The charAt method in Java is used to retrieve a character at a specific index
// from a String.
// It returns the character located at the given index position within the
// string.
// -------------------------------------------------------------------------------------------------

// Q.1.2 Sort the String According to Acii vlaue

// import java.util.*;
// public class String_Question2 {

// public static void main(String[] args) {
// String str = "hello world!";
// char[] charArray = str.toCharArray();

// // Sort the character array based on ASCII values
// Arrays.sort(charArray);

// // Convert the sorted character array back to a string
// String sortedStr = new String(charArray);

// System.out.println("Sorted string: " + sortedStr);
// }
// }

// Another Mehtod

// import java.util.Arrays;

// public class String_Question2 {

// public static void main(String[] args) {
// String str = "Hello world!";
// char[] charArray = str.toCharArray();

// Arrays.sort(charArray);

// for (int i = 0; i < charArray.length; i++) {
// System.out.print(charArray[i]);

// }

// }
// }

// -------------------------------------------------------------------------------------------------
// Q.1.3 java program to print A to Z alphabets

// public class String_Question2 {
// public static void main(String[] args) {
// for (char i = 'A'; i <= 'Z'; i++) {
// System.out.print(i+" ");

// }
// }
// }

// -------------------------------------------------------------------------------------------------
// Q.2 How to count the size of string without using length() function ;

// public class String_Question2 {
// public static void main(String[] args) {
// String str = "Satyam Raj Chaudhary" ;
// char arr[] = str.toCharArray();
// int count =0;
// for(char ch:arr){
// count++;
// }
// System.out.println(count);
// }
// }

// ANother mehtod

// public class String_Question2 {

// public static void main(String[] args) {
// String str = "Satyam Raj Chaudhary";
// char ch[] = str.toCharArray();
// int count =0;

// for (int i = 0; i < ch.length; i++) {
// count++;

// }
// System.out.println(count);
// }
// }

// -------------------------------------------------------------------------------------------------
// Q.2.2 How to count the no of space in string ?

// public class String_Question2 {
// public static void main(String[] args) {
// int count = 0;
// String str = "Satyam Raj Chaudhary";

// for (int i = 0; i < str.length() - 1; i++) {
// if ((str.charAt(i) ==' ') ) {
// count++;
// }
// }
// System.out.println(count);
// }
// }

// Another Method

// public class String_Question2 {

// public static void main(String[] args) {
// String str = "Satyam Raj Chaudhary";
// char ch[] = str.toCharArray();
// int count =0;

// for (int i = 0; i < ch.length; i++) {
// if(ch[i]==' ' && ch[i+1]!=' '){
// count++ ;
// }

// }
// System.out.println(count);
// }
// }

// -------------------------------------------------------------------------------------------------
// Q.2.3 How to count the size of array without space ?

// public class String_Question2 {

// public static void main(String[] args) {
// String str = "Satyam Raj Chaudhary";
// char arr[] = str.toCharArray();
// int count = 0;

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] != ' ') {
// count++;
// }
// }

// System.out.println(count);
// }
// }

// Another mehtod

// public class String_Question2 {
// public static void main(String[] args) {
// int count = 0;
// String str = "Satyam Raj Choudhary";
// int size =str.length();

// for (int i = 0; i < str.length() - 1; i++) {
// if (str.charAt(i) ==' ' && str.charAt(i + 1) != ' ') {
// count++;
// }
// }
// int result=size-count ;
// System.out.println(count);
// System.out.println(size);
// System.out.println(result);
// }
// }
// ---------------------------------------------------------------------------------------------------------------------

// Q.2.4 How To Count Occurrences of a SPECIFIC Character in a String ;

// public class String_Question2 {

// public static void main(String[] args) {
// String str = " Satyam Raj Chaudhary";
// char ch[] = str.toCharArray();
// int count = 0;
// char targetChar = 'a'; // Replace 'a' with the desired character to count

// for (int i = 0; i < ch.length; i++) {
// if (ch[i] == targetChar) {
// count++;
// }
// }

// System.out.println("Count of '" + targetChar + "': " + count);
// }
// }
// another method

// public class String_Question2{
// public static void main(String[] args) {
// int result ;
// String str=" Satyam Raj Chaudhary";
// int totalcount = str.length(); // total length
// int totalcount_after_removing_a= str.replace("a","").length();
// int count = totalcount - totalcount_after_removing_a ;
// System.out.println("no of times a ocurr "+count);

// }
// }

// ---------------------------------------------------------------------------------------------------------------------

// Q.2.5 Remove White Spaces in a String

// public class String_Question2 {

// public static void main(String[] args) {
// String str=" Satyam Raj Chaudhary";
// str=str.replaceAll("\\s","");
// System.out.println(str);
// }
// }

// another meehtod

// import java.util.*;
// public class String_Question2 {

// public static void main(String[] args) {
// String str=" i am Satyam Raj Chaudhary";

// str=str.replaceAll("\\s{2,}", " ").trim(); // finding two or more spaces and
// converting into single space
// System.out.println(str); // he .trim() method in Java is used to remove
// leading and trailing whitespace
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.6 how to Remove a specific word in a String

// public class String_Question2 {
// public static void main(String[] args) {
// String str=" Satyam Raj Chaudhary";
// str=str.replaceAll("a","k");
// System.out.println(str);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.7 After remmoving a specific character tell the size of String

// public class String_Question2{
// public static void main(String[] args) {
// int result ;
// String str=" Satyam Raj Chaudhary";
// int totalcount = str.length(); // total length
// str = str.replace("a","");
// result= str.length(); // length after removing a
// System.out.println(result);

// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.8 No junk characters , delete the junk character ?

// public class String_Question2{
// public static void main(String[] args) {
// String str= " â€ satya#m RAJ 7$903*962473 ";
// str = str.replaceAll("[^a-zA-Z0-9]","");
// System.out.println(str);
// }
// }
// Another Mehtod
// public class String_Question2 {

// public static void main(String[] args) {
// String str= " â€ satya#m RAJ 7$903*962473 ";
// str = str.replaceAll("[^a-z A-Z 0-9]","");
// System.out.println(str);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.9 No Alternating characters , how many deletion we required ?
// you don't have to delete character you just have tell how many adjacent
// character's are there or how many deletion is required

// public class String_Question2 {
// static int alternatingcharaccter( String s){

// int count= 0 ;
// for(int i =1;i < s.length();i++){

// if(s.charAt(i) == s.charAt(i-1))
// {
// count++ ;
// }

// }

// return count;
// }
// public static void main(String[] args) {
// String s ="AABAAB" ;
// System.out.println(alternatingcharaccter(s));
// }
// }
// ---------------------------------------------------------------------------------------------------------------------

// Q.2.10 No Alternating characters , delete the alternating character ?

// INPUT="AABAAB";
// OUTPUT="ABAB";

// public class String_Question2 {

// public static void delete_alternating_character(String str) {
// String newStr = "";
// newStr += str.charAt(0);

// for (int i = 1; i < str.length(); i++) {
// if (str.charAt(i) != str.charAt(i - 1)) {
// newStr += str.charAt(i);
// }

// }
// System.out.println(newStr);

// }

// public static void main(String[] args) {
// String str = "AABAAAAAB";
// delete_alternating_character(str);

// }
// }

// Another Method

// public class String_Question2 {
// static void delete_alternating_character(String str) {
// StringBuilder result = new StringBuilder();

// result.append(str.charAt(0)); // Add the first character

// for (int i = 1; i < str.length(); i++) {
// if (str.charAt(i) != str.charAt(i - 1)) {
// result.append(str.charAt(i));
// }
// }

// System.out.println(result.toString());
// }

// public static void main(String[] args) {
// String str = "AABAAB";
// // String str ="acaaabbbacdddd";
// delete_alternating_character(str);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.14 String remove all adjacent duplicates. <->

// public class String_Question2 {
// // Method to remove adjacent duplicates from a string
// public static String removeAdjacentDuplicates(String str) {
// StringBuilder result = new StringBuilder();
// int i = 0; // Initialize the index

// while (i < str.length()) {
// // If the current character is not the same as the next one add it into
// result
// if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) { // i ==
// str.length() - 1 to print last index
// result.append(str.charAt(i));
// i++;
// } else {
// // Skip all adjacent duplicates
// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// i++;
// }
// i++; // Skip the last duplicate character
// }
// }

// return result.toString();
// }

// public static void main(String[] args) {
// String input = "acaaabbbacdddd";
// System.out.println("Original String: " + input);
// String result = removeAdjacentDuplicates(input);
// System.out.println("String after removing adjacent duplicates: " + result);
// }
// }
// ---------------------------------------------------------------------------------------------------------------------

// Q.14 String Recursively remove all adjacent duplicates. <->

// for this case: abccbccba // abbba // aa // null
// it is giving abbba but it should be null

// public class String_Question2 {
// // Method to remove adjacent duplicates recursively
// public static String removeAdjacentDuplicates(String str) {
// // Base case: if the string is empty or has only one character, return it as
// is
// if (str.length() <= 1) {
// return str;
// }

// StringBuilder result = new StringBuilder();
// int i = 0; // Initialize the index

// while (i < str.length()) {

// // If the current character is not the same as the next one add it into
// result
// if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
// result.append(str.charAt(i));
// i++;
// } else {
// // Skip all adjacent duplicates
// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// i++;
// }
// i++; // Skip the last duplicate character
// }
// }
// // This line converts the StringBuilder object result into a regular String
// object named newStr.
// String newStr = result.toString();

// // If no adjacent duplicates were removed, return the current string
// if (newStr.length() == str.length()) { // To Stop Recursion When No Changes
// Are Made:
// return newStr;
// }
// // This comparison checks if the length of newStr (the string after removing
// adjacent duplicates) is the same as the original input string (str).
// // If the lengths are equal, it means no adjacent duplicates were removed
// during this iteration because the length didn’t change.

// // Recursively remove duplicates in the new string
// return removeAdjacentDuplicates(newStr);
// }

// public static void main(String[] args) {
// String input = "abccbccba"; // abbba
// System.out.println("Original String: " + input);
// String result = removeAdjacentDuplicates(input);
// System.out.println("String after removing adjacent duplicates: " +
// (result.isEmpty() ? "null" : result));

// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.11 Java Program to Convert Int to String

// int to String

// public class String_Question2 {
// public static void main(String[] args) {
// int num= 12345 ;
// String str = Integer.toString(num);
// System.out.println(str);
// }
// }
// ---------------------------------------------------------------------------------------------------------------------

// How to convert an String to int in Java?

// public class String_Question2 {
// public static void main(String[] args) {

// String str="100";
// int num=Integer.parseInt(str);
// System.out.println(num);

// }
// }

// ---------------------------------------------------------------------------------------------------------------------

// 2.12 How to convert an integer Array to String in Java?

// import java.util.*;
// public class String_Question {
// public static void main(String[] args) {
// int[] Array = {1, 2, 3, 4, 5};

// String arrayAsString = Arrays.toString(Array);

// System.out.println("Array as String: " + arrayAsString);
// }
// }
// ---------------------------------------------------------------------------------------------------------------------

// 2.13 How to convert an char Array to String in Java?

// public class String_Question2 {
// public static void main(String[] args) {
// char ch[]={ 'a', 'b','c','d' } ;
// String str= String.valueOf(ch);
// System.out.println(str);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------

// How to convert an String to char Array in Java?

// public class String_Question2 {
// public static void main(String[] args) {
// // Initialize a string
// String str = "Hello, World!";

// // Convert the string to a char array using toCharArray() method
// char[] charArray = str.toCharArray();

// // Print the char array
// System.out.println("Char array:");
// for (char c : charArray) {
// System.out.print(c + " ");
// }
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// 2.14 How to convert an char to String in Java?

// public class String_Question {
// public static void main(String[] args) {
// char myChar = 'A';

// String charAsString = String.valueOf(myChar);

// System.out.println("Char as String: " + charAsString);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.14.1 How to add sum two Strings in java?

// String str1 = "Hello";
// String str2 = "World";
// String result = str1 + " " + str2;
// System.out.println(result); // Output: Hello World

// // ANOTHER MEHOTD
// String str1 = "Hello";
// String str2 = "World";
// String result = str1.concat(" ").concat(str2);
// System.out.println(result); // Output: Hello World

// String str1 = "1111";
// String str2 = "2222";

// int num1 = Integer.parseInt(str1);
// int num2 = Integer.parseInt(str2);
// int sum = num1 + num2;

// String result = String.valueOf(sum);
// System.out.println(result); // Output: 3333

// ---------------------------------------------------------------------------------------------------------------------

// 2.15) Write a java program to CAPITALIZE first word in string?

// public class String_Question2 {

// public static void main(String[] args) {
// String str = "satyam raj chaudHary";
// String newstr[] = str.split(" ");

// for(String words:newstr){
// System.out.println(words.substring(0, 1).toUpperCase()+
// words.substring(1).toLowerCase());
// }
// }
// }

// public class String_Question2 {

// public static void main(String[] args) {
// String str = "satyam raj chaudHary";
// String newstr[] = str.split(" ");

// for (String word : newstr) {
// System.out.print(word.substring(0, word.length() - 1) +
// word.substring(word.length() - 1).toUpperCase()+" " );
// }
// }
// }

// word.substring(0, 1):
// This part extracts the first character of the word.
// It uses the substring method, where the first argument is the starting index
// (inclusive), and the second argument is the ending index (exclusive).
// In this case, it starts from index 0 and ends at index 1, retrieving the
// first character of the word.

// .toUpperCase():
// This method is used to convert the first character to uppercase. This ensures
// that the first letter of each word is capitalized.

// word.substring(1):
// This part extracts the rest of the characters in the word, starting from
// index 1. It includes all characters from index 1 to the end of the word.

// + " ":
// This concatenates a space at the end of each formatted word. It ensures that
// there is a space between each word in the printed output.

// ---------------------------------------------------------------------------------------------------------------------

// 2.16) Write a java program to TOGGLE each word in string?

// We can tOGGLE each word of a string by the help of split(), toLowerCase(),
// toUpperCase() and substring() methods.
// By the help of split("\\s") method, we can get all words in an array.

// public class String_Question2 {

// public static void main(String[] args) {
// String str = "Hello Java ";
// StringBuffer togString =new StringBuffer() ;

// for (int i = 0; i < str.length(); i++) {
// char ch =str.charAt(i) ;

// if(Character.isLowerCase(ch)){
// togString.append(Character.toUpperCase(ch));
// }
// else{
// togString.append(Character.toLowerCase(ch));
// }
// }
// System.out.println(togString.toString());
// }
// }
// ---------------------------------------------------------------------------------------------------------------------
// In Java, how can two strings be COMPARED?
// Comparing Two Strings Using equals(), equalsIgnoreCase() & compareTo()
// compareToIgnoreCase() Methods

// public class String_Question2 {
// public static void main(String[] args) {
// String str1 = "H";
// String str2 = "h";

// // Using equals()
// if (str1.equals(str2)) {
// System.out.println("Strings are equal using equals()");
// } else {
// System.out.println("Strings are not equal using equals()");
// }

// // Using equalsIgnoreCase()
// if (str1.equalsIgnoreCase(str2)) {
// System.out.println("Strings are equal ignoring case using
// equalsIgnoreCase()");
// } else {
// System.out.println("Strings are not equal ignoring case using
// equalsIgnoreCase()");
// }

// // Using compareTo()
// int result = str1.compareTo(str2);
// if (result == 0) {
// System.out.println("Strings are equal using compareTo()");
// } else if (result < 0) {
// System.out.println("str1 is lexicographically less than str2 using
// compareTo()");
// } else {
// System.out.println("str1 is lexicographically greater than str2 using
// compareTo()");
// }

// // Using compareToIgnoreCase()
// result = str1.compareToIgnoreCase(str2);
// if (result == 0) {
// System.out.println("Strings are equal ignoring case using
// compareToIgnoreCase()");
// } else if (result < 0) {
// System.out.println("str1 is lexicographically less than str2 ignoring case
// using compareToIgnoreCase()");
// } else {
// System.out.println("str1 is lexicographically greater than str2 ignoring case
// using compareToIgnoreCase()");
// }
// }
// }

// ---------------------------------------------------------------------------------------------------------------------

// Q.2,16.1 Why strings are immutable in Java? <->

// immmutable - objects whose contents can'not be chamged ..
// immmutable String or objects that cannot be modified once it is created. but
// we can only hnage the refrence to the objects
// String is immutable in java because of the security synchronization and
// concurrency ,caching and class loading .

// Thread Safety:
// Immutability makes strings inherently thread-safe. Since strings cannot be
// modified,

// Caching:
// String literals are cached in a special string pool in Java.
// When you create a new string literal with the same value as an existing one,
// the JVM reuses the existing object from the pool.
// This helps in conserving memory and improving performance.they can be safely
// shared among multiple threads without the need for external synchronization
// mechanisms.

// Security:
// Strings are widely used in various security-related operations, such as
// storing passwords or cryptographic keys.
// Immutability ensures that once a string is created, its value cannot be
// changed, preventing unintended modifications

// public class String_Question {

// public static void main(String[] args) {
// String s1=new String("hello world "); // heap me banaega or ek copy scp me
// (refrence stack se s1)
// String s2= "hello ji";// scp me banaega (refrence stack se s2)
// String s3= " hello world "; // s1 ka jo copy tha scp me s3 usse refrence lega
// (refrence stack se s3)
// String s4 = new String("hello ji");
// s2.concat("satyam "); // dekha chnage nhi hua ek baar jo scp me baan gaya wo
// chnage nhyi hoga
// s2=s2.concat("Satyam"); //this is possible ,value chnage nhi hua hai , pura
// ka pura new hii bana hai

// // string constant pool (scp) me same element dubara nhi banega orr ek baar
// value baan gaya tooh change bhi nhi hoga

// System.out.println(s1);
// System.out.println(s2);
// System.out.println(s3);
// System.out.println(s4);
// }
// }

// The sort(String str) function is necessary because Java strings are
// immutable, meaning that once a string is created, it cannot be changed.
// Therefore, to sort the characters in a string, you need to:

// Convert the string into a character array (because arrays are mutable).
// Sort the character array.
// Convert the sorted character array back into a string.
