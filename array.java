// 01/february

// 1-D ARRAY 
// jab values pata hai.

 public class array {
     public static void main(String[] args) {
         int a=8;
         int num[]={ 5,6,7,8};

         for(int i=0;i<num.length;i++)        //length= 4 but loop 0 sw 3 tak hii jana chaiye
       //   for(int i=0;i<=num.length;i++)
       //   for(int i=0;i<num.length-1;i++)
       //   for(int i=0;i<=num.length-1;i++)
        
        
         {
             System.out.println(num[i]);
         }
     }
    
 }

// public class array {
//     public static void main(String[] args) {
//         int num[]={5,6,7,8,};
//         for(int x:num){
//             System.out.println(x);
//         }
//     } 
// }


// 2.
// Secondary method jab values  pata 

// public class array {

//     public static void main(String[] args) {
//         int num[]= new int[4];
//         num[0]=5;
//          num[1]=9;
//           num[2]=7;
//            num[3]=6;
//                    for(int i=0;i< num.length;i++){
//             System.out.print(num[i] + " " );
//         }
//     }
// }

// 3.
// Secondary method jab values nhi pata 

// public class array {

//     public static void main(String[] args) {
        
//         int num[]= new int[10];
//         for(int i=0;i<num.length;i++){
//             num[i]= i + 10;
//         }
//          for (int i = 0; i < num.length; i++) {
//      System.out.println(num[i]);
//     }
//     }
// }
 
// 4.

// CHAR TYPE 
// public class array {
//     public static void main(String[] args) {
//         int a=8;
//         char num[]={ 'a','b','c','d'};

//         for(int i=0;i<num.length;i++){
//             System.out.println(num[i]);
//         }
//     }
    
// }

// 5.
// // STRING TYPE 
// public class array {
//     public static void main(String[] args) {
//         int a=8;
//         String num[]={ "avinash","balram","sachin"};

//         for(int i=0;i<=3;i++){
//             System.out.println(num[i]);
//         }
//     }
    
// }

// 6.
// float
// public class practice_array {

//     public static void main(String[] args) {
//         float arr[]={12.3f,12.5f,33.9f};
//         for(int i=0;i<arr.length;i++){
//             System.out.println( arr[i]);
//         }
//     }
// }

// ......................................................................................................................................................................................................


// 02/february

// Java program to illustrate the
// concept of length and length()

// public class array {
//     public static void main(String[] args)
//     {
//         // Here array is the array name of int type
//         int[] array = new int[4];
//         System.out.println("The size of the array is " + array.length);
 
//         // Here str is a string object
//         String str = "GeeksforGeeks";
//         System.out.println("The size of the String is " + str.length());
//     }
// }
//--------------------------------------------------------------------------------

// method_overloading in array || annonymous array 






//--------------------------------------------------------------------------------//--------------------------------------------------------------------------------//--------------------------------------------------------------------------------

// Q.1
// can we have multiple maIn() method in java class ?
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


// ......................................................................................................................................................................................................

//  THEORY OF ARRAY 

// Array is a data structure which store similar/ homogenous element 
// This means that all elements in the array have the same data type and Array a starts from index 0.
// The size of an array is fixed and cannot be changed after the array has been created.
// In Java, arrays are objects. Arrays can be of primitive data types or reference types



// 2. What Is the Advantage and Disadvantage of an Array?

// -> The main use of Array is used to store multiple values in a single variable, instead of declaring separate variables for each value.
// -> We can sort multiple elements of Array at the same time.
// > We can access any element randomly by using indexes provided by arrays.


// The disadvantage of an Array
// Size Limit: We can store the only fixed size of elements in the array. It doesn't grow its size at runtime.
// Arrays are Strongly Typed: This means that all elements in the array have the same data type. We can not store different types of data in an Array

// 3. What are the Types of Array in Java?
// There are two types of array.
// Single Dimensional Array
// Multidimensional Arra

// 4. Can You Pass the Negative Number in Array Size?
// No, you can not pass the negative number as Array size. 
// If you pass a negative number in Array size then you will not get the compiler error. 
// Instead, you will get the NegativeArraySizeException at run time.

// 4. can you change the size of an array aat run time ?
// once array is created you cannot directly chnage its size at runtime..

// 5. When ArrayIndexOutOfBoundsException occurs?
// ArrayOutOfBoundsException is thrown when an attempt is made to access the Array with an illegal index.
// Access array with negative index to Array leads to throwing ArrayOutOfBoundsException
// example -
// public class Main {
//     public static void main(String[] args) {
//         int[] array = { 100, 200, 300, 400, 500 };

//         int element = array[5]; // jai hai nahi only 4 index tax present hai 

//         System.out.println(element);
//     }
// }

// 6. Difference of Array and ArrayList
//  An Array is static in nature i.e. of fixed length. The size of an array is fixed and cannot be changed after the array has been created.
//  ArrayList is dynamic in nature. If you add elements to an ArrayList, it will automatically increase its size.


//  7. Can You Declare an Array Without Array Size?
//  No, you can not declare an Array without an Array size. You will get a compile-time error.


//  8. Where Does Array Store in JVM Memory?
// As we know that Array is an object in java. So, Array is stored in heap memory in JVM

// 9. What is ArrayStoreException? When this exception is thrown?
// ArrayStoreException is a runtime exception. The error occur when we don't store element in same data type ;
// example - int new banaya usme "satyam" store kar rahe ho 

// This exception is thrown to indicate that an attempt has been made to store the wrong type of object in an array of objects.
//  In other words, if you want to store the integer Object in an Array of String you will get ArrayStoreException.

//  11. What is an Anonymous Array in Java? Give an Example?
//  An array without any name (or reference) is called an Anonymous Array. They are useful for scenarios where we need one-time usage of Array.

// example - 
// public class Main {
//     public static void main(String[] args)
//     {
//         // anonymous array
//         sum(new int[]{ 1, 2, 3 });
//     }
//     public static void sum(int[] a)
//     {
//         int total = 0;

//         // using for-each loop
//         for (int i : a)
//             total = total + i;

//         System.out.println("The sum is:" + total);
//     }
// }


//  10. What is the Difference Between ArrayStoreException and ArrayOutOfBoundsException?
//  ArrayStoreException is thrown if you are trying to add an incompatible data type. For example,
//   if you try to add an integer object to String Array, then ArrayStoreException is thrown.
 
//  ArrayOutOfBoundsException is thrown when an attempt is made to access the Array with an illegal index. 
//  For example, an illegal index means if the index is either negative or greater than or equal to the size of the Array.

//  12. Are arrays mutable or immutable in Java?
//  Arrays are mutable. The size of the array is fixed, but the elements can be changed.







// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------

// QUESTION ON ARRAY BY LOVE BABBER 


// Q.0 sort the array 
// ek for loop chalao i=0;
// ek for loop chalao j=i+1 ;
// if(arr[i]>arr[j]){
//    swap ;
// }
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// Q.1Array Reverse the array <-> 
// for loop last se chala do 
// or
// while consition then use swapping 

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.2 Array Find the maximum and minimum element in an array <-> 
// phle element ko largest maan lo orr sbase compare karo 

// Q.2.1 find  SECOND largest element in an array 
// phle or dusre element ko largest or second largest maan lo phir  i=2 se loop start and compare 

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.3 Array Find the "Kth" max and min element of an array <-
// maximum = 
//  Array ko sort kar do  ascending order me 
//  tmaximum ==return (n-k);


//Minimum
// Array ko sort kar do  ascending order me 
// smallest = return(k-1);

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// Q.4 Array Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo <-> 
// phle element ko i 
// or dusre ko j maan lo  
// or 2 loop chalao or compare karo ek dusre se if(arr[i]>arr[j]) then swap ;
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// Q.4.1  Array is sorted or not TRue or False ?
// loop i=1 se start karo 
// condiiton arr[i]>arr[i-1] false ;
// else true 

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// Q.4.2   Remove Duplicates in sorted  array ;

// method-1 = temp[ ] naam ka ek new variable banaega 
// temp[] naam ka variable banao arr size ka ;
// for loop chlao ;
// if(arr[i]!=arr[i+1]){
//    temp[j]=arr[i]
//    j++ ;
// }
// temp[j]=arr[arr.length-1]

// ========================================
// method-2 = temp[ ] naam ka ek new variable nhi  banaega ussi  me store hoga 
// for loop chlao ;
// if(arr[i]!=arr[i+1]){
//    arr[j]=arr[i]
//    j++ ;
// }
// arr[j]=arr[arr.length-1]
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.3   Remove Duplicates in unsorted  array 
// hashset use hoga 
// hashset doesn't store  duplicate values 
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.4   fing Duplicates in  array and print only duplicates element

// loop chalao aage waale element se compare karo 
// if(arr[i]== arr[i+1]){
//    arr[j] = arr[i]  ;  or temp[j] = arr[i]
// }
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.5 Find Sub Array Of An Array 

// index ki help se solution aayega 
// i will tell you where to start 
// j will tell where to stop 
// k will print everything form i to j 

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Q. 4.6  Find Span of array {Span= max-min}

// jaise min max nikalte hai wais enikalo last me return max - mix kar dnea 

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.7   Count of smaller or equal element in arraay

// nhi samjh aaya 
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.8  Search the given element in array 

// for loop chalo ;
// if(arr[i]==x) elememnt found 
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.9  merege two array 

// temp[] naam ka new arraay banao ;
// temp[i]=arr1[i];
// temp[arr1.length + i]= arr[i]

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.10 Sort the given array
// Sort the given array
//  int i=0;
//  int j=i+1;
// Swapping use karo 

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//  Q.5  Array Move all the negative elements to one side of the array <-> 

// Array ko short kar do 
// or
// temp[] naam ka array banao usme 
// value story karwao if (arr[i]>0)
// value story karwao if (arr[i]<0)
// or 
// i=0;
// j=n-1 ;
// if(left <= right && arr[left] >= 0)
// left++ ;
// if(left <= right && arr[left] < 0)
// right-- ;
// then swap both ;




// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// Q.6  Array Find the Union and Intersection of the two sorted arrays. <-> 


// jo chota hai usko print karo 
// (arr1[i]<arr2[j]) arr[1] print karwao orr i++
// (arr1[i]>arr2[j]) arr[2] print karwao orr j++
// else if (arr1[i]==arr2[j])
//     System.out.print(arr2[j++]+ " ");
//     i++;
// koi baach jaye uske lie hai ye 2 condition 
// while (i<m) 
// System.out.println(arr1[i++]+" ")
// while (j<n) 
// System.out.println(arr2[j++]+" ");

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.7  Array Write a program to cyclically rotate an array by one. <->

// last value x me store karwa do 
// then loop chalao phir arr[i-1] ki value arr[i] me store karwa do ..
// arr[0]=x; x ki value ko arr[0] store karwa do ..

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



// Q.8  Array find Largest sum contiguous Subarray [V. IMP] <-> 
// without Kadane's algorithm 

// ek maxsum banao 
// ek sum banao 
// 2 loop chalao or 
// if maxsum< sum
// store value of sum in maxsum 

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



// Q.9 Array Minimise the maximum difference between heights [V.IMP] <-> 

// phle array ko sort kaor 
// phir max-min ka difff nikal do 1st or last se  

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//  Q.10 Array Minimum no. of Jumps to reach end of an array <-> 


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.11    Array find duplicate in an array of N+1 Integers <->
//  loop i=0 se start karo 
// comapre arr[i] with arr[i+1]

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.12  Array Merge 2 sorted arrays without using Extra space. <->  

// for loop chalo compare arr1[i] with arr2[0] then swap if  arr1[i] > arr2[0]
//  then sort arr2 Sorting with swapping arr[j] ko ar[j+1] se 

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.13  Array Kadane's Algo [V.V.V.V.V IMP] 

// ek sum banao
// ek maxsum banao
// ek for loop chalao
   // join 
//             if(sum>=0){
//                 sum += arr[i];
//             }

//             // tum sarre loss me ho( -ve) mai apna dandha khud start karunga 

//             else if(sum<0){
//                 sum= arr[i];
//             }

// if (sum>maxsum){
//     //                 maxsum = sum ;
//     //             }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//   Q.14  Array Merge Intervals <->

// Stack is used here

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.15 Array Next Permutation

// jo given number hai uska all Permutation nikalo then 
// Permutation me hii Search karo Given number k0,
// just next after number after the given number will be your 
// lexicographhically next greater Permutation hoga ..


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Find Ceil & Floor Of An Number In A Sorted Array ..
// BINARY SEARCH FOR CEIL ;
// BINARY SEARCH FOR FLOOR ;

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.16 <-> Array Count Inversion <-> 

// 2 FOR LOOP chalao
// IFarr[i]>arr[i+1];
// id++;



// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//   Q.17 Array Best time to buy and Sell stock <-> 

// arr[o]= buy hoga ;
// now check 
// if next price is high sell the stock ;
// if next price is less buy the stock ;

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.18  Array find all pairs on integer array whose sum is equal to given number <->

// 2 for loop chalo 
// if(arr[i]+ arr[j]== sum){
//    count++ ;
// }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//   Q.19  Array find common elements In 3 sorted arrays <->

// if(arr1[i] == arr2[j] && arr2[j]==arr3[k]){
//    syso(arr2[j]);
//    i++;
//    j++;
//    k++;
// }
// else if(arr1[i]<arr2[j]){
//    i++ ;

// }
// else if(arr2[j]<arr3[k]){
//    j++;
// }
// else{
//    k++ ;
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//     Q.20  Array Rearrange the array in alternating positive and negative items with O(1) extra space <-> 

// int  i=0;
// int j=arr.length-1;
// // ye ho gaya shifting ka code
// while(i<=j){
//    whhile(i<=j && arr[i]>0){
//       i++;
//    }
//    whhile(i<=j && arr[j]<0){
//       j--;
//    }
   
//    now swap both i and j ;
//    if(i<=j){
//       swap(arr,i,j);
//       i++;
//       j--;
//    }
// // ye ho gaya alternating ka code ;
// while(k<n &&  i<n){
//    swap(arr,k,i);
//    k=k+2;
//    i=i+1;
// }
   
// }







// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//   Q.21   Array Find if there is any subarray with sum equal to 0    
// 2 for loop chalo and check arr[i]+ arr[j]==0;
// or 
// use hashmap 
// and see hs.contain(0);

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// <Q.22 Array Find factorial of a large number <-> 
// BigInteger result = BigInteger.ONE;



// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//   Q.23  Array find maximum product subarray <-> 
// Kadane's algorithm 


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.24 Array Find longest coinsecutive subsequence <-> 
//             if(arr[i]==arr[i-1]+1){
//                 count ++;








// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//     Q.25   Array Given an array of size n and a number k, fin all elements that appear more than " n/k " times. <-> 

// int n = arr.length;
// int x = n / k;
// sort the array 
// if(arr[i]==arr[i+1]){
//    count++ ;
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.26    Array Maximum profit by buying and selling a share atmost twice <->
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.27  Array Find whether an array is a subset of another array <-> 

// 2 for loop chalao
// compare arr[i]==arr[j]{
//    true
// }
// else 
// false ;
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    Q.28 Array Find the triplet that sum to a given value <->
// for (int i = 0; i < arr.length -2; i++) 
//    for (int j = i + 1; j < arr.length-1 ; j++) 
//        for (int k = j + 1; k < arr.length; k++) 
//            if (arr[i] + arr[j] + arr[k] == x) 
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.29 Array Trapping Rain water problem <-> 

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//    Q.30 Array Chocolate Distribution problem <-> 
// array ko sort kar do 
// i=0;
// j=i+m-1;
// diff= a[i] - a[i+m-1] ;
// i++ ;

// or 

// for (int i = 0; i + m - 1 < n; i++) {
//    int diff = arr[i + m - 1] - arr[i];
//    if (diff < min)
//        min = diff;
// }


// minimum diff will be the answer 
// // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.31 Array Smallest Subarray with sum greater than a given value. <-> 

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//    Q.32  Array Three way partitioning of an array around a given value <-> 
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.33 Array Minimum swaps required bring elements less equal K together <->
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//     Q.34  Array Minimum no. of operations required to make an array palindrome <-> 
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.35      Array Median of 2 sorted arrays of equal size <-> 

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//       Q.36  Array Median of 2 sorted arrays of different size

// ------------------------------------------------------------------------------------------------------------------------------