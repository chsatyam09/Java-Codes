// --------------// Theory Quesions -----------------------
// --------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q. String in Java:
// Java treats Strings as objects, not arrays. String objects are created using
// the java.lang.String class.

// Strings in Java are called objects because they are instances of the String
// class, which is part of the Java standard library (java.lang.String).
// The String class provides a variety of methods for string manipulation,
// making it more than just a primitive data type.
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. Is String a primitive or derived type in Java?
// Strings are derived data types.
// or we can say string is a non primitive data type ;
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. when to use concat and when to use append

// use concat - new stirng or string literals ;
// use append - stringBuffer , stringBuilder ;

// It is also important to realize that with append, the original list is simply
// modified.(i.e mutable String == changeable)

// On the other hand, with concatenation, an entirely new list is created.(i.e
// immmutable String == unchangable)

// concat == immutable
// append == muttable
// immmutable string i.e. String_literals and String New Keywod  ke sath concatenation me concat use karo
// mutable string i.e StringBuilder and StringBuffer unke sath concatenation me append use karo
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. Duplicates
// Duplicates allowed in heap
// Duplicates not allowed in scp
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. What are some different ways to create a String object in Java?
// using the new keyword/operator -  Heap me create Hota hai 
// using double quotes / using string literals - SCP me Create Hota hai.
// using String builder and String buffer   -  Heap me create Hota hai 

// ------------------------------------------------------------------------------------------------------------------------------------
// Q. Memory Allocation in stirng

// When we create a String using the `new` keyword, it will be created in the
// Heap memory.
// Example: String s1 = new String("Hello");

// When we create a String using string literals (double quotes), it will be
// created in the String Constant Pool (inside the Heap).
// Example: String s1 = "Hello";

// When we create a String using StringBuilder, it will be created in the Heap
// memory, not in the String Constant Pool.
// Example: StringBuilder brand2 = new StringBuilder("Pw_skills");

// When we create a String using StringBuffer, it will be created in the Heap
// memory, not in the String Constant Pool.
// Example: StringBuffer brand3 = new StringBuffer("Pw_skills");

// ------------------------------------------------------------------------------------------------------------------------------------
// Q. How many objects will be created in the following code?
// String s1="javatpoint";
// String s2="javatpoint";
// Answer: Only one in Scp bcz Duplicates not allowed in scp

// ------------------------------------------------------------------------------------------------------------------------------------
// How many objects will be created?
// String a = new String("Examveda"); // object1
// String b = new String("Examveda"); // object2
// String c = "Examveda"; // object3
// String d = "Examveda"; // object3
// String e = "Examvedaaaa";// object4
// Answer: Only four .
// Here's the breakdown of how many objects are created:

// String a = new String("Examveda");: This creates one objects:
// String b = new String("Examveda");: This also creates one objects,
// here the string are same but objects are created 2 beacuse bcz Duplicates are
// allowed in Heap

// String c = "Examveda";: This creates one object in the String pool,
// String d = "Examveda";: This will not create the object in the String
// pool,beacuse string "Examveda" already exists there.
// here the string are same so objects are created 1 beacuse bcz Duplicates are
// allowed in Scp

// String e = "Examvedaaaa";: This creates one objects:
// Therefore, a total of four objects are created.
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. What is the difference between equals() method and == operator?
// The equals() method matches content of the strings whereas == operator
// matches object or reference or location  of the strings.
// refrence - mtlb kaha pe craeate hua hai (Loacion)
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. What is the difference between str1 == str2 and str1.equals(str2)?
// == COMAPRE LOCATION or reference
// .equals compare content
// // Java offers both the equals() method and the "==" operator for comparing
// objects. However, here are some differences between the two:

// Essentially, equals() is a method, while == is an operator.
// The == operator can be used for comparing references (addresses) and the
// .equals() method can be used to compare content.
// To put it simply, == checks if the objects point to the same memory location,
// whereas .equals() compares the values of the objects.
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. Explain String pool in Java.

// Scp is memory location in heap where java stores his string literal object
// Stores string literals created directly using double quotes (" ").
// Does not store copies
// When a string literal is created, the JVM first checks the SCP for an
// existing instance with the same value.
// If found, the existing instance is reused, and a reference to it is returned.
// If not found, a new string object is created in the SCP, and a reference to
// it is returned.
// String Pool, also known as SCP (String Constant Pool),
// Scp is a special storage space in Java heap memory that is used to store
// unique string objects.
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. Is String immutable or final in Java? If so, then what are the benefits of
// Strings being Immutable?

// Yes, Strings are immutable in Java.
// Immutable objects mean they can't be changed or altered once they've been
// created. it will create new object every time .
// However, we can only modify the reference to the string object. using
// StringBuffer and StringBuilder
// ------------------------------------------------------------------------------------------------------------------------------------
// Q. What does the string intern() method do in Java?

// How the intern() Method Works

// We use the intern() method to check if a string with the same content already exists in the String Constant Pool (SCP).
//  If it exists, the method returns the reference to that string.
// If it does not exist, it copies the content from the heap memory, adds it to the pool,
//  and returns the reference to the newly added string.

// Kaise kaam karta hai intern()?

// Agar intern() method use karein, to wo check karta hai ki kya String Constant
// Pool me same content ka string already exist karta hai.
// Agar exist karta hai, to uska reference return karega.
// Agar exist nahi karta, to wo heap memory se content copy karke pool me add
// karega aur uska reference return karega.

// Java maintains a special area in memory called the String Constant Pool for
// string literals.
// When a string is interned, it is checked against the strings in the pool. If
// a string with the same value already exists in the pool, the interned string
// will reference that object instead of creating a new one.
// If no matching string exists, the method adds the string to the pool.

// String Constant Pool:

// String intern() method in Java ka kaam hota hai String Constant Pool me
// reference return karna.
// Agar ek string object heap memory me bana hai aur uska content String
// Constant Pool me available hai, to intern() method ussi String Constant Pool
// ka reference return karega.
// Agar wo content pool me nahi hai, to wo us content ko pool me add karega aur
// reference return karega.

// Heap vs String Constant Pool:

// Jab hum new String("Hello") likhte hain, ek Heap memory me object banta hai.
// Jab hum "Hello" (string literal) likhte hain, wo String Constant Pool me
// store hota hai.

// Why Use intern():
// It reduces memory overhead by avoiding multiple copies of the same string.
// It ensures that comparisons using == for string references work correctly for
// interned strings.

// public class InternExample {
// public static void main(String[] args) {
// String s1 = new String("Hello"); // Creates a new string object in the heap
// String s2 = "Hello"; // Uses the string from the pool

// System.out.println(s1 == s2); // Output: false (different references)

// String s3 = s1.intern(); // Adds "Hello" to the pool (or uses the existing
// one)

// System.out.println(s2 == s3); // Output: true (both refer to the same pool
// object)
// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------
// Q. State the difference between StringBuffer and StringBuilder in Java.

// StringBuffer and StringBuilder are two Java classes for manipulating strings.
// These are mutable objects, i.e., they can be modified, and provide various
// methods such as insert(), substring(), delete(), and append(), for String
// manipulation.

// StringBuffer-=
// StringBuffer allows only one thread to access a method at once, so it is not
// possible to call StringBuffer methods from two threads simultaneously, which
// means it takes more time to access.
// The StringBuffer class has synchronized methods, making it thread-safe,
// slower, and less efficient than StringBuilder.

// StringBuilder-=
// The StringBuilder class has no synchronized methods. Unlike StringBuffer,
// StringBuilder does not offer synchronized methods, which makes it less
// thread-safe, faster, and more efficient.
// ------------------------------------------------------------------------------------------------------------------------------------

// Q. What is the use of the substring() method in Java?

// The substring method is used to return substring from a specified string.
// This method takes two parameters i.e., beginIndex (the starting index) and
// endIndex (the ending index).

// public class SubstringExample {
// public static void main(String[] args) {
// String str = "Hello, world!";
// String substr1 = str.substring(0, 5); // Extracts "Hello" ( 0 is including
// and 5 is excluidng )
// String substr2 = str.substring(7); // Extracts "world!" ( including 7 to till
// last )
// System.out.println(substr1);
// System.out.println(substr2);
// }
// }
// startIndex: The starting index of the substring (inclusive).
// endIndex: The ending index of the substring (exclusive).

// =======================================================================================================================================================================

// Q. ways to create string differnet Types of String

// public class string {
// public static void main(String[] args) {

// // immutable stirng == unchangable ;

// String brand = "pw_skills";
// System.out.println(brand);
// String brand1 = new String( "pw_skills");
// System.out.println(brand1);

// // mutable string == changeable ;

// StringBuilder brand2 = new StringBuilder("Pw_skills");
// StringBuffer brand3 = new StringBuffer("Pw_skills");
// System.out.println(brand2);
// System.out.println(brand3);

// }
// }

// =================================================================

// ways to create string

// The mutable objects can be changed to any value or state without adding a new object.
// Whereas, the immutable objects can not be changed to its value or state once it is created

// this is immmutable string (unchnageable)

// public class string {
// public static void main(String[] args) {
// String brand = "pw_skills"; // ye Scp me bnata hai ..(scp= String constant poll) [ no duplicate allowed in scp ]
// System.out.println(brand);

// // // Here is 2ndways to create immutable string

// String brand1 = new String( "pw_skills"); // ye heap me banta hai [ duplicate
// allowed in Heap ]
// // If the new operator is used to create a string, it gets created in the
// heap memory.
// System.out.println(brand1);

// }
// }

// -----------------------------------------------------------------------------

// ways to chnage or use concatenation in immmutable string

// The mutable objects can be changed to any value or state without adding a new object.
// Whereas, the immutable objects can not be changed to its value or state once
// it is created, it will creaate new eberytime u will chnage or modified.

// immutable stirng == unchangable ; ( use concat ) with concatenation, an entirely new list is created.
// immutable String ko chnage karna hai tooh same refrence me wapas daal do

// mutable string == changeable ; i.e stringBuffer and stringBuilder (use
// append) with append, the original list is simply modified

// public class string {
// public static void main(String[] args) {
// String brand = "pw_skills"+" ";
// String x = brand.concat("kholi--1"); // immutable string hai isme print nhi hoga
// System.out.println(x);
// brand = brand.concat("kholi--2"); // immutable string hai lekin humne same
// refrence me wapas store karwa dia
// // with concatenation, an entirely new list is created
// System.out.println(brand);

// System.out.println("-------------------------------");

// // // // Here is 2ndways to create immutable string

// String brand1 = new String( "pw_skills"+ " ");
// brand1.concat("kholi---1"); // immutable string hai isme print nhi hoga
// brand1 = brand.concat("kholi--2"); // immutable string hai lekin humne
// samerefrence me wapas store karwa dia
// // with concatenation, an entirely new list is created
// System.out.println(brand1);

// }
// }

// -----------------------------------------------------------------------------
// immutable string new string nhi ban raha bass refrence ko chnage kar rahe hai

// public class string_Theory {
//     public static void main(String[] args) {

//         String s1 = new String("pw");
//           s1.concat("skills"); // not working bcz this is immutable , same refrence me wapas karna hoga
//         System.out.println();
//     }
// }

// or

// public class string_Theory{
// public static void main(String[] args) {

// String s1 = new String("pw" + " ");
// s1=s1.concat("skills");
// System.out.println(s1);
// }
// }

// -----------------------------------------------------------------------------
// different ways of comparision

// comprison of strings
// == operator compares the refrence of the object
// .equals(s2) compare the contents of two objects

// [ duplicate allowed not in scp ]
// [ duplicate allowed in Heap ]

// public class string {
// public static void main(String[] args) {
// String s1 = "pw_skills";

// // // Here is 2ndways to create immutable string

// String s2 = new String( "pw_skills");
// System.out.println(s1==s2);
// System.out.println(s1.equals(s2));

// }
// }

// public class string {

// public static void main(String[] args) {
// String s1="pwskill";
// String s2="pwskill";
// String s3= new String("pwskill");
// String s4= new String("pwskill");
// System.out.println(s1==s2);
// System.out.println(s1==s3);
// System.out.println(s3==s4);
// System.out.println(s1.equals(s2));
// System.out.println(s1.equals(s3));
// System.out.println(s3.equals(s4));
// }
// }

// public class string {

// public static void main(String[] args) {
// String s1 =("pwskills");
// String s2 =("pwskills");
// String s3 =("PWSKILLS");

// System.out.println(s1==s2);
// System.out.println(s1==s3);
// System.out.println(s2==s3);

// System.out.println(s1.equals(s2));
// System.out.println(s1.equals(s3));
// System.out.println(s2.equals(s3));
// }
// }

// public class string {

// public static void main(String[] args) {
// String s1="pwskills";
// String s2=new String("pwskills");
// String s3=new String("pwskills");
// System.out.println(s1==s2);
// System.out.println(s1==s3);
// System.out.println(s2==s3);

// System.out.println(s1.equals(s2));
// System.out.println(s1.equals(s3));
// System.out.println(s2.equals(s3));
// }
// }

// =================================================================

// why to convert String into CharArray, What's the purpose of it ?
// i can write this code without converting into charArray ..

// infact I have seen multiple videos in which they have convert String into
// CharArray,
// but all the question I have implemented without converting into charArray ..

// any example where you it is must to convert String into CharArray,

// String str = "Satyam";
// char ch[] = str.toCharArray();

// Character-Level Manipulation: When you need to perform operations on
// individual characters within a string, such as counting occurrences,
// reversing the order, or checking for specific characters, converting to a
// character array provides direct access to each character.
// Performance Optimization: In certain cases, especially when dealing with
// large strings or frequent character-level operations, converting to a
// character array can offer performance advantages. This is because accessing
// elements of an array is generally faster than accessing characters within a
// string using methods like charAt().
// Compatibility with Character-Based APIs: Some APIs or libraries might require
// character arrays as input. For example, certain encryption algorithms or text
// processing functions might expect a character array rather than a string.
// Custom Sorting or Filtering: If you need to sort or filter characters based
// on specific criteria, converting to a character array can provide more
// flexibility and control over the sorting or filtering process.

// -----------------------------------------------------------------------------
// ways to chnage or use concatenation in mmutable string
// The mutable objects can be changed to any value or state without adding a new
// object.
// Whereas, the immutable objects can not be changed to its value or state once
// it is created

// immutable stirng == unchangable ; ( use concat ) with concatenation, an
// entirely new list is created.
// immutable String karo chnage karna hai tooh same refrence me wapas daal do

// mutable string == changeable ; i.e stringBuffer and stringBuilder (use append
// ) with append, the original list is simply modified

// public class string_Theory {
// public static void main(String[] args) {
// StringBuilder brand2 = new StringBuilder("Pw_skills");
// brand2.append("kholi--1"); // mutable string hai islie directly chnage ho raha hai
// brand2.concat("kholi--2"); // concat is not working with mutable string
// System.out.println(brand2);
// }
// }

// -----------------------------------------------------------------------------

// import java.util.* ;
// public class String{
// public static void main(String[] args) {

// String s1 = "pw";
// String s2 = "pw"+"java";
// String s3 = "pw"+"java"+"skills";
// String s4=s1+s2;

// System.out.println(s1);
// System.out.println(s2);
// System.out.println(s3);
// System.out.println(s4);
// }
// }

// -----------------------------------------------------------------------------

// immmutable vs mutable

// public class string {
// public static void main(String[] args) {
// String brand = "pw_skills";
// System.out.println(brand);
// brand.concat("coaching");
// System.out.println(brand);
// // uppar wala immmutable string hai jo change nhi hoga same refrence me
// dubara store karna hoga

// System.out.println(" ");

// StringBuilder brand1 = new StringBuilder("Pw_skills");
// System.out.println(brand1);
// brand1.append(" " + "coaching");
// System.out.println(brand1);
// // uppar wala mutable string hai jo change hoga
// }
// }

// -------------------------------------------------------------------
// inbuilt method in string

// public class string {

// public static void main(String[] args) {
// String s1 ="pw SkillS";
// System.out.println(s1);
// System.out.println(s1.toUpperCase());
// System.out.println(s1.toLowerCase());
// System.out.println(s1.length());
// System.out.println(s1.charAt(5));
// System.out.println(s1.substring(3,8));
// System.out.println(s1.indexOf("k"));
// System.out.println(s1.replace(" ",""));
// System.out.println(s1.toCharArray());
// }
// }

// -------------------------------------------------------------------
// -------------------------------------------------------------------
// -------------------------------------------------------------------
// -------------------------------------------------------------------
// -----------------------------------------------------------------------------

// 06/feb
// Mutable String

// The mutable objects can be changed to any value or state without adding a new
// object.
// Whereas, the immutable objects can not be changed to its value or state once
// it is created.

// immutable stirng == unchangable ; ( use concat ) with concatenation, an
// entirely new list is created.
// immutable String karo chnage karna hai tooh same refrence me wapas daal do

// mutable string == changeable ; i.e stringBuffer and stringBuilder (use append
// ) with append, the original list is simply modified

// using StringBuffer

// public class string {
// public static void main(String[] args) {
// StringBuffer s1= new StringBuffer(" heelo wolrd ");
// // StringBuffer s1=" Helooworld " // this is invalid syntax in mutable string
// System.out.println(s1);
// s1.append(" you are my world");
// System.out.println(s1);
// }
// }

// using StringBuilder

// public class string {
// public static void main(String[] args) {
// StringBuilder s1= new StringBuilder(" heelo wolrd ");
// // StringBuilder s1=" Helooworld " // this is invalid syntax
// System.out.println(s1);
// s1.append("you are my world");
// System.out.println(s1);
// }
// }

// -------------------------------------------------------------------------------------------------------------

// ways to do chnage in mutable String /

// public class string {

// public static void main(String[] args) {
// StringBuffer s1 =new StringBuffer("hello Satyam Raj" + " ");
// s1.append("chaudhary");
// System.out.println(s1);

// StringBuilder s2 =new StringBuilder("hello Satyam Raj" + " ");
// s2.append("chaudhary");
// System.out.println(s2);
// }
// }

// -----------------------------------------------------------------------------

// public class string {

// public static void main(String[] args) {
// StringBuffer sb=new StringBuffer("virat");
// sb.append("kholi");
// sb=new StringBuffer("Sachin");
// System.out.println(sb);
// }
// }

// -----------------------------------------------------------------------------

// final

// final can'not be applied to immmutable string (unchnageable)

// final ka impact StringBuffer pe nhi hoga
// final ka impact variable pe hoga
// sb pe impact hoga

// public class StringTheory {
// public static void main(String[] args) {
// StringBuffer sb=new StringBuffer("virat");
// sb.append("kholi");
// sb=new StringBuffer("Sachin");
// System.out.println(sb);
// }
// }

// // or

// public class StringTheory {
// public static void main(String[] args) {
// final StringBuffer sb=new StringBuffer("virat"); // final ka impact
// StringBuffer pe nhi hoga.. final ka impact sb variable pe hoga
// sb.append("kholi");
// sb= new StringBuffer("Sachin"); // sb variable cannot be chnaged
// System.out.println(sb);
// }
// }

// -----------------------------------------------------------------------------//
// -----------------------------------------------------------------------------//
// -----------------------------------------------------------------------------

// capacity

// capacity means how many character you can hold

// length
// length means how many character are present

// public class StringTheory {

// public static void main(String[] args) {
// StringBuffer sb= new StringBuffer();
// System.out.println(sb.capacity());
// }
// }

// public class string {

// public static void main(String[] args) {

// StringBuilder sb= new StringBuilder();
// System.out.println(sb.capacity());

// sb.append("qwertyuioplkjhgf");
// System.out.println(sb.capacity());

// sb.append("q");
// System.out.println(sb.capacity());

// StringBuilder sb1= new StringBuilder();
// System.out.println(sb1.capacity());

// sb1.append("qwty");
// System.out.println(sb1.capacity());
// System.out.println(sb1.length());

// StringBuilder sb2= new StringBuilder("virat"); // 16+virat;
// System.out.println(sb2.capacity());

// StringBuilder sb3= new StringBuilder(150);
// System.out.println(sb3.capacity());
// sb3.append("java");
// System.out.println(sb3);
// sb3.trimToSize();
// System.out.println(sb3.capacity());

// StringBuffer sb4= new StringBuffer("pwjava");
// System.err.println(sb4);
// System.out.println(sb4.reverse());

// }
// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q. String vs StringBuffer vs StringBuilder

// Theory

// string-
// we opt if the content is fixed and it is would not change frequently;
// String is immmutable and final in java .
// String is a final class.

// string buffer-
// we opt if the content change frequently but the thread safety is required;
// StringBuffer is thread-safe and synchronized

// stringbuilder-
// we opt if the content change frequently but the thread safety is not
// required;
// StringBuilder is not thread-safe and not synchronized

// String is immutable whereas StringBuffer and StringBuilder are mutable
// classes.

// -------------------------------------------------------------------------------------------------------------------------------------------------------

// 1. What are the different string methods in Java?

// There are various string operations in Java that allow us to work with
// strings.
// These methods or operations can be used for string handling in Java as well
// as string manipulation in Java. Some of such methods are as follows:

// split(): Split/divide the string at the specified regex.
// compareTo(): Compares two strings on the basis of the Unicode value of each
// string character.
// compareToIgnoreCase(): Similar to compareTo, but it also ignores case
// differences.
// length(): Returns the length of the specified string.
// substring(): Returns the substring from the specified string.
// equalsIgnoreCase(): Compares two strings ignoring case differences.
// contains(): Checks if a string contains a substring.
// trim(): Returns the substring after removing any leading and trailing
// whitespace from the specified string.
// charAt(): Returns the character at specified index.
// toLowerCase(): Converts string characters to lower case.
// toUpperCase(): Converts string characters to upper case.
// concat(): Concatenates two strings.

// --------------------------------------------------------------------------------------------------------------------------------------

// --------------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------
// .togString Converts an object into a string representation.

// int asciiValue = (int) ch; -> it is actually converting a char (character) to
// its ASCII
// char ch = (char) asciiValue; -> Converting integer ASCII value to character

// .toCharArray(); Converts a string into a character array.
// str.charAt(i); // The charAt method in Java is used to retrieve a character
// at a specific index from a String.
// It returns the character located at the given index position within the
// string.

// char ch[]: Declaration: Declares a character array named ch.
// char ch: Declaration: Declares a single character variable named ch.

// \\s
// str.replace("a","").length();
// str=str.replaceAll("\\s{2,}", " ").trim(); // // finding two or more spaces
// and converting into single space
// str.substring(0, 5); // Extracts "Hello" ( 0 is including and 5 is excluidng
// )
// .trim() method in Java is used to remove leading and trailing whitespace
// str = str.replaceAll("[^a-zA-Z0-9]","");

// int to stirng - String str = Integer.toString(num);
// String to int - int num=Integer.parseInt(str);
// integer Array to String - String str= Arrays.toString(intArray);
// charcter Array to String - String str= String.valueOf(ch);
// String to charcter - char[] charArray = str.toCharArray();
// charcter to String - String charAsString = String.valueOf(myChar);

// String[] words = str.split(" "); // based on split all character will store
// here
// String capitalizedWord = word.substring(0, 1).toUpperCase() +
// word.substring(1).toLowerCase();

// Palindrome: A word or phrase that reads the same backward as forward.
// Example: "racecar"

// Anagram: A word or phrase formed by rearranging the letters of another word
// or phrase.
// Example: "listen" and "silent" are anagrams.

// Pangram: A sentence that contains all the letters of the alphabet.
// Example: "The quick brown fox jumps over the lazy dog."

// isomorphic Isomorphic: Two objects or systems that have the same structure or
// form, but different content or implementation. Example: "listen" and "silent"
// are isomorphic anagrams.

// str.append

// subsequnce vs substring

// subsequnce - non-continous, forward
// substring - continous , forward
// ----------------------------------------------------------------------------------------------------------------------------------

// Q.1 Difference between Replace and replaceAll
// replaceAll me doublequotes " " use hota hai ,
// replace me singlequotes ' ' use hota hai ,

// replace is case-Sensitive
// replaceAll is case-inSensitive

// replace mehtod is used to replace the first occurence of the charcter
// replaceAll mehtod is used to replace the All occurence of the charcter

// replaceAll() can use regular expressions to match more complex patterns.

// Replace method is used to replace a character or
// substring by another character or substring to replace all occurrences in a
// given string
// Return type: String

// replaceAll method is used to returns a new string replacing all the sequence
// of characters that match in the given string.
// This method is also replacing all the occurence of old characters with new
// characters in the given string but the character should be declared in string
// form.
// Return type: String
// -------------------------------------------------------------------------------------------------

// Q.1 Difference between Replace and replaceAll

// replace works with plain characters or strings, replacing all occurrences of
// the specified character or substring.
// replaceAll works with regular expressions, providing more advanced pattern
// matching and replacement capabilities.

// replace(char oldChar, char newChar):
// replaceAll(String regex, String replacement):

// public class String_Question2 {
// public static void main(String[] args) {
// String str ="Hello world" ;
// String result = str.replace('l','o');
// System.out.println(result);
// }
// }

// public class String_Question2 {

// public static void main(String[] args) {
// String str =" Hello world" ;
// String result = str.replaceAll("l","o");
// System.out.println(result);
// }
// }

// public class String_Question2 {
// public static void main(String[] args) {
// String str = "Hello, world!";

// // Using replace()
// String newStr1 = str.replace('o', 'a');
// System.out.println("replace(): " + newStr1); // Output: Halla, warld!

// // Using replaceAll()
// String newStr2 = str.replaceAll("o", "a");
// System.out.println("replaceAll(): " + newStr2); // Output: Halla, warld!

// // Case-sensitivity example
// String str2 = "HELLO, WORLD!";
// String newStr3 = str2.replace('o', 'a');
// System.out.println("replace(): " + newStr3); // Output: HELLA, WARLD!
// String newStr4 = str2.replaceAll("o", "a");
// System.out.println("replaceAll(): " + newStr4); // Output: HELLA, WARLD!
// }
// }

// Key differences:

// Case sensitivity: replace() is case-sensitive, while replaceAll() is
// case-insensitive.
// Regular expressions: replaceAll() can use regular expressions to match more
// complex patterns.
// Efficiency: replaceAll() can be less efficient than replace() for simple
// character replacements, as it involves regular expression matching.

// -------------------------------------------------------------------------------------------------