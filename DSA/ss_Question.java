// Find first and last positions of an element in a sorted array
// Find a Fixed Point (Value equal to index) in a given array Search in a rotated sorted array
// Maximum and minimum of an array using minimum number of comparisons
// Optimum location of point to minimize total distance
// Find the repeating and the missing
// find majority element
// Searching in an array where adjacent differ by at most k
// find a pair with a given difference
// find four elements that sum to a given value
// maximum sum such that no 2 elements are adjacent
// Count triplet with sum smaller than a given value merge 2 sorted arrays
// print all subarrays with 0 sum
// Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting
// square root of an integer
// Searching & Sorting
// Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting Searching & Sorting
// Searching & Sorting
// Searching & Sorting Searching & Sorting Searching & Sorting
// Product array Puzzle
// Sort array according to count of set bits
// minimum no. of swaps required to sort the array Bishu and Soldiers Rasta and Kheshtak
// Kth smallest number again
// Find pivot element in a sorted array K-th Element of Two Sorted Arrays Aggressive cows
// Book Allocation Problem EKOSPOJ:
// Job Scheduling Algo
// Missing Number in AP
// Smallest number with atleastn trailing zeroes infactorial Painters Partition Problem:
// Findthe inversion count
// Implement Merge-sort in-place
// Partitioning and Sorting Arrays with Many Repeated Entries




// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.1 Find first and last positions of an element in a sorted array. <->
// First and Last Position of an Element In Sorted Array

// time complexity 0(logn)

// public class ss_Question {
//     public static int[] position(int arr[],int target) {
//         int n=arr.length ;
//         int l=0;
//         int h=n-1;
//         int mid =0 ;
//         int res[]={-1,-1}; // if taget is not found in array return -1,-1
// // finidng first index 
//         while (l<=h) {
//             mid=(l+h)/2 ;

//             if(target == arr[mid]){
//                 res[0] = mid ;
//                 h= mid-1 ;
//             }

//             else if(arr[mid]<target){
//                 l=mid+1; 
//             }
//             else{
//                 h=mid-1;
//             }  
//         }

//          l=0;
//          h=n-1;
//         mid =0 ;
//         while (l<=h) {
//             mid=(l+h)/2 ;

//             if(target == arr[mid]){
//                 res[1] = mid ;
//                l = mid+1 ;
//             }

//             else if(arr[mid]<target){
//                 l=mid+1; 
//             }
//             else{
//                 h=mid-1;
//             }
//         }
// return res ;
//     }
//     public static void main(String[] args) {
//         int arr[]={3,4,4,4,4,4,4,4,4,6};
//         int target =4 ;
//         int result[]=position(arr, target);
//         System.out.println("First Position: " + result[0]);
//         System.out.println("Last Position: " + result[1]);
// }
// }
// Another Method 
// Array is sorted and we have to search something in array - binary search ( log n)

// public class ss_Question {

//     public static void main(String[] args) {
//         int arr[] = {3, 4, 4, 4, 4, 4, 4, 4, 4, 6};
//         int n = arr.length;
//         int Target = 4;  // changed to 4 for demonstration
//         int c = 0;

//         int firstIndex = -1; // initialize to -1 to indicate not found
//         int LastIndex = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == Target) {
//                 if (c == 0) {
//                     firstIndex = i;
//                     c++;
//                 }
//                 LastIndex = i; // every time we are updating the last index 
//             }
//             if (arr[i] > Target) {
//                 break;
//             }
//         }

//         if (firstIndex != -1 && LastIndex != -1) {
//             System.out.println("First Index: " + firstIndex + ", Last Index: " + LastIndex);
//         } else {
//             System.out.println("Target not found in the array.");
//         }
//     }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.2 Find a Fixed Point (Value equal to index) in a given array <->
// Value Equal To The Index Value


// import java.util.ArrayList;

// public class ss_Question {
//     static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             int val = arr[i];
//             int reqIn = i + 1;
//             if (val == reqIn) {
//                 list.add(val);
//             }
//         }
//         return list;
//     }

//     public static void main(String[] args) {
//         int arr[] = {15, 2, 45, 12, 7};
//         int n = arr.length;

//         // Create an instance of ss_Question class
//         ss_Question obj = new ss_Question();

//         // Call the non-static method using the object
//         System.out.println(obj.valueEqualToIndex(arr, n));
//     }
// }




// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.3 Search in a rotated sorted array <->

// public class ss_Question {

//     static int Search(int arr[], int target) {
//         int l = 0;
//         int h = arr.length - 1;

//         while (l <= h) {
//             int mid = (l + h) / 2;

//             if (target == arr[mid]) {
//                 return mid;
//             }

//             // Check if the left portion is sorted
//             else if (arr[l] <= arr[mid]) {
//                 // Check if the target is in the left portion
//                 if (target >= arr[l] && target < arr[mid]) {
//                     h = mid - 1;
//                 } else {
//                     l = mid + 1;
//                 }
//             } 



//                  else {
//                 // Check if the target is in the right portion
//                 if (target > arr[mid] && target <= arr[h]) {
//                     l = mid + 1;
//                 } else {
//                     h = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 5, 6, 7, 8, 1, 2};
//         int target = 5;
//         int res = Search(arr, target);
//         System.out.println(res);
//     }
// }



// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4  square root of an integer . <->
// Square Root of a number



// public class ss_Question {

//     public static int findSquareRoot(int n) {
//         for (int i = 1; i < n; i++) {
//             if (i * i == n) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int n = 9;
//         int result = findSquareRoot(n);

//         if (result != -1) {
//             System.out.println("Square root of " + n + " is: " + result);
//         } else {
//             System.out.println("No integer square root for " + n);
//         }
//     }
// }

// Another method 

// public class ss_Question {

//     static int sqrt(int n){
//         if(n==1 || n==0){
//             return n ;
//         }

//         int l=0;
//         int h=n/2;
//         int res=0;
//         while (l<=h) {
//             int mid =(l+h)/2 ;
//             if(mid*mid== n ){
//                 return mid ;
//             }
//             else if(mid * mid > n){
//                 h=mid-1 ;
//                  res=mid ; // ceil value 
//             }
//             else{
//                 l=mid+1 ;
//                 res = mid;  // floor value 
//             }
//         }
//         return res ;
//     }

//     public static void main(String[] args) {
//         int n=24 ;
//         System.out.println(sqrt(n));

//     }
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.5 Maximum and minimum of an array using minimum number of comparisons <->
// Middle of three 

// import java.util.Arrays;

// public class ss_Question {

//     public static int[] comparison(int arr[],int n) {

//         Arrays.sort(arr);
//         int result [] = {arr[0],arr[n-1]};
//         return result;
//     }
//     public static void main(String[] args) {
//         int arr[]={2,6,9,3,5,8,1};
//         int n=arr.length;
//         int result[] = comparison(arr, n);
//         System.out.println("Minimum Value: " + result[0]);
//         System.out.println("Maximum Value: " + result[1]);
//         // or 
//         // System.out.println(result); // not work 
//     }
// }

// Another Method 

// import java.util.Arrays;

// public class ss_Question {

//     public static int[] comparisons(int arr[]) {
//         int max = 0;
//         int min = 0;

//         if (arr[0] > arr[1]) {
//             max = arr[0];
//             min = arr[1];
//         } else {
//             max = arr[1];
//             min = arr[0];
//         }

//         for (int i = 2; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             } else if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }

//         int result[] = { max, min };
//         return result;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 6, 9, 3, 5, 8, 1 };
//         int result[] = comparisons(arr);
//         System.out.println(Arrays.toString(result));
//     }
// }

// Another Method 



// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.6 Optimum location of point to minimize total distance <->
// Optimum location


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.7  Find the repeating and the missing <->
// Find The Repeating And Missing Number

// missing = 0
// repeating  = 0
// For i = 1 to n:
// 	count  = 0
// 	For j = 0 to n:
// 		If arr[j] is equal to i:
// 			count = count + 1
// 	If count is equal to 0:
// 		missing = i
// 	If count is greater than 1:
// 		repeating = i



// import java.util.Arrays;

// public class ss_Question {

//     public static void rpms(int arr[], int n) {

//         Arrays.sort(arr);
//         int missing = 0;
//         int repeating = 0;

//         // Running the first loop checking for the number
//         for (int i = 1; i <= n; i++) {
//             int count = 0;

//             // Second Loop for checking the number in the array
//             for (int j = 0; j < n; j++) {
//                 if (arr[j] == i) {
//                     count ++;
//                 }
//             }

//             if (count == 0) {
//                 missing = i;
//             }

//             if (count == 2) {
//                 repeating = i;
//             }
//         }

//         System.out.println("Repeating element: " + repeating);
//         System.out.println("Missing element: " + missing);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2,2, 4};
//         int n = arr.length;
//         rpms(arr, n);
//     }
// }


// Another method 

// import java.util.Arrays;

// public class FindRepeatingAndMissing {

//     public static void solve() {
//         // Below is the array
//         int arr[] = {1, 2, 2, 3, 5, 6, 7};

//         // Defining the size of the array
//         int n = arr.length;

//         // Missing Number
//         int miss = 0;

//         // Repeating Number
//         int rep = 0;

//         // Below is the count array initialized with 0's
//         int[] count = new int[n];

//         Arrays.fill(count, 0);

//         for (int i = 0; i < n; i++) {
//             count[arr[i] - 1]++;
//         }

//         for (int i = 0; i < n; i++) {
//             if (count[i] == 0) {
//                 miss++ ;
//             }
//             if (count[i] == 2) {
//                 rep++ ;
//             }
//         }

//         System.out.println("Missing Number: " + miss);
//         System.out.println("Repeating Number: " + rep);
//     }

//     public static void main(String[] args) {
//         solve();
//     }
// }



// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.8  find majority element <->
// majority element



// public class ss_Question {

//     public static int majority(int arr[]) {
//         int maj=arr[0];
//         int count =1;

//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==maj){
//                 count ++ ;
//             }
//             else{
//                 count -- ;
//             }
            
//             if(count == 0){
//                 maj =arr[i];
//                 count =1 ;
//             }
//         }
//         return maj ;
//     }

//     public static void main(String[] args) {
//         int arr[]={5,5,8,8,8,8,1};
//         System.out.println(majority(arr));
//     }
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q>9  Searching in an array where adjacent differ by at most k <->
// - We'll start from 0th index & take the diff = (difference between it's value & target value) / K. 
// - Now jump your index to diff as we're sure that if they're differ by at most k, it means target value can't occur in between
// - Complexity: worst case O(n), but it'll be optmized & will have less than O(n)



// package array ;

// public class ss_Question {
    
//     public static int findWhereAdjacentDifferByAtMostk(int arr[], int k, int val) {
//         int start = 0;

//         while (start < arr.length) {
//             if (arr[start] == val) {
//                 return start;
//             }

//             int diff = Math.abs(arr[start] - val) / k;
//             diff = Math.max(1, diff);

//             start = start + diff;
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr1[] = {70, 60, 70, 80, 90, 110, 130};
//         int arr2[] = {2, 3, 2, 4, 5, 6, 7};
  
//         System.out.println(findWhereAdjacentDifferByAtMostk(arr1, 20, 110));
//         System.out.println(findWhereAdjacentDifferByAtMostk(arr2, 1, 2));
//     }
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.10  find a pair with a given difference <->

// public class ss_Question {

//     public static int difference(int arr[],int n) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 if(arr[i]+arr[j]== n){
//                     return n ;
//                 }
                
//             }
            
//         }
//         return -1 ;
        
//     }

//     public static void main(String[] args) {
//         int arr[]={12,19,44,27,18,4,18,37,86};
//         int n=24 ;
//         int res = difference(arr, n);
//         System.out.println(res);
//     }
// }

// Another mehtod 

// import java.io.*;

// class ss_Question
// {
// 	// The function assumes that the array is sorted
// 	static boolean findPair(int arr[],int n)
// 	{
// 		int size = arr.length;

// 		// Initialize positions of two elements
// 		int i = 0, j = 1;

// 		// Search for a pair
// 		while (i < size && j < size)
// 		{
// 			if (i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n))
// 			{
// 				System.out.print("Pair Found: "+
// 								"( "+arr[i]+", "+ arr[j]+" )");
// 				return true;
// 			}
// 			else if (arr[j] - arr[i] < n)
// 				j++;
// 			else
// 				i++;
// 		}

// 		System.out.print("No such pair");
// 		return false;
// 	}

// 	// Driver program to test above function
// 	public static void main (String[] args)
// 	{
// 		int arr[] = {1, 8, 30, 40, 100};
// 		int n = -60;
// 		findPair(arr,n);
// 	}
// }





// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.11 find four elements that sum to a given value. <->

// class ss_Question
// {

// 	void findFourElements(int A[], int n, int X) 
// 	{
// 		// Fix the first element and find other three
// 		for (int i = 0; i < n - 3; i++) 
// 		{
// 			// Fix the second element and find other two
// 			for (int j = i + 1; j < n - 2; j++) 
// 			{
// 				// Fix the third element and find the fourth
// 				for (int k = j + 1; k < n - 1; k++) 
// 				{
// 					// find the fourth
// 					for (int l = k + 1; l < n; l++) 
// 					{
// 						if (A[i] + A[j] + A[k] + A[l] == X) 
// 							System.out.print(A[i]+" "+A[j]+" "+A[k] 
// 																+" "+A[l]);
// 					}
// 				}
// 			}
// 		}
// 	}

// 	// Driver program to test above functions
// 	public static void main(String[] args) 
// 	{
// 		FindFourElements findfour = new FindFourElements();
// 		// int A[] = {10, 20, 30, 40, 1, 2};
//         int A[] = {1,2,-3,4,-2,-1,3};
// 		int n = A.length;
// 		int X = 91;
// 		findfour.findFourElements(A, n, X);
// 	}
// }

// Another method 



// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.11.1  find three elements that sum to a given value. <->




// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.12 maximum sum such that no 2 elements are adjacent <->




// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Q.13 Count triplet with sum smaller than a given value <->

// Time Complexity: O(n3)
// Auxiliary Space: O(1)

// class Test 
// { 
// 	static int arr[] = new int[]{5, 1, 3, 4, 7}; 
	
// 	static int countTriplets(int n, int sum) 
// 	{ 
// 		// Initialize result 
// 		int ans = 0; 
	
// 		// Fix the first element as A[i] 
// 		for (int i = 0; i < n-2; i++) 
// 		{ 
// 		// Fix the second element as A[j] 
// 		for (int j = i+1; j < n-1; j++) 
// 		{ 
// 			// Now look for the third number 
// 			for (int k = j+1; k < n; k++) 
// 				if (arr[i] + arr[j] + arr[k] < sum) 
// 					ans++; 
// 		} 
// 		} 
	
// 		return ans; 
// 	} 
	
// 	// Driver method to test the above function 
// 	public static void main(String[] args) 
// 	{ 
// 		int sum = 12; 
// 		System.out.println(countTriplets(arr.length, sum)); 
// 	} 
// } 

// Another method
// Time Complexity: O(n2)
// Auxiliary Space: O(1)

 

// import java.util.Arrays; 
// class ss_Question
// { 
// 	static int arr[] = new int[]{5, 1, 3, 4, 7}; 
	
// 	static int countTriplets(int n, int sum) 
// 	{ 
// 		// Sort input array 
// 		Arrays.sort(arr); 
	
// 		// Initialize result 
// 		int ans = 0; 
	
// 		// Every iteration of loop counts triplet with 
// 		// first element as arr[i]. 
// 		for (int i = 0; i < n - 2; i++) 
// 		{ 
// 			// Initialize other two elements as corner elements 
// 			// of subarray arr[j+1..k] 
// 			int j = i + 1, k = n - 1; 
	
// 			// Use Meet in the Middle concept 
// 			while (j < k) 
// 			{ 
// 				// If sum of current triplet is more or equal, 
// 				// move right corner to look for smaller values 
// 				if (arr[i] + arr[j] + arr[k] >= sum) 
// 					k--; 
	
// 				// Else move left corner 
// 				else
// 				{ 
// 					// This is important. For current i and j, there 
// 					// can be total k-j third elements. 
// 					ans += (k - j); 
// 					j++; 
// 				} 
// 			} 
// 		} 
// 		return ans; 
// 	} 
	
// 	// Driver method to test the above function 
// 	public static void main(String[] args) 
// 	{ 
// 		int sum = 12; 
// 		System.out.println(countTriplets(arr.length, sum)); 
// 	} 
// } 


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.14  merge 2 sorted arrays <->
// import java.util.Arrays;

// public class ss_Question {

//     public static void merge(int arr1[], int arr2[], int n, int m) {
//         int i = 0;
//         int j = 0;
//         int k = n - 1;

//         while (i <= k && j < m) {
//             if (arr1[i] > arr2[j]) {
//                 // swap(arr1(k),arr2(j));
//                 int temp = arr1[k];
//                 arr1[k] = arr2[j];
//                 arr2[j] = temp;
//                 k--;
//                 j++;
//             } else {
//                 i++;
//             }
//         }
        
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//     }

//     public static void main(String[] args) {
//         int arr1[] = {1, 3, 5, 7};
//         int arr2[] = {0, 2, 6, 8, 9};
//         int n = arr1.length;
//         int m = arr2.length;

//         merge(arr1, arr2, n, m);

//         System.out.println("Merged arr1: " + Arrays.toString(arr1));
//         System.out.println("Merged arr2: " + Arrays.toString(arr2));
//     }
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.15  print all subarrays with 0 sum <->

// public class ss_Question {

//     public static void subarray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum = arr[j] + sum ;
//                 if (sum == 0) {
//                     for (int k = i; k <= j; k++) {  // k will tell you from where to where print 
//                         System.out.print(arr[k] + " ");
//                     }
//                     System.out.println();
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {2, 3, 3, 6, -7, -2, -3};
//         subarray(arr);
//     }
// }

// Another method  



// import java.util.HashSet;

// public class ss_Question {

//     public static void subarraysWithSumZero(int arr[]) {
//         HashSet<Integer> set = new HashSet<>();
//         int currentSum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             currentSum = arr[i]+currentSum;

//             if (currentSum == 0 || set.contains(currentSum)) {
//                 printSubarray(arr, set, currentSum);
//                 set.clear();
//                 currentSum = 0;
//             } else {
//                 set.add(currentSum);
//             }
//         }
//     }

//     public static void printSubarray(int arr[], HashSet<Integer> set, int sum) {
//         System.out.print("Subarray with sum 0: ");
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == sum || set.contains(arr[i])) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {2, 3, 3, 6, -7, -2, -3};
//         subarraysWithSumZero(arr);
//     }
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.16  Product array Puzzle. <->


// public class ss_Question {

//     public static void productExceptSelf(int arr[]) {
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             int product = 1;

//             for (int j = 0; j < n; j++) {
//                 if (i != j) {
//                     product = arr[j] * product;
//                 }
//             }

//             System.out.print(product + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {10,3,5,6,2};
//         System.out.println("Product of array elements except self:");
//         productExceptSelf(arr);
//     }
// }
// Another method 



// Another mehtod 
// ye nhi smjh aaya  

// public class ss_Question {

//     public static void productExceptSelf(int arr[]) {
//         int n = arr.length;
//         int[] output = new int[n];

//         // Calculate the product of all elements to the left of each element
//         int leftProduct = 1;
//         for (int i = 0; i < n; i++) {
//             output[i] = leftProduct; // ye line kyu hai 
//             leftProduct = arr[i]*leftProduct;
//         }

//         // Calculate the product of all elements to the right of each element
//         int rightProduct = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             output[i] *= rightProduct;
//             rightProduct = arr[i]*rightProduct;
//         }

//         // Print the final result
//         for (int i = 0; i < n; i++) {
//             System.out.print(output[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {10,3,5,6,2};
//         System.out.println("Product of array elements except self:");
//         productExceptSelf(arr);
//     }
// }







// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.17  Sort array according to count of set bits <->



// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.18  minimum no. of swaps required to sort the array. <->

// public class ss_Question {

//     static int minimumSwaps(int arr[]) {
//         int n = arr.length;
//         int swaps = 0;

//         for (int i = 0; i < n; i++) {
//             // While the current element is not at its correct position
//             while (arr[i] != i + 1) {
//                 // Swap the current element with the one at its correct position
//                 int temp = arr[i];
//                 arr[i] = arr[temp - 1];
//                 arr[temp - 1] = temp;
//                 swaps++;
//             }
//         }

//         return swaps;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 3, 1, 2};
//         System.out.println("Minimum swaps required: " + minimumSwaps(arr));
//     }
// }

// Another method


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.19 Bishu and Soldiers <->



// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.20 Rasta and Kheshtak <->


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.21  Kth smallest number again <->


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.22  Find pivot element in a sorted array <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.23  K-th Element of Two Sorted Arrays <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.24  Aggressive cows <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.25  Book Allocation Problem <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.26 EKOSPOJ: <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.27 Job Scheduling Algo <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.28 Missing Number in AP <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.29 Smallest number with atleastn trailing zeroes infactorial <->


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.30 Painters Partition Problem: <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.31  ROTI-Prata SPOJ <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Q.32 DoubleHelix SPOJ <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.33 Subset Sums <->


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.34 Findthe inversion count <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.35 Implement Merge-sort in-place <->

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.36 Partitioning and Sorting Arrays with Many Repeated Entries
