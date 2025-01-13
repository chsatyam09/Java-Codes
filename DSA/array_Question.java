
// Q.0 Sorting of an arraY

// import java.util.Arrays;

// public class array_Question {
// static void consecutive(int arr[]){

// Arrays.sort(arr);

// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// int arr[]={8,2,6,9,4,5,3};
// consecutive(arr);

// }
// }

// --------------- ---------- ----- Another Method----------O(n log n)
//

// import java.util.PriorityQueue;
// public class array_Question {

// public static void sort(int arr[]){
// PriorityQueue<Integer> pq = new PriorityQueue<>();
// for (int i = 0; i < arr.length; i++) {
// pq.add(arr[i]);
// }

// for (int i = 0; i < arr.length; i++) {
// System.out.println(pq.poll());

// }

// }

// public static void main(String[] args) {
// int arr[]={12,12,13,14,14,14,15,22,16,19};
// sort(arr);
// }
// }

// --------------- ---------- ----- Another Method----------O(n log n)
// ----------

// import java.util.HashSet;
// import java.util.PriorityQueue;

// public class array_Question {

// public static void main(String[] args) {
// int arr[] = { 12, 12, 13, 14, 14, 14, 15, 16, 19, 9, 9 };
// PriorityQueue<Integer> pq = new PriorityQueue<>();
// for (int i = 0; i < arr.length; i++) {
// pq.add(arr[i]);
// }

// while (!pq.isEmpty()) {
// System.out.println(pq.poll());
// }

// }
// }

// --------------- ---------- ----- Another Method----------O(n log n)
// ----------

// import java.util.Arrays;
// public class array_Question {

// public static void main(String[] args) {
// int arr[] = {8, 2, 6, 9, 4, 5, 3};

// Arrays.sort(arr);

// // Print the sorted array using Arrays.toString()
// System.out.println(Arrays.toString(arr));
// // Arrays.toString(arr): This method is part of the java.util.Arrays class.
// // It takes an array as an argument and returns a string representation of
// the array.
// }
// }

// ----------------- Another method ---------- O(n^2)---------- ----------

// public class array_Question {
// public static void main(String[] args) {
// int arr[]={8,2,6,9,4,5,3};
// for (int i = 0; i < arr.length; i++) {
// for (int j = i+1; j < arr.length; j++) {
// if(arr[i] > arr[j]){
// int temp = arr[i] ;
// arr[i] = arr[j];
// arr[j]= temp ;

// }

// }

// System.out.print(arr[i]+ " ");
// }
// }
// }

// ---------- ---------- Another Method

// import java.util.Arrays;
// public class array_Question {
// public static void Sort(int arr[]){

// //logic
// int temp =0 ;
// for (int i = 0; i < arr.length; i++) {
// for (int j = arr.length-1;j>i; j--) {
// if(arr[i]>arr[j]){
// temp = arr[i];
// arr[i]=arr[j];
// arr[j]=temp ;
// }
// }
// }
// // printing
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i]+" ");
// }
// }
// public static void main(String[] args) {
// int arr[]={12,23,2,4,124,21,76,43};
// Sort(arr);
// }
// }
// ----------------------------------------------------------------------------

// Q.1 Reverse an array of integers

// public class array_Question {
// public static void main(String[] args) {
// int arr[]={12,33,34,55,66};
// for(int i=arr.length-1; i>=0;i--){
// System.out.println(arr[i]);
// }
// }
// }
// ------------another method for reversing a Array ------------------

// public class array_Question {
// public static void main(String[] args) {
// int arr[]={12,33,34,55,66};

// for(int i=0; i<=0;i++){
// int j= arr.length-1;
// if(i<j){
// int temp = arr[i];
// arr[i]=arr[j];
// arr[j]=temp ;
// i++;
// j-- ;
// }
// for( i=0;i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }
// }

// }
// }

// ------------another method for reversing a Array ------------------

// public class array_Question {
// public static void main(String[] args) {
// int arr[]={12,93,34,55,66};
// int i=0 ; int j=arr.length-1 ;
// while(i<j){
// // Swapping is used only
// int temp = arr[i];
// arr[i]=arr[j];
// arr[j]=temp ;
// i++;
// j-- ;
// }
// for( i=0;i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }

// }
// }

// ------------another method for reversing a Array ------------------

// public class array_Question {
// static void Reverse(int arr[]){
// int i=0 ;
// int j=arr.length-1 ;
// while(i<j){

// int temp =arr[i];
// arr[i]=arr[j];
// arr[j]=temp ;
// i++;
// j-- ;

// for( i=0;i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }
// }
// }

// public static void main(String[] args) {
// int arr[]={12,23,34,55,66};
// for(int i=0; i < arr.length;i++){
// System.out.print(arr[i]+ " ");
// }

// System.out.println("Arrays After Sorting");
// Reverse(arr);

// }
// }
// ---------------------------------------------------------------------------------------------------------------------------
// Q.1.1 Reverse an array of integers from a specific point

// public class array_Question {

// static void Reverse(int arr[],int k){
// int i=k+1 ;
// int j=arr.length-1 ;
// while(i<j){
// int t =arr[i];
// arr[i]=arr[j];
// arr[j]=t ;
// i++;
// j-- ;

// }
// for( i=0;i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }
// }

// public static void main(String[] args) {
// int arr[]={1 ,2 ,3, 4 ,5 ,6,7,8,9}; // 1 2 3 4 9 8 7 6 5
// int k = 3;
// System.out.println("Arrays After SOrting ");

// Reverse(arr,k);
// }
// }

// -------------------------- Another Method

// import java.util.* ;
// import java.io.*;

// public class array_Question
// {
// public static void reverseArray(ArrayList<Integer> arr, int m)
// {
// int start = m + 1;
// int end = arr.size() - 1;

// while (start < end) {
// // Swap elements
// int temp = arr.get(start);
// arr.set(start, arr.get(end));
// arr.set(end, temp);

// // Move towards the middle
// start++;
// end--;
// }
// }

// public static void main(String[] args) {
// // Example usage
// ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
// int m = 3;

// System.out.println("Original array: " + arr);

// reverseArray(arr, m);

// System.out.println("Modified array: " + arr);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------------
// Q . Sum of array digits

// Normal Method

// public class array_Question {

// public static void main(String[] args) {
// int arr[] = {10,20,30};
// int sum =0;
// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];

// }
// System.out.println(sum);
// }
// }

// Annonymous array

// public class array_Question {

// static void sum(int[] no){
// int total =0 ;
// for (int i : no) {
// total=total+i ;
// }
// System.out.println("Sum is:"+ total);
// }
// public static void main(String[] args) {

// array_Question.sum(new int[]{10,20,30});
// }

// }

// ---------------------------------------------------------------------------------------------------------------------------
// Q.2 find LARGEST element in an array

// class array_Question{
// public static void main(String[] args) {
// int arr[]={12,14,88,16,18,20};
// int max=arr[0];

// for (int i = 1; i < 5; i++) {
// if(arr[i]>max){
// max=arr[i];
// }
// else{
// i++;
// }

// }
// System.out.println(max);
// }
// }

// ------------ Another mehtod LARGEST element in an array --------------

// public class array_Question {
// static int largest(int arr[]){

// int max=0 ;
// max=arr[0];

// for (int i = 1; i < arr.length; i++) {
// if(arr[i]>max){
// max=arr[i];
// }

// }
// return max ;
// }

// public static void main(String[] args) {
// int arr[]={12,14,20,40,29};
// System.out.println(largest(arr));
// }
// }

// --------------------------------------------------------------------------------------------------------------------------

// Q.2.1 find Smallest element in an array

// class array_Question{
// public static void main(String[] args) {
// int arr[]={83,367,4367,11,456};
// int min=arr[0];
// for (int i = 0; i < arr.length; i++) {
// if(arr[i]<min){
// min=arr[i];
// }

// }
// System.out.println(min);
// }
// }

// =============== Another mehtod to find MINIMUM element in an array
// ========================

// class array_Question{
// static int minimum(int arr[]){

// int min=0 ;
// min=arr[0];
// for (int i = 1; i < arr.length; i++) {
// if(arr[i]<min){
// min=arr[i];
// }
// }
// return min;
// }

// public static void main(String[] args) {
// int arr[]={22,13,15,3,466,};
// System.out.println(minimum(arr));

// }
// }

// ---------------------------------------------------------------------------------------------------------------------------

// Q.2.2 Array Find the Largest and Smallest element in an array <->

// public class array_Question {

// static int[] findMaxAndMin(int arr[]) {

// // Find the maximum value
// int max = arr[0];
// for (int i = 1; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// }

// // Find the minimum value
// int min = arr[0];
// for (int i = 1; i < arr.length; i++) {
// if (arr[i] < min) {
// min = arr[i];
// }
// }

// return new int[] {max, min};
// }

// public static void main(String[] args) {
// int arr[] = {237, 78, 3256, 58, 19, 46, 3, 89, 8, 2, 6};
// int[] result = findMaxAndMin(arr);
// System.out.println("Maximum value: " + result[0]);
// System.out.println("Minimum value: " + result[1]);
// }
// }

// -------------- Another method

// import java.util.*;
// public class array_Question {

// public static void main(String[] args) {
// int arr[]={237,78,3256,58,19,46,3,89,8,2,6};
// Arrays.sort(arr);

// System.out.println("Minimum Element:"+arr[0]);
// System.out.println("Maximum Element:"+arr[arr.length-1]);
// }
// }

// ------------ Another Method

// import java.util.*;

// public class array_Question {

// public static void Sort(int arr[]){
// int temp =0 ;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i+1; j < arr.length; j++) {
// if(arr[i]>arr[j]){
// //Swap
// temp=arr[i];
// arr[i]=arr[j];
// arr[j] = temp;
// }
// }

// System.out.print(arr[i]+" ");
// }
// System.out.println();
// System.out.println("Minimum Element:"+arr[0]);
// System.out.println("Maximum Element:"+arr[arr.length-1]);
// }
// // // System.out.println(Arrays.toString(arr));

// public static void main(String[] args) {
// int arr[]={237,78,3256,58,19,46,3,89,8,2,6};
// Sort(arr);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------------
// Q.2.3 find SECOND largest element in an array

// class array_Question{
// static int secondlargest(int arr[]){
// int max1=0 ;
// int max2=0 ;

// if (arr[0]>arr[1]) {

// max1=arr[0];
// max2=arr[1];
// }

// else{
// max1=arr[1];
// max2=arr[0];
// }

// for (int i = 1; i < arr.length; i++) {
// if(arr[i]>max1){
// max2=max1 ;
// max1=arr[i];

// }

// else if (arr[i]>max2){

// max2=arr[i] ;
// }

// }

// return max2 ;
// }

// public static void main(String[] args) {
// int arr[]={ 20,40,6,25,30,88,98};
// System.out.println(secondlargest(arr));

// }
// }

// //
// ---------------------------------------------------------------------------------------------------------------------------

// //Q.2.4 find SECOND MINIMUM element in an array

// public class array_Question {
// public static void Smin(int arr[]){
// int max1=0;
// int max2=0;
// if(arr[0]>arr[1]){
// max1 =arr[0];
// max2 =arr[1];

// }
// else{
// max1 =arr[1];
// max2 =arr[0];
// }

// for (int i = 0; i < arr.length; i++) {
// if(max1>arr[i]){
// max2=max1 ;
// max1=arr[i];
// }
// else if(max2<arr[i]){
// max2=arr[i];
// }

// }
// System.out.println(max2);

// }

// public static void main(String[] args) {
// int arr[]={12,45,754,22,5,745} ;
// Smin(arr);
// }
// }

// ------------ Another Method
// public class array_Question {
// public static void Sminium(int arr[]) {
// int min = arr[0];
// int Smin = arr[1];
// if (min > Smin) {
// int temp = min;
// min = Smin;
// Smin = temp;
// } else {
// min = arr[0];
// Smin = arr[1];

// }

// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (Smin > arr[j]) {
// int temp = Smin;
// Smin = arr[j];
// arr[j] = temp;
// }

// }

// }
// System.out.println(Smin);

// }

// public static void main(String[] args) {
// // int arr[]={12,45,89,23,67,24,89,57,94};
// int arr[] = { 12,45,754,22,5,745 };
// Sminium(arr);

// }
// }

// ---------------------------------------------------------------------------------------------------------------------------
// peek(): Returns the item at the head of the queue without removing it.
// poll(): Returns and removes the item at the head of the queue.

// Q.3 Find Kth max and Min element in array

// --------------- kth max elememnt ;

// import java.util.PriorityQueue;

// public class array_Question {

// public static int Kthmax(int arr[], int k, int n){

// PriorityQueue<Integer> pg = new PriorityQueue<>();
// for (int i = 0; i < arr.length; i++) {
// pg.add(arr[i]); // 3,4,7,10,15,20,55
// }

// for (int i = 0; i <n-k; i++) {
// pg.poll(); //

// }

// return pg.peek(); // 15

// }

// public static void main(String[] args) {
// int[] arr = {7, 10, 4, 3, 20, 15,55};
// int k =3;
// int n = arr.length;
// System.out.println(Kthmax(arr, k, n));
// }
// }

// --------------- kth min elememnt ;
// import java.util.PriorityQueue;

// public class array_Question {

// public static int Kthmax(int arr[], int k, int n){

// PriorityQueue<Integer> pg = new PriorityQueue<>();
// for (int i = 0; i < arr.length; i++) {
// pg.add(arr[i]);
// }

// for (int i = 0; i <k-1; i++) {
// pg.poll();

// }

// return pg.peek();

// }

// public static void main(String[] args) {
// int[] arr = {7, 10, 4, 3, 20, 15,55};
// int k =3;
// int n = arr.length;
// System.out.println(Kthmax(arr, k, n));
// }
// }

// -------------------------- kthSmallest ------------------

// import java.util.Arrays;

// class array_Question{
// public static int kthSmallest(Integer[] arr, int K)
// {
// // Sort the given array
// Arrays.sort(arr);

// // Return K'th element in
// // the sorted array
// return arr[K - 1];
// }

// // driver's code
// public static void main(String[] args)
// {
// Integer arr[] = { 12, 3, 5, 7, 19 };
// int K = 2;

// // Function call
// System.out.print("K'th smallest element is "+ kthSmallest(arr, K));
// }
// }
// ==================================== another method
// =============================================================================
// Kth smallest

// Find Kth Min element in array

// public class array_Question {
// static int minimum(int arr[],int k){
// int n= arr.length;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i+1; j < arr.length; j++) {
// // if(arr[i]>arr[j]){
// // int temp= arr[i];
// // arr[i]=arr[j];
// // arr[j]=temp ;
// // }
// if(arr[j]>arr[i]){
// int temp= arr[j];
// arr[j]=arr[i];
// arr[i]=temp ;
// }

// }
// System.out.print(arr[i]+" ");
// }
// System.out.println();

// return arr[n-k];
// // return arr[k-1];
// }

// public static void main(String[] args) {
// int arr[]={91,42,12,13,14,16,19,23,298};
// int k=4 ;
// System.out.println(minimum(arr, k));
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.4 Given an array which consists of only 0, 1 and 2. Sort the array without
// any sorting algoritm .

// Yes, you can use a PriorityQueue to sort an array without using a traditional
// sorting algorithm.

// public class array_Question {
// public static void Sort(int arr[], int n){
// int count0 =0;
// int count1 =0;
// int count2 =0;

// for (int i = 0; i < arr.length; i++) {
// if(arr[i]==0){
// count0++;
// }
// else if(arr[i]==1){
// count1++;
// }
// else{
// count2++;

// }

// }

// for (int i = 0; i <=count0; i++) {
// System.out.print(0+" ");
// }
// for (int i = 0; i <=count1; i++) {
// System.out.print(1+" ");
// }
// for (int i = 0; i <=count2; i++) {
// System.out.print(2+" ");
// }
// }

// public static void main(String[] args) {
// int arr[]={0,1,0,1,2,0,2,0,2,1,0,1,2,0,0};
// int n = arr.length ;
// Sort(arr, n);
// }
// }
// ================== Another method =======================================

// public class array_Question {
// public static void main(String[] args) {
// int arr[]={0,1,0,1,2,0,2,0,2,1,0,1,2,0,0};
// System.out.println(" array before sorting");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i]+ " ");

// }

// int temp =0 ;
// for (int i=0;i<arr.length;i++){
// for (int j =i+1; j < arr.length; j++) {
// if(arr[j]<arr[i]){
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp ;
// }
// }
// }
// System.out.println(" array After sorting");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i]+ " ");
// }}
// }

// ================== Another method =======================================

// public class array_Question {
// static void Sort(int arr[]){
// int zero = 0, one = 0, two = 0;

// // Count the number of 0's, 1's and 2's
// for (int i = 0; i < arr.length; i++){
// if (arr[i] == 0) {
// zero++;
// } else if (arr[i] == 1) {
// one++;
// } else {
// two++;
// }
// }

// // Fill the array with 0's, 1's and 2's
// int k = 0;
// for (int i = 0; i < zero; i++) arr[k++] = 0;
// for (int i = 0; i < one; i++) arr[k++] = 1;
// for (int i = 0; i < two; i++) arr[k++] = 2;
// }

// public static void main(String[] args) {
// int arr[] = {0, 1, 0, 1, 2, 0, 2, 0, 2, 1, 0, 1, 2, 0, 0};

// Sort(arr);

// System.out.println("Array after sorting:");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.4.1 Array is sorted or not TRue or False

// public class array_Question {

// public static void sorted(int arr[]){

// boolean x = true ;

// for (int i = 1; i < arr.length; i++) {
// if(arr[i-1]>arr[i]){
// x = false;
// break;
// }
// else{
// x = true ;
// }

// }

// if(x==true){
// System.out.println("array is sorted");
// }
// else{
// System.out.println("array is not sorted");
// }

// }

// public static void main(String[] args) {
// int arr[]={12,12,13,14,14,14,22,15,16,19};
// sorted(arr);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------------
// Q.4.2 Remove Duplicates in sorted array ;

// t.c - O(n)

// import java.util.HashSet;

// public class array_Question {

// public static void main(String[] args) {
// int arr[] = { 12, 12, 13, 14, 14, 14, 15, 16, 19, 9, 9 };
// HashSet<Integer> hs = new HashSet<>();
// for (int i = 0; i < arr.length; i++) {
// hs.add(arr[i]);
// }

// for (int no : hs) {
// System.out.println(no);

// }

// }
// }

// Another Mehtod ----------------------------------------------

// import java.util.HashSet;
// import java.util.ArrayList;

// public class array_Question {

// public static void Sorted(int arr[]) {
// HashSet<Integer> hs = new HashSet<>();

// // Add elements to the HashSet to remove duplicates
// for (int i = 0; i < arr.length; i++) {
// hs.add(arr[i]);
// }

// // Convert HashSet to ArrayList to use indexing
// ArrayList<Integer> uniqueList = new ArrayList<>(hs);

// // Use a for loop with an index to print each unique element
// for (int i = 0; i < uniqueList.size(); i++) {
// System.out.println(uniqueList.get(i));
// }
// }

// public static void main(String[] args) {
// int arr[] = {12, 12, 13, 14, 14, 14, 15, 16, 19};
// Sorted(arr);
// }
// }

// ----------------------------------------------

// public class array_Question {
// public static void main(String[] args) {
// int[] arr = {12, 12, 13, 14, 14, 14, 15, 16, 19};
// int j = 0;
// for (int i = 1; i <=arr.length; i++) {
// if (arr[i] != arr[j]) {
// System.out.println(arr[j]);
// }
// j++;
// }

// }
// }

// ---------------------------------------------------------------------------------------------------------------------------
// // Q.4.3 Remove Duplicates in unsorted array

// // hashset duplicate element store nhi karta

// import java.util.HashSet;
// public class array_Question {

// public static void main(String[] args) {

// int arr[]={12,33,12,9,12,22,33,9};

// HashSet<Integer> hs= new HashSet<>();
// for (int i = 0; i < arr.length; i++) {

// hs.add(arr[i]);
// }

// for(int no:hs){
// System.out.print(no+" ");
// }
// }
// }

// ---------------------------------------------------------------------------------------------------------------------------
// // Q.4.4 find Duplicates in array and print only duplicates element only once

// getOrDefault: Agar HashMap mein key hai toh uski value dega, warna humari di
// gayi default value return karega.

// keySet: HashMap ki saari unique keys ka ek collection return karta hai jise
// hum iterate kar sakte hain.
// ------------------------------------------------------------
// import java.util.*;
// public class array_Question {

// public static void sorted(int arr[], int n){
// HashMap<Integer,Integer> hs =new HashMap<>(); // values unki occurrences

// for (int i = 0; i < n; i++) {
// hs.put(arr[i],hs.getOrDefault(arr[i],0)+1) ; // mil gaya tooh +1, or nhi mila
// tooh deafult and +1 default 0 hai .

// }

// for(int x: hs.keySet()){ // keySet() is a method of HashMap that returns a
// Set of all the keys present in the map.
// if(hs.get(x)>1){
// System.out.println(x);
// }
// }
// }
// public static void main(String[] args) {
// int arr[] = {2,2,2,2,2,3, 3, 4, 5, 6, 7, 7,2,2,2,2,2,2};
// int n = arr.length ;
// sorted(arr, n);
// }
// }

// ------------------------------------------------------------
// hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);

// Iska Matlab:
// hs.getOrDefault(arr[i], 0):

// HashMap me check karta hai ki arr[i] key pehle se daftar (HashMap) me hai ya
// nahi.
// Agar arr[i] mil gaya:
// Uski current value (ginati) return karega.
// Agar arr[i] nahi mila:
// Default value 0 return karega.
// + 1:

// Current ginati me 1 add kar deta hai (chahe ginati 0 ho ya pehle se kuch ho).
// hs.put(arr[i], ...):

// HashMap me arr[i] key ke liye updated ginati (current value + 1) ko store kar
// deta hai.

// // Another Method

// import java.util.Arrays;
// public class array_Question {
// public static void main(String[] args) {
// int arr[] = {2, 2, 3, 3, 4, 5,2,2, 6, 7, 7, 2,2,5};
// Arrays.sort(arr); // Sort the array

// System.out.println("Duplicate elements are:");
// for (int i = 0; i < arr.length - 1; i++) {
// // Check if the current element is equal to the next element
// if (arr[i] == arr[i + 1]) {
// // Print the element
// System.out.println(arr[i]);

// // Skip all the elements that are the same
// while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
// i++;
// }
// }
// }
// }
// }

// ---------------------------------------------------------------------------------------------------------------------------

// Q.4.5 Find All Sub Array Of An Array .

// public class array_Question {
// static void subarray(int arr[]){
// for(int i=0;i<arr.length;i++){
// for (int j = i; j < arr.length; j++) {
// for (int k = i; k<=j; k++) {
// System.out.print(arr[k]+ " ");

// }
// System.out.println(" ");
// }
// }
// }

// public static void main(String[] args) {
// int arr[]={1,2,3,4,5};
// subarray(arr);

// }
// }

// Another method with 0(n^2)

// public class array_Question {
// public static void subArray(int arr[], int n){
// for (int i = 0; i < arr.length; i++) {
// String result = " " ; // // result is used as a string for convenience in
// displaying the sequence of subarrays during iterations.
// for (int j = i; j < arr.length; j++) {

// result = result+arr[j];
// System.out.println(result);
// }

// }
// }

// public static void main(String[] args) {
// int arr[]={1,2,3,4,5};
// subArray(arr, 0);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------------

// Q. 4.6 Find Span of array {Span= max-min}

// public class array_Question {
// static int Span(int arr[]){
// int max =0;
// int min =0;

// max=arr[0];
// min=arr[0];
// for (int i = 1; i < arr.length; i++) {
// if(arr[i]>max){
// max=arr[i];
// }
// else if (arr[i]<min) {
// min=arr[i];
// }
// }

// return max-min ;

// }

// public static void main(String[] args) {
// int arr[]={20,42,88,99,6};
// System.out.println(Span(arr));
// }
// }

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.7 Count of smaller or equal element in arraay

// public class array_Question {

// public static int countElementsLessThanOrEqualTo(int[] arr, int x) {
// int count = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] <= x) {
// count++;
// }

// }
// return count;
// }

// public static void main(String[] args) {
// int arr[] = {2, 6, 12, 18, 21, 26, 33, 42,5};
// int x = 26;

// int count = countElementsLessThanOrEqualTo(arr, x);
// System.out.println("Number of elements less than or equal to " + x + " is: "
// + count);
// }
// }

// -------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.8 Search the given element in array

// public class array_Question {

// public static void main(String[] args) {

// int arr[]={12,23,45,67,26,49};
// int x=26 ;
// boolean flag=false;
// for (int i = 0; i < arr.length; i++) {

// if(arr[i]==x){
// System.out.println(x + " elememnt is found in array " + " at index "+ i);
// flag=true;
// break ;
// }

// }
// if(flag==false){
// System.out.println("element not found in array");
// }
// }
// }

// -------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.9 merege two sorted array with extra Space

// public class array_Question {
// public static void mergeSortedArrays(int arr1[], int arr2[], int m, int n) {
// int temp[] = new int[m + n];
// int i = 0, j = 0, k = 0;

// // Merge arrays
// while (i < m && j < n) {
// if (arr1[i] < arr2[j]) {
// temp[k++] = arr1[i++];
// } else {
// temp[k++] = arr2[j++];
// }
// }
// // Copy remaining elements of arr1[] if any
// while (i < m) {
// temp[k++] = arr1[i++];
// }
// // Copy remaining elements of arr2[] if any
// while (j < n) {
// temp[k++] = arr2[j++];
// }
// // Print the merged array
// System.out.print("Merged array: ");
// for (int l = 0; l < temp.length; l++) {
// System.out.print(temp[l] + " ");
// }
// System.out.println(); // Print a new line after printing the array
// }
// public static void main(String[] args) {
// int arr1[] = {1, 5, 9};
// int arr2[] = {2, 3,5, 6, 7};
// int m = arr1.length;
// int n = arr2.length;

// mergeSortedArrays(arr1, arr2, m, n);
// }
// }

// -----------------------------------------------------------------------------------------------------------------------
// Q.4.9.1 merege two sorted array without taking any extra space

// import java.util.Arrays;
// public class array_Question {
// public static void space(int arr1[], int arr2[], int n, int m) {
// int i = 0; // Pointer for arr1
// int j = 0; // Pointer for arr2
// int k = n - 1; // Last index of arr1

// // Traverse and swap elements of arr1 and arr2 if needed
// while (i <n && j < m) {
// if (arr1[i] < arr2[j]) {
// i++;
// } else {
// // Swap arr1[k] and arr2[j] to keep larger elements in arr2
// int temp = arr1[k];
// arr1[k] = arr2[j];
// arr2[j] = temp;
// k--;
// j++;
// }
// }

// // Sort both arrays to make them individually sorted after swapping
// Arrays.sort(arr1);
// Arrays.sort(arr2);

// // Print the merged arrays
// System.out.print("Merged array 1: ");
// for (int val : arr1) {
// System.out.print(val + " ");
// }
// System.out.println();

// System.out.print("Merged array 2: ");
// for (int val : arr2) {
// System.out.print(val + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr1[] = {1, 3, 5, 7};
// int arr2[] = {0, 2, 6, 8, 9};
// int n = arr1.length;
// int m = arr2.length;

// space(arr1, arr2, n, m);
// }
// }

// ANother Mehotd
// --------------------------------------------------------------------------------------

// import java.util.Arrays;
// public class ArrayQuestion {

// public static void space(int arr1[], int arr2[], int n, int m) {
// int i = 0; // Pointer for arr1
// int j = 0; // Pointer for arr2
// int k = n - 1; // Last index of arr1

// // Traverse and swap elements of arr1 and arr2 if needed
// while (i < n && j < m) {
// if (arr1[i] < arr2[j]) {
// i++;
// } else {
// // Swap arr1[k] and arr2[j] to keep larger elements in arr2
// int temp = arr1[k];
// arr1[k] = arr2[j];
// arr2[j] = temp;
// k--;
// j++;
// }
// }

// // Sort both arrays to make them individually sorted after swapping
// Arrays.sort(arr1);
// Arrays.sort(arr2);

// // Combine both sorted arrays into a single merged array
// int[] mergedArray = new int[n + m];
// System.arraycopy(arr1, 0, mergedArray, 0, n);
// System.arraycopy(arr2, 0, mergedArray, n, m);

// // Print the merged single array
// System.out.print("Combined Merged Array: ");
// for (int val : mergedArray) {
// System.out.print(val + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr1[] = {1, 3, 5, 7};
// int arr2[] = {0, 2, 6, 8, 9};
// int n = arr1.length;
// int m = arr2.length;

// space(arr1, arr2, n, m);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.4.10 print 1 to n without loop

// public class array_Question {
// public static void recursion(int n){
// if(n==0){
// return ;
// }
// recursion(n-1);
// System.out.println(n+" ");

// }

// public static void main(String[] args) {
// int n = 10 ;
// recursion(n);
// }
// }

// Another Mehtod

// public class array_Question {
// public static void printNumbers(int n) {
// if (n > 0) {
// printNumbers(n - 1);
// System.out.print(n + " ");
// }
// }

// public static void main(String[] args) {
// int n = 5;
// printNumbers(n);
// }
// }

// //
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// // Q.5 Move all the negative elements to one side of the array

// public class array_Question {
// public static int[] separateNegativeAndPositive(int arr[]) {
// int n= arr.length;
// int i=0;
// int j=n-1;
// while(i<j){
// if(arr[i]<0){
// i++;
// }
// else if (arr[j]>=0)
// {
// j--;
// }
// else{
// int temp = arr[i];
// arr[i]= arr[j];
// arr[j]=temp ;
// i++;
// j--;
// }

// }
// return arr;

// }
// }

// Another method

// public class array_Question {
// public static void main(String[] args) {
// int arr[] = {12, 23, -22, -12, -2, 22, -45, 29};
// int temp[] = new int[arr.length];

// int j = 0;

// // Copy positive numbers to temp
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > 0) {
// temp[j++] = arr[i];
// }
// }

// // Copy negative numbers to temp
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < 0) {
// temp[j++] = arr[i];
// }
// }

// // Print the result
// for (int i = 0; i < temp.length; i++) {
// System.out.print(temp[i] + " ");
// }
// }
// }

// Another method

// Quick Sort Algorithm

// public class array_Question {
// public static void main(String[] args) {
// int arr[] = {2, 3, -2, -1, 6, -9};

// // Using two pointers approach
// int left = 0;
// int right = arr.length - 1;

// while (left <= right) {
// // Move left pointer to the right until a negative element is found
// while (left <= right && arr[left] >= 0) {
// left++;
// }

// // Move right pointer to the left until a positive element is found
// while (left <= right && arr[right] < 0) {
// right--;
// }

// // Swap elements at left and right pointers
// if (left <= right) {
// int temp = arr[left];
// arr[left] = arr[right];
// arr[right] = temp;
// left++;
// right--;
// }
// }

// // Print the modified array
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// ------------------------------------------------------------------------------------------------------------------------

// // Q.5.1 Move all the negative elements to one side of the array and sort
// them

// import java.util.PriorityQueue;
// public class array_Question {
// public static void move(int arr[]) {

// int temp[] = new int[arr.length];
// int j = 0;

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < 0) {
// temp[j++] = arr[i];
// }
// }
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > 0) {
// temp[j++] = arr[i];
// }
// }

// // now sort the temp array then print
// PriorityQueue<Integer> pq = new PriorityQueue<>();
// for (int i = 0; i < temp.length; i++) {
// pq.add(temp[i]);

// }

// for (int i = 0; i < temp.length; i++) {
// System.out.println(pq.poll());

// }

// }

// public static void main(String[] args) {
// int arr[] = { 12, 23, -22, -12, -2, 22, -45, 29 };
// move(arr);
// }
// }

// another method

// import java.util.PriorityQueue;

// public class array_Question {

// public static void move(int arr[]) {
// int temp[] = new int[arr.length];
// int j = 0;

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < 0) {
// temp[j++] = arr[i];
// }
// }
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > 0) {
// temp[j++] = arr[i];
// }
// }

// // now sort the temp array then print
// PriorityQueue<Integer> pq = new PriorityQueue<>();
// for (int i = 0; i < temp.length; i++) {
// pq.add(temp[i]); // Changed j++ to i
// }

// while (!pq.isEmpty()) {
// System.out.println(pq.poll()); // Changed pq.peek() to pq.poll()
// }
// }

// public static void main(String[] args) {
// int arr[] = {12, 23, -22, -12, -2, 22, -45, 29};
// move(arr);
// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.6 Find the Union of the two sorted arrays.

// public class array_Question {
// public static void union(int arr1[], int arr2[], int m , int n){
// int i=0;
// int j= 0;
// int k=0;
// int temp[]= new int[arr1.length+arr2.length];

// while (i<m && j<n) {
// if(arr1[i]<arr2[j]){
// temp[k++] =arr1[i];
// i++;
// }

// else if (arr1[i]== arr2[j]){
// temp[k++] = arr1[i];
// i++;
// j++;
// }
// else if(arr1[i] > arr2[j]){
// temp[k++] =arr2[j];
// j++;
// }
// }
// while (i<m) {
// temp[k++] =arr1[i];
// i++;
// }

// while (j<n) {
// temp[k++] =arr2[j];
// j++;
// }

// for (int l = 0; l < temp.length; l++) {
// System.out.print(temp[l]+" ");

// }

// }
// public static void main(String[] args) {
// int arr1[]={1,3,4,5,7};
// int arr2[]={2,3,5,6};
// int m=arr1.length ;
// int n=arr2.length ;
// union(arr1, arr2, m, n);
// }
// }

// ------------------------------------- --------- Another Method

// public class array_Question {
// static void Union(int arr1[], int arr2[], int m, int n) {
// int i = 0;
// int j = 0;
// while (i < m && j < n) {

// if (arr1[i] < arr2[j]) {
// System.out.print(arr1[i++] + " ");
// } else if (arr1[i] > arr2[j]) {
// System.out.print(arr2[j++] + " ");
// }
// // If elements are equal, print one and increment both indices
// else if (arr1[i] == arr2[j]) {
// System.out.print(arr2[j++] + " ");
// i++;
// }
// }

// // Print remaining elements of arr1, if any
// while (i < m) {
// System.out.print(arr1[i++] + " ");
// }

// // Print remaining elements of arr2, if any
// while (j < n) {
// System.out.print(arr2[j++] + " ");
// }
// }

// public static void main(String[] args) {
// int arr1[] = {1, 3, 4, 5, 7};
// int arr2[] = {2, 3, 5,34, 6};
// int m = arr1.length;
// int n = arr2.length;
// Union(arr1, arr2, m, n); // Corrected the argument here
// }
// }

// --------------------- --------------------- Another Method

// public class array_Question {
// public static void Union(int arr1[], int arr2[], int m, int n, int temp[]) {
// int i = 0;
// int j = 0;
// int k = 0;

// while (i < m && j < n) {
// if (arr1[i] < arr2[j]) {
// temp[k++] = arr1[i++];
// } else if (arr1[i] > arr2[j]) {
// temp[k++] = arr2[j++];
// } else {
// temp[k++] = arr1[i++];
// j++;
// }
// }

// // Remaining elements from arr1
// while (i < m) {
// temp[k++] = arr1[i++];
// }

// // Remaining elements from arr2
// while (j < n) {
// temp[k++] = arr2[j++];
// }
// }

// public static void main(String[] args) {
// int arr1[] = {1, 3, 4, 5, 7};
// int arr2[] = {2, 3, 5, 6};
// int m = arr1.length;
// int n = arr2.length;
// int temp[] = new int[m + n];
// Union(arr1, arr2, m, n, temp);

// System.out.println("Union of the arrays:");
// for (int k = 0; k < temp.length; k++) {
// System.out.print(temp[k] + " ");
// }
// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.6.1 Find the Intersection of the two sorted arrays.

// import java.util.Arrays;
// public class array_Question {
// public static void Intersection(int arr1[], int arr2[]) {
// Arrays.sort(arr1); // Sort arr1
// Arrays.sort(arr2); // Sort arr2

// int i = 0;
// int j = 0;

// while (i < arr1.length && j < arr2.length) {
// if (arr1[i] < arr2[j]) {
// i++; // Move `i` forward if `arr1[i]` is smaller
// } else if (arr1[i] > arr2[j]) {
// j++; // Move `j` forward if `arr2[j]` is smaller
// } else {
// System.out.println(arr1[i]); // Intersection element
// i++;
// j++;
// }
// }
// }

// public static void main(String[] args) {
// int arr1[] = {1, 3, 2, 2, 4, 5, 7};
// int arr2[] = {2, 3, 5, 6, 1};
// Intersection(arr1, arr2);
// }
// }

// --------------------- --------------------- Another Method

// - time complexity 0(N+M)

// import java.util.*;
// public class array_Question{
// public static void Intersection(int arr1[], int arr2[]){

// Arrays.sort(arr1);
// Arrays.sort(arr2);

// int i= 0;
// int j=0;

// while (i<arr1.length && j<arr2.length) {
// if(arr1[i]==arr2[j]){
// System.out.println(arr1[i]);
// i++;
// j++;
// }
// else if(arr1[i]>arr2[j]){
// j++ ;

// }
// else{
// i++;
// }

// }
// }
// public static void main(String[] args) {
// int arr1[]={1,3,2,2,4,5,7};
// int arr2[]={2,3,5,6,1};
// Intersection(arr1, arr2);

// }
// }

// ---------------------------------------------------- Another Method

// import java.util.HashSet;
// import java.util.ArrayList;

// public class array_Question {

// public static void Intersection(int arr1[], int arr2[]) {
// HashSet<Integer> arr1set = new HashSet<>();
// HashSet<Integer> arr2set = new HashSet<>();

// // Add elements of arr1 to arr1set
// for (int i = 0; i < arr1.length; i++) {
// arr1set.add(arr1[i]);
// }

// // Find common elements and add to arr2set
// for (int i = 0; i < arr2.length; i++) {
// if (arr1set.contains(arr2[i])) {
// arr2set.add(arr2[i]);
// }
// }

// // Print the intersection elements
// for (Integer element : arr2set) {
// System.out.print(element + " ");
// }
// }

// public static void main(String[] args) {
// int arr1[] = {1, 5, 3, 2, 2, 4, 5, 7};
// int arr2[] = {2, 3, 5, 6, 1, 5};
// Intersection(arr1, arr2);
// }
// }

// ---------------------------------------------------- Another Method

// import java.util.ArrayList;
// import java.util.HashSet;
// public class array_Question {
// public static void Intersection(int arr1[], int arr2[]) {
// HashSet<Integer> set1 = new HashSet<>();
// ArrayList<Integer> answer = new ArrayList<>();

// for (int i = 0; i < arr1.length; i++) {
// set1.add(arr1[i]);

// }
// for (int i = 0; i < arr2.length; i++) {
// if (set1.contains(arr2[i])) { // set1 element contains elements of any arr2
// then i will put that element in my answer .
// answer.add(arr2[i]);
// set1.remove(arr2[i]) ; // to save from duplicates
// }
// }
// System.out.println(answer);
// }
// public static void main(String[] args) {
// int arr1[] = {1, 5,3, 2, 2, 4, 5, 7};
// int arr2[] = {2, 3, 5, 6, 1,5};
// Intersection(arr1, arr2);
// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.7 Write a program to cyclically rotate an array by one.

// public class array_Question{
// public static void main(String[] args) {
// int arr[]={1,2,3,4,5};
// int x = arr[arr.length-1];
// for (int i=arr.length-1 ; i>0 ;i--) {
// arr[i]=arr[i-1];
// }
// arr[0]=x;
// for (int i= 0; i < arr.length; i++) {
// System.out.print(arr[i]+" ");
// }
// }
// }
// --------------------------------------------------------------------------------------------------------------

// Q.7.1 Write a program to cyclically rotate an array by K times .

// import java.util.*;
// public class array_Question{
// // Reverses elements in the array from index start to end
// public static void reverse(int arr[], int start, int end) {
// while (start < end) {
// // Swap elements
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;

// // Move towards the middle
// start++;
// end--;
// }
// }

// // Utility method to print the array
// public static void printArray(int arr[]) {
// for (int num : arr) {
// System.out.print(num + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = {1, 2, 3, 4, 5, 6, 7};
// int k = 3;
// int n = arr.length;

// // Rotate the array by k positions to the right
// reverse(arr, 0, n - 1); // Reverse the entire array
// reverse(arr, 0, k - 1); // Reverse the first part (0 to k-1)
// reverse(arr, k, n - 1); // Reverse the second part (k to n-1)

// // Print the rotated array
// System.out.println("Rotated array:");
// printArray(arr);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// // Q.8 find Largest sum contiguous Subarray [V. IMP]
// without Kadane's algorithm

// public class array_Question {
// public static int contiguous(int arr[], int n){
// int sum =0;
// int maxsum =0;

// for (int i = 0; i < arr.length; i++) {
// sum = sum+arr[i];
// if(sum>maxsum){
// maxsum =sum;
// }
// }
// return maxsum ;
// }

// public static void main(String[] args) {
// int arr[]={-1,3,4,-2};
// int n= arr.length ;
// int x = contiguous(arr, n);
// System.out.println(x);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q>9 Minimise the maximum difference between heights [V.IMP]
// Maximum or minimum number me kuch jodd ghata ke minimum differnce nikalo

// import java.util.Arrays;
// public class array_Question {

// public static int difference(int arr[], int n, int k) {
// Arrays.sort(arr);

// int answer = arr[n - 1] - arr[0];
// int smallest = arr[0] + k;
// int largest = arr[n - 1] - k;
// int min, max;

// for (int i = 0; i < arr.length - 1; i++) {
// if(arr[i]-k<=0){
// continue ;
// }
// min = Math.min(smallest, arr[i + 1] - k);
// max = Math.max(largest, arr[i] + k);

// // Only update the answer if min is non-negative
// if (min >= 0) {
// answer = Math.min(answer, max - min);
// }
// }

// return answer;
// }

// public static void main(String[] args) {
// // int arr[] = {6, 5, 8, 10};
// int arr[] = {4,2,3,6};
// int n = arr.length;
// int k = 3;

// int result = difference(arr, n, k);
// System.out.println("The minimum difference is " + result);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// // // Q.10 Minimum no. of Jumps to reach end of an array

// public class array_Question {
// public static void main(String[] args) {
// // int arr[]={1,3,5,9,2,2,6,8,2,9,10};
// int arr[]={1,3,5,7,9,2,6,8,2,9,10};
// int n = arr.length;

// int MaxReach = 0; // uss index se maximum kon se index tak tum reach kar skte
// ho , MaxReach sabse door point batata hai jahan tak aap jaa sakte ho,
// int jumps =0 ; // The number of jumps lage to reach to last index.
// int halt=0; // halt yeh babta hai app maxReach tak reach kar gaye ho
// nowdecsion lena padgea .
// // new maxReach is my next halt everytime , halt pe reach karke decsion lena
// padgea

// for (int i = 0; i < arr.length; i++) {
// MaxReach=Math.max(MaxReach,i+arr[i]); // comparing from the previous one
// if(halt==i){ // iska matlab hai ki aap ab tak ke jumps ke saath maxRange tak
// pahunch gaye ho.
// halt=MaxReach;
// jumps++;
// if(halt>=n-1){
// System.out.println(jumps);
// }
// }
// }
// }
// }

// MaxReach aapko yeh batata hai ki aap ab tak jitni door jaa sakte ho, usme
// sabse
// zyada door kaunsa point hai.
// Matlab, aap current position se kitni aage tak jaa sakte ho, yeh Max batata
// hai.

// If maxRange equals i, it means you have reached the maximum range possible
// with the current number of jumps.
// At this point, you need to make another jump to increase the range

// --------------------------------------------------------------------------------------------------------------------//

// Q.11

// find duplicate in an array of N+1 Integers print only duplicate element only
// once .

// import java.util.Arrays;

// public class array_Question {
// public static void main(String[] args) {
// int arr[] = { 2, 2, 3, 3, 4, 5, 2, 2, 6, 7, 7, 2, 2 };
// Arrays.sort(arr); // Sort the array

// System.out.println("Duplicate elements are:");
// for (int i = 0; i < arr.length - 1; i++) {
// // Check if the current element is equal to the next element
// if (arr[i] == arr[i + 1]) {
// // Print the element
// System.out.println(arr[i]);

// // Skip all the elements that are the same
// while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
// i++;
// }
// }
// }
// }
// }

// // Another Method

// import java.util.*;
// public class array_Question {

// public static void sorted(int arr[], int n){
// HashMap<Integer,Integer> hs =new HashMap<>();

// for (int i = 0; i < n; i++) {
// hs.put(arr[i],hs.getOrDefault(arr[i],0)+1) ;

// }

// for(int x: hs.keySet()){
// if(hs.get(x)>1){
// System.out.println(x);
// }
// }
// }
// public static void main(String[] args) {
// int arr[] = {2, 2,2,2,2,3, 3, 4, 5, 6, 7, 7,2,2,2,2,2,2};
// int n = arr.length ;
// sorted(arr, n);
// }
// }

// ------------------------------------------------------------------------------------------------------------------

// Q.11.1 Remove the duplicate in an array of N+1 Integers

// import java.util.*;
// public class array_Question {
// public static void main(String[] args) {
// int j = 0;
// int arr[] = {1, 2, 2, 3, 3, 4, 5, 5,1,2,2,1,9,2,2};

// int n = arr.length;
// Arrays.sort(arr);

// // Iterate through the array and update the unique elements in the beginning
// for (int i = 0; i <n - 1; i++) {
// if (arr[i] != arr[i + 1]) {
// System.out.println(arr[i]);
// }
// }
// System.out.println(arr[n-1]);
// }
// }

// Another method

// import java.util.HashSet;

// public class array_Question {

// public static void main(String[] args) {
// int arr[]={1, 2, 2, 3, 3, 4, 5, 5,1,2,2,1,9};
// HashSet<Integer> hs = new HashSet<>();
// for (int i = 0; i < arr.length; i++) {
// hs.add(arr[i]);
// }

// for(int no:hs){
// System.out.println(no);
// }
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.12 Merge 2 sorted arrays without using Extra space.

// import java.util.Arrays;
// public class array_Question {

// public static void space(int arr1[], int arr2[], int n, int m) {
// int i = 0; // Pointer for arr1
// int j = 0; // Pointer for arr2
// int k = n - 1; // Last index of arr1

// // Traverse and swap elements of arr1 and arr2 if needed
// while (i <n && j < m) {
// if (arr1[i] < arr2[j]) {
// i++;
// } else {
// // Swap arr1[k] and arr2[j] to keep larger elements in arr2
// int temp = arr1[k];
// arr1[k] = arr2[j];
// arr2[j] = temp;
// k--;
// j++;
// }
// }

// // Sort both arrays to make them individually sorted after swapping
// Arrays.sort(arr1);
// Arrays.sort(arr2);

// // Print the merged arrays
// System.out.print("Merged array 1: ");
// for (int val : arr1) {
// System.out.print(val + " ");
// }
// System.out.println();

// System.out.print("Merged array 2: ");
// for (int val : arr2) {
// System.out.print(val + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr1[] = {1, 3, 5, 7};
// int arr2[] = {0, 2, 6, 8, 9};
// int n = arr1.length;
// int m = arr2.length;

// space(arr1, arr2, n, m);
// }
// }

// ANother Mehotd
// --------------------------------------------------------------------------------------

// import java.util.Arrays;

// public class ArrayQuestion {

// public static void space(int arr1[], int arr2[], int n, int m) {
// int i = 0; // Pointer for arr1
// int j = 0; // Pointer for arr2
// int k = n - 1; // Last index of arr1

// // Traverse and swap elements of arr1 and arr2 if needed
// while (i < n && j < m) {
// if (arr1[i] < arr2[j]) {
// i++;
// } else {
// // Swap arr1[k] and arr2[j] to keep larger elements in arr2
// int temp = arr1[k];
// arr1[k] = arr2[j];
// arr2[j] = temp;
// k--;
// j++;
// }
// }

// // Sort both arrays to make them individually sorted after swapping
// Arrays.sort(arr1);
// Arrays.sort(arr2);

// // Combine both sorted arrays into a single merged array
// int[] mergedArray = new int[n + m];
// System.arraycopy(arr1, 0, mergedArray, 0, n);
// System.arraycopy(arr2, 0, mergedArray, n, m);

// // Print the merged single array
// System.out.print("Combined Merged Array: ");
// for (int val : mergedArray) {
// System.out.print(val + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr1[] = {1, 3, 5, 7};
// int arr2[] = {0, 2, 6, 8, 9};
// int n = arr1.length;
// int m = arr2.length;

// space(arr1, arr2, n, m);
// }
// }

// --------------------------------------------------------------------------------------------------------------------

// Q.13 Kadane's Algo [V.V.V.V.V IMP] similar to Q.8
// // KADANE'S ALGORITHM == Maximum Subarray

// public class array_Question {
// static int maxSubArray(int arr[]) {
// int sum = 0;
// int maxsum = 0;
// for (int i = 0; i < arr.length; i++) {

// // mai postive me hu negative walle ki help karunga
// if (sum >= 0) { //
// sum = sum + arr[i]; // -2
// }
// // tum sarre loss me ho( -ve) mai apna dandha khud start karunga

// else if (sum < 0) {
// sum = arr[i]; // -2
// }

// if (sum > maxsum) { // -2
// maxsum = sum;
// }

// }
// return maxsum;
// }

// public static void main(String[] args) {
// int arr[] = { -1, 3, 4, -2 };
// // int arr[]={ -2,1,-3,4,-1,2,1,-5,4};
// System.out.print(maxSubArray(arr));
// }
// }

// Uisng sliding window

// public class array_Question {

// public static int Kadane(int arr[], int n) {
// int ans = Integer.MIN_VALUE; // Initialize with minimum value
// int window = 0; // Variable to store the sum of the current subarray

// for (int right = 0; right < n; right++) {
// window += arr[right]; // Add the current element to the window

// // Update the maximum sum found so far
// ans = Math.max(ans, window);

// // If the window becomes negative, reset it to zero
// if (window < 0) {
// window = 0;
// }
// }
// return ans;
// }

// public static void main(String[] args) {
// int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
// int n = arr.length;
// System.out.println(Kadane(arr, n)); // Expected output: 6
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q.14 Merge Intervals

// For the given 5 intervals - [1, 4], [3, 5], [6, 8], [10, 12], [8, 9].

// Since intervals [1, 4] and [3, 5] overlap with each other, we will merge them
// into a single interval as [1, 5].

// Similarly, [6, 8] and [8, 9] overlap, merge them into [6,9].

// Interval [10, 12] does not overlap with any interval.

// Final List after merging overlapping intervals: [1, 5], [6, 9], [10, 12].

// stack is used here
// public static void main(String[] args) {
// Interval arr[] = new Interval[4];
// arr[0] = new Interval(1, 3);
// arr[1] = new Interval(2, 4);
// arr[2] = new Interval(5, 7);
// arr[3] = new Interval(6, 8);
// mergeInterval(arr);
// }

// import java.util.* ;
// class array_Question {
// public int[][] merge(int[][] intervals) {
// Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
// // [ [1,3] , [2,6] ,[8,10],[9,18]
// int start=intervals[0][0]; // 1
// int end =intervals[0][1]; // 3
// List<int[]> list = new ArrayList<>();
// for(int i=1;i<intervals.length;i++){
// int s=intervals[i][0];
// int e=intervals[i][1];
// if(s<=end){
// end = Math.max(e,end);
// }else{
// list.add(new int[]{start,end});
// start =s ;
// end =e;

// }

// }

// list.add(new int[]{start,end}); // adding last array
// return list.toArray(new int[list.size()][]); // list converting to 2D
// Arrayand converting it
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.15 Next Permutation
// For example, [2, 1, 3, 4] is lexicographically smaller than [2, 1, 4, 3].

// import java.util.*;
// public class array_Question {
// public void nextPermutation(int[] nums) {
// int i = nums.length - 2;
// int j = nums.length - 1;
// while (i >= 0 && nums[i] >= nums[i + 1]) {
// i--;
// }
// if (i >= 0) {
// while (j >= 0 && nums[j] <= nums[i]) {
// j--;
// }
// swap(nums, i, j);
// }
// reverse(nums, i + 1,nums.length - 1);
// }

// public void swap(int[] nums, int i, int j) {
// int temp = nums[i];
// nums[i] = nums[j];
// nums[j] = temp;
// }

// public void reverse(int[] nums, int start,int end ) {
// while (start < end) {
// swap(nums, start, end);
// start++;
// end--;
// }
// }

// public static void main(String[] args) {
// array_Question sol = new array_Question();
// // int[] nums = {1, 1, 5, 4, 1}; // [1, 4, 1, 1, 5]
// // int[] nums = {4,1,7,5,3,2,0}; // [1, 4, 1, 1, 5]
// int[] nums = {4,2,7,5,3,1,0};
// sol.nextPermutation(nums);
// System.out.println(Arrays.toString(nums)); // Output: [1, 4, 1, 1, 5]
// }
// }

// ---------------------Another Method ---------------
// class array_Question {
// public void nextPermutation(int[] nums) {
// int n = nums.length;
// int i = n - 2; // Start from second last element
// int j = n - 1; // Start from last element

// // Find the first decreasing element from the end
// for (i = n - 2; i >= 0; i--) {
// if (nums[i] < nums[i + 1]) { // Found the pivot
// break;
// }
// }

// if (i >= 0) { // If a valid pivot was found
// // Find the smallest element larger than nums[i] on the right
// for (j = n - 1; j > i; j--) {
// if (nums[j] > nums[i]) {
// break; // Found the element to swap
// }
// }
// // Swap nums[i] and nums[j]
// swap(nums, i, j);
// }

// // Reverse the array from i + 1 to the end
// reverse(nums, i + 1, n - 1);
// }

// private void swap(int[] nums, int i, int j) {
// int temp = nums[i];
// nums[i] = nums[j];
// nums[j] = temp;
// }

// private void reverse(int[] nums, int start, int end) {
// while (start < end) {
// swap(nums, start, end);
// start++;
// end--;
// }
// }
// }

// ---------------------Another Method --------------- ( galat hai ye lekin
// smjhane ke lie sahi code)
// class array_Question {
// public void nextPermutation(int[] nums) {
// int n = nums.length;
// int i=n-2;
// int j=n-1;

// for ( i = n - 2; i >= 0; i--) {
// if (nums[i] >nums[i + 1]) {
// i-- ;
// else if (nums[i] <nums[i + 1]){

// if(nums[i]>nums[j]){
// j--;
// }
// else if (nums[i]<nums[j]){
// swap(nums[],i,j)
// }

// }
// }
// }
// }

// private void swap(int[] nums, int i, int j) {
// int temp = nums[i];
// nums[i] = nums[j];
// nums[j] = temp;
// }

// private void reverse(int[] nums, int start, int end) {
// while (start < end) {
// swap(nums, start, end);
// start++;
// end--;
// }
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.15.1 Find Ceil & Floor Of An Number In A Sorted Array ..

// public class array_Question {
// public static int ceil (int arr[],int key ){

// // BINARY SEARCH FOR CEIL
// int low = 0 ;
// int high = arr.length-1 ;
// int mid =0 ;

// while(low<=high){
// mid=(low+high)/2 ;

// if(key==arr[mid]){
// return arr[mid] ;

// }

// else if (key<arr[mid]){
// high=mid-1;
// low=low;
// }
// else if (key>arr[mid]){
// low=mid+1 ;
// high=high ;
// }
// }
// return arr[low]; // CEIL

// }

// public static int floor (int arr[],int key ){

// // BINARY SEARCH FOR FLOOR
// int low = 0 ;
// int high = arr.length-1 ;
// int mid =0 ;

// while(low<=high){
// mid=(low+high)/2 ;

// if(key==arr[mid]){
// return arr[mid] ;

// }

// else if (key<arr[mid]){
// high=mid-1;
// low=low;
// }
// else if (key>arr[mid]){
// low=mid+1 ;
// high=high ;
// }
// }
// return arr[high]; // FLOOR

// }

// public static void main(String[] args) {
// int arr[]={19,23,56,61,72,88,92};
// int key =68 ;
// System.out.println(ceil(arr, key));
// System.out.println(floor(arr, key));

// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// public class array_Question {
// public static int ceil (int arr[],int key,int low,int high , int mid ){

// while(low<=high){
// mid=(low+high)/2 ;

// if(key==arr[mid]){
// return arr[mid] ;

// }

// else if (key<arr[mid]){
// high=mid-1;
// low=low;
// }
// else if (key>arr[mid]){
// low=mid+1 ;
// high=high ;
// }
// }
// return arr[low];

// }

// public static int floor (int arr[],int key, int low,int high , int mid ){

// while(low<=high){
// mid=(low+high)/2 ;

// if(key==arr[mid]){
// return arr[mid] ;

// }

// else if (key<arr[mid]){
// high=mid-1;
// low=low;
// }
// else if (key>arr[mid]){
// low=mid+1 ;
// high=high ;
// }
// }
// return arr[high];

// }

// public static void main(String[] args) {
// int arr[]={19,23,56,61,72,88,92};
// int key =68 ;
// int low = arr[0] ;
// int high = arr[arr.length-1] ;
// int mid =0 ;
// System.out.println(ceil(arr, key));
// System.out.println(floor(arr, key));

// }
// }
// --------------------------------------------------------------------------------------------------------------------//

// Q.16. Array Count Inversion <->

// brute force method

// public class array_Question {
// public static void main(String[] args) {
// int arr[] = { 8, 4, 2, 1, 1 };
// int id = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] > arr[j]) {
// id++;
// }
// }
// }
// System.out.println(id);
// }
// }

// --------------- optimal method

// import java.util.Arrays;
// public class array_Question {
// static long merge(int arr[], int temp[], int left, int mid, int right) {
// int i = left, j = mid + 1, k = left;
// long inv_count = 0;

// while (i <= mid && j <= right) {
// if (arr[i] <= arr[j])
// temp[k++] = arr[i++];
// else {
// inv_count += (mid - i + 1);
// temp[k++] = arr[j++];
// }
// }

// // Copy remaining elements of left subarray
// while (i <= mid)
// temp[k++] = arr[i++];

// // Copy remaining elements of right subarray
// while (j <= right)
// temp[k++] = arr[j++];

// // Copy back to original array to maintain sorted subarrays
// for (i = left; i <= right; i++)
// arr[i] = temp[i];

// return inv_count;
// }
// // -------------------------------------------------------
// static long mergeSort(int arr[], int temp[], int left, int right) {
// long inv_count = 0;
// if (right > left) {
// int mid = (left + right) / 2;

// inv_count += mergeSort(arr, temp, left, mid);
// inv_count += mergeSort(arr, temp, mid + 1, right);

// // Merge the sorted halves
// inv_count += merge(arr, temp, left, mid, right);
// }
// return inv_count;
// }
// // -------------------------------------------------------
// static long getInvCount(int arr[], int n) {
// int temp[] = new int[n];
// return mergeSort(arr, temp, 0, n - 1);
// }
// // -------------------------------------------------------
// public static void main(String[] args) {
// // int arr[] = {2, 4, 1, 3, 5};
// int arr[]={8,4,2,1,1};
// int n = arr.length;
// System.out.print("Number of inversions is " + getInvCount(arr, n));
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.17 Array Best time to buy and Sell stock <->
// you can buy only stcok at a time

// public class array_Question {
// public static int Best(int stock[], int n){
// int buy = stock[0];
// int profit =0;
// int maxprofit =0;
// for (int i = 1; i < stock.length; i++) {
// if(stock[i]<buy){
// buy = stock[i];
// }
// else if(stock[i]>buy){
// profit = stock[i]- buy ;

// }
// if(maxprofit<profit){
// maxprofit =profit ;

// }

// }
// return maxprofit ;

// }

// public static void main(String[] args) {
// int stock[]={7,8,1,9,6,4};
// int n = stock.length ;
// int x = Best(stock, n);
// System.out.println(x);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q. 17.1 Best Time to Buy and Sell Stock II ; -
// you can buy ans sell stock multiple times

// class array_Question{
// public int maxProfit(int[] prices) {
// int buy =prices[0];
// int profit = 0 ;
// int maxprofit =0;

// for(int i = 1;i<prices.length;i++){
// if(buy>prices[i]){
// buy=prices[i];
// }
// else if(buy<prices[i]){
// profit += prices[i]-buy ;
// buy = prices[i] ;
// }
// }
// return profit ;
// }
// }

// Another method

// public class array_Question {
// public static void main(String[] args) {
// int arr[]={7,8,1,9,6,4};
// int profit =0;
// for (int i = 1; i < arr.length; i++) {
// if(arr[i]>arr[i-1]){
// profit = profit + arr[i] -arr[i-1];
// }

// }
// System.out.println(profit);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q. 17.2 Best Time to Buy and Sell Stock III ; - you can buy ans sell stock at
// most 2 times

// class array_Question {
// public static int maxProfit(int[] prices, int n) {
// if (n == 0) {
// return 0; // Agar prices array empty hai, profit 0 return karenge.
// }

// int[] left = new int[n]; // First pass ke liye: Day 0 se day i tak ka max
// profit.
// int[] right = new int[n]; // Second pass ke liye: Day i se last day tak ka
// max profit.

// // **First Pass: Left to Right (Best Time to Buy Stock)**
// int minPrice = prices[0]; // Sabse pehla price ko minimum assume karte hain.
// for (int i = 1; i < n; i++) {
// // Agar current price kam hai, minimum update karenge.
// minPrice = Math.min(minPrice, prices[i]);

// // Current profit calculate karte hain aur left[i] me max store karte hain.
// left[i] = Math.max(left[i - 1], prices[i] - minPrice);
// }

// // **Second Pass: Right to Left (Best Time to Sell Stock)**
// int maxPrice = prices[n - 1]; // Sabse last price ko maximum assume karte
// hain.
// for (int i = n - 2; i >= 0; i--) {
// // Agar current price zyada hai, maximum update karenge.
// maxPrice = Math.max(maxPrice, prices[i]);

// // Current profit calculate karte hain aur right[i] me max store karte hain.
// right[i] = Math.max(right[i + 1], maxPrice - prices[i]);
// }

// // **Combine Results: Find Maximum Profit Across Two Transactions**
// int maxProfit = 0;
// for (int i = 0; i < n; i++) {
// // Dono passes ke results combine karke maximum profit find karte hain.
// maxProfit = Math.max(maxProfit, left[i] + right[i]);
// }

// return maxProfit; // Maximum achievable profit return karte hain.
// }

// public static void main(String[] args) {
// int prices[] = { 3, 3, 5, 0, 0, 3, 1, 4 }; // Stock prices for each day.
// int n = prices.length;

// // Function call to find max profit.
// int result = maxProfit(prices, n);
// System.out.println("Maximum Profit with Two Transactions: " + result);
// }
// }

// Another Mehotd

// class array_Question {
// public static int maxProfit(int[] prices, int n) {
// if (n == 0) // Agar array empty hai, to profit 0 hoga.
// return 0;

// int[] left = new int[n]; // `left[i]` maximum profit store karega day 0 se
// day `i` tak.
// int[] right = new int[n]; // `right[i]` maximum profit store karega day `i`
// se last day tak.

// // **Left to Right Traversal**: Har day ke liye max profit calculate karenge
// assuming buy aur sell allowed hai 0 se `i` tak.
// int min = prices[0]; // Minimum price ko initialize karte hain.
// for (int i = 1; i < n; i++) {
// // Agar current price `prices[i]` minimum hai, to min update karenge.
// if (prices[i] < min) {
// min = prices[i];
// }

// // Current profit calculate karte hain.
// int profit = prices[i] - min;

// // `left[i]` me max profit store karenge (current profit ya previous profit).
// left[i] = Math.max(left[i - 1], profit);
// }

// // **Right to Left Traversal**: Har day ke liye max profit calculate karenge
// assuming buy aur sell allowed hai `i` se last day tak.
// int max = prices[n - 1]; // Maximum price ko initialize karte hain.
// for (int i = n - 2; i >= 0; i--) {
// // Agar current price `prices[i]` maximum hai, to max update karenge.
// if (prices[i] > max) {
// max = prices[i];
// }

// // Current profit calculate karte hain.
// int profit = max - prices[i];

// // `right[i]` me max profit store karenge (current profit ya next profit).
// right[i] = Math.max(right[i + 1], profit);
// }

// // **Max Profit Calculation**: Dono arrays ka sum lete hain aur max profit
// find karte hain.
// int maxProfit = 0;
// for (int i = 0; i < n; i++) {
// maxProfit = Math.max(maxProfit, left[i] + right[i]);
// }

// return maxProfit; // Maximum achievable profit return karte hain.
// }

// public static void main(String[] args) {
// int prices[] = { 7, 8, 1, 9, 6, 4 }; // Prices ka array
// int n = prices.length;
// int result = maxProfit(prices, n); // Function call
// System.out.println("Maximum Profit: " + result); // Result print
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q.18 Array find all pairs on integer array whose sum is equal to given number

// public class array_Question {

// public static int pair(int arr[], int k){
// int count =0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i+1; j < arr.length; j++) {
// if(arr[i]+arr[j]==k){
// count++;

// }

// }

// }
// return count ;
// }

// public static void main(String[] args) {
// int arr[]={1,5,7,1};
// int k = 6;
// System.out.println(pair(arr, k));
// }
// }
// --------------------------Another Method-------------------------------

// import java.util.*;
// import java.io.*;

// public class array_Question {

// public static int pairSum(int arr[], int n, int target) {
// int start = 0;
// int end = n - 1;
// int count = 0;

// while (start < end) {
// if (arr[start] + arr[end] == target) {
// count++;
// start++;
// } else if (arr[start] + arr[end] > target) {
// end--;
// } else {
// start++;
// }
// }

// if (count == 0) {
// return -1;
// }
// return count;
// }

// public static void main(String[] args) {
// int arr[] = {1, 5, 7, 1};
// int target = 6;

// // Ensure the array is sorted
// Arrays.sort(arr);

// // Call pairSum and print the result
// int result = pairSum(arr, arr.length, target);
// if (result != -1) {
// System.out.println("Number of pairs with the given target sum: " + result);
// } else {
// System.out.println("No pairs found with the given target sum.");
// }
// }
// }

// // ---------------------- Another Method-----------------------------------

// import java.util.*;
// import java.io.*;

// public class array_Question {

// public static int pairSum(int arr[], int n, int target) {
// HashMap<Integer, Integer> map = new HashMap<>();
// int count = 0;

// for (int i = 0; i < arr.length; i++) {
// map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

// int x = target - arr[i];
// if (map.containsKey(x)) { // Check if x is present in the map
// count++; // Add the count of x to the answer
// // count = map.get(x);
// }

// }

// // If no pairs were found, return -1
// return count > 0 ? count : -1;
// }

// public static void main(String[] args) {
// int arr[] = { 1, 5, 7, 1 };
// int target = 6;

// // Call the pairSum function and print the result
// int result = pairSum(arr, arr.length, target);
// if (result != -1) {
// System.out.println("Number of pairs with the given target sum: " + result);
// } else {
// System.out.println("No pairs found with the given target sum.");
// }
// }
// }

// import java.util.*;
// import java.io.*;

// public class array_Question {

// public static int pairSum(int arr[], int n, int target) {
// HashMap<Integer, Integer> map = new HashMap<>();
// int count = 0;

// for (int i = 0; i < arr.length; i++) {
// map.put(arr[i]);

// int x = target - arr[i];
// if (map.containsKey(x)) { // Check if x is present in the map
// count++; // Add the count of x to the answer
// // count = map.get(x);
// }

// }

// // If no pairs were found, return -1
// return count > 0 ? count : -1;
// }

// public static void main(String[] args) {
// int arr[] = { 1, 5, 7, 1 };
// int target = 6;

// // Call the pairSum function and print the result
// int result = pairSum(arr, arr.length, target);
// if (result != -1) {
// System.out.println("Number of pairs with the given target sum: " + result);
// } else {
// System.out.println("No pairs found with the given target sum.");
// }
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// // Q.19 Array find common elements In 3 sorted arrays <->

// public class array_Question {
// static void common(int arr1[], int arr2[], int arr3[]) {
// int i = 0;
// int j = 0;
// int k = 0;

// while (i < arr1.length && j < arr2.length && k < arr3.length) {
// if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
// System.out.println(arr1[i]);
// i++;
// j++;
// k++;
// } else if (arr1[i] < arr2[j]) {
// i++;
// } else if (arr2[j] < arr3[k]) {
// j++;
// } else {
// k++;
// }
// }
// }

// public static void main(String[] args) {
// int arr1[] = {1, 2, 5, 10, 20, 40, 80};
// int arr2[] = {6, 7, 20, 80, 100};
// int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
// common(arr1, arr2, arr3);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// // Q.5 Move all the negative elements to one side of the array

// public class array_Question{
// public static void rearrange(int arr[]) {
// int n = arr.length;
// int i = 0;
// int j = n - 1;

// while (i < j) {
// if (arr[i] > 0) {
// i++;
// } else if (arr[j] < 0) {
// j--;
// } else {
// swap(arr, i, j);
// i++;
// j--;
// }
// }

// // Print the rearranged array
// for (int k = 0; k < arr.length; k++) {
// System.out.print(arr[k] + " ");
// }
// }

// public static void swap(int arr[], int start, int end) {
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// }

// public static void main(String[] args) {
// int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
// rearrange(arr);
// }
// }

// -------------------------------------- Another method
// ------------------------------

// public class array_Question {
// public static void main(String[] args) {
// int arr[] = {12, 23, -22, -12, -2, 22, -45, 29};
// int temp[] = new int[arr.length];

// int j = 0;

// // Copy positive numbers to temp
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > 0) {
// temp[j++] = arr[i];
// }
// }

// // Copy negative numbers to temp
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < 0) {
// temp[j++] = arr[i];
// }
// }

// // Print the result
// for (int i = 0; i < temp.length; i++) {
// System.out.print(temp[i] + " ");
// }
// }
// }

// ----------------------------------------------------------------------------------

// Q.20 Array Rearrange the array in alternating positive and negative items
// with O(1) extra space .<->

// public class array_Question {

// public static void rearrange(int arr[]) {
// int n = arr.length;
// int i = 0;
// int j = n - 1;

// while (i < j) {
// if (arr[i] > 0) {
// i++;
// } else if (arr[j] < 0) {
// j--;
// } else {
// swap(arr, i, j);
// i++;
// j--;
// }
// }

// // Alternating the positive and negative elements
// int k = 0;

// while (k < n && i < n) { // Initially, k starts at the beginning of the
// array(0), and i starts where the
// // positives begin.
// swap(arr, k, i); // So, the swap function alternates a positive number with a
// negative number,
// // starting from index 0.
// i = i + 1;
// k = k + 2;
// }

// // Print the rearranged array
// for (k = 0; k < arr.length; k++) {
// System.out.print(arr[k] + " ");
// }
// }

// public static void swap(int arr[], int start, int end) {
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// }

// public static void main(String[] args) {
// int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
// rearrange(arr);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.21 Find If There Is Any Sub Array With Sum Equal To 0

// import java.util.HashSet;

// public class array_Question {
// static boolean hasSubarraySumZero(int arr[]) {
// // Use a HashSet to store prefix sums
// HashSet<Integer> prefixSums = new HashSet<>();
// int sum = 0;

// for (int num : arr) {
// sum += num;

// // If the prefix sum is 0 or has been seen before, a subarray with sum 0
// exists
// if (sum == 0 || prefixSums.contains(sum)) {
// return true;
// }

// // Add the current prefix sum to the HashSet
// prefixSums.add(sum);
// }

// // No subarray with sum 0 found
// return false;
// }

// public static void main(String[] args) {
// int arr[] = {4, 2, 1, -1, 6};
// boolean result = hasSubarraySumZero(arr);

// if (result) {
// System.out.println("Subarray with sum 0 exists.");
// } else {
// System.out.println("No subarray with sum 0 found.");
// }
// }
// }

// Another Mehtod

// public class array_Question {
// public static int findSubarrayWithSum(int arr[], int target) {
// // Traverse the array to find subarrays
// for (int i = 0; i < arr.length; i++) {
// int sum = 0; // Initialize sum of the current subarray
// for (int j = i; j < arr.length; j++) {
// sum = arr[i] + arr[j]; // Add the current element to the sum

// // Check if the current subarray sum equals the target
// if (sum == target) {
// return 1; // Return 1 if subarray with the desired sum is found
// }
// }
// }
// return -1; // Return -1 if no such subarray is found
// }

// public static void main(String[] args) {
// // int arr[] = {4, 2, 1,-1, 6}; // Input array
// int arr[] = { 4, 2, 1, -1, 6 }; // Input array
// int targetSum = 0; // Desired sum to find
// int result = findSubarrayWithSum(arr, targetSum); // Call the function

// // Check the result and print the appropriate message
// if (result == 1) {
// System.out.println("Subarray with sum " + targetSum + " found.");
// } else {
// System.out.println("No subarray with sum " + targetSum + " found.");
// }
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// 22 . Array Find factorial of a large number <->

// Another method

// public class array_Question {

// public static int factorial(int x){
// int sum =1;
// for (int i = 1; i <=x; i++) {
// sum = sum*i ;

// }
// return sum ;
// }

// public static void main(String[] args) {
// int x = 5 ;

// System.out.println(factorial(x));

// }
// }

// BigInteger: BigInteger is a class in Java that belongs to the java.math
// package.
// It is used for representing arbitrary-precision integers.
// This means it can handle integers of any size, limited only by the available
// memory.

// ============ Normal factorial

// import java.math.BigInteger;
// public class array_Question {

// public static void main(String[] args) {
// BigInteger result = BigInteger.ONE;
// int n = 20;

// for (int i = 1; i <= n; i++) {
// result = result.multiply(BigInteger.valueOf(i));
// }

// System.out.println(result);
// }
// }

// Another method
// return as an arrayList

// --------------------------------------------------------------------------------------------------------------------//

// Q.23 Array find maximum product subarray == kadane's algorithm

// public class array_Question {

// public static void main(String[] args) {
// int product=1 ;
// int maxproduct =0 ;
// int arr[]={1,2,-3,4,5,6};
// for (int i = 0; i < arr.length; i++) {

// if(product>=0){
// product = arr[i] * product ;
// }
// else if(product<0){
// product= arr[i];
// }
// if (product>maxproduct){
// maxproduct = product ;
// }

// }
// System.out.println(maxproduct);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.24 Array Find longest coinsecutive subsequence. <->

// import java.util.Arrays;

// public class array_Question {
// static int consecutive(int arr[]){

// int count = 0 ;
// Arrays.sort(arr);

// for (int i = 1; i < arr.length; i++) {
// if(arr[i]== arr[i-1]+1){
// count++ ;
// }
// }

// return count;
// }

// public static void main(String[] args) {
// int arr[]={8,6,9,4,5,3}; // 2,3,4,5,6 = 5
// int result = consecutive(arr);
// System.out.println(result);

// }
// }

// Another method

// import java.util.HashSet;
// public class array_Question {
// public static int consecutive(int arr[]) {
// HashSet<Integer> hs = new HashSet<>();

// for (int i = 0; i < arr.length; i++) {
// hs.add(arr[i]);
// }

// int ans = 0;

// for (int i = 0; i < arr.length; i++) {
// if (!hs.contains(arr[i] - 1)) {
// int count = 1;
// while (hs.contains(arr[i] + count)) {
// count++;
// }
// ans = Math.max(ans, count);
// }
// }

// return ans;
// }

// public static void main(String[] args) {
// int arr[] = {2, 6, 1, 9, 4, 5, 3};
// int n = arr.length;
// int x = consecutive(arr);
// System.out.println(x);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//

// Q.25 Given an array of size n and a number k, find all elements that appear
// more than " n/k " times. int arr[] = {1, 1, 2, 2, 3, 2, 2, 3, 1, 1, 1, 3, 5,
// 4,8,9,2,2};

// import java.util.HashMap;

// public class array_Question {

// public static int findElements(int arr[], int n, int threshold){
// HashMap<Integer, Integer> hs = new HashMap<>();

// for (int i = 0; i < arr.length; i++) {
// hs.put(arr[i],hs.getOrDefault(arr[i],0)+1) ; // For each element, it either
// // adds the element to the map (if it's not already present) with an initial
// // count of 1 or increments its existing count by 1.

// }
// int ans =0;
// int count =0;
// for(int x:hs.keySet()) // keySet(): This method returns a set of all the keys
// present in the map. This set can be iterated over to access each key in the
// map.
// if(hs.get(x)>threshold){
// count++;
// }
// return count;
// }

// public static void main(String[] args) {
// int arr[] = {1, 1, 2, 2, 3, 2, 2, 3, 1, 1, 1, 3, 4,8,9,2,2}; // Example array
// int n = arr.length;
// int k =4;
// int threshold = n/k ;
// int y = findElements(arr, n, threshold);
// System.out.println(y);
// }
// }

// Another Mehtod

// import java.util.*;
// public class array_Question {

// // Function to find all elements in array that appear more than n/k times
// public static void findElements(int[] arr, int k) {
// int n = arr.length;
// int threshold = n / k; // Calculate n/k

// // Sort the array to bring duplicates together
// Arrays.sort(arr);

// // Initialize variables to track the current element and its frequency
// int count = 1; // Start counting from 1 since each element appears at least
// once

// // Traverse the sorted array
// for (int i = 1; i < n; i++) {
// // Check if the current element is the same as the previous one
// if (arr[i] == arr[i - 1]) {
// count++; // Increment count if it's the same element
// } else {
// // Check if the count of the previous element is more than the threshold
// if (count > threshold) {
// System.out.println(arr[i - 1] + " appears more than " + threshold +
// "times.");
// }
// // Reset count for the new element
// count = 1;
// }
// }

// // Check for the last element after the loop
// if (count > threshold) {
// System.out.println(arr[n - 1] + " appears more than " + threshold +
// "times.");
// }
// }

// public static void main(String[] args) {
// int[] arr = {3, 1, 2, 2, 1, 2, 3, 3}; // Example array
// int k = 4; // Example value for k

// // Call the function to find elements that appear more than n/k times
// findElements(arr, k);
// }
// }

// ------------------------------------------------------------------------------------------------
// Q.25.1 Frequency of each element in an array using hashMap

// import java.util.HashMap;

// public class array_Question {

// public static void frequency(int arr[], int n) {
// HashMap<Integer, Integer> hs = new HashMap<>();

// // Count occurrences of each element
// for (int i = 0; i < arr.length; i++) {
// hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
// }

// // Print elements along with their frequencies
// for (int x : hs.keySet()) {
// System.out.println("Element: " + x + ", Frequency: " + hs.get(x));
// }
// }

// public static void main(String[] args) {
// int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
// int n = arr.length;
// frequency(arr, n);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q.26 Array Maximum profit by buying and selling a share atmost twice ;

// already done at question number 17.2

// --------------------------------------------------------------------------------------------------------------------//
// Q.27 Array Find whether an array is a subset of another array
// Check Subset

// import java.util.HashSet;
// public class array_Question {

// public static boolean isSubset(int arr1[], int arr2[]){
// HashSet<Integer> hs = new HashSet<>();
// for (int i = 0; i < arr1.length; i++) { // // Step 1: Add all elements of
// arr1 to the set
// hs.add(arr1[i]);

// }
// // Step 2: Check if all elements of arr2 are in the set
// for (int i = 0; i < arr2.length; i++) {
// if(!hs.contains(arr2[i])){ // The loop iterates through each element of arr2
// to check whether each element exists in the HashSet hs.
// return false ;
// }

// }
// return true ;

// }

// public static void main(String[] args) {
// int[] arr1 = {11, 1, 13, 21, 3, 7};
// int[] arr2 = {11, 3, 7, 7};

// if (isSubset(arr1, arr2)) {
// System.out.println("arr2 is a subset of arr1");
// } else {
// System.out.println("arr2 is not a subset of arr1");
// }
// }
// }

// Another Method

// import java.util.HashMap;

// public class array_Question {

// public static boolean isSubset(int[] arr1, int[] arr2) {
// HashMap<Integer, Integer> elementCount = new HashMap<>();

// // Count occurrences of each element in arr1
// for (int num : arr1) {
// elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
// }

// // Check if each element in arr2 exists in arr1 with sufficient count
// for (int num : arr2) {
// if (!elementCount.containsKey(num) || elementCount.get(num) <= 0) {
// return false; // Element not found or insufficient count
// }
// elementCount.put(num, elementCount.get(num) - 1); // Decrement count
// }

// return true; // All elements of arr2 are in arr1
// }

// public static void main(String[] args) {
// int[] arr1 = {11, 1, 13, 21, 3, 7};
// int[] arr2 = {11, 3, 7, 7};

// if (isSubset(arr1, arr2)) {
// System.out.println("arr2 is a subset of arr1");
// } else {
// System.out.println("arr2 is NOT a subset of arr1");
// }
// }
// }

// //
// --------------------------------------------------------------------------------------------------------------------//
// Q.28 Array Find the triplet that sum to a given value.

// import java.util.Arrays;
// public class array_Question {
// public static boolean findTriplet(int[] arr, int sum) {
// Arrays.sort(arr); // Step 1: Sort the array
// int n = arr.length;

// // Step 2: Iterate over the array and fix the first element
// for (int i = 1; i < n - 2; i++) {
// int left = i; // Left pointer
// int right = n - 1; // Right pointer

// // Step 3: Use two-pointer technique for the remaining two elements
// while (left < right) {
// int currentSum = arr[i] + arr[left] + arr[right];

// if (currentSum == sum) {
// System.out.println("Triplet Found: " + arr[i] + ", " + arr[left] + ",
// "+arr[right]);
// return true;
// }

// if (currentSum < sum) {
// left++; // Move left pointer to the right to increase the sum
// } else {
// right--; // Move right pointer to the left to decrease the sum
// }
// }
// }
// return false; // No triplet found
// }

// public static void main(String[] args) {
// int[] arr = {12,11,1, 3, 4, 1, 6, 9,9};
// int sum = 24;
// if (!findTriplet(arr, sum)) {
// System.out.println("No triplet found");
// }
// }
// }

// ------------------------------------------------------------------------------------------------------
// Q. 28.1 Smaller Than Triplet Sum

// import java.util.*;
// public class array_Question {
// // Function to find the count of triplets with sum smaller than the target
// public static int threeSumSmaller(int n, int[] arr, int target) {
// Arrays.sort(arr); // Step 1: Sort the array
// int count = 0;

// // Step 2: Fix the first element
// for (int i = 0; i < n - 2; i++) {
// int left = i + 1;
// int right = n - 1;

// // Step 3: Use the two-pointer technique for the remaining two elements
// while (left < right) {
// int currentSum = arr[i] + arr[left] + arr[right];

// // If the sum of the triplet is less than the target
// if (currentSum < target) {
// // All elements between left and right pointers will be valid
// count = count + (right - left);
// left++;
// } else {
// right--;
// }
// }
// }
// return count;
// }

// public static void main(String[] args) {
// int[] arr = {12, 3, 4, 1, 6, 9}; // Example array
// int target = 24; // Target sum
// int n = arr.length; // Length of the array

// // Calling the threeSumSmaller method and printing the result
// int result = threeSumSmaller(n, arr, target);
// System.out.println("Number of triplets with sum smaller than the target: " +
// result);
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q. 29 Array Trapping Rain water problem .

// public class array_Question {
// // Method to calculate the amount of trapped water
// public static long getTrappedWater(long[] arr, int n) {
// long left[] = new long[n]; // Array to store the maximum height to the left
// of each element
// long right[] = new long[n]; // Array to store the maximum height to the right
// of each element

// left[0] = arr[0];
// for (int i = 1; i < n; i++) {
// left[i] = Math.max(left[i - 1], arr[i]); // Fill left array
// }

// right[n - 1] = arr[n - 1];
// for (int i = n - 2; i >= 0; i--) {
// right[i] = Math.max(right[i + 1], arr[i]); // Fill right array
// }

// long ans = 0; // Initialize answer variable
// for (int i = 0; i < n; i++) {
// ans += (Math.min(left[i], right[i]) - arr[i]); // Calculate trapped water at
// each position
// }

// return ans;
// }

// // Main method to test the getTrappedWater function
// public static void main(String[] args) {
// long[] arr = {3, 1,2,4,0,1,3,2}; // Sample input array
// int n = arr.length; // Length of the array

// long result = getTrappedWater(arr, n); // Call the method
// System.out.println("The amount of trapped water is: " + result); // Display
// the result
// }
// }

// Another Method

// time complexity = 0(n^2)

// public class array_Question {

// static int trap(int arr[]){
// int result= 0;
// for (int i = 1; i <= arr.length-2; i++) {

// int lb =arr[i];
// for (int j = 0; j <= i-1; j++) {
// if(arr[j]> lb){
// lb= arr[j];
// }

// }
// int rb =arr[i];
// for (int j = i+1; j < arr.length; j++) {
// if(arr[j]> rb){
// rb= arr[j];
// }

// }

// int wl ;
// if(rb>lb){
// wl =lb;
// }
// else{
// wl=rb ;
// }

// int tw ;
// tw = wl -arr[i];
// result = result + tw ;

// }
// return result ;
// }

// public static void main(String[] args) {
// int arr[]={4,2,0,3,2,5};
// System.out.println(trap(arr));

// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q.30 Array Chocolate Distribution problem .

// import java.util.Arrays;
// public class array_Question {
// public static int chocolate(int arr[], int m, int n) {
// Arrays.sort(arr);

// int min = Integer.MAX_VALUE;
// for (int i = 0; i< n- m + 1 ; i++) {
// int diff = arr[i + m - 1] - arr[i];
// if (diff < min)
// min = diff;
// }
// return min;
// }

// public static void main(String[] args) {
// int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
// int n = arr.length;
// int m = 5;
// System.out.println(chocolate(arr, m, n));
// }
// }

// Another Method

// import java.util.ArrayList;
// import java.util.Collections;

// public class array_Question {
// static int findMinDiff(int n, int m, ArrayList<Integer> chocolates) {
// Collections.sort(chocolates);
// int ans = Integer.MAX_VALUE;

// for (int i = 0; i <= n - m; i++) {
// int minElement = chocolates.get(i);
// int maxElement = chocolates.get(i + m - 1);
// ans = Math.min(ans, maxElement - minElement);
// }

// return ans;
// }
// }

// //
// --------------------------------------------------------------------------------------------------------------------//
// Q.31 Array Smallest Subarray with sum greater than a given value .
// Rahul And Minimum Subarray
// Example: Given an ‘ARR’: [1, 2, 21, 7, 6, 12] and a number ‘X’: 23. The
// length of the smallest subarray is 2 as the subarray is [21,7].

// public class array_Question {
// public static int subArray(int arr[], int n, int x){
// int right = 0;
// int left = 0;
// int ans = n+1 ;
// int window = 0;
// for ( right = 0; right < arr.length; right++) {
// window= window+arr[right];
// while (window>x) {
// ans = Math.min(ans,right-left+1);
// window = window - arr[left];
// left++;

// }
// }
// return ans ;
// }

// public static void main(String[] args) {
// int arr[]={1, 2, 21, 7, 6, 12};
// int x =23 ;
// int n = arr.length;
// System.out.println(subArray(arr, n, x));
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q.32 Array Three way partitioning of an array around a given value .
// Partioning of array around given value

// public class array_Question {
// // Method to partition the array based on the given range [a, b]
// public static void partitioning(int arr[], int n) {
// int a = 3; // Lower bound of the range
// int b = 5; // Upper bound of the range
// int left = 0; // Pointer to the left side for elements < a
// int right = n - 1; // Pointer to the right side for elements > b
// int i = 0; // Current index

// while (i <= right) {
// if (arr[i] < a) {
// // Element is less than 'a', move it to the left part
// swap(arr, i, left);
// left++;
// i++;
// } else if (arr[i] > b) {
// // Element is greater than 'b', move it to the right part
// swap(arr, i, right);
// right--;
// } else {
// // Element is in the range [a, b], leave it in place
// i++;
// }
// }
// }

// // Method to swap two elements in the array
// public static void swap(int arr[], int left, int right) {
// int temp = arr[left];
// arr[left] = arr[right];
// arr[right] = temp;
// }

// // Main method to test the partitioning function
// public static void main(String[] args) {
// int arr[] = {5, 7, 1, 4, 6, 3}; // Sample input array
// int n = arr.length; // Length of the array

// // Call the partitioning method
// partitioning(arr, n);

// // Print the array after partitioning
// System.out.println("Array after partitioning:");
// for (int num : arr) {
// System.out.print(num + " ");
// }
// }
// }

// //
// --------------------------------------------------------------------------------------------------------------------//
// Q.33 Array Minimum swaps required bring elements less equal K together .
// Minimum swaps to bring good elements together

// public class array_Question {
// public static int minSwap(int[] arr, int n, int k) {
// int count = 0;
// // finding No of Gud values or you can say finding the size of sliding window
// for (int i = 0; i < n; i++) {
// if (arr[i] <= k) {
// count++; // Gud elemnts // 3 // Gud values = sliding window size
// }
// }
// // counting the bad vlaues in first size of sliding window
// int bad = 0;
// for (int i = 0; i < count; i++) {
// if (arr[i] > k) {
// bad++; // 1
// }
// }

// int ans = bad; // 1

// int j = 0; //1,
// for (int i = count; i < n; i++) { //i=3,4
// if (arr[i] > k) { // yahha pe bad elemnt aage waala found kara
// bad++; // 2
// }

// if (arr[j] > k) { // phle wala check kara
// bad--; // 1
// }
// j++;
// ans = Math.min(ans, bad);
// }

// return ans;
// }

// public static void main(String[] args) {
// int[] arr = {2,6, 5, 6, 1,3};
// // int[] arr = {1,2,5,3,7};
// int k = 3;
// int n = arr.length;
// System.out.println(minSwap(arr, n, k));
// }
// }

//
// --------------------------------------------------------------------------------------------------------------------//
// Q.34 Array Minimum no. of operations required to make an array palindrome .

// public class array_Question {
// public static int converison(int arr[], int n){
// int i=0;
// int j =n-1;
// int operations =0;
// while (i<j) {
// if(arr[i]==arr[j]){
// i++;
// j--;
// }
// else if(arr[i]<arr[j]){
// arr[i+1] = arr[i+1] +arr[i] ;
// i++;
// operations++;
// }
// else{
// arr[j-1] = arr[j-1] + arr[j];
// j--;
// operations++;
// }

// }
// return operations;
// }

// public static void main(String[] args) {
// int[] arr = {4,3,7,1};
// // int[] arr = {1,4,5,9,1};
// // int[] arr = {1,2,3,4,3,2,1};
// int n = arr.length;
// System.out.println(converison(arr, n));
// }
// }

// ------------------ Another Method

// import java.util.Arrays;

// public class array_Question {
// public static int minOperations(int[] arr) {
// int n = arr.length;
// int left = 0, right = n - 1;
// int operations = 0;

// while (left <= right) {
// if (arr[left] == arr[right]) {
// left++;
// right--;
// } else {
// if (arr[left] < arr[right]) {
// arr[left + 1] = arr[left + 1]+ arr[left];
// left++;
// } else {
// arr[right - 1] = arr[right - 1] + arr[right];
// right--;
// }
// operations++;
// }
// }

// return operations;
// }

// public static void main(String[] args) {
// // int[] arr = {4,3,7,1};
// int[] arr = {1,4,5,9,1};
// // int[] arr = {1,2,3,4,3,2,1};

// int operations = minOperations(arr);
// System.out.println("Minimum operations: " + operations);
// }
// }

// //
// --------------------------------------------------------------------------------------------------------------------//
// Q.35 Array Median of 2 sorted arrays of equal size
// Q.35 Find the median of all subarrays of a particular size k .

// public class array_Question {
// // Method to find the median of every subarray of size k
// public static double[] findMedianOfSubarrays(int arr[], int n, int k) {
// double[] medians = new double[n-k+1]; // Array to store medians of each
// subarray
// int index = 0; // Index to track the medians array

// // Iterate through each subarray of size k
// for (int i = 0; i < n-k+1; i++) {
// int[] subArray = new int[k]; // Temporary array to store current subarray
// int subIndex = 0; // Index for the subarray

// // Copy elements from the main array to the subarray
// for (int j = i; j < i + k; j++) {
// subArray[subIndex++] = arr[j];
// }

// // Sort the subarray to find the median
// java.util.Arrays.sort(subArray);

// double median;
// // Calculate the median for the sorted subarray
// if (k % 2 == 0) {
// median = (subArray[k / 2] + subArray[k / 2 - 1]) / 2.0;
// } else {
// median = subArray[k / 2];
// }

// medians[index++] = median; // Store the median in the medians array
// }

// return medians; // Return all medians
// }

// public static void main(String[] args) {
// int arr[] = {1, 4, 3, 5, 6}; // Input array
// int n = arr.length; // Length of the array
// int k = 2; // Size of the subarray

// // Get the medians of each subarray and print them
// double[] medians = findMedianOfSubarrays(arr, n, k);
// System.out.println("Medians of subarrays of size " + k + ":");
// for (double median : medians) {
// System.out.println(median);
// }
// }
// }

// --------------------------------------------------------------------------------------------------------------------//
// Q.36 Array Median of 2 sorted arrays of different size.
// method of Sorting and finding Median

// time complexity = O(m+n)

// public class array_Question {
// public static void sorted(int arr1[], int arr2[], int m, int n) {
// int temp[] = new int[m + n];
// int i = 0, j = 0, k = 0;

// // Merge arrays
// while (i < m && j < n) {
// if (arr1[i] < arr2[j]) {
// temp[k++] = arr1[i++];
// } else {
// temp[k++] = arr2[j++];
// }
// }

// // Copy remaining elements of arr1[] if any
// while (i < m) {
// temp[k++] = arr1[i++];
// }

// // Copy remaining elements of arr2[] if any
// while (j < n) {
// temp[k++] = arr2[j++];
// }

// // Print the merged array
// System.out.print("Merged array: ");
// for (int l = 0; l < temp.length; l++) {
// System.out.print(temp[l] + " ");
// }
// System.out.println();

// // Find and print the median
// double median;
// int totalLength = m + n;
// if (totalLength % 2 == 0) {
// median = (temp[totalLength / 2 - 1] + temp[totalLength / 2]) / 2.0;
// } else {
// median = temp[totalLength / 2];
// }
// System.out.println("Median: " + median);
// }

// public static void main(String[] args) {
// int arr1[] = {1, 5, 9};
// int arr2[] = {2, 3, 6, 7,10};
// int m = arr1.length;
// int n = arr2.length;

// sorted(arr1, arr2, m, n);
// }
// }

// //
// --------------------------------------------------------------------------------------------------------------------//

// Sliding window Problem