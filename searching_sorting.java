




// Bubble Sort:

// Not typically recommended for large datasets or performance-critical applications.
// Can be suitable for small datasets or nearly sorted datasets due to its simplicity.


// Selection Sort:

// Similar to bubble sort, not efficient for large datasets.
// In-place and may be preferred when memory usage is a concern.


// Insertion Sort:

// Efficient for small datasets or partially sorted datasets.
// Adaptive and stable, making it suitable for scenarios where the data is likely to be nearly sorted.


// Merge Sort:

// Suitable for sorting linked lists due to its sequential access pattern.
// Efficient for large datasets, has a stable time complexity, and is suitable for external sorting.

// Quick Sort:

// Generally, a fast and efficient sorting algorithm with good average-case performance.
// Can be sensitive to the choice of the pivot, but improvements like randomized quicksort address this issue.
// Widely used in practice for general-purpose sorting.

// Heap Sort:

// In-place and has a consistent O(n log n) time complexity.
// Less commonly used in practice compared to quicksort or merge sort but can be useful in constrained memory environments.

// Radix Sort:

// Efficient for sorting integers or strings with fixed length.
// Suitable for situations where the range of possible key values is limited.




// LINEAR SEARCH 

// public class searching_sorting {
//     static int LINEAR(int arr[],int key){
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==key){
//                 return i ;
//             }
            
//         }
//         return -1 ;
//     }

//     public static void main(String[] args) {
//         int arr[]={51,10,22,40,26,11};
//         int key =26 ;
//         System.out.println(LINEAR(arr, key));
//     }
// }

// For linear search, the space complexity is considered to be O(1), which means it uses a constant amount of space regardless of the size of the input.
// The time complexity of linear search is O(n), where "n" is the number of elements in the array or list.


// BINARY SEARCH 

// If data is not sorted you can't apply binary search



// public class searching_sorting {
//     static int BINARY(int arr[], int key){
//         int low=0;
//         int high=arr.length-1;
//         // int mid=(low+high) /2 ;

   
//         while (low<=high) {
//             int mid=(low+high) /2 ;
        
//         if(arr[mid] == key){
//             return mid ;
//         }

//      else if (key < arr[mid]) {
//         high = mid - 1;
//     } 
//     else {
//         low = mid + 1;
//     }
  
// }
// return -1 ;
// }

//     public static void main(String[] args) {
//         int arr[]={3,5,6,8,12,15,16,19,21};
//         int key=19;
//         System.out.println(BINARY(arr, key));
//     }
// }

// another method 

// public class searching_sorting {
//     static int BINARY(int arr[], int key){
//         int low=0;
//         int high=arr.length-1;

   
//         while (low<=high) {
//             int mid=(low+high) /2 ;
        
//         if(arr[mid] == key){
//             return mid ;
//         }

//         else if(key > arr[mid]){
//             low = mid+1 ;
           
//         }
//         else if(key < arr[mid]){
//             high = mid-1;
           
//         }
// }
// return -1 ;
// }

//     public static void main(String[] args) {
//         int arr[]={3,5,6,8,12,15,16,19,21};
//         int key=19;
//         System.out.println(BINARY(arr, key));
//     }
// }



// Time Complexity (O(log n)):

// Binary search operates by dividing the array in half at each step. This leads to a logarithmic time complexity because, with each comparison, the size of the remaining portion of the array is halved.
// The base of the logarithm is 2 because the array is divided in half in each step.
// Mathematically, the time complexity can be expressed as O(log₂ n), where "n" is the number of elements in the array.

// Space Complexity (O(1)):

// Binary search is an in-place algorithm, meaning that it doesn't require additional memory proportional to the size of the input. The space complexity is constant and denoted as O(1).
// Binary search typically only uses a few variables (like pointers or indices) to keep track of the search space and the current element being compared, and these variables use constant space.
// Binary search is highly efficient for searching in sorted arrays due to its logarithmic time complexity, making it much faster than linear search, especially for large datasets. The constant space complexity makes it a memory-efficient algorithm.

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// BUBBLE SORTING 


// public class searching_sorting {
//     static void BUBBLE(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {18, 19, 45, 11, 29, 9, 3, 10};
//         BUBBLE(arr);

//         // Print the sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// Time Complexity:

// Worst Case: In the worst-case scenario, when the input array is in reverse order, the Bubble Sort algorithm requires multiple passes to move the largest element to its correct position. This results in a time complexity of O(n^2).
// Best Case: In the best-case scenario, when the input array is already sorted, Bubble Sort still needs to make a pass to confirm that the array is sorted. However, 
// it can be optimized to detect whether any swaps were made during a pass. This gives a best-case time complexity of O(n).
// Average Case: On average, Bubble Sort performs O(n^2) comparisons and swaps.

// Space Complexity:

// Bubble Sort is an in-place sorting algorithm, meaning it does not use additional memory proportional to the input size. 
// The space complexity is constant, denoted as O(1). The algorithm only requires a constant amount of extra memory for variables like loop counters and temporary variables used in the swap operation.


// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// INSERTION SORTING  = phle element ko unsorted baaki sarre sorted ek-ek karke usse compare karo 

// public class searching_sorting {

//     static void INSERTION(int arr[]){
//         for (int i = 1; i < arr.length; i++) {
//             int temp =arr[i]; // jisko utha ke sahi jagah pe dalna hai 
//             int j=i;
//             while(j>0 && temp<arr[j-1]) {
//                 arr[j]=arr[j-1]; // 0 index pe jo value hai usko 1 index pe kar do
//                 j-- ;
//             }

//             arr[j]=temp ;   // temp ki value 0 index pe save kardo 
            
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={5,4,10,1,6,2};
//         INSERTION(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// Another method 

// public class searching_sorting {

//     static void INSERTION( int arr[]){ 
//         for (int i = 1; i < arr.length; i++) {
//             int temp=arr[i];
//             int j=i-1 ;
//             while (j>=0 && temp<arr[j]) {
//                 arr[j+1]=arr[j];
//                 j-- ;
                
//             }

//             arr[j+1]=temp;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]={5,4,10,1,6,2};
//         INSERTION(arr);
//       for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



// SLECTION SORTING = 
// SLECTION SORTING is the combination of searching and sorting both  ;

// public class searching_sorting {
//     public static void SELECTION(int arr[]) {
        

//         for (int i = 0; i < arr.length ; i++) {
//             int min = i;

//             // searching 
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//             }

//             // sorting 
//             int temp = arr[i];
//             arr[i] = arr[min];
//             arr[min] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {38, 52, 9, 18, 6, 62, 13};
//         SELECTION(arr);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// // // MERGE SORT 

// class MergeSort {
//     // function to do the combine task by mergeProcedure
//     public static void mergeProcedure(int[] arr, int l, int mid, int r){
//         int i, j, k;
//         // n1 - size of left subarray
//         // n2 - size of right subarray
//         int n1 = mid - l + 1;
//         int n2 = r - mid;

//         // create a left and right subarray
//         int[] lsubarray = new int[n1];
//         int[] rsubarray = new int[n2];

//         // copy the elements into left and right subarray
//         for(i=0; i<n1; i++){
//             lsubarray[i] = arr[l+i];
//         }

//         for(j=0; j<n2; j++){
//             rsubarray[j] = arr[mid + 1 + j];
//         }

//         // comparison among elements in the left and right subarray
//         i=0;
//         j=0;
//         k=l;

//         while(i < n1 && j < n2){
//             if(lsubarray[i] <= rsubarray[j]){
//                 arr[k] = lsubarray[i];
//                 i = i+1;
//             }
//             else{
//                 arr[k] = rsubarray[j];
//                 j = j + 1;
//             }
//             k = k + 1;
//         }

//         // copy the remaining elements from left subarray
//         while(i < n1){
//             arr[k] = lsubarray[i];
//             i = i+1;
//             k = k+1;
//         }

//         // copy the remaining elements from right subarray
//         while(j < n2){
//             arr[k] = rsubarray[j];
//             j = j + 1;
//             k = k +1;
//         }
//     }

//     // function to do mergesort
//     public static void mergeSort(int[] arr, int l, int r){
//         if(l < r){
//             // 1. Divide the array into various subproblems
//             int mid = l + (r - l)/2;

//             // 2. Conquer the subproblems via the recursion
//             // left subarray - recursive call
//             mergeSort(arr, l, mid);
//             // right subarray - recursive call
//             mergeSort(arr, mid+1, r);

//             // 3. Combine - mergeProcedure
//             mergeProcedure(arr, l, mid, r);
//         }
//     }


//     // to display array
//     public static void printArr(int[] arr, int n){
//         for(int i=0; i<n; i++){
//             System.out.println(arr[i]+ " ");
//         }
//     }

    
//     public static void main(String[] args) {
//         int[] arr = {50, 20, 40, 90, 88, 11, 13, 19, 27};
//         int n = arr.length;

//         System.out.println("Array before sort is: ");
//         printArr(arr, n);

//         mergeSort(arr, 0, n-1);

//         System.out.println("Array after sort is: ");
//         printArr(arr, n);
        
// }
// }

// // // // QUUCK SORT 


// import java.io.*;
// import java.util.*;

// public class quickSort {
//     // function to do the partition of an array
//     public static int partition(int[] arr, int l, int h){
//         int pivot = arr[l];
//         int i = l;
//         for(int j=l+1; j<=h; j++){

//             //  j to take care of bigger elements than pivot elements ;
//             // i to take care of smaller elements than pivot elements ;
//             if(arr[j] <= pivot){
//                 i = i + 1;
//                 // swap(arr[i], arr[j])
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         // swap (arr[l], arr[i])
//         // to get the correct position of the pivot element
//         // last me pivot element or i me swap hoga 
//         int tem = arr[l];
//         arr[l] = arr[i];
//         arr[i] = tem;

//         return i;
//     }



//     // function of the quicksort algorithm
//     public static void quickSort(int[] arr, int l, int h){
//         if(l < h){
//             // 1. Divide the array into two subproblems
//             int m = partition(arr, l, h);
//             // 2. Conquer the subproblems via the recursion
//             quickSort(arr, l, m-1);
//             quickSort(arr, m+1, h);
            
//         }
//     }

//     // function to display the array
//     public static void printArr(int[] arr, int n){
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//     }

//      public static void main(String[] args){
//         int[] arr = {50, 30, 70, 90, 10, 34, 89, 98, 13};
//         int n = arr.length;

//         System.out.println("Array before sorting is: ");
//         printArr(arr, n);

//         quickSort(arr, 0, n-1);

//         System.out.println("Array after sorting is: ");
//         printArr(arr, n);

//     }
// }



// Quick Sort Another method 

// public class searching_sorting {


// // Step-3
//     public static int partition(int arr[], int i, int j) {
//         int pivot = arr[(i + j) / 2];
//         while (i <= j) {
//             while (arr[i] < pivot) {
//                 i++;
//             }
//             while (arr[j] > pivot) {
//                 j--;
//             }

//             if (i <= j) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 i++;
//                 j--;
//             }
//         }
//         return i;
//     }


//     // Step-4  
//     public static void quickSortrecursion(int arr[], int i, int j) {
//         int pi = partition(arr, i, j);
//         if (i < pi - 1) {
//             quickSortrecursion(arr, i, pi - 1);  // left side recursion
//         }

//         if (pi < j) {
//             quickSortrecursion(arr, pi, j);  // right side recursion
//         }
//     }




//     // Step-2
//     public static void printArr(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// // Step-1 
// public static void main(String[] args) {
//     int arr[] = {15, 9, 7, 13, 12, 16, 4, 18, 11};
//     int n = arr.length;
//     quickSortrecursion(arr, 0, n - 1);
//     printArr(arr);
// }














