
// Java implementation of iterative Linear Search

// public class Linear_search {
//     public static void main(String[] args) {
// int arr[]={9,2,12,24,6,7,19};
// int n = arr.length ;
// int x =112;

//         int count =0;
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==x){
//                 System.out.println("element "+ x  + " found at index: "+ i);
//                 count++;
//             }
//         }
// if(count ==0){
//     System.out.println("Element not found in array");

// }

//     }

// }

// public class Linear_search {

//     public static int Linear_search(int arr[], int x){

//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==x){
//                 System.out.println("element "+ x  + " found at index: "+ i);
//                return i ;
//             }
//         }
//   return -1;

//     }
//     public static void main(String[] args) {
//         int arr[]={9,2,12,24,6,7,19};
//         int n = arr.length ;
//         int x =112;
//         int index = Linear_search(arr, x);
//     if (index != -1) {
//         System.out.println("Element found at index: " + index);
//     } else {
//         System.out.println("Element not found");
//     }  
// }
// }

// -----------------------------------------------------------------------------------------------------------

// Java implementation of iterative Binary Search

// import java.io.*;

// class BinarySearch {

//     // Returns index of x if it is present in arr[].
//     int binarySearch(int arr[], int x)
//     {
//         int low = 0, high = arr.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             // Check if x is present at mid
//             if (arr[mid] == x)
//                 return mid;

//             // If x greater, ignore left half
//             if (arr[mid] < x)
//                 low = mid + 1;

//             // If x is smaller, ignore right half
//             else
//                 high = mid - 1;
//         }

//         // If we reach here, then element was
//         // not present
//         return -1;
//     }

//     // Driver code
//     public static void main(String args[])
//     {
//         BinarySearch ob = new BinarySearch();
//         int arr[] = { 2, 3, 4, 10, 40 };
//         int n = arr.length;
//         int x = 10;
//         int result = ob.binarySearch(arr, x);
//         if (result == -1)
//             System.out.println(
//                 "Element is not present in array");
//         else
//             System.out.println("Element is present at "
//                                + "index " + result);
//     }
// }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// BINARY Search 
// public class ss_Question {
//     static int Lower(int arr[], int key){
//         int low =0 ;
//         int high = arr.length-1 ;
//         while ( low<= high) {
//             int mid = (low + high)/2  ;

//             if(key==arr[mid]){
//                 return mid ;
//             }

//             else if(key>arr[mid]){
//                 low =mid+1 ;

//             }
//             else if (arr[mid]>key){
//                 high = mid-1 ;
//             }

//         }
//         return -1 ;
//     }

//     public static void main(String[] args) {
//         int arr[]={2,4,7,7,7,9,8,12,};
//         int key =7;
//         System.out.println(Lower(arr, key));
//     }
// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Modification of Binary Search
// Lower Bound 
// Time Complexity: O(log n)
// Space Complexity: O(1)

// import java.io.*;
// import java.util.*;                          
// import java.util.Scanner ;

// class ss_Question {

//     // function definition
//     public static int findFirstOccurence(int[] arr, int target){
//         int low=0, high=arr.length-1;
//         int result = -1;

//         while(low <= high){
//             //to avoid overflow
//             int mid = low + (high - low)/2;
//             if(arr[mid] == target){
//                 result = mid;
//                 // traverse to the left side of an array
//                 high = mid - 1;
//             }

//             else if(arr[mid] > target){
//                 high = mid - 1;
//             }

//             else{
//                 low = mid + 1;
//             }
//         }
//         return result;
//     } 
//     public static void main(String[] args) {

// int arr[]={2,4,7,7,7,7,19,29,};
// int target =7;
//         // function calling
//         int result = findFirstOccurence(arr, target);
//         if(result == -1){
//             System.out.println("Target element is not present in an array");
//         }
//         else{
//             System.out.println("Target element first occurence is present at index: "+result);
//         }
// }
// }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Basic sorting technique 

// public class DSA {
//     public static void  Sorting(int arr[], int n){

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[i]>arr[j]){
//                     swap(arr,i,j);
//                 }

//             }

//         }
//     }
//     public static void  swap(int arr[], int i , int j){
//         int temp = arr[i];
//         arr[i]=arr[j];
//         arr[j]= temp;

//     }
//     public static void printArr(int arr[], int n){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={9,2,12,24,6,7,19};
//         int n = arr.length;
//         System.out.println("Array before Bubbble sort : -");
//      printArr(arr, n);

//     Sorting(arr, n);
//     System.out.println();

//         System.out.println("Array After bubble sort : -");
//         printArr(arr, n);
//     }
// }

// -----------------------------------------------------------------------------------------------------------
// Bubble Sort 

// public class Searching_Sortingg {

//     public static void main(String[] args) {
//         int arr[] = { 8, 49, 7, 4, 29, 66 };
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) { // Outer loop for passes
//             for (int j = 0; j < n - 1 - i; j++) { // Inner loop for comparison
//                 // -i just because we will not check the last element
//                 if (arr[j] > arr[j + 1]) {
//                     Swap(arr, j);
//                 }

//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");

//         }

//     }

//     static void Swap(int arr[], int j) {
//         int temp = arr[j];
//         arr[j] = arr[j + 1];
//         arr[j + 1] = temp;

//     }
// }

// // Another Mehtod

// public class Searching_Sortingg {

//     public static void main(String[] args) {
//         int arr[] = { 8, 49, 7, 4, 29, 66 };
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) { // Outer loop for passes
//             int flag = 0;
//             for (int j = 0; j < n - 1 - i; j++) { // Inner loop for comparison
//                 // -i just because we will not check the last element
//                 if (arr[j] > arr[j + 1]) {
//                     Swap(arr, j);
//                     flag = 1;
//                 }

//             }
//             if (flag == 0) {
//                 break;
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");

//         }

//     }

//     static void Swap(int arr[], int j) {
//         int temp = arr[j];
//         arr[j] = arr[j + 1];
//         arr[j + 1] = temp;

//     }
// }

// -----------------------------------------------------------------------------------------------------------
// Selection Sort

// public class SelectionSort {

// public static void main(String[] args) {
// int arr[] = {64, 25, 12, 22, 11};
// int n = arr.length;

// // Selection Sort
// for (int i = 0; i < n - 1; i++) {
// // Assume the first element is the minimum
// int minIndex = i;

// // Find the minimum element in the unsorted part
// for (int j = i + 1; j < n; j++) {
// if (arr[j] < arr[minIndex]) {
// minIndex = j;
// }
// }

// // Swap the found minimum element with the first element of the unsorted part
// int temp = arr[minIndex];
// arr[minIndex] = arr[i];
// arr[i] = temp;
// }

// // Print the sorted array
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// --------------------why this is not working

// public class SelectionSort {

// public static void main(String[] args) {
// int arr[]={64, 25, 12, 22, 11};
// int n=arr.length;
// for (int i = 0; i < arr.length; i++) {
// int min = arr[i];
// for (int j = i+1; j < arr.length; j++) {
// if(arr[j]<arr[min]){
// int temp =arr[min];
// arr[min]=arr[j];
// arr[j]=temp;
// }

// }

// }
// // Print the sorted array
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }

// }
// }
// -----------------------------------------------------------------------------------------------------------
// Insertion Sort "

// public class insertion_sort {
// public static void main(String[] args) {
// int arr[]={12,11,13,5,6};
// for (int i = 1; i < arr.length; i++) {
// int temp = arr[i];
// int j = i;
// while(j>0 && arr[j-1]>temp){
// arr[j]=arr[j-1];
// j--;
// }

// arr[j]=temp ;

// }
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i]+" ");

// }
// }
// }

// Another Mehtod


// Another method  

// public class insertion_sort {

//         public static void main(String[] args) {
//                 int arr[] = { 12, 11, 13, 5, 6 };
//                 for (int i = 1; i < arr.length; i++) {
//                         int j = i;
//                         while (j > 0 && arr[j - 1] > arr[j]) {
//                                 int temp = arr[j];
//                                 arr[j] = arr[j - 1];
//                                 arr[j - 1] = temp;
//                                 j--;
//                         }
//                 }
//                 for (int i = 0; i < arr.length; i++) {
//                         System.out.print(arr[i] + " ");

//                 }
//         }
// }

// Another Mehtod


// -----------------------------------------------------------------------------------------------------------
// Merge Sort "



// public class Searching_Sortingg {
//     // In the Merge_Sort function, the array is recursively divided into smaller
// // subarrays until each subarray contains a single element.
// // Merge Sort function
// public static void Merge_Sort(int arr[], int i, int j) {
// if (i < j) {
// // 1. Divide the array and find the mid
// int mid = i + (j - i) / 2;

// // 2. Sort the left subarray
// Merge_Sort(arr, i, mid);

// // 3. Sort the right subarray
// Merge_Sort(arr, mid + 1, j);

// // 4. Merge the two sorted subarrays
// Merge_Procedure(arr, i, mid, j);
// }
// }

// // Function to merge two sorted subarrays
// public static void Merge_Procedure(int arr[], int i, int mid, int j) {
// // Find sizes of two subarrays to be merged
// int n1 = mid - i + 1;
// int n2 = j - mid;

// // Create temporary arrays
// int left[] = new int[n1];
// int right[] = new int[n2];

// // Copy data to temporary arrays
// for (int x = 0; x < n1; x++)
// left[x] = arr[i+ x];

// for (int y = 0; y < n2; y++)
// right[y] = arr[mid + 1 + y];

// // compariosn between rigth subarray and leftSubarray and merging them

// int x = 0, y = 0;
// int k = i;
// while (x < n1 && y < n2) {
// if (left[x] <= right[y]) {
// arr[k] = left[x];
// x++;
// } else {
// arr[k] = right[y];
// y++;
// }
// k++;
// }

// // Copy remaining elements of left[] if any
// while (x < n1) {
// arr[k] = left[x];
// x++;
// k++;
// }

// // Copy remaining elements of right[] if any
// while (y < n2) {
// arr[k] = right[y];
// y++;
// k++;
// }
// }

// // Function to print the array
// static void printArr(int arr[], int n) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// // Main function to test Merge Sort
// public static void main(String[] args) {
// int arr[] = {50, 20, 40, 99, 88, 11, 13};
// int n = arr.length;

// System.out.println("Array Before Sorting: ");
// printArr(arr, n);

// Merge_Sort(arr, 0, n - 1);

// System.out.println("Array After Sorting: ");
// printArr(arr, n);
// }
// }
// -----------------------------------------------------------------------------------------------------------
// // Quick Sort With pivot element as left element

// public class Searching_Sortingg {

//     // Function to perform Quick Sort
//     public static void quickSortRecuraion(int[] arr, int l, int h) {
//         if (l < h) {
//             // Partition the array and get the pivot index
//             int pivot = partition(arr, l, h);
            
//             // Recursively sort elements before the pivot
//             quickSortRecuraion(arr, l, pivot - 1);
            
//             // Recursively sort elements after the pivot
//             quickSortRecuraion(arr, pivot + 1, h);
//         }
//     }
//     // Function to partition the array and return the pivot index
//     public static int partition(int[] arr, int l, int h) {
//         int pivot = arr[l];  // Choose the pivot as the first element
//         int i = l;           // Start pointer i at the left
//         int j = h;           // Start pointer j at the right

//         while (i < j) {
//             // Move i to the right until you find an element greater than pivot
//             while ( arr[i] <= pivot) i++;

//             // Move j to the left until you find an element smaller than pivot
//             while (arr[j] > pivot) j--;

//             // Swap elements at i and j if i is still less than j
//             if (i < j) {
//                 swap(arr, i, j);
//             }
//         }

//         // Swap the pivot with the element at j
//         swap(arr, j, l);

//         // Return the pivot index
//         return j;
//     }

//     // Function to swap elements in the array
//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     // Function to print the array
//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     // Main function to test the Quick Sort implementation
//     public static void main(String[] args) {
//         int[] arr = {50, 20, 40, 99, 88, 11, 13};
//         int n = arr.length;

//         System.out.println("Array before sorting:");
//         printArray(arr);

//         // Perform Quick Sort
//         quickSortRecuraion(arr, 0, n - 1);

//         System.out.println("Array after sorting:");
//         printArray(arr);
//     }
// }

// Quick Sort With pivot element as middle element

// public class QuickSort {

// // Function to perform Quick Sort
// public static void quickSortRecuraion(int[] arr, int low, int high) {
// if (low < high) {
// // Partition the array and get the pivot index
// int pi = partition(arr, low, high);

// // Recursively sort elements before and after partition
// quickSortRecuraion(arr, low, pi - 1); // Sort the left subarray
//     quickSortRecuraion(arr, pi + 1, high); // Sort the right subarray
// }
// }

// // Function to partition the array
// public static int partition(int[] arr, int low, int high) {
// int pivot = arr[(low + high) / 2]; // Choose the middle element as the pivot

// while (low <= high) {
// // Find an element larger than the pivot from the left
// while (arr[low] < pivot) {
// low++;
// }

// // Find an element smaller than the pivot from the right
// while (arr[high] > pivot) {
// high--;
// }

// // Swap elements if needed
// if (low <= high) {
// int temp = arr[low];
// arr[low] = arr[high];
// arr[high] = temp;

// // Move the pointers
// low++;
// high--;
// }
// }

// return low; // Return the partition point
// }

// // Function to print the array
// public static void printArray(int[] arr) {
// for (int i : arr) {
// System.out.print(i + " ");
// }
// System.out.println();
// }

// // Main function
// public static void main(String[] args) {
// int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
// int n = arr.length;

// System.out.println("Original Array:");
// printArray(arr);

// // Perform Quick Sort
// quickSortRecuraion(arr, 0, n - 1);

// System.out.println("Sorted Array:");
// printArray(arr);
// }
// }




// Quick Sort With pivot element as right element


// public class QuickSort {

//     // Function to perform Quick Sort
//     public static void quickSort(int[] arr, int l, int h) {
//         if (l < h) {
//             // Partition the array and get the pivot index
//             int pivot = partition(arr, l, h);
            
//             // Recursively sort elements before the pivot
//             quickSort(arr, l, pivot - 1);
            
//             // Recursively sort elements after the pivot
//             quickSort(arr, pivot + 1, h);
//         }
//     }

//     // Function to partition the array and return the pivot index
//     public static int partition(int[] arr, int l, int h) {
//         int mid = l + (h - l) / 2;  // Calculate the middle index
//         int pivot = arr[mid];       // Choose the pivot as the middle element

//         // Move the pivot element to the start of the array
//         swap(arr, l, mid);

//         int i = l;                  // Start pointer i at the left
//         int j = h;                  // Start pointer j at the right

//         while (i < j) {
//             // Move i to the right until you find an element greater than pivot
//             while (i < h && arr[i] <= pivot) i++;

//             // Move j to the left until you find an element smaller than pivot
//             while (j > l && arr[j] > pivot) j--;

//             // Swap elements at i and j if i is still less than j
//             if (i < j) {
//                 swap(arr, i, j);
//             }
//         }

//         // Swap the pivot with the element at j
//         swap(arr, j, l);

//         // Return the pivot index
//         return j;
//     }

//     // Function to swap elements in the array
//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     // Function to print the array
//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     // Main function to test the Quick Sort implementation
//     public static void main(String[] args) {
//         int[] arr = {50, 20, 40, 99, 88, 11, 13};
//         int n = arr.length;

//         System.out.println("Array before sorting:");
//         printArray(arr);

//         // Perform Quick Sort
//         quickSort(arr, 0, n - 1);

//         System.out.println("Array after sorting:");
//         printArray(arr);
//     }
// }
// -------------------------------------------------------------------------------------------------------------------
// Count Sort
// public class CountingSort {

//     public static void countingSort(int[] arr) {
//         int n = arr.length;

//         // Find the maximum element in the array
//         int max = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         // Create a count array to store the count of each unique number
//         int[] count = new int[max + 1];

//         // Store the count of each element in the count array
//         for (int i = 0; i < n; i++) {
//             count[arr[i]]++;
//         }

//         // Modify the count array by adding the previous counts to get cumulative positions
//         for (int i = 1; i <= max; i++) {
//             count[i] += count[i - 1];
//         }

//         // Output array to store the sorted array
//         int[] output = new int[n];

//         // Build the output array by placing elements in their correct positions
//         for (int i = n - 1; i >= 0; i--) {
//             output[count[arr[i]] - 1] = arr[i];
//             count[arr[i]]--;
//         }

//         // Copy the sorted elements back to the original array
//         for (int i = 0; i < n; i++) {
//             arr[i] = output[i];
//         }
//     }

//     // Function to print the array
//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 3, 2, 3, 4, 1, 6, 4, 3};

//         System.out.println("Array before sorting:");
//         printArray(arr);

//         countingSort(arr);

//         System.out.println("Array after sorting:");
//         printArray(arr);
//     }
// }

// -------------------------------------------------------------------------------------------------------------------
// Radix Sort / Bucket Sort


// import java.util.Arrays;
// public class Searching_Sortingg {
// // Function to perform counting sort based on the digit represented by exp
// // (1's, 10's, 100's, etc.)
// private static void countingSort(int[] arr, int exp) {
// int n = arr.length;
// int[] output = new int[n]; // Output array to hold sorted numbers
// int[] count = new int[10]; // Array to store the count of occurrences for each digit (0-9)

// // Initialize count array to 0
// Arrays.fill(count, 0);

// // Store the count of occurrences of each digit in the count array
// for (int i = 0; i < n; i++) {
// int digit = (arr[i] / exp) % 10;
// count[digit]++;
// }

// // Change count[i] so that it contains the actual position of the digit in output[]
// for (int i = 1; i < 10; i++) {
// count[i] += count[i - 1];
// }

// // Build the output array
// for (int i = n - 1; i >= 0; i--) {
// int digit = (arr[i] / exp) % 10;
// output[count[digit] - 1] = arr[i];
// count[digit]--;
// }

// // Copy the sorted elements into the original array
// System.arraycopy(output, 0, arr, 0, n);
// }

// // Function to implement Radix Sort
// public static void radixSort(int[] arr) {
// // Find the maximum number to know the number of digits
// int max = Arrays.stream(arr).max().getAsInt();

// // Do counting sort for every digit, starting with the least significant digit
// for (int exp = 1; max / exp > 0; exp *= 10) {
// countingSort(arr, exp);
// }
// }

// public static void main(String[] args) {
// int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
// radixSort(arr);
// System.out.println("Sorted array: " + Arrays.toString(arr));
// }
// }

// Another Method 

// public class SortingAlgorithms {
//     public static void main(String[] args) {
//         int arr[] = {2,7,1,5,4,6,3,0};
//         printArray(arr,"original array");
//         radixSort(arr);
//         printArray(res,"sorted array");
//     }
	
// public static void swap(int arr[], int index1, int index2){
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }

//     public static void printArray(int arr[], String message){
//         System.out.println("Printing " + message);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]);
//             if(i!=arr.length-1){
//                 System.out.print(",");
//             }
//         }
//         System.out.println();
//     }

//  public static void countingSortWithDigit(int arr[], int digit){
//         // find K,
//         int n = arr.length;
//         int k = 9;
//         int res[] = new int[n];

//         int countArr[] = new int[k+1];

//         System.out.println("value of digit is "+ digit);
//         // find the frequency
//         for(int i=0;i<n;i++){
//             int index = (arr[i]/digit)%10;
//             System.out.println("element is "+ arr[i] + "digit is "+ index);
//             countArr[index]+=1;
//         }
//         printArray(countArr,"count array");

//         // find cumulative frequency
//         for(int i=1;i<=k;i++){
//             countArr[i] += countArr[i-1];
//         }

//         printArray(countArr,"count array with cumulative frequency");
//         printArray(arr,"original array");
//         //find the sorted array
//         for(int i=n-1;i>=0;i--){
//             int val = arr[i];
//             System.out.println("Value is "+ val);
//             // a-- & --a
//             int countIndex = (arr[i]/digit)%10;
//             System.out.println("Index in count array "+ countIndex);
//             int countVal = --countArr[countIndex];
//             System.out.print("Element "+ val +" placed at index "+countVal);
//             res[countVal] = val;
//         }

//         // copy back to original array
//         for(int i =0;i<n;i++){
//             arr[i] = res[i];
//         }

//         printArray(arr,"original array");

// //        return res;
//     }

//  public static void radixSort(int arr[]){
//         int n = arr.length;
//         int maxEl = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(arr[i]>maxEl){
//                 maxEl = arr[i];
//             }
//         }
//         if(maxEl == Integer.MIN_VALUE){
//             System.out.println("Empty array");
//             return;
//         }

//         for(int digit = 1;maxEl/digit>0;digit*=10){
//             countingSortWithDigit(arr,digit);
//         }

//     }
// }

// -------------------------------------------------------------------------------------------------------------------
// Shell Sort

// import java.util.Arrays;

// public class Searching_Sortingg {

// public static void shellSort(int[] arr) {
// int n = arr.length;

// // Start with a large gap, then reduce the gap
// for (int gap = n / 2; gap > 0; gap /= 2) {

// // Perform a gapped insertion sort for this gap size
// for (int i = gap; i < n; i++) {
// int temp = arr[i];
// int j;

// // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
// for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
// arr[j] = arr[j - gap];
// }

// // Put temp (the original arr[i]) in its correct location
// arr[j] = temp;
// }
// }
// }

// public static void main(String[] args) {
// int[] arr = {12, 34, 54, 2, 3};
// System.out.println("Original array: " + Arrays.toString(arr));

// shellSort(arr);

// System.out.println("Sorted array: " + Arrays.toString(arr));
// }
// }
// -------------------------------------------------------------------------------------------------------------------
// Max Heap Sort
// import java.util.Arrays;

// public class HeapSort {

// public static void heapSort(int[] arr) {
// int n = arr.length;

// // Build a max heap
// for (int i = n / 2 - 1; i >= 0; i--) {
// heapify(arr, n, i);
// }

// // Extract elements from the heap one by one
// for (int i = n - 1; i > 0; i--) {
// // Move the current root (maximum element) to the end of the array
// int temp = arr[0];
// arr[0] = arr[i];
// arr[i] = temp;

// // Call heapify on the reduced heap
// heapify(arr, i, 0);
// }
// }

// // Function to heapify a subtree rooted with node i, which is an index in
// arr[]
// // n is the size of the heap
// private static void heapify(int[] arr, int n, int i) {
// int largest = i; // Initialize largest as root
// int left = 2 * i + 1; // left child
// int right = 2 * i + 2; // right child

// // If the left child is larger than the root
// if (left < n && arr[left] > arr[largest]) {
// largest = left;
// }

// // If the right child is larger than the current largest
// if (right < n && arr[right] > arr[largest]) {
// largest = right;
// }

// // If the largest is not the root
// if (largest != i) {
// // Swap the root with the largest
// int swap = arr[i];
// arr[i] = arr[largest];
// arr[largest] = swap;

// // Recursively heapify the affected subtree
// heapify(arr, n, largest);
// }
// }

// public static void main(String[] args) {
// int[] arr = {12, 11, 13, 5, 6, 7};
// System.out.println("Original array: " + Arrays.toString(arr));

// heapSort(arr);

// System.out.println("Sorted array: " + Arrays.toString(arr));
// }
// }

// -------------------------------------------------------------------------------------------------------------------
// Min Heap Sort
// import java.util.Arrays;

// public class HeapSort {

// public static void heapSort(int[] arr) {
// int n = arr.length;

// // Build a min heap
// for (int i = n / 2 - 1; i >= 0; i--) {
// minHeapify(arr, n, i);
// }

// // Extract elements from the heap one by one
// for (int i = n - 1; i > 0; i--) {
// // Move the current root (minimum element) to the end of the array
// int temp = arr[0];
// arr[0] = arr[i];
// arr[i] = temp;

// // Call minHeapify on the reduced heap
// minHeapify(arr, i, 0);
// }
// }

// // Function to heapify a subtree rooted with node i, which is an index in
// arr[]
// // n is the size of the heap
// private static void minHeapify(int[] arr, int n, int i) {
// int smallest = i; // Initialize smallest as root
// int left = 2 * i + 1; // left child
// int right = 2 * i + 2; // right child

// // If the left child is smaller than the root
// if (left < n && arr[left] < arr[smallest]) {
// smallest = left;
// }

// // If the right child is smaller than the current smallest
// if (right < n && arr[right] < arr[smallest]) {
// smallest = right;
// }

// // If the smallest is not the root
// if (smallest != i) {
// // Swap the root with the smallest
// int swap = arr[i];
// arr[i] = arr[smallest];
// arr[smallest] = swap;

// // Recursively heapify the affected subtree
// minHeapify(arr, n, smallest);
// }
// }

// public static void main(String[] args) {
// int[] arr = {12, 11, 13, 5, 6, 7};
// System.out.println("Original array: " + Arrays.toString(arr));

// heapSort(arr);

// System.out.println("Sorted array: " + Arrays.toString(arr));
// }
// }
