
// 01/february - 01/August - 15/December - 09/January

// public class array_revision {
// public static void main(String[] args) {
// // Creating a normal array with elements 1, 2, 3, 4, 5, 6, 6
// int[] normalArray = {1, 2, 3, 4, 5, 6, 6};

// // Printing the array elements
// System.out.println("Normal Array:");
// for (int element : normalArray) {
// System.out.print(element + " ");
// }
// }
// }

// import java.util.ArrayList;
// import java.util.Arrays;

// public class array_revision {
// public static void main(String[] args) {
// // Creating an ArrayList with elements 1, 2, 3, 4, 5, 6, 6 using
// Arrays.asList
// ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,
// 6, 6));

// // Printing the ArrayList elements
// System.out.println("ArrayList:");

// // for (int element : arrayList) {
// // System.out.print(element + " ");
// // }

// for (int i = 0; i < arrayList.size(); i++) {
// System.out.println(arrayList.get(i));

// }
// }
// }

// import java.util.ArrayList;
// public class array {
// public static void main(String[] args) {
// // Creating an ArrayList with elements 1, 2, 3, 4, 5, 6, 6
// ArrayList<Integer> arrayList = new ArrayList<>();
// arrayList.add(1);
// arrayList.add(2);
// arrayList.add(3);
// arrayList.add(4);
// arrayList.add(5);
// arrayList.add(6);
// arrayList.add(6);

// // Printing the ArrayList elements
// System.out.println("\nArrayList:");
// for (int element : arrayList) {
// System.out.print(element + " ");
// }
// System.out.println();
// for (int i = 0; i < arrayList.size(); i++) {
// System.out.print(arrayList.get(i)+" ");

// }
// }
// }

// -------------------------------------------------------------------------------------

// 1-D ARRAY
// jab values pata hai.

// public class array_revision {
// public static void main(String[] args) {
// int a=8;
// int num[]={ 5,6,7,8}; // Sub Script OPerator

// for(int i=0;i<num.length;i++) //length= 4 but loop 0 sw 3 tak hii jana chaiye
// // for(int i=0;i<=num.length;i++)
// // for(int i=0;i<=num.length-1;i++)

// {
// System.out.println(num[i]);
// }
// }

// }

// public class array_revision {
// public static void main(String[] args) {
// int num[]={5,6,7,8};
// for(int rahul:num){
// System.out.println(rahul);
// }
// }
// }

// 2.
// Secondary method jab values pata

// public class array_revision {
// public static void main(String[] args) {
// int num[]= new int[4];
// num[0]=5;
// num[1]=9;
// num[2]=7;
// num[3]=6;
// for(int i=0;i< num.length;i++){
// System.out.print(num[i] + " " );
// }
// }
// }

// 3.
// Secondary method jab values nhi pata

// public class array_revision {
// public static void main(String[] args) {

// int num[]= new int[10];
// for(int i=0;i<num.length;i++){
// num[i]= i ;
// }
// for (int i = 0; i < num.length; i++) {
// System.out.println(num[i]);
// }
// }
// }

// 4.
// CHAR TYPE Array

// public class array_revision {
// public static void main(String[] args) {
// int a = 8;
// char num[] = { 'a', 'b', 'c', 'd' };

// for (int i = 0; i < num.length; i++) {
// System.out.println(num[i]);
// }
// }

// }

// 5.
// // STRING TYPE
// public class array {
// public static void main(String[] args) {
// int a=8;
// String num[]={ "avinash","balram","sachin"};

// for(int i=0;i<=3;i++){
// System.out.println(num[i]);
// }
// }

// }

// 6.
// float
// public class practice_array {
// public static void main(String[] args) {
// float arr[]={12.3f,12.5f,33.9f};
// for(int i=0;i<arr.length;i++){
// System.out.println( arr[i]);
// }
// }
// }

// ......................................................................................................................................................................................................

// Java program to illustrate the
// concept of length and length()
// length - used to identify the size of int array ,
// length()- use to identify the size of String array .

// public class array {
// public static void main(String[] args)
// {
// // Here array is the array name of int type
// int[] array = new int[4];
// System.out.println("The size of the array is " + array.length);

// // Here str is a string object
// String str = "GeeksforGeeks";
// System.out.println("The size of the String is " + str.length());
// }
// }

// --------------------------------------------------------------------------------
// Multi-Dimensional Array

// --------------------------------------------------------------------------------

// method_overloading in array || annonymous array

// An anonymous array in Java is an array without a name.
// It's created and used immediately, often as an argument to a method. Because
// it lacks a name, it can only be used once.
// An anonymous array in Java is an array that is not explicitly assigned to a
// variable. Instead,
// it is used directly in the context where it's needed, typically as an
// argument to a method. This type of array is "anonymous" because it doesn't
// have a name.

// annonymous array can be single Dimensional and Multi-Dimensional

// public class array_revision {

// public static void main(String[] args) {

// array_revision.sum(new int[]{10,20,30});
// }
// static void sum(int[] no){
// int total =0 ;
// for (int i : no) {
// total=total+i ;
// }
// System.out.println("Sum is:"+ total);
// }
// }

// Without annonymous array

// public class array_revision {

// public static void main(String[] args) {
// int num[]={10,20,30,40,50};
// int total =0;
// for (int i = 0; i < num.length; i++) {
// total = total+num[i];
// }
// System.out.println(total);
// }
// }

// --------------------------------------------------------------------------------//--------------------------------------------------------------------------------//--------------------------------------------------------------------------------

// ......................................................................................................................................................................................................

// THEORY OF ARRAY

// Array is an primitive Data Structure , which doesn't stores the real value,
// it store the refrence or we can day it store memory location where real value
// is stored.
// Array is a data structure which store similar/ homogenous element .
// In Java, arrays are objects. beacuse we craete array with the help of new
// keyword .
// This means that all elements in the array have the same data type and Array a
// starts from index 0.
// The size of an array is fixed and cannot be changed after the array has been
// created.
// In Java, arrays are objects. Arrays can be of reference types, Reference
// types, on the other hand, refer to objects

// 2. What Is the Advantage and Disadvantage of an Array?

// -> The main use of Array is used to store multiple values in a single
// variable, instead of declaring separate variables for each value.
// -> We can sort multiple elements of same data type in Array at the same time.
// > We can access any element randomly by using indexes provided by arrays.

// The disadvantage of an Array
// Size Limit: We can store the only fixed size of elements in the array. It
// doesn't grow its size at runtime.
// Arrays are Strongly Typed: This means that all elements in the array have the
// same data type. We can not store different types of data in an Array

// 3. What are the Types of Array in Java?
// There are two types of array.
// Single Dimensional Array
// Multidimensional Array

// 4. Can You Pass the Negative Number in Array Size?
// No, you can not pass the negative number as Array size.
// If you pass a negative number in Array size then you will not get the
// compiler error.
// Instead, you will get the NegativeArraySizeException at run time.

// 4. can you change the size of an array aat run time ?
// once array is created you cannot directly chnage its size at runtime..

// 5. When ArrayIndexOutOfBoundsException occurs?
// ArrayOutOfBoundsException is thrown when an attempt is made to access the
// Array with an illegal index.
// Access array with negative index to Array leads to throwing
// ArrayOutOfBoundsException
// example -
// public class array_revision {
// public static void main(String[] args) {
// int[] array = { 100, 200, 300, 400, 500 };
// int element = array[5]; // jai hai nahi only 4 index tax present hai
// System.out.println(element);
// }
// }

// 6. Difference of Array and ArrayList
// An Array is static in nature i.e. of fixed length. The size of an array is
// fixed and cannot be changed after the array has been created.
// ArrayList is dynamic in nature. If you add elements to an ArrayList, it will
// automatically increase its size.

// 7. Can You Declare an Array Without Array Size?
// No, you can not declare an Array without an Array size. You will get a
// compile-time error.

// public class array_revision {

// public static void main(String[] args) {
// int arr[]= {24, 214,224,245} ;

// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]);

// };
// }
// }

// here we have not declared the size of array
// You're Absolutely Right!
// You haven't explicitly declared the size of the array arr in your code.

// However, the compiler implicitly determines the size based on the number of
// elements you provide within the curly braces {}. In this case, the array arr
// has a size of 4 elements: 24, 214, 224, and 245.

// This is a convenient way to initialize an array with specific values without
// having to manually specify its size. The compiler does the work for you.

// 8. Where Does Array Store in JAVA?
// As we know that Array is an object in java. So, Array is stored in heap
// memory in JVM .
// Heap Memory: Used for storing objects and arrays, managed by the Garbage
// Collector.

// 9. What is ArrayStoreException? When this exception is thrown?
// ArrayStoreException is a runtime exception. The error occur when we don't
// store element in same data type ;
// example - int new banaya usme "satyam" store kar rahe ho

// This exception is thrown to indicate that an attempt has been made to store
// the wrong type of object in an array of objects.
// In other words, if you want to store the integer Object in an Array of String
// you will get ArrayStoreException.

// 11. What is an Anonymous Array in Java? Give an Example?
// An array without any name (or reference) is called an Anonymous Array.
// They are useful for scenarios where we need one-time usage of Array.

// example
// public class array {

// public static void main(String[] args) {
// array.sum(new int[]{1,2,3,4,5});
// }

// public static void sum(int[] np){
// int total =0;
// for(int i : np){
// total = total + i ;
// }
// System.out.println(total);
// }
// }

// 10. What is the Difference Between ArrayStoreException and
// ArrayOutOfBoundsException?
// ArrayStoreException is thrown if you are trying to add an incompatible data
// type. For example,
// if you try to add an integer object to String Array, then ArrayStoreException
// is thrown.

// ArrayOutOfBoundsException is thrown when an attempt is made to access the
// Array with an illegal index.
// For example, an illegal index means if the index is either negative or
// greater than or equal to the size of the Array.
// tip - we can the index of elemnt not the exact element ;

// 12. Are arrays mutable or immutable in Java? ( object can be changed after it
// has been created.)
// Arrays are mutable. The size of the array is fixed, but the elements can be
// changed.

// In Java, the concepts of mutable and immutable refer to whether or not the
// state (data) of an object can be changed after it has been created.

// Mutable Objects
// Definition: Mutable objects are those whose state or data can be modified
// after they are created.
// ex- StringBuilderand Stringbuffer

// Example: Objects of classes like StringBuilder, ArrayList, and most other
// classes in Java are mutable.

// import java.util.ArrayList;
// public class array_revision {
// public static void main(String[] args) {
// ArrayList<String> list = new ArrayList<>();
// list.add("Hello");
// list.add("World");

// // Modify the ArrayList
// list.set(1, "Java");

// System.out.println(list); // Output: [Hello, Java]
// }
// }

// Immutable Objects
// Definition: Immutable objects are those whose state or data cannot be changed
// once they are created. Any modification to an immutable object results in a
// new object being created.

// Example: The String class in Java is a common example of an immutable object.

// Example with String:

// public class array_revision{
// public static void main(String[] args) {
// String str = "Hello";

// // Modify the String
// str = str.concat(" World");

// System.out.println(str); // Output: Hello World
// }
// }

// ------------------------------------------------------------------------------------------------------------------------------
// Lists like ArrayList and LinkedList, which allow dynamic resizing and ordered
// storage.
// Queues like LinkedList and PriorityQueue, which manage elements in a specific
// order.
// Sets like HashSet and TreeSet, which ensure uniqueness and provide sorting
// capabilities.
// Maps like HashMap and TreeMap, which manage key-value pairs with fast lookups
// and sorted order.
// HashMap - key and value pair , find Duplicate with iternation
// HashTable
// Hashing

// ------------------------------------------------------------------------------------------------------------------------------

// QUESTION ON ARRAY BY LOVE BABBER

// Q.0 sort the array

// use priorityQueue

// or
// ek for loop chalao i=0;
// ek for loop chalao j=i+1 ;
// if(arr[i]>arr[j]){
// swap ;
// use Arrays.toString(arr); // Print the sorted array using Arrays.toString()
// }

// or
// Sort Method
// use arrays.sort(arr)
// // Print the sorted array using Arrays.toString()
// System.out.println(Arrays.toString(arr));

// or
// ek for loop chalao i=0;
// ek for loop chalao j=arr,length-1 ;
// if(arr[i]>arr[j]){
// swap ;
// }

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.1 Array Reverse the array <->
// for loop last se chala do

// or

// int i=0 ; int j=arr.length-1 ;
// while(i<j){
// Swapping karo
// Don't forget i++ and j--

// ---------------------------------------------------------------------------------------------------------------------------
// Q.1.1 Reverse an array of integers from a specific point

// revese ka code likh lo
// while calling reverse on main method use i=K+1;
// -------------------------------------------------------------------------------------------------------
// Q . Sum of array digits .
// for loop chalo then do sum +=arr[i]

// Annonymous Array of sum
// everything will be same just define the in differnet way ,
// classname.methodname(new int[]{10,20,30})

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.2 Array Find the Largest element in an array <->
// phle element ko largest maan lo orr sbase compare karo
// or
// array ko sort kardo and get arr[arr.length-1];
// ------------------------------------------------------------------------------------------------------
// Q.2.1 Array Find the mainimum element in an array <->
// phle element ko minimum maan lo orr sbase compare karo
// or
// array ko sort kardo and get arr[arr[0]];
// ------------------------------------------------------------------------------------------------------
// Q.2.2 Array Find the maximum and Minumun(both) element in an array <->

// Array ko sort karlo then print 1st and last element for maximum and Minumun
// element respectively .
// or
// phle element ko largest maan lo orr sbase compare karo
// phle element ko minimum maan lo orr sbase compare karo
// return new int[] {max, min};
// and to print values store them in new array ans print result[0], result[1] ,
// return karwaya tha n uppar islie you have to print here
// ------------------------------------------------------------------------------------------------------
// Q.2.3 find SECOND largest element in an array
// phle or dusre element ko largest or second largest maan lo dono ko phle khud
// compare karo,
// then compare with everyone

// Q.2.3 find SECOND MInimum element in an array
// phle or dusre element ko MInimum or second MInimum maan lo dono ko phle khud
// compare karo,
// then compare with everyone

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.3 Array Find the "Kth" max and min element of an array <-

// PriorityQueue elements aapne aap aarange karke store kar dia hai . [ peek,
// poll, add ]
// n-k ke tak poll karo then peek the elememnt
// . peek() will return the item at the head of the queue without removing it,
// while . poll() will return the head of the queue and remove it.

// maximum =
// Array ko sort kar do ascending order me
// tmaximum ==return (n-k);
// // or
// PriorityQueue banao usme store karwao array
// retrive the elements till n-k ;
// then peek ;

// Minimum
// Array ko sort kar do ascending order me
// smallest = return(k-1);
// or
// PriorityQueue banao usme store karwao array
// Remove the first (k-1) elements from the queue
// then peek ;

// or
// Array ko sort kar do Descending order me
// smallest = return(n-k);

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4 Array Given an array which consists of only 0, 1 and 2. Sort the array
// without using any sorting algo <->

// 2 for loop chalao and compare aage wale se
// for (int i=0;i<arr.length;i++){
// for (int j =i+1; j < arr.length; j++) {
// if(arr[j]<arr[i]){
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp ;

// ----- or

// ek for chalao if arr[i]==0 count0++; else if arr[i]==1 count1++; else
// count2++ ;
// or sabko aalg aalg loop se print karwao ; for(int i=0;i<count0;i++)
// arr[k++]=0 ; // or ; for(int i=0;i<count0;i++) syso(0+" ");

// ----- or

// sorting algo - Use Merge Sort O(n log n)

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.1 Array is sorted or not TRue or False ?

// boolean x == true;
// loop i=1 se start karo
// conditon arr[i] < arr[i-1]
// x= false ;
// break ;
// else
// x == true;

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.2 Remove Duplicates in sorted array ;

// HashSet doesn't store the duplicates elemnts ;
// for loop chaloa
// hs.add(arr[i]);

// method-1

// j=0,i=1;
// for loop chlao ;
// if(arr[i]!=arr[j]){
// syso(arr[j]);
// j++

// ========================================

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.3 Remove Duplicates in unsorted array

// hashset use hoga
// hashset doesn't store duplicate values
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.4 fing Duplicates in array and print only duplicates element

// use hashmap HashMap<Integer,Integer> hs = new HashMap<>();
// or
// Array ko sort karo
// loop i=0 se start karo
// comapre arr[i] with arr[i+1] if arr[i] != arr[i+1] then add that elemnt in
// the same array
// and if that element is repeated for that 2 time
// while(i<arr.length &&rr[i] == arr[i+1]){
// i++;
// }
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.5 Find Sub Array Of An Array

// index ki help se solution aayega
// i will tell you where to start
// j will tell where to stop
// k will print everything form i to j

// Another Mehrod

// one for loop for number of iteration
// one for loop for print the aaray
// and String result to store subarray

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q. 4.6 Find Span of array {Span= max-min}

// jaise min max nikalte hai wais enikalo last me return max - mix kar dnea

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.7 Count of smaller or equal element in arraay
// Number of elements less than or equal to

// if (arr[i] > x) {
// count++;
// return count ;
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.8 Search the given element in array

// for loop chalo ;
// if(arr[i]==x) elememnt found
// break;
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.9 merege two array with extra Space

// while(i<m && i<n)
// temp[] naam ka new arraay banao ;
// and add elemnts form both the aaray
// if (arr1[i] < arr2[j]) {
// else { temp[k++] = arr2[j++];
// -----------------------------------------------------------------------------------------------------------------------

// Q.4.9.1 merege two sorted array without taking any extra space

// while(i<m && i<n)
// compare both array if arr1 is less than arr2 then i++
// else if arr1 is greater than arr2 then swap arr2[0] with arr[k] k=n-1;
// do k-- and j++
// and then sort both the aaray

// -----------------------------------------------------------------------------------------------------------------------
// Q.4.10 print 1 to n without loop

// Aapka observation sahi hai. Is code mein, elements kisi array ya list mein
// explicitly store nahi ho rahe.
// Java mein jab recursive function call hota hai, toh wo apne function calls ko
// ek call stack mein store karta hai.
// Ye call stack hi woh jagah hai jahan ye values temporarily hold hoti hain.

// Stack Mechanism Ka Kaam
// Jab bhi recursion(n-1) call hota hai, current state of n stack mein push ho
// jati hai aur next function call execute hota hai.

// Jab n 0 ho jata hai, toh function return ho jata hai aur uske baad stack mein
// jo bhi elements hain,
// unhe backtrack karte waqt System.out.println(n + " "); ke through print kiya
// jata hai.

// Example with n = 10
// Aayiye stack ke mechanism ko samjhte hain:

// Starting from recursion(10), n ki values stack mein push hoti hain jab tak n
// 0 nahi ho jata:

// recursion(10) → Stack: [10]
// recursion(9) → Stack: [10, 9]
// recursion(8) → Stack: [10, 9, 8]
// recursion(7) → Stack: [10, 9, 8, 7]
// Aur aise hi stack fill hota rahta hai jab tak recursion(1) aur phir
// recursion(0) tak nahi pahunch jata.
// Backtracking Phase:

// Jaise hi n 0 hota hai, return hote waqt stack ke har element ko pop kiya jata
// hai aur tab System.out.println(n + " "); execute hota hai.
// Popping order mein values print hoti hain:
// 1, 2, 3, ..., 10
// Key Point
// Elements kisi variable ya array mein store nahi hote, balki wo stack mein
// temporarily hold hote hain aur backtracking phase mein output ho jate hain.

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.5 Array Move all the negative elements to one side of the array <->

// Array ko short kar do
// or
// temp[] naam ka array banao usme
// 2 seprate for loop chalo and store all postive then store all negative
// value store karwao if (arr[i]>0) then
// value store karwao if (arr[i]<0)
// or

// i=0;
// j=n-1 ;
// while(i<j){
// if(arr[i]<0){
// i++;
// }
// else if (arr[j]>=0)
// {
// j--;
// }
// else swap both ;

// ------------------------------------------------------------------------------------------------------------------------
// // Q.5.1 Move all the negative elements to one side of the array and sort
// them
// temp[] naam ka array banao usme
// 2 seprate for loop chalo and store all postive in temp array then store all
// negative in temp array
// value store karwao if (arr[i]>0) then temp[j++] = arr[i];
// value store karwao if (arr[i]<0) temp[j++] = arr[i];

// now use priority queue to store to all elemnts from temp to priority queue
// then print from priority queue pq.peek or pq.poll

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.6 Array Find the Union of the two sorted arrays. <->

// jo chota hai usko print karo
// (arr1[i]<arr2[j]) arr[i] print karwao orr i++
// (arr1[i]>arr2[j]) arr[i] print karwao orr j++
// else if (arr1[i]==arr2[j]) // // dono equal hai tooh ek print karo or
// increment dono hoga
// System.out.print(arr2[j++]+ " ");
// i++;
// koi baach jaye uske lie hai ye 2 condition
// while (i<m)
// System.out.println(arr1[i++]+" ")
// while (j<n)
// System.out.println(arr2[j++]+" ");

// --------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.6.1 Find the Intersection of the two arrays.
// if arr[i]==arr[j]
// print arr[i] and i++ and j++;
// else i++;
// else j++;

// use Hashset

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.7 Array Write a program to cyclically rotate an array by one. <->

// last value x me store karwa do
// then loop chalao phir arr[i-1] ki value arr[i] me store karwa do ..
// arr[0]=x; x ki value ko arr[0] store karwa do ..
// --------------------------------------------------------------------------------------------------------------------------------------
// Q.7.1 Write a program to cyclically rotate an array by K time .
// Steps:
// Reverse the entire array.
// Reverse the first k elements.
// Reverse the remaining n- k elements.
// Example:
// For an array arr and k = 3:

// Reverse the entire array.
// Reverse the first 3 elements.
// Reverse the remaining elements.

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.8 Array find Largest sum contiguous Subarray [V. IMP] <->
// without Kadane's algorithm

// ek maxsum banao
// ek sum banao
// 1 loop chalao or
// if sum>maxsum
// store value of sum in maxsum

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.9 Array Minimise the maximum difference between heights [V.IMP] <->

// Maximum or minimum number me kuch jodd ghata ke minimum differnce nikalo
// find smallest and then find Largest
// add k and subtract k between each element
// Steps -
// phle array ko sort karo
// answer = arr[n-1] - arr[0] ;
// phir min arr[0]+ k
// phir max arr[arr.length-1]- K
// then return min-max ka difff nikal do 1st or last se
// ----------------------------------------------------------------------------------------------------------------------------------

// Q>9.1 Find the maximum difference between heights [V.IMP]
// Array ko sort karo
// differnece nikalo arr[n-1] - arr[0] ;
// ----------------------------------------------------------------------------------------------------------------------------------
// Q>9.2 Find the minimum difference between heights [V.IMP]
// Array ko sort karo
// differnece nikalo arr[n-1] - arr[0] ;
// smallest = arr[0]+k;
// largest = arr[n-1]-k;
// for loop
// Math.min(smallest,arr[i+1]-k);
// Math.max(smallest,arr[i]+k);

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.10 Array Minimum no. of Jumps to reach end of an array ? <->

// Minium se yaad rakho u have define MaxReach, halt , jumps ;
// 1 foor loop chalo then and find out the maxReach by adding the index number
// and index value and comapring with previosu one
// check the halt if condition true update the next halt and do the jump++
// if halt>n-1 return total number of jumps

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.11 // find duplicate in an array of N+1 Integers print only duplicate
// element only once .

// use hashMap
// or
// sort the Array
// ek loop chalo i =1 then conpare if arr[i] ==arr[i+1];
// then print the arr[i];
// to skip all remaning common elemnts while(i<arr.lenght && arr[i]==arr[i+1]
// i++);

// --------------------------------------------------------------------------------------------------------------------------------------
// Q.11.1 Remove the duplicate in an array of N+1 Integers
// use hashset
// or
// sort the array
// loop i=0 se start karo
// comapre arr[i] with arr[i+1] if arr[i] != arr[i+1] then print arr[i]
// and upadate j=i ; and print last elememnt seprately arr[j]

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.12 Array Merge 2 sorted arrays without using Extra space. <->

// compare both array and
// if (arr1[i] < arr2[j]) then continue;
// and if arr[i]>arr2[j] then swap

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.13 Array Kadane's Algo [V.V.V.V.V IMP]

// ek sum banao
// ek maxsum banao
// jab tab posituve ya 0 hu mai , mai help karunga tumhari
// mai khud negative me hu , islie sath dandha nhi karumga , khud start karunga
// new dandha

// or

// using sliding Window
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.14 Array Merge Intervals <->
// Sort the array on the basis of first element
// int Start = [0][0] , // int end = [0][1]
// create List
// start the for loop then
// define another start and end
// compare them

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.15 Array Next Permutation
// Q. 4,1,7,5,3,2,0

// 4,2,7,5,3,1,0
// 4,2,0,1,3,5,7

// find all the combination of give set of array and retunr the just next
// combination

// arr[i]=n-2;
// arr[j]=n-1;
// for loop chalo compare arr[i] with arr[i+1]
// if arr[i]>arr[i+1] then i-- (move towards left)
// ek time aayagea jab condition fail hoga orr i waha pe stop hoga
// for loop chalo compare arr[j] with arr[i]
// if arr[j]<arr[i] then j-- (move towards left)
// ek time aayagea jab condition fail hoga orr waha pe i or j swap honge
// then reverse the array from i+1 to end

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.15.1 Find Ceil & Floor Of An Number In A Sorted Array ..
// BINARY SEARCH FOR CEIL ;
// BINARY SEARCH FOR FLOOR ;

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.16 <-> Array Count Inversion <->

// ek ko fixed karo dusre se pura traverse karo - 2 for loop chalao and campare
// arr[i]>arr[j] count++;
// or
// merge sort
// divide the array same as merge sort and lastly while merging count the steps
// which is smaller than other

// steps - ,
// -> Split the given input array into two halves, left and right similar to
// merge sort recursively.
// -> Count the number of inversions in the left half and right half along with
// the inversions found during the merging of the two halves.
// -> Stop the recursion, only when 1 element is left in both halves.
// -> To count the number of inversions, we will use a two pointers approach.
// Let us consider two pointers i and j, one pointing to the left half and the
// other pointing towards the right half.
// -> While iterating through both the halves, if the current element A[i] is
// less than A[j], add it to the sorted list, else increment the count by mid -
// i.

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.17 Array Best time to buy and Sell stock <->

// arr[o]= buy hoga ;
// now check
// if next price is less buy the stock ;
// if next price is high sell the stock ;
// Compare the maxprice and price

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.17.1 Array Best time to buy and Sell stock II <->

// arr[o]= buy hoga ;
// now check
// if next price is less buy the stock ;
// if next price is high sell the stock ;
// add the profit
// chnage the buying price ;
// repeat the process

// else if(buy<prices[i]){ // selling the stock
// profit += prices[i]-buy ;
// buy = prices[i] ;
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q. 17.2 Best Time to Buy and Sell Stock III ; - you can buy ans sell stock at
// most 2 times
// Consider prices = [3,3,5,0,0,3,1,4]:

// The first pass (left-to-right) calculates the best time to buy the stock .
// The second pass (right-to-left) calculates the best time to sell the stock.
// By combining these results, the code finds the maximum possible profit across
// two transactions.

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.18 Array find all pairs on integer array whose sum is equal to given number
// <->

// ek for loop chalo then add all the elememnts in Hashmap - map.put(arr[i],
// map.getOrDefault(arr[i], 0) + 1);
// x+y = target ;
// x =target-y ;
// Check if x is present in the map
// if yes count++;

// or
// Make Array Sorted
// if(arr[i]+arr[k]==target){
// count++ ;
// start++;
// end--;
// else if(arr[i]+arr[k]>target){
// end--}
// else{
// start++;
// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.19 Array find common elements In 3 sorted arrays <->

// while (i < arr1.length && j < arr2.length && k < arr3.length) {
// if(arr1[i] == arr2[j] && arr2[j]==arr3[k]){
// syso(arr2[j]);
// i++;
// j++;
// k++;
// }
// else if(arr1[i]<arr2[j]){
// i++ ;

// }
// else if(arr2[j]<arr3[k]){
// j++;
// }
// else{
// k++ ;
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.20 Array Rearrange the array in alternating positive and negative items
// with O(1) extra space <->

// array ko sort karo all negative elememnts ek side and all positive elements
// ek side
// now swap positive negative and find get the alternative digits
// swap(arr, i, j);
// i=i+1;
// j=j+2;

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.21 Array Find if there is any subarray with sum equal to 0

// 2 loop chalo or ek sum me store karwate jao and lastly check karo elemnt 0 ke
// equal hai ya nhi
// , every time you have make the sum value =0;
// or
// use hashmap
// for loop chalo sum add karwao
// and see sum == 0; hs.containkey(sum) return true ;
// hs.put(sum,i) ; // Update the hashmap with the current sum and its index

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// <Q.22 Array Find factorial of a large number <->

// loop chalao or multiply karte jao

// Another method
// return as an arrayList

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.23 Array find maximum product subarray <->
// Kadane's algorithm
// jab tak mai positive hu ya 0 hu help karunga
// negative ho tum mai aapn akaam khud start karunga
// if (product>maxproduct){ maxproduct = product ;

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.24 Array Find longest coinsecutive subsequence <->
// sort the array
// if(arr[i]==arr[i-1]+1){
// count ++;

// Another mehtod
// USe Hashset or PriorityQueue

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.25 Array Given an array of size n and a number k, fin all elements that
// appear more than " n/k " times. <->

// sort the array
// and comapre with the previous one

// or

// ek hashmap banao usme elememnts add karo
// map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // For each element, it
// either adds the element to the map (if it's not already present) with an
// initial count of 1 or increments its existing count by 1.
// Iterate through the keys of the map.
// Check if the frequency of the element is greater than n/k.
// ------------------------------------------------------------------------------------------------
// Q.25.1 Frequency of each element in an array using hashMap
// ek hashmap banao usme elememnts add karo
// map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
// ek for loop se print karwa do used hs.keySet()

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.26 Array Maximum profit by buying and selling a share atmost twice <->
// already done at question number 17.2
// ek barr left loop
// ek baar right loop
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.27 Array Find whether an array is a subset of another array <->

// ek hashset banao usme for loop se saare elements add karo
// ek or for loop chalo or check karo saare elements of aar2[i] present hai
// hashset me ya nhi

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.28 Array Find the triplet that sum to a given value <->

// for (int i = 0; i < arr.length -2; i++)
// for (int j = i + 1; j < arr.length-1 ; j++)
// for (int k = j + 1; k < arr.length; k++)
// if (arr[i] + arr[j] + arr[k] == x)

// Another Mehtod
// sort the array
// ek for chalo
// 2 pointer lo left =i+1 and right = n-1; loop n-2 tak hii chalega
// while(left<right) toop teeno ko jodd do like int currentsum =
// arr[i]+arr[left]+arr[right
// while(currentSum<sum)
// left++; Move left pointer to the right to increase the sum
// right--; Move right pointer to the left to decrease the sum]
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.29 Array Trapping Rain water problem <->

// Water tabhi trap hoga jab uske left or right me usse badi building ho ;
// to find this create one left arr[] and one right arr[]
// first element ke left me hai nhi kuch islie left[i]=left[0];
// Start the loop and fill the left array by comparing with previos one ,
// left[i]= Math.max(left[i-1],left[i])
// similary fill the right one loop start from n-2 comparing with next one ,
// right[i] = Math.max(right[i + 1], arr[i])
// last element ke right me hai nhi kuch islie right[i]=right[n-1];
// formula = ans = Math.max(left[i],right[i] - arr[i]) // left ko pakdo , right
// ko pakdo dono me jo chota hai usee minus kardo building ke height se (arr[i])
// se

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.30 Array Chocolate Distribution problem <->

// difference 1st and 5th student ke beech me niakalna hota hai , among total
// number of studnet
// first sort the array
// ek for loop chalo find minimum and maximum bwtween 1st and 5th kid everytime
// is should be change
// int ans = Math.min(ans,diff);

// or

// array ko sort kar do
// for(i=0;i<n-m+1;i++)
// int minElement = arr[i]
// int maxElement = arr[i+m-1];
// ans = Math.min(ans, maxElement - minElement);

// minimum diff will be the answer
// //
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.31 Array Smallest Subarray with sum greater than a given value. <->
// Example: Given an ‘ARR’: [1, 2, 21, 7, 6, 12] and a number ‘X’: 23. The
// length of the smallest subarray is 2 as the subarray is [21, 7].

// Subaaray = Sliding Window
// loop chalo and store the value in window,
// check and the first value then check if it > == x then save the length and
// remove the first element and agian compare it .

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.32 Array Three way partitioning of an array around a given value. <->

// ek left pointer lo,
// ek right pointer lo ,
// int left = 0; // Pointer to the left side for elements < a
// int right = n - 1; // Pointer to the right side for elements > b

// ek loop chalao aagr koi element a se chota hai usse left side se swap kar do
// ; if arr[i]<a then swap with left and incremnt left++;
// else if koi element b se bada hai usse right side se swap kar do ; if
// arr[i]>b then swap with right and decremment right--
// lastly i++ for between elements

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.33 Array Minimum swaps required bring elements less equal K together. <->

// Sliding Window Technique Used hoga .

// Start the loop and find good values in whole array ; Number of good values
// will be the window size
// start the first loop till i<count find bad value in size of first window size
// ;
// again start the another loop from i =count till i<n and find bad value in
// size of seconf window size
// window size same rahega left-- karo or rigth++ karo mtlb aage badhao window

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.34 Array Minimum no. of operations required to make an array palindrome.
// <->
// remember - A single number is always a palindrome
// ex- 1234321 this is a palindrome

// how to make palindrome - 1,4,5,9,1 - no of operation to make it palindrome is
// - 1 ,
// Q.How

// left =0;
// right=n-1;
// if left==right move both
// jiss side chota hai usse aage wale se add karo // if left<right add and
// operations++; 4+5 kar do ;
// if(arr[i]<arr[j]){ arr[i+1] = arr[i+1] +arr[i] ; i++ humesha aage jao orr
// pecche wale me aad kar, 5 me 4 add hoga

// // jiss side chota hai usse aage wale se add karo left>right add and
// operations++;
// arr[j-1] = arr[j-1] + arr[j] ; j--
// return operations

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.35 Array Median of 2 sorted arrays of Given size. <->
// Q.35 Find the median of all subarrays of a particular size k ;

// ek subarray banao jisme sarre medians store karwaoge having size n-k+1 ;
// double[] medians = new double[n-k+1]; // Array to store medians of each
// subarray
// ek for loop chalo kitne baar chalega uske lie (n-k+1) ; // for (int i = 0; i
// < medians.length; i++) {// Iterate through each subarray of size k
// ek temperorray subarray banao jisme current elemnts subarray store hoga ;
// int[] subArray = new int[k]; // Temporary array to store current subarray
// ek orr for loop chalo jo chalega i+k times ; // for (int j = i; j < i + k;
// j++) {
// and Copy elements from the main array to the subarray ; //
// subArray[subIndex++] = arr[j];

// sort the subarray
// condition check if (k % 2 == 0) {
// fins median
// unn median ko everytime store in the subarray jo uppar banaye the and
// increase the index everytime ;
// at last print subarray

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.36 Array Median of 2 sorted arrays of different size.
// median for odd = arr[(n/2)]
// median for even= (arr[(n/2)] + arr[(n/2) - 1]) / 2.0

// make a temp array and store all the elememnts of arr1[] and arr2[] by
// comparing each other
// copy the reamining elemnet of both array in temp array
// double median;
// int totalLength = m + n;
// if (totalLength % 2 == 0) {
// median = (temp[totalLength / 2 - 1] + temp[totalLength / 2]) / 2.0;
// } else {
// median = temp[totalLength / 2];
// }
// System.out.println("Median: " + median);
// }
