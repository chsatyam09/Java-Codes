
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q. String vs StringBuffer vs StringBuilder

// Theory 

// string-
//  we opt if the content is fixed and it is would not change frequently;
// String is immmutable and final in java .
// String is a final class.

// string buffer-
//  we opt if the content change frequently but the thread safety is required;
// StringBuffer is thread-safe and synchronized 

//   stringbuilder-
//   we opt if the content change frequently but the thread safety is not  required;
// StringBuilder is not  thread-safe and  not synchronized 


// String is immutable whereas StringBuffer and StringBuilder are mutable classes.


// 1. What are the different string methods in Java?

// There are various string operations in Java that allow us to work with strings.
//  These methods or operations can be used for string handling in Java as well as string manipulation in Java. Some of such methods are as follows:

// split(): Split/divide the string at the specified regex.
// compareTo(): Compares two strings on the basis of the Unicode value of each string character.
// compareToIgnoreCase(): Similar to compareTo, but it also ignores case differences.
// length(): Returns the length of the specified string.
// substring(): Returns the substring from the specified string.
// equalsIgnoreCase(): Compares two strings ignoring case differences.
// contains(): Checks if a string contains a substring.
// trim(): Returns the substring after removing any leading and trailing whitespace from the specified string.
// charAt(): Returns the character at specified index.
// toLowerCase(): Converts string characters to lower case.
// toUpperCase(): Converts string characters to upper case.
// concat(): Concatenates two strings.




//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Theory Quesions 

// Q. String in Java:
//  Java treats Strings as objects, not arrays. String objects are created using the java.lang.String class.

// Q. Is String a primitive or derived type in Java?
// Strings are derived data types.

// Q. when to use concat and when to use append 

// It is also important to realize that with append, the original list is simply modified.(i.e mutable String ==  changeable)

//  On the other hand, with concatenation, an entirely new list is created.(i.e immmutable String == unchangable)

// concat == immutable 
// append == muttable
// immmutable string ke sath concatenation me  concat use karo  
// mutable string i.e StringBuilder and StringBuffer unke sath concatenation me append use karo 


// Q. Duplicates 
// Duplicates  allowed in heap 
// Duplicates  not allowed in scp  

//Q. What are some different ways to create a String object in Java?
// using the new operator
// use double quotes


// Q. How many objects will be created in the following code?
// String s1="javatpoint";
// String s2="javatpoint";
// Answer: Only one.

// How many objects will be created?
// String a = new String("Examveda");
// String b = new String("Examveda");
// String c = "Examveda";
// String d = "Examveda";
// Answer: Only Three.
// Object will be created each time whenever we use new keyword.
//  So, 2 object will be created simply for the first two line and matter is with remaining two bottom line. 
//  String c="examveda" creates an object and store it in String pool, next time when we are writing 
//  String d="examveda" it will first check in String pool whether object already exists or not.
//   Since, it is existing, no new object will be created. Hence reference "d" points to existing object "examveda".
//    So ultimately 3 object will be created at the end.


// Q. What is the difference between equals() method and == operator?
// The equals() method matches content of the strings whereas == operator matches object or reference of the strings.


//  Q. Explain String pool in Java.
// String Pool, also known as SCP (String Constant Pool),
//  is a special storage space in Java heap memory that is used to store unique string objects.
//   Whenever a string object is created, it first checks whether the String object with the same string value is already present in the String pool or not, 
//   and if it is available, then the reference to the string object from the string pool is returned.
//    Otherwise, the new string object is added to the string pool, and the respective reference will be returned.


// Q. Is String immutable or final in Java? If so, then what are the benefits of Strings being Immutable?
// Yes, Strings are immutable in Java. 
// Immutable objects mean they can't be changed or altered once they've been created.
//  However, we can only modify the reference to the string object. using StringBuffer and StringBuilder




// Q.  What does the string intern() method do in Java?

// If you apply the intern() method to a few strings, you will ensure that all strings having the same content share the same memory.
// intren() creates an exact copy of a String object in the heap memory and stores it in the String constant pool. 

// public class String_Question {
//     public static void main(String[] args) {
//         String brand = "pw_skills";      // ye Scp me bnata hai ..(scp= String constant poll) [ no duplicate allowed in scp ]
//         System.out.println(brand);

// //   // Here is 2ndways to create immutable string 

//            String brand1 = new String( "pw_skills");  // ye heap me banta hai    [ duplicate allowed in Heap ]
//     //  If the new operator is used to create a string, it gets created in the heap memory.   
//         System.out.println(brand1);
//         // System.out.println(brand==brand1);  //output false islie hai kyuki ek heap me bana or ek scp location me 


//         String brand2=brand1.intern();
//         System.out.println(brand==brand2); // output True islie hai kykui kyuki humne intern() ki help se heap ki copy scp me save kar lia 
      
//     }
// }


// Q. State the difference between StringBuffer and StringBuilder in Java.
// StringBuffer and StringBuilder are two Java classes for manipulating strings. 
// These are mutable objects, i.e., they can be modified, and provide various methods such as insert(), substring(), delete(), and append(), for String manipulation.

// StringBuffer-=
// StringBuffer allows only one thread to access a method at once, so it is not possible to call StringBuffer methods from two threads simultaneously, which means it takes more time to access.
//  The StringBuffer class has synchronized methods, making it thread-safe, slower, and less efficient than StringBuilder.

//  StringBuilder-=
//  The StringBuilder class has no synchronized methods. Unlike StringBuffer, StringBuilder does not offer synchronized methods, which makes it less thread-safe, faster, and more efficient.


// Q. What is the difference between str1 == str2 and str1.equals(str2)?
// == COMAPRE LOCATION or reference
// .equals compare content
// // Java offers both the equals() method and the "==" operator for comparing objects. However, here are some differences between the two:

// Essentially, equals() is a method, while == is an operator.
// The == operator can be used for comparing references (addresses) and the .equals() method can be used to compare content.
//  To put it simply, == checks if the objects point to the same memory location, whereas .equals() compares the values of the objects.


// Q. What is the use of the substring() method in Java?
// The substring method is used to return substring from a specified string. 
// This method takes two parameters i.e., beginIndex (the starting index) and endIndex (the ending index).





// ==============================================================================================================================================================================================================================================================================


// Q.1 Difference between Replace and replaceAll

// replace works with plain characters or strings, replacing all occurrences of the specified character or substring.
// replaceAll works with regular expressions, providing more advanced pattern matching and replacement capabilities.

// public class String_Question {

//     public static void main(String[] args) {
//         String str =" Hello world" ;
//         String result = str.replace('l','o');
//         System.out.println(result);
//     }
// }

// public class String_Question {

//     public static void main(String[] args) {
//         String str =" Hello world" ;
//         String result = str.replaceAll("l","o");
//         System.out.println(result);
//     }
// }

// Q.1 How to REVERSE String in java?

// Method-1
// public class String_Question {
//     public static void main(String[] args) {
//         String str="satyam ";
//         String str2=" ";

//         for (int i = 0; i < str.length(); i++) {
//             str2=str.charAt(i)+str2 ;
//         }

//         System.out.println(str2);
//     }
// }

// Method-2
// public class String_Question {
//     public static void main(String[] args) {
//         String str="satyam ";
//         String result="";

//         for (int i = str.length()-1; i >=0; i--) {
//             result=str.charAt(i)+result ;     // satyam print hoga 
//         }

//         System.out.println(result);
//     }
// }

// Method-3
// public class String_Question {
//     public static void main(String[] args) {
//         String str="satyam ";
//         String result="";

//         for (int i = str.length()-1; i >=0; i--) {
//             result=result+str.charAt(i) ;
//         }

//         System.out.println(result);
//     }
// }

// Method-4
// public class String_Question {
//     public static void main(String[] args) {
//         String str="satyam ";
//         String result="";

//         for (int i = str.length()-1; i >=0; i--) {
//                  result+=str.charAt(i) ;
//         }

//         System.out.println(result);
//     }
// }

// Mehtod-5

// public class String_Question {
//     public static void main(String[] args) {
//     String str ="Satyam";
//     StringBuilder sb = new StringBuilder();  // this is prefined class wwhich store reverse 
//     sb.append(str);
//     sb.reverse();
//    System.out.println("Reversed string is : "+sb);
//   }
// }

// Method-6

// public class String_Question{
//     public static void main(String[] args) {
//         StringBuffer sb= new StringBuffer("satyam");
//         System.out.println(sb.reverse());

//         StringBuilder sr=new StringBuilder("chaudhary");
//         System.out.println(sr.reverse());
//     }
// }

// method -7
// public class String_Question{
//     public static void main(String[] args) {
//         String input ="satyam ";
//         StringBuffer sb =new StringBuffer(input);
//         System.out.println(sb.reverse());
//     }
// }


// Q.1.2 Java Program to Reverse each Word of a String
// INPUT - JAVA PROGRAM
// OUTPUT - AVAJ MAGORP


// hhimanshu 

// without  using StringBuilder

// public class String_Question{
//     public static void main(String[] args) {

//         String str = "java programming";
//         String[] words = str.split(" "); // Specify the delimiter for splitting

//         String revString = "";

//         for (int i = 0; i < words.length; i++) {
//             String word = words[i];
//             String revword = "";

//             // Reverse the current word
//             for (int j = word.length() - 1; j >= 0; j--) {
//                 revword = revword + word.charAt(j); //avaj
//             }

//             revString = revString + revword + " "; //avaj magorp
//         }

//         System.out.println(revString.trim()); // Trim any trailing space before printing
//     }
// }

// using StringBuilder

// public class String_Question {
//     public static void main(String[] args) {
//         // Input string
//         String inputString = "JAVA PROGRAM";

//         // Split the string into words
//         String[] words = inputString.split(" ");

//         // Create a StringBuilder to build the reversed string
//         StringBuilder reversedString = new StringBuilder();

//         // Reverse each word and append it to the StringBuilder
//         for (String word : words) {
//             StringBuilder reversedWord = new StringBuilder(word);
//             reversedWord.reverse();
//             reversedString.append(reversedWord).append(" ");
//         }

//         // Convert the StringBuilder back to a String and trim any trailing spaces
//         String result = reversedString.toString().trim();

//         // Print the reversed string
//         System.out.println(result);
//     }
// }


 // Q.1.2 How to REVERSE String in java?

//  hhimanshu

// using StringBuilder

// INPUT = I.LKE.THIS.PROGRAM ;
// OUTPUT = PROGRAM.THIS.LIKE.I ;

//  public class String_Question {
//     public static void main(String[] args) {
//         String originalString = "I.LIKE.THIS.PROGRAM";

//         // Split the string based on the dot (.)
//         String[] parts = originalString.split("\\.");

//         // Create a StringBuilder object to build the reversed string
//         StringBuilder reversedString = new StringBuilder();

//         // Concatenate the parts in reverse order
//         for (int i = parts.length - 1; i >= 0; i--) {
//             reversedString.append(parts[i]);
//             if (i > 0) {
//                 reversedString.append(".");
//             }
//         }

//         // Convert the StringBuilder back to a String
//         String result = reversedString.toString();

//         // Print the reversed string
//         System.out.println(result);
//     }
// }


// without using StringBuilder

// public class String_Question {
//     public static void main(String[] args) {
//         String inputString = "I.LIKE.THIS.PROGRAM";

//         // Split the string into parts based on the dot (.)
//         String[] parts = inputString.split("\\.");

//         // Create an empty string to store the reversed result
//         String reversedString = "";

//         // Iterate through the parts in reverse order and concatenate them
//         for (int i = parts.length - 1; i >= 0; i--) {
//             reversedString += parts[i];
//             if (i > 0) {
//                 reversedString += ".";
//             }
//         }

//         // Print the reversed string
//         System.out.println(reversedString);
//     }
// }



//  Q.2 How to count the size of string  without using length() function ;

// public class String_Question {
//     public static void main(String[] args) {
//         int count = 0;
//         String str = " Satyam Raj Chaudhary";

//         for (int i = 0; i < str.length() - 1; i++) {
//             if (str.charAt(i) == ' ')  {
//                 count ++ ;
            
//             }
//             else if((str.charAt(i ) != ' ')){
//                 count ++ ;
//             }
//         }

//         System.out.println(count);
//     }
// }


//  Q.2.1 How to count the size of String

// public class String_Question{
//     public static void main(String[] args) {
//         int result ;
//         String str= "Satyam Raj Chaudhary";
//          result= str.length();
//          System.out.println(result);
//     }
// }

//  Q.2.2  How to count the no of space in string  ? 

// public class String_Question {
//     public static void main(String[] args) {
//         int count = 0;
//         String str = " Satyam Raj Chaudhary";

//         for (int i = 0; i < str.length() - 1; i++) {
//             if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }


//  Q.2.3 How to count the size of array  without space ? 

// public class String_Question {
//     public static void main(String[] args) {
//         int count = 0;
//         String str = "Satyam Raj Choudhary";
//          int size =str.length();

//         for (int i = 0; i < str.length() - 1; i++) {
//             if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
//                 count++;
//             }
//         }
//         int result=size-count ;
//         System.out.println(count);
//         System.out.println(size);
//         System.out.println(result);
//     }
// }




// Q.3  How To Count Occurrences of a  SPECIFIC Character in a String ;

// public class String_Question{
//     public static void main(String[] args) {
//         String str1 =" Satyam Raj Chaudhary";
//          int count = str1.length(); // total length 
//          String str2 = str1.replace("a","");
//          int result = str2.length();
//         int final_length =  count - result ;
//          System.out.println(final_length);
 
//     }
// }

// ============== ============== ==============another method ============== ============== ==============

// public class String_Question{
//     public static void main(String[] args) {
//         int result ;
//         String str=" Satyam Raj Chaudhary";
//          int totalcount = str.length(); // total length 
//          int totalcount_after_removing_a= str.replace("a","").length();
//          int count = totalcount - totalcount_after_removing_a ;
//          System.out.println(count);
 
//     }
// }



// Q.4  Remove White Spaces in a String

// public class String_Question {

//     public static void main(String[] args) {
//         String str=" Satyam Raj Chaudhary";
//         str=str.replaceAll("\\s","");
//         System.out.println(str);
//     }
// }

// another meehtod 

// import java.util.*;
// public class String_Question {

//     public static void main(String[] args) {
//         String str=" i am    Satyam              Raj   Chaudhary";
        
//         str=str.replaceAll("\\s{2,}"," ").trim(); // finding two or more spaces and converting into single space 
//         System.out.println(str);
//     }
// }

// Q.4.1  how to Remove a specific word in a String

// public class String_Question {

//     public static void main(String[] args) {
//         String str=" Satyam Raj Chaudhary";
//         str=str.replaceAll("a","");
//         System.out.println(str);
//     }
// }


// Q.4.2  after remmoving a specific character tell the size  of String 

// public class String_Question{
//     public static void main(String[] args) {
//         int result ;
//         String str=" Satyam Raj Chaudhary";
//          int totalcount = str.length(); // total length 
//         str = str.replace("a","");
//        result= str.length(); // length after removing a 
//         System.out.println(result);
 
//     }
// }


// Q.4.3  No junk characters , delete the junk character  ? 

// public class String_Question{

// public static void main(String[] args) {
//     String str= " â€  satyam RAJ 7903962473 ";
//     str = str.replaceAll("[^a-z0-9]","");
//     // str = str.replaceAll("[^a-zA-Z0-9]","");
//     System.out.println(str);
// }
// }



// Q.4.4  No Alternating characters , how many deletion we required ? 
// you don't have to delete character  you just have tell how many adjacent character's are there or how many deletion is required 



// public class String_Question {
//     static int alternatingcharaccter( String s){
  
//         int count= 0 ;
//         for(int i =1;i < s.ength();i++){
           
//             if(s.charAt(i) == s.charAt(i-1))
//             {
//                  count++  ;
//             }

//         }

//         return count;
//     }
//     public static void main(String[] args) {
//         String s ="AABAAB" ;
// System.out.println(alternatingcharaccter(s));
//     }
// }



// Q.4.6  No Alternating characters , delete the alternating character  ? 

// INPUT="AABAAB";
// OUTPUT="ABAB";

// not working 

// public class String_Question{
//     static void delete_alternating_character(String str){

//         for (int i = 1; i < str.length(); i++) {

//             if(str.charAt(i)==str.charAt(i-1)){
//                 str.replace(" ");
//             }
            
//         }
//     }


//     public static void main(String[] args) {
//         String str =" AABAAB";
//         delete_alternating_character(str);




//     }
// }

// Q.5 Java Program to Convert String to Int and Int to String 

// int to String 

// public class String_Question {

//     public static void main(String[] args) {
//         int num= 12345 ;
//         String str = Integer.toString(num);
//         System.out.println(str);
//     }
// }


// How to convert an  String  to int  in Java?

// public class String_Question {

//     public static void main(String[] args) {
        
//         String str="100";
//       int num=Integer.parseInt(str);
//         System.out.println(num);

//     }
// }


// 5.2 How to convert an integer  Array to String in Java?

// import java.util.*;
// public class String_Question {
//     public static void main(String[] args) {
//         int[] intArray = {1, 2, 3, 4, 5};

//         String arrayAsString = Arrays.toString(intArray);

//         System.out.println("Array as String: " + arrayAsString);
//     }
// }

// 5.1 How to convert an  char Array to String in Java?

// public class String_Question {

//     public static void main(String[] args) {
//         char ch[]={ 'a', 'b','c','d' } ;
//         String str= String.valueOf(ch);
//         System.out.println(str);
//     }
// }

// How to convert an  String to char Array  in Java?
// public class String_Question {
//     public static void main(String[] args) {
//         String str="School Master ";
//         char arr[]= new char[15];
//         str.getChars(0,10,arr,0);
//         // 0 = where to start ;
//         // 10 = where to end ;
//         // arr = where to Store ;
//         // 0 = arr me kaha se store karna chahte ho ;
//         System.out.println(arr);
//     }

    
// }


// 5.1 How to convert an  char  to String in Java?

// public class String_Question {
//     public static void main(String[] args) {
//         char myChar = 'A';

//         String charAsString = String.valueOf(myChar);

//         System.out.println("Char as String: " + charAsString);
//     }
// }



// 6) How to check  ANAGRAM PROGRAM  in java ?
// ex- cat /act 
// ex-listen /silent 
// ex-rat / art 

// Steps to perform anagram program :
//  1.remove space 
// 2.convert to lower_case
// 3.convert to an array char 
// 4.Sort ex- a= 65

// import java.util.Arrays;
// public class String_Question {
//     public static void main(String[] args) {
//         String arr1="Scholl Master";
//         String arr2="The classroom";


//         // remove space 
//         arr1=arr1.replace(" ","");
//         arr2=arr2.replace(" ","");

//         //  another method to remove space 
//     //    s1=s1.replace("\\s","");
//     //    s2=s2.replace("\\s","");



//         // just checking 
//         //  System.out.println(s1);  
//         //  System.out.println(s2);


//         //convert to lower_case 

//         arr1=arr1.toLowerCase();
//         arr2=arr2.toLowerCase();

//           // just checking 
//         //  System.out.println(s1);  
//         //  System.out.println(s2);


//         // convert to an array char

//        char arr_x[]=arr1.toCharArray();
//        char arr_y[]=arr2.toCharArray();


//             // just checking 
//         //  System.out.println(arr1);  
//         //  System.out.println(arr2);

        
//     //this line for sorting the array in ascending order 

//          Arrays.sort(arr1);
//         Arrays.sort(arr2);

//                  // just checking 
//          System.out.println(arr1);  
//          System.out.println(arr2);

//          //           // now comparing  

//          if ( Arrays.equals(arr1,arr2)){
//             System.out.println(" this is an ANAGRAM");
//          }
//          else{
//             System.out.println("THIS IS NOT  an anagram");
//          }
        
//     }
// }

//  another method  simple way 

// import java.util.Arrays;

// public class String_Question {
//     public static void main(String[] args) {
//         String str1 = "School Master";
//         String str2 = "The classroom";

//         // Remove spaces and convert to lowercase
//         str1 = str1.replace(" ", "").toLowerCase();
//         str2 = str2.replace(" ", "").toLowerCase();

//         // Convert to char arrays
//         char[] arr1 = str1.toCharArray();
//         char[] arr2 = str2.toCharArray();

//         // Sorting the arrays
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         // Comparing sorted arrays
//         if (Arrays.equals(arr1, arr2)) {
//             System.out.println("This is an ANAGRAM");
//         } else {
//             System.out.println("This is NOT an anagram");
//         }
//     }
// }



// // 6) How to check PANAGRAM  String in java ?
// public class string
// {
//     public static void main(String[] args) 
//     {
//        boolean flag=false;
//         String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";

//           // this line for removing white spaces 
//         str=str.replace(" ", "");

//         // this line for  converting to lower case ;
//         // str=str.toLowerCase() ;

//           // this line for converting to an char array 
//         char []ch=str.toCharArray();

//         // create an empty array of total alphabet Size 
//         int arr[]=new int[26]; // here is new array 

//         for(int i=0;i<ch.length;i++)
//         {
//             arr[ch[i]-65]++;   //    T=84  - 65 = 19  new array i.e arr me 19 .. o ki jagah 1 ho jayegaa ++ karne ki wajah se 0 converted to 1 in arr 
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==0)
//             {
//                 System.out.println("Its not pangram");
//                 flag=true;
//             }
//         }
        
//         if(flag==false)
//         {
//             System.out.println("Its pangram");
//         }
//     }
// }


// 7) Write a java program to CAPITALIZE each word in string?



// public class String_Question {

//     public static void main(String[] args) {
//         String actualString = " i am                        satyam                 raj ";
//         String replaceString = actualString.replaceAll("\\s{2,}", " ");
//         System.out.println(replaceString);
//         String words[] = replaceString.split(" "); // spliting based on space
        
//         for (String word : words) {
//             if (!word.isEmpty()) {  // Check for non-empty words
//                 System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
//             }
//         }
//     }
// }

// word.substring(0, 1): 
// This part extracts the first character of the word. 
// It uses the substring method, where the first argument is the starting index (inclusive), and the second argument is the ending index (exclusive).
//  In this case, it starts from index 0 and ends at index 1, retrieving the first character of the word.

// .toUpperCase(): 
// This method is used to convert the first character to uppercase. This ensures that the first letter of each word is capitalized.

// word.substring(1): 
// This part extracts the rest of the characters in the word, starting from index 1. It includes all characters from index 1 to the end of the word.

// + " ":
//  This concatenates a space at the end of each formatted word. It ensures that there is a space between each word in the printed output.



// 8) Write a java program to TOGGLE each word in string?

// We can tOGGLE each word of a string by the help of split(), toLowerCase(), toUpperCase() and substring() methods. 
// By the help of split("\\s") method, we can get all words in an array.

// public class String_Question {

//     public static void main(String[] args) {
//         String str = "Hello Java ";
//         StringBuffer togString =new StringBuffer() ;

//         for (int i = 0; i < str.length(); i++) {
//             char ch =str.charAt(i) ;

//             if(Character.isLowerCase(ch)){
//                 togString.append(Character.toUpperCase(ch));
//             }
//             else{
//                 togString.append(Character.toLowerCase(ch));
//             }
//         }
//         System.out.println(togString.toString());
//     }
// }

// In Java, how can two strings be COMPARED?

// str1.equals(str2);
// str1.equalsIgnoreCase(str2);
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// ===================================================== lovebabbar ===================================================== 

// Q.1 Reverse a String <->

// public class String_Question {
//     public static void main(String[] args) {
//         String str="satyam ";
//         String result="";

//         for (int i = str.length()-1; i >=0; i--) {
//             result=result+str.charAt(i) ;
//         }

//         System.out.println(result);
//     }
// }


//Q.2 String Check whether a String is Palindrome or not <->

// public class String_Question {

//     public static void main(String[] args) {
//         String s1="NITIN";
//         String s2="";
//         for (int i = s1.length()-1; i>=0; i--) {
//             s2=s2+s1.charAt(i);
            
//         }
//         if(s1.equals(s2)){
//             System.out.println("THIS IS A PALIDROME");
//         }
//         else{
//             System.out.println("THIS IS NOT PALIDROME");
//         }
//     }
// }



// Q.3  Find Duplicate characters in a string <->

// himanshu 
// public class String_Question {

//     static void Duplicate(String s1){
//         for (int i = 0; i < s1.length(); i++) {
//             for (int j = i+1; j < s1.length(); j++) {
//                 if(s1.charAt(i)== s1.charAt(j)){    // koi match hii nhi kar raha 
//                     System.out.println("Duplicate character asr:" + s1.charAt(i));
//                 }
 
//             }
            
//         }
      
//     }

//     public static void main(String[] args) {
//         String s1="maheshbabu";
// Duplicate(s1);

//     }
// }

// Another method  

// public class String_Question {

//     static char findDuplicate(String s1) {
//         for (int i = 0; i < s1.length(); i++) {
//             for (int j = i + 1; j < s1.length(); j++) {
//                 if (s1.charAt(i) == s1.charAt(j)) {
//                     System.out.println("Duplicate character is: " + s1.charAt(i));
//                     return s1.charAt(i);
//                 }
//             }
//         }
//         return '\0'; 
//     }

//     public static void main(String[] args) {
//         String s1 = "maheshbabu";
//         char duplicate = findDuplicate(s1);
//         if (duplicate == '\0') {
//             System.out.println("No duplicate characters found.");
//         }
//     }
// }

// Return null character if no duplicate is found



// Q.4  Why strings are immutable in Java? <->

// immmutable - objects whose contents can'not be chamged .. 
// immmutable String or objects that cannot be modified once it is created. but we  can only hnage the refrence  to the objects 
// String is immutable in java because of the security synchronization  and concurrency ,caching and class loading .

// Thread Safety: 
// Immutability makes strings inherently thread-safe. Since strings cannot be modified, 

// Caching: 
// String literals are cached in a special string pool in Java. 
// When you create a new string literal with the same value as an existing one, the JVM reuses the existing object from the pool.
// This helps in conserving memory and improving performance.they can be safely shared among multiple threads without the need for external synchronization mechanisms. 

// Security: 
// Strings are widely used in various security-related operations, such as storing passwords or cryptographic keys. 
// Immutability ensures that once a string is created, its value cannot be changed, preventing unintended modifications


// public class String_Question {

//     public static void main(String[] args) {
//         String s1=new String("hello world "); // heap me banaega or ek copy scp me (refrence stack se s1)
//         String s2= "hello ji";// scp me banaega (refrence stack se s2)
//         String s3= " hello world "; // s1 ka jo copy tha scp me  s3 usse refrence lega (refrence stack se s3)
//         String s4 = new String("hello ji");
//         s2.concat("satyam "); // dekha chnage nhi hua ek baar jo scp me baan gaya wo chnage nhyi hoga 
//         s2=s2.concat("Satyam"); //this is possible ,value chnage nhi hua hai , pura ka pura new hii bana hai 


//         // string constant pool (scp) me same  element dubara nhi banega orr ek baar value baan gaya tooh change bhi nhi hoga 

//         System.out.println(s1);
//         System.out.println(s2);
//         System.out.println(s3);
//         System.out.println(s4);
//     }
// }



// Q.5 String Write a Code to check whether one string is a rotation of another <->


// public class String_Question {

//     static boolean isRotation(String s , String goal){
//         if(s.length()== goal.length() && (s+s).contains(goal)){
//             return true ;
//         }
//         else{
//             return false  ; 
//         }
//     }

//     public static void main(String[] args) {
//         String s="abcde";
//         String goal="cdeab";
//         System.out.println(isRotation(s, goal));
        
//     }
// }

// Another method  


// public class String_Question {

//     public boolean isRotation(String s, String goal) {
//         String whole = s + s;


//         if (s.length() != goal.length()) {
//             return false;
//         }

      
//         if (!whole.contains(goal)) {   //  The contains method is a Java String method that checks whether a specified sequence of characters (substring) is present in another string. 
    
//             return false;
//         } else {
//             return true;
//         }
//     }

//     public static void main(String[] args) {
//         String s = "abcde";
//         String goal = "cdeab";

//         // This step is necessary because the isRotation method is an instance method (non-static method), and it needs to be called on an instance of the class.
//         String_Question stringQuestion = new String_Question();


//      //  Called the method on an instance of String_Question
//         boolean result = stringQuestion.isRotation(s, goal);


//     // why not this ?
//     // System.out.println(isRotation(s,goal));



//         System.out.println("Is " + goal + " a rotation of " + s + "? " + result);
//     }
// }




//Q.6 String Write a Program to check whether a string is a valid shuffle of two strings or not <->

// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
// Output: "leetcode"
// Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

// without sorting 

// public class String_Question {
//     public static boolean isValidShuffle(String str1, String str2, String shuffle) {
//         int len1 = str1.length();
//         int len2 = str2.length();
//         int lenShuffle = shuffle.length();

//         if (len1 + len2 != lenShuffle) {
//             return false;
//         }

//         int i = 0, j = 0, k = 0;

//         while (k < lenShuffle) {
//             if (i < len1 && str1.charAt(i) == shuffle.charAt(k)) {
//                 i++;
//             } else if (j < len2 && str2.charAt(j) == shuffle.charAt(k)) {
//                 j++;
//             } else {
//                 return false;
//             }
//             k++;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String string1 = "abc";
//         String string2 = "123";
//         String shuffle1 = "a1b2c3";  
//         String shuffle2 = "bca321"; 
//         String shuffle3 = "ac312b";  

//         System.out.println(isValidShuffle(string1, string2, shuffle1));  
//         System.out.println(isValidShuffle(string1, string2, shuffle2)); 
//         System.out.println(isValidShuffle(string1, string2, shuffle3)); 
//     }
// }


// Another method with sorting 

// import java.util.*;
// public class String_Question {
//     public static boolean isValidShuffle(String str1, String str2, String shuffle) {

//         // length finding and matching 
//         int len1 = str1.length();
//         int len2 = str2.length();
//         int lenShuffle = shuffle.length();

//         if (len1 + len2 != lenShuffle) {
//             return false;
//         }



//         // Sorting all String 
//         str1=sort(str1);
//         str2=sort(str2);
//         shuffle=sort(shuffle);

//         int i = 0, j = 0, k = 0;

//         while (k < lenShuffle) {
//             if (i < len1 && str1.charAt(i) == shuffle.charAt(k)) {
//                 i++;
//             } else if (j < len2 && str2.charAt(j) == shuffle.charAt(k)) {
//                 j++;
//             } else {
//                 return false;
//             }
//             k++;
//         }

//         return true;
//     }

//     // ye nhi samjh aaya 
//     private static String sort(String input) {
//         char[] charArray = input.toCharArray();
//         Arrays.sort(charArray);
//         return new String(charArray);
//     }

//     public static void main(String[] args) {
//         String string1 = "abc";
//         String string2 = "123";
//         String shuffle1 = "a1b2c3";  
//         String shuffle2 = "bca321";  
//         String shuffle3 = "ac312b"; 

//         System.out.println(isValidShuffle(string1, string2, shuffle1));  
//         System.out.println(isValidShuffle(string1, string2, shuffle2));
//         System.out.println(isValidShuffle(string1, string2, shuffle3));  
//     }
// }

//Q.7 String Count and Say problem <->

// Q.3322251
// soluton -  two 3 ,three 2 ,one 5,one 1  = " 23321511" ;


// Example 2:
// Input: n = 4
// Output: "1211"
// Explanation:
// countAndSay(1) = "1"
// countAndSay(2) = say  1 ko dekho i.e."1" = one  time 1 = "11"
// countAndSay(3) = say 2 ko dekho i.e."11" = two  time 1's = "21"
// countAndSay(4) = say 3 ko dekho i.e."21" = one time  2 + one time  1 = "12" + "11" = "1211"

// public class String_Question {

//     public String countAndSay(int n) {
//         if (n == 1) return "1";

//         // Recursion
//         String s = countAndSay(n - 1);
//         StringBuilder res = new StringBuilder();
//         int counter = 1;

//         for (int i = 0; i < s.length(); i++) {
//             // Segregating into groups
//             if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
//                 counter++;
//             } else {
//                 res.append(counter).append(s.charAt(i));
//                 counter = 1;
//             }
//         }

//         return res.toString();
//     }

//     public static void main(String[] args) {
//         String_Question obj = new String_Question();
//         int n = 4;
//         String result = obj.countAndSay(n);
//         System.out.println(result);
//     }
// }

//  Q.8 String Write a program to find the longest Palindrome in a string.[ Longest palindromic Substring] <->


// public class String_Question {

//     // Function to find and print the longest palindromic substring
//     static void longestSubstring(String s) {

//         // Initialize variables to store the start and end indices of the longest palindromic substring
//         int start = 0, end = 1;

//         // Iterate through each character in the string
//         for (int i = 1; i < s.length(); i++) {
//             // Check for even length palindromes
//             int l = i - 1;  // Left index for even length palindrome
//             int h = i;      // Right index for even length palindrome

//             // Expand around the center to find the longest palindrome
//             while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
//                 if (h - l + 1 > end) {
//                     start = l;          // Update start index
//                     end = h - l + 1;    // Update length of the palindrome
//                 }
//                 l--;
//                 h++;
//             }

//             // Check for odd length palindromes
//             l = i - 1;  // Left index for odd length palindrome
//             h = i + 1;  // Right index for odd length palindrome

//             // Expand around the center to find the longest palindrome
//             while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
//                 if (h - l + 1 > end) {
//                     start = l;          // Update start index
//                     end = h - l + 1;    // Update length of the palindrome
//                 }
//                 l--;
//                 h++;
//             }
//         }

//         // Print the longest palindromic substring using substring method
//         System.out.println(s.substring(start, start + end));
//     }

//     public static void main(String[] args) {
//         // Example usage with the given string
//         String s = "caabaddbbddaa";
//         longestSubstring(s);
//     }
// }




// Q.9 String Find Longest Recurring Subsequence in String <->





// Q.10 String Print all Subsequences of a string. <->






// Q.11 String Print all the permutations of the given string <->






// Q.13 String Split the Binary string into two substring with equal 0’s and 1’s <->
// Q.14 String Word Wrap Problem [VERY IMP]. <->
// Q.15 String EDIT Distance [Very Imp] <->
// Q.16 String Find next greater number with same set of digits. [Very Very IMP] <->
// Q.17 String Balanced Parenthesis problem.[Imp] <->
//Q.18 String Word break Problem[ Very Imp] <->
// Q.19  String Rabin Karp Algo <->
//Q.20 String KMP Algo <->
// Q.21String Convert a Sentence into its equivalent mobile numeric keypad sequence. <->
//Q.22 String Minimum number of bracket reversals needed to make an expression balanced. <->
// Q.23String Count All Palindromic Subsequence in a given String. <->
// Q.24String Count of number of given string in 2D character array <->
// Q.25String Search a Word in a 2D Grid of characters. <->
//Q.26String Boyer Moore Algorithm for Pattern Searching. <->
// Q.27String Converting Roman Numerals to Decimal <->
// Q.28String Longest Common Prefix <->
// Q.29String Number of flips to make binary string alternate





// Q. 30 Find the Adjacent repeated character  in string. <->

// HIMANSHU

// public class String_Question{

//     static String str2=" " ;  // isme static kyu use hoga 
//     static void find(String str){
//         for (int i = 1; i < str.length(); i++) {
//             if(str.charAt(i)== str.charAt(i-1)){
//                 str2 = str.charAt(i)+str2;
//             }
            
//         }
//     }
//     public static void main(String[] args) {
//         String str="ABAABAACC";
//         find(str);
//         System.out.println(str2);
//     }
// }


// WORKING 

// public class String_Question{

//     public static void main(String[] args) {
//         String str="ABAABAACC";
//         String str2=" " ; 
 
//             for (int i = 1; i < str.length(); i++) {
//                 if(str.charAt(i)== str.charAt(i-1)){
//                     str2 += str.charAt(i);
//                 }
                
//             }
//         System.out.println(str2);
//     }
// }



// Q. 31 String Minimum number of swaps for bracket balancing. <->
// Answer ME COUNT RETURN KARNA HAI NA KI SWAP KARKE DIKHANA HAI 

// HIMANSHU

// Example 1:
// Input: s = "][]["
// Output: 1
// Explanation: You can make the string balanced by swapping index 0 with index 3.
// The resulting string is "[[]]".


// Example 2:
// Input: s = "]]][[["
// Output: 2
// Explanation: You can do the following to make the string balanced:
// - Swap index 0 with index 4. s = "[]][][".
// - Swap index 1 with index 5. s = "[[][]]".
// The resulting string is "[[][]]".


// ye non adjacent walla case hai 

// public class String_Question{
//    static int minimumnumberswaps(String str){

//         int open=0;
//         int close= 0;
//         for (int i = 0; i < str.length(); i++) {
//             if(str.charAt(i)=='['){
//                 open++ ;
//             }

//             if (open<=0) {

//                 close++ ;
                
//             }
//             else{
//                 open-- ;
//             }
            
//         }
//         return(close+1)/2 ;

//     }

//     public static void main(String[] args) {
//         String str="[]][][";

//         System.out.println(minimumnumberswaps(str));

//     }
// }


// ye adjacent walla case hai 

// public class String_Question {
//     static int minimumnumberswaps(String str){

//         int open=0;
//         int closed=0 ;
//         int unbalanced=0;
//         int swap = 0 ;

//         for (int i = 0; i < str.length(); i++) {
//             if(str.charAt(i)=='['){
//                 open++;
//                 if(unbalanced>0)
//                 {
//                     swap+=unbalanced ;
//                     unbalanced-- ;
//                 }
//             }
            
//             else{
//                 closed++ ;
//                 unbalanced= closed-open ;
//             }
            
          

//         }
//         return swap ;
//     }

//     public static void main(String[] args) {

//         String str="[]][][";
//         System.out.println(minimumnumberswaps(str));
        
//     }
// }



// Q.32 String Find the longest common subsequence between two strings. <->


// public class String_Question {
//     static int solve(String a, String b, int i, int j) {
//         // base case
//         if (i == a.length() || j == b.length()) {
//             return 0;
//         }

//         int ans = 0;

//         if (a.charAt(i) == b.charAt(j)) {
//             ans = 1 + solve(a, b, i + 1, j + 1);
//         } else {
//             ans = Math.max(solve(a, b, i + 1, j), solve(a, b, i, j + 1));  // The Math.max function is then used to compare the results of these two recursive calls, 
//                                                                         //  and the larger result is assigned to the variable ans.
//                                                         //This ensures that the recursive call considers both possibilities and selects the one that contributes more to the overall solution.
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         String a = "abcdef";
//         String b = "abc"; 
//         System.out.println(solve(a, b, 0, 0));
//     }
// }


// Q. //33 . String Program to generate all possible valid IP addresses from given string. <->
// Example 1:

// Input: s = "25525511135"
// Output: ["255.255.11.135","255.255.111.35"]











// Q. 33.1 write a program to check it is valid ip address or not ?
// check whether a given string represents a valid IPv4, IPv6, or an invalid IP address


// himanshu 
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class String_Question {

//     static String validIPv4orIPv6(String IP) {
//         String ipv4Pattern = "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
//         String ipv6Pattern = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

//         Pattern patternIPv4 = Pattern.compile(ipv4Pattern);
//         Pattern patternIPv6 = Pattern.compile(ipv6Pattern);

//         Matcher matcherIPv4 = patternIPv4.matcher(IP);
//         Matcher matcherIPv6 = patternIPv6.matcher(IP);

//         if (matcherIPv4.matches()) {
//             return "IPv4";
//         } else if (matcherIPv6.matches()) {
//             return "IPv6";
//         } else {
//             return "Invalid";
//         }
//     }

//     public static void main(String[] args) {
//         String IP = "174.192.30.70";
//         System.out.println(validIPv4orIPv6(IP));
//     }
// }





























// Q.34 String Write a program tofind the smallest window that contains all characters of string itself. <->
// Q.35 String Rearrange characters in a string such that no two adjacent are same <->
// Q.63 String Minimum characters to be added at front to make string palindrome <->
// Q.37 String Given a sequence of words, print all anagrams together <->
// Q.38 String Find the smallest window in a string containing all characters of another string <->
// Q.39 String Recursively remove all adjacent duplicates <->
// Q.40 String String matching where one string contains wildcard characters <->
// Q.4 1String Function to find Number of customers who could not get a computer <->
// Q.42 String Transform One String to Another using Minimum Number of Given Operation <->
// Q.43 String Check if two given strings are isomorphic to each other <->
// Q.44 String Recursively print all sentences that can be formed from list of word lists





















































