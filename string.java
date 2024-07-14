
// 04/feb

// ways to create string 

// The mutable objects can be changed to any value or state without adding a new object.
//  Whereas, the immutable objects can not be changed to its value or state once it is created

// this is immmutable string (unchnageable)

// public class string {
//     public static void main(String[] args) {
//         String brand = "pw_skills";      // ye Scp me bnata hai ..(scp= String constant poll) [ no duplicate allowed in scp ]
//         System.out.println(brand);

// //   // Here is 2ndways to create immutable string 

//            String brand1 = new String( "pw_skills");  // ye heap me banta hai    [ duplicate allowed in Heap ]
    //  If the new operator is used to create a string, it gets created in the heap memory.   
//         System.out.println(brand1);
      
//     }
// }

// -----------------------------------------------------------------------------

// ways to chnage or use concatenation in  immmutable string 
// The mutable objects can be changed to any value or state without adding a new object.
//  Whereas, the immutable objects can not be changed to its value or state once it is created

 // immutable stirng == unchangable ;  ( use concat ) with concatenation, an entirely new list is created.
//  immutable String karo chnage karna hai tooh same refrence me wapas daal do 

 // mutable string == changeable ;  i.e  stringBuffer and stringBuilder  (use  append )  with append, the original list is simply modified

// public class string {
//     public static void main(String[] args) {
//         String brand = "pw_skills"+" ";
//           brand.concat("kholi--1");   // immutable string hai isme print nhi hoga 
//          brand = brand.concat("kholi--2"); // immutable string hai lekin humne same refrence me wapas store karwa dia  
//          // with concatenation, an entirely new list is created
//         System.out.println(brand); 

// //   // Here is 2ndways to create immutable string 

//            String brand1 = new String( "pw_skills"+ " ");
//            brand1.concat("kholi---1");   // immutable string hai isme print nhi hoga 
//            brand1 = brand.concat("kholi--2"); // immutable string hai lekin humne same refrence me wapas store karwa dia 
//            // with concatenation, an entirely new list is created
//         System.out.println(brand1);
      
//     }
// }


// -----------------------------------------------------------------------------
// different ways of comparision


// comprison of strings 
// == operator compares the refrence of the object 
// .equals(s2) compare the contents of two objects 

// [ duplicate allowed in scp ]
// [ duplicate allowed in Heap ]


// public class string {
//     public static void main(String[] args) {
//         String s1 = "pw_skills";

// //   // Here is 2ndways to create immutable string 

//            String s2 = new String( "pw_skills");
// System.out.println(s1==s2);
// System.out.println(s1.equals(s2));
      
//     }
// }

// public class string {

//     public static void main(String[] args) {
//         String s1="pwskill";
//         String s2="pwskill";
//         String s3= new String("pwskill");
//         String s4= new String("pwskill");
//         System.out.println(s1==s2);
//         System.out.println(s1==s3);
//         System.out.println(s3==s4);
//         System.out.println(s1.equals(s2));
//         System.out.println(s1.equals(s3));
//         System.out.println(s3.equals(s4));
//     }
// }

// public class string {

//     public static void main(String[] args) {
//         String s1 =("pwskills");
//         String s2 =("pwskills");
//         String s3 =("PWSKILLS");

//         System.out.println(s1==s2);
//            System.out.println(s1==s3);
//               System.out.println(s2==s3);

//               System.out.println(s1.equals(s2));
//                   System.out.println(s1.equals(s3));
//                       System.out.println(s2.equals(s3));
//     }
// }

// public class string {

//     public static void main(String[] args) {
//         String s1="pwskills";
//         String s2=new String("pwskills");
//          String s3=new String("pwskills");
//          System.out.println(s1==s2);
//          System.out.println(s1==s3);
//          System.out.println(s2==s3);


//          System.out.println(s1.equals(s2));
//           System.out.println(s1.equals(s3));
//            System.out.println(s2.equals(s3));
//     }
// }


// =================================================================

// Types of String 


// public class string {
//     public static void main(String[] args) {

//  // immutable stirng == unchangable ;

//         String brand = "pw_skills";
//         System.out.println(brand);
//         String brand1 = new String( "pw_skills");
//         System.out.println(brand1);

//  // mutable string == changeable ;

     
//         StringBuilder  brand2 = new StringBuilder("Pw_skills");
//         StringBuffer  brand3 = new StringBuffer("Pw_skills");
//                 System.out.println(brand2);
//                 System.out.println(brand3);

//     }
// }


// -----------------------------------------------------------------------------
// ways to chnage or use concatenation in  mmutable string  
// The mutable objects can be changed to any value or state without adding a new object.
//  Whereas, the immutable objects can not be changed to its value or state once it is created

 // immutable stirng == unchangable ;  ( use concat ) with concatenation, an entirely new list is created.
//  immutable String karo chnage karna hai tooh same refrence me wapas daal do 

 // mutable string == changeable ;  i.e  stringBuffer and stringBuilder  (use  append )  with append, the original list is simply modified

// public class string {
//     public static void main(String[] args) {
//         StringBuilder  brand2 = new StringBuilder("Pw_skills");
//           brand2.append("kholi--1");   // mutable string hai islie directly chnage ho raha hai
//          brand2.concat("kholi--2");  // concat is not working with mutable string 
//         System.out.println(brand2); 

      
//     }
// }


// -----------------------------------------------------------------------------

// immutable string new string nhi ban raha bass refrence ko chnage kar rahe hai 
// public class string{
//     public static void main(String[] args) {
        
//         String s1 = new String("pw");
//         s1.concat("skills");  // not working bcz this is immutable , same refrence me wapas karna hoga 
//         System.out.println(s1);
//     }
// }

// or

// public class string{
//     public static void main(String[] args) {
        
//         String s1 = new String("pw" + " ");
//         s1=s1.concat("skills");
//         System.out.println(s1);
//     }
// }

// -----------------------------------------------------------------------------


// public class string{
//     public static void main(String[] args) {
        
//         String s1 = "pw";
//           String s2 = "pw"+"java";
//             String s3 = "pw"+"java"+"skills";
//               String s4=s1+s2;
    
//         System.out.println(s1);
//                 System.out.println(s2);
//                         System.out.println(s3);
//                                 System.out.println(s4);
//     }
// }

// -----------------------------------------------------------------------------

// immmutable vs mutable

// public class string {
//   public static void main(String[] args) {
//       String brand = "pw_skills";
//       System.out.println(brand);
//       brand.concat("coaching");
//       System.out.println(brand);
//       // uppar wala immmutable string hai jo change nhi hoga  same refrence  me dubara store karna hoga 

// System.out.println(" ");

//       StringBuilder brand1 = new StringBuilder("Pw_skills");
//               System.out.println(brand1);
//                  brand1.append(" " + "coaching");
//                   System.out.println(brand1);
//                     // uppar wala mutable string hai jo change  hoga 
//   }
// }




//-------------------------------------------------------------------
// inbuilt method in string 


// public class string {

//     public static void main(String[] args) {
//         String s1 ="pw  SkillS";
//         System.out.println(s1);
//         System.out.println(s1.toUpperCase());
//              System.out.println(s1.toLowerCase());
//                   System.out.println(s1.length());
//                        System.out.println(s1.charAt(3));
//                             System.out.println(s1.substring(3,8));
//                                  System.out.println(s1.indexOf("k"));
//                                    System.out.println(s1.replace(" ",""));
//                                       System.out.println(s1.toCharArray());
//     }
// }

//-------------------------------------------------------------------
// 05 feb 
// reversing of  string 

// public class string {

//     public static void main(String[] args) {
//         String s1="pw-skills";
//         String s2=" ";
//         for(int i=s1.length()-1;i>=0;i--){
//             s2=s2+s1.charAt(i);
//         }
//         System.out.println("before reversing"+ " "+ s1);
//         System.out.println(s2);
//     }
// }

// shortcut- method 

// public class string {

//     public static void main(String[] args) {

//            StringBuffer r= new StringBuffer("pw-skills");
//         System.out.println(r);
//         System.out.println(r.reverse());
        
//     }
    
// }

// public class string {

//     public static void main(String[] args) {
//         String s1="java pwskills";
//         String s2=" ";
//         String strr[]=s1.split(" ");
//         for(int i=strr.length-1;i>=0;i--){
//             s2=s2+strr[i]+" ";
//         }
//         System.out.println(s2);
//     }
// }



// -----------------------------------------------------------------------------
// PANILDROME PROGRAM 
// EX- MADAM
// EX-NITIN
// EX-2552


// public class string {

//     public static void main(String[] args) {
//         String s1="NITIN";
//         String s2="";
//         for(int i=s1.length()-1;i>=0;i--){
//             s2=s2+s1.charAt(i);
//         }
//         System.out.println(s2);

//         if(s1.equals(s2)){
 
//               System.out.println("PANILDROME");
//         }
//         else{
//             System.out.println("not panildrome");
//         }
      

//     }
// }





// -----------------------------------------------------------------------------
// ANAGRAM PROGRAM 

// Steps to perform anagram program :
//  1.remove space 
// 2.convert to lower_case
// 3.convert to an array char 
// 4.Sort ex- a= 65
// compare array 


// import java.util.Arrays;

// public class string {

//     public static void main(String[] args) {
//         String s1= " School Master ";
//         String s2 =" The Classroom";

//         // this line for removing white spaces 
         
//         // new string ban gaya yaha pe or ye 
//         // immutable string hai . islie same string pe refer karwa dia 
//         s1=s1.replace(" ","");
//         s2=s2.replace(" ","");


//         // this line for converting all alphabets to lowercase

//         s1=s1.toLowerCase();
//         s2=s2.toLowerCase();


//       //this line for converting all alphabets to an array 

//         char[ ]ar1=s1.toCharArray();
//          char[ ]ar2=s2.toCharArray();


//         //this line for sorting the array in ascending order 

//          Arrays.sort(ar1);
//         Arrays.sort(ar2);
        

//           // now comparing  

//          if ( Arrays.equals(ar1,ar2)){
//             System.out.println(" this is an ANAGRAM");
//          }
//          else{
//             System.out.println("THIS IS NOT  an anagram");
//          }

//     }
// }



// -----------------------------------------------------------------------------
// PANGRAM PROGRAM 
// A to Z sarre letters hone chaiye 

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
//         int arr[]=new int[26];

//         for(int i=0;i<ch.length;i++)
//         {
//             arr[ch[i]-65]++;   //    T=84  - 65 = 19  new array i.e arr me 19 .. o ki jagah 1 ho jayegaa 
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


// -----------------------------------------------------------------------------

// 06/feb 
// Mutable String 

// The mutable objects can be changed to any value or state without adding a new object. 
// Whereas, the immutable objects can not be changed to its value or state once it is created.


 // immutable stirng == unchangable ;  ( use concat ) with concatenation, an entirely new list is created.
//  immutable String karo chnage karna hai tooh same refrence me wapas daal do 

 // mutable string == changeable ;  i.e  stringBuffer and stringBuilder  (use  append )  with append, the original list is simply modified

//using StringBuffer

// public class string {
//     public static void main(String[] args) { 
//         StringBuffer s1= new StringBuffer(" heelo wolrd ");
//         // StringBuffer s1=" Helooworld "   // this is invalid syntax in mutable string 
//         System.out.println(s1);
//         s1.append(" you are my world");
//          System.out.println(s1);
//     }
// }


// using StringBuilder

// public class string {
//     public static void main(String[] args) {
//         StringBuilder s1= new StringBuilder(" heelo wolrd ");
//     // StringBuilder s1=" Helooworld "   // this is invalid syntax 
//         System.out.println(s1);
//         s1.append("you are my world");
//             System.out.println(s1);
//     }
// }

// -------------------------------------------------------------------------------------------------------------

// ways to do chnage in mutable String /

// public class string {

//     public static void main(String[] args) {
//         StringBuffer s1 =new StringBuffer("hello Satyam Raj" + " ");
//         s1.append("chaudhary");
//         System.out.println(s1);

//         StringBuilder s2 =new StringBuilder("hello Satyam Raj" + " ");
//         s2.append("chaudhary");
//         System.out.println(s2);
//     }
// }

// -----------------------------------------------------------------------------

// public class string {

//     public static void main(String[] args) {
//      StringBuffer sb=new StringBuffer("virat");
//         sb.append("kholi");
//        sb=new StringBuffer("Sachin");
//                 System.out.println(sb);
//     }
// }


// -----------------------------------------------------------------------------

// final


// final can'not be applied to  immmutable string (unchnageable)



// final ka impact StringBuffer pe nhi hoga 
// final ka impact variable pe hoga 
// sb pe impact hoga 


// public class string {
//   public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer("virat");
//       sb.append("kholi");
// sb=new StringBuffer("Sachin");
//               System.out.println(sb);
//   }
// }

// // or 

// public class string {
//   public static void main(String[] args) {
//     final StringBuffer sb=new StringBuffer("virat"); // final ka impact StringBuffer pe nhi hoga.. final ka impact sb variable pe hoga 
//       sb.append("kholi");
// sb=new StringBuffer("Sachin");  // sb variable cannot be chnaged 
//               System.out.println(sb);
//   }
// }


// -----------------------------------------------------------------------------// -----------------------------------------------------------------------------// -----------------------------------------------------------------------------

// capacity 

// capacity means how many  character you can hold 

// length 
// length means how many character are present 



// public class string {

//     public static void main(String[] args) {
//         StringBuffer sb= new StringBuffer();
//         System.out.println(sb.capacity());
//     }
// }


// public class string {

//     public static void main(String[] args) {


//         StringBuilder sb= new StringBuilder();
//         System.out.println(sb.capacity());

//         sb.append("qwertyuioplkjhgf");
//         System.out.println(sb.capacity());


//         sb.append("q");
//         System.out.println(sb.capacity());


//           StringBuilder sb1= new StringBuilder();
//         System.out.println(sb1.capacity());

//          sb1.append("qwty");
//         System.out.println(sb1.capacity());
//         System.out.println(sb1.length());



//         StringBuilder sb2= new StringBuilder("virat");  // 16+virat;
//         System.out.println(sb2.capacity());




//         StringBuilder sb3= new StringBuilder(150);
//         System.out.println(sb3.capacity());
//         sb3.append("java");
//         System.out.println(sb3);
//         sb3.trimToSize();
//          System.out.println(sb3.capacity());

        
//         StringBuffer sb4= new StringBuffer("pwjava");
//         System.err.println(sb4);
//         System.out.println(sb4.reverse());


//     }
// }