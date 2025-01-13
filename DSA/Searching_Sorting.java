// 1. Linear Search - ek/ek karke check karte hai loop se 
// Linear search algorithm iterates through each element in the list or array, comparing it with the target element until a match is found or the end of the list is reached.
//  If the end of the list is reached, then it means that the target element is not present in the array.

// Case	Time Complexity
// Best Case	O(1)
// Average Case	O(n)
// Worst Case	O(n)

// The space complexity of linear search is O(1).

// Algorithm for Linear Search Algorithm:
// The algorithm for linear search can be broken down into the following steps:

// Start: Begin at the first element of the collection of elements.
// Compare: Compare the current element with the desired element.
// Found: If the current element is equal to the desired element, return true or index to the current element.
// Move: Otherwise, move to the next element in the collection.
// Repeat: Repeat steps 2-4 until we have reached the end of collection.
// Not found: If the end of the collection is reached without finding the desired element, return that the desired element is not in the array.





// 10. What are some real-world applications of linear search algorithm?
// Linear search algorithm can be used in scenarios such as searching for a specific value in a phone book, searching for a name in an unsorted list of contacts, 
// or finding an item in a grocery list. It’s often used in scenarios where the data size is small or not expected to grow significantly.


// -----------------------------------------------

// 2. Binary Search - mid nikal ke left ya right check karo 

// Description: This search algorithm works on sorted arrays by repeatedly dividing the search interval in half. 
// If the target value is less than the middle element, the search continues on the left half; otherwise, it continues on the right half.
// Time Complexity: O(log n)

// Binary Search Algorithm:
// Below is the step-by-step algorithm for Binary Search:

// Divide the search space into two halves by finding the middle index “mid”. 
// Compare the middle element of the search space with the key. 
// If the key is found at middle element, the process is terminated.
// If the key is not found at middle element, choose which half will be used as the next search space.
// If the key is smaller than the middle element, then the left side is used for next search.
// If the key is larger than the middle element, then the right side is used for next search.
// This process is continued until the key is found or the total search space is exhausted.



// Disadvantages of Binary Search:
// The array should be sorted.

// -----------------------------------------------

// Breadth-First Search (BFS)
// -----------------------------------------------
// Depth-First Search (DFS)

// -----------------------------------------------

// In Bubble Sort algorithm, 

// traverse from left and compare adjacent elements and the higher one is placed at right side. 
// compare j and j+1 only 
// remove the checking of last element every time 
// flag to stop traversing after sorting 

// -----------------------------------------------
// Selection Sort algorithm - phle element ko minimum maan lo orr sbase swap karwao 
// Selection Sort is the combination  of Searching and Sorting ;

// Assume the first element is the minimum.
// Find the minimum element from the rest of the unsorted array.
// If a new minimum is found, swap it with the element at the beginning.
// If the first element is already the minimum, no swap is needed.
// Move the boundary to the right and repeat the process until the entire array is sorted.



// -----------------------------------------------
// Insertion Sort Algorithm: - 
// phle element ko sorted and rest of them are unsorted 
// now store the 1st element of unsorted in temp ;
// now compare that temp with sorted elemnt 
// and swap or shft them ;
// Insertion sort is a simple sorting algorithm that works by building a sorted array one element at a time. It is considered an ” in-place ” sorting algorithm, meaning it doesn’t require any additional memory space beyond the original array.

// To achieve insertion sort, follow these steps:

// We start with second element of the array as first element in the array is assumed to be sorted.
// Compare second element with the first element and check if the second element is smaller then swap them.
// Move to the third element and compare it with the second element, then the first element and swap as necessary to put it in the correct position among the first three elements.
// Continue this process, comparing each element with the ones before it and swapping as needed to place it in the correct position among the sorted elements.
// Repeat until the entire array is sorted.
// -----------------------------------------------
// Merge Sort 
// Divide:
// find the mid of the array 
// then divide the array into two halves 
// left half and right half 
// This division continues until the entire array is broken down into individual elements.
// Conquer (Merge):
// The sorted subarrays are then merged together to form larger sorted arrays.
// This merging process continues recursively until all subarrays are merged into a single sorted array.


// -----------------------------------------------
// Quick Sort 

// select first element as pivot element 
// our peimary goal is that all the elements less thean pivot should me on left side and all the elements greater then pivot is on right side .
// after one partition all the elements less thean pivot should me on left side and all the elements greater then pivot is on right side .
// non we will apply recursion on left hand side and another recursion on right hand side 

// Working of Quick Sort

// select first element as pivot element 
// our peimary goal is that all the elements less thean pivot should me on left side and all the elements greater then pivot is on right side .
// take one pivot element 
// now take two pointer palced one the starting of the arr i.e. arr[0] and placed one at the end of the array i.e.arr[n-1];
// i move right hand side if i find an element that is grater the pivot i will stop there 
// j will move left hand side if j find an element that is lesser than pivot j will stop there .
// When i and j have found such elements, they are swapped.
// This continues until i crosses j. At that point, the pivot is swapped with the element at j, placing the pivot in its correct position.
// -------------------------------------------------------------------------------------------------------------------
// Counting Sort 

// input  Array hai  [1, 3, 2, 3, 4, 1, 6, 4, 3]
// ek new array me count store kia,means number of times it occurs
// position array. - position nikala count + previous count 
// final array - traverse the original array from the last jo element number hai ,
// wo index check karo position me
//  uss index me jo value hai minus kardo 1 and then jo value aayi USS index oe naya array me position ka index store karwao,
// Start with the last element in the input array.
// Suppose the last element is 3. Look at position array index 3, which is 6. Place 3 at index 5 in the final array and decrement the value at position index 3 by 1.
// Repeat this for each element.



// Step 1: Counting Occurrences
// Count Array: This array will store the count of each element's occurrences in the input array. 
// Step 2: Calculate Positions
// Position Array: This array helps determine the correct positions of elements in the sorted array. 
// It's calculated by modifying the count array to reflect cumulative sums.
// Start from the second element in the count array.
// Add the previous element's value to the current element.
// Step 3: Build the Sorted Array
// Final Sorted Array: This is where the sorting takes place.

// Traverse the input array from the last element to the first (to maintain stability).
// For each element, use the position array to find its correct position in the final sorted array.
// After placing the element, decrement the corresponding value in the position array
// -------------------------------------------------------------------------------------------------------------------
// Radix Sort - if we perform 3 times counting sort we will achieve radix sort ?
// It sorts numbers digit by digit, starting from the least significant digit (LSD) to the most significant digit (MSD), or vice versa.

// Determine Passes: Find the largest number in the array to determine the maximum number of digits (it will tell the number of passes required).
// Initialize Buckets: Create buckets for each digit (0-9).
// Sort by Digits: Start with the least significant digit (LSD) and distribute numbers into buckets.( unit place , tense place, Hundred place )
// Collect and Repeat: Collect numbers from buckets and repeat for each subsequent digit, moving left until all digits are processed.
// -------------------------------------------------------------------------------------------------------------------
// Shell Sort 
// find the iteration i.e. n/2 
// Compare the elements in the gap of n/2  and swap if elemnt is bigger 
// Reduce Gap: Continue reducing the gap and performing the insertion sort until the gap is 1.

// -------------------------------------------------------------------------------------------------------------------
// Heap Sort   - Max Heap and Min heap 

// perfect Binary tree -  all level must be filled with equal elements
// Almost complete Binary tree - level must be filled with  elements ( left to rigth )
// In Almost complete Binary tree till 2nd last element elements are equally filled and in last level elements are filled left to right 

// Max Heap  -  parent is > child  -  Ascending order. -  left chota right bada 
// Min Heap  -   child is > parent  - Descending order.

// Node = i
// find parent of any node  = i/2 ;
// left child =  2*i;
// Right child =  2*i+1;

// Max Heap 

// Process:
// Compare the parent node with its children.
// If the parent node is smaller than any of its children, swap it with the largest child.
// Recursively apply heapify to the affected subtree to restore the Max Heap property.


// Max Heap Inseriton
// Data Always inserted form the leaf node .
// Data on leaf node as left as possible .
// correct the MAX HEAP Again 

// Max Heap Deletion 
// Data Always Deleted form the root  node .
// After Deleting the root node ,  Data on leaf node right side element should in place of Root elemnet now  .
// correct the MAX HEAP Again 
// again delete the root node 
// Again Data on leaf node right side element should in place of Root elemnet now  
// correct the MAX HEAP Again 
// repeat 


// Min Heap

// Process:
// Compare the parent node with its children.
// If the parent node is larger than any of its children, swap it with the smallest child.
// Recursively apply heapify to the affected subtree to restore the Min Heap property.

// Min Heap Inseriton and Deletion  -  Same as Max Heap 


// Heapify Mehtod 

// Max Heap heapify: Ensures the parent node is greater than its children. It helps maintain the Max Heap property.
// Min Heap heapify: Ensures the parent node is less than its children. It helps maintain the Min Heap property.

// Time- Complexity 

// Max Heap:
// Heap Construction (Building a Max Heap):
// Time Complexity: 0(n);

// Insertion:
// Time Complexity: 
// O(logn)

// Deletion:
// Time Complexity: 
// O(logn)

// Find-Max:
// Time Complexity: 
// O(1)

// Heapify Time Complexity: 
// O(logn)

// Heap Sort (Using Max Heap):
// Time Complexity: 
// O(nlogn)

