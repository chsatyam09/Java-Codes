// Master Leetcode 485: A Step-by-Step Guide to Max Consecutive Ones
// Leetcode 487 Walkthrough: Finding the Longest Streak of Ones with One Flip
// Leetcode Problem 1004: Max Consecutive Ones III
// LeetCode 2090 | K Radius Subarray Averages Solution

// Example Problem: Maximum Sum of Subarray of Size K
// LeetCode 643: Maximum Average Subarray of Size K
// LeetCode 209 - Minimum Size Subarray Sum
// Q. 13 Maximum Subarray


// --------------------------------------------------------------------------------------------------------

// Concept of Sliding Window
// The sliding window technique involves creating a "window" (a subarray or sublist) that slides over the input data structure, 
// typically an array or string. As the window slides, you calculate some value or perform some operation, keeping track of the maximum,
// minimum, sum, or other properties of the elements within the window.

// Types of Sliding Window
// Fixed-size Sliding Window: The window size remains constant as it slides through the array or string.
// Variable-size Sliding Window: The window size can change dynamically based on certain conditions.

// How It Works
// Start with a window that includes a subset of the array elements.
// Move the window by adding the next element from the array and removing the first element of the window.
// Repeat the process until you've covered all possible windows in the array.

// Use Cases:
// Finding maximum/minimum sums in subarrays.
// Finding the longest substring with unique characters.
// Checking for a particular pattern or condition within a substring.
// Finding the smallest subarray that meets a condition.


// Sliding Window technique  - // right-left+1 = current length of the subarray  ;

// public int findMaxConsecutiveOnes(int[] nums) {
//     int left = 0;
//     int ans = -1;
//     int right =0;


//     for( right = 0; right < nums.length; right++){

//         // "add" element nums [right] to window

//         // while condition not met             
//        // do some logic to remove left from window and left++

//         // update the answer

//     }
// }



// Example Problem: Maximum Sum of Subarray of Size K
// Given an array of integers and a number K, find the maximum sum of any contiguous subarray of size K.

// Naive Approach:
// A naive solution would be to iterate over all possible subarrays of size K, calculating the sum of each and keeping track of the maximum sum. This approach would have a time complexity of 
// O(n×K).

// code of Naive Approach:

// public class Sliding_winodw{

//     public static int maxSumSubarray(int[] arr, int k, int n) {
      
//         int maxSum = Integer.MIN_VALUE;

//         // Iterate over all possible subarrays of size K
//         for (int i = 0; i < n-k+1; i++) {
//             int currentSum = 0;

//             // Calculate the sum of the current subarray of size K
//             for (int j = i; j < i + k; j++) {
//                 currentSum += arr[j];
//             }

//             // Update the maximum sum if the current sum is greater
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//         }

//         return maxSum;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 1, 5, 1, 3, 2,9,9,9};
//         int k = 3;
//         int n = arr.length;
//         System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSumSubarray(arr, k,n));
//     }
// }

// Sliding Window Approach:
// The sliding window approach optimizes this to 

// O(n) by calculating the sum of the first window of size K and then sliding the window across the array.
// example - 
// public class Sliding_winodw {
//     public static void main(String[] args) {
//         int[] arr = {2, 1, 5, 1, 3, 2};
//         int k = 3;
//         System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSumSubarray(arr, k));
//     }

//     public static int maxSumSubarray(int[] arr, int k) {
//         int maxSum = 0;
//         int windowSum = 0;

//         // Calculate the sum of the first window
//         for (int i = 0; i < k; i++) {
//             windowSum += arr[i];
//         }

//         maxSum = windowSum;

//         // Slide the window from start to end of the array
//         for (int i = k; i < arr.length; i++) {
//             // Subtract the element that is left out of the window and add the new element
//             // windowSum += arr[i] - arr[i - k];
//             windowSum =  windowSum + arr[i] - arr[i - k];
//             maxSum = Math.max(maxSum, windowSum);
//         }

//         return maxSum;
//     }
// }

// Explanation:
// Initial Calculation:
// Calculate the sum of the first K elements (the first window).
// Slide the Window:
// Start from the next element in the array, slide the window by one element:
// Subtract the element that is now outside the window (first element of the previous window).
// Add the new element that has entered the window.
// Update the maximum sum if the current window's sum is greater than the previous maximum.
// Result:
// The maximum sum found during this process is the answer.


// ------------------------------------------------------------------------------------------------------------------------------


// Master Leetcode 485:  Max Consecutive Ones
// Input: nums = [1,1,0,1,1,1]
// Output: 3

// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int left =0;
//          int  window =0;
//          int ans=-1;

//         for(int right =0;right<nums.length;right++){
//             window = window+nums[right];
//             while(right-left+1 !=window){ // condiiotn satisfied nhi ho rahi hai tooh left se ek ek bahar nikalo
//                 window = window-nums[left];
//                 left++;
//             }
//                  ans =Math.max(ans,right-left+1);
//         }

//         return ans ;
        
//     }
// }



// Leetcode 487 Walkthrough: Finding the Longest Streak of Ones with One Flip
// Input: nums = [1,0,1,1,0]
// Output: 4
// Solutin - find  Longest subArray which contain at most 1 zero 


// public class Sliding_winodw{
//     public static int  findMaxConsecutiveOnes(int arr[]) {
//         int left =0;
//         int right =0;
//         int window =0;
//         int ans =0;

//         for ( right =0; right < arr.length; right++) {
//             window = window + arr[right];
//             while(!(right-left+1 == window || right-left ==window)){ 
//                 window = window-arr[left];
//                 left++;
//             }
//             ans = Math.max(ans,right-left+1);
//         }
//         return ans ;
//         }
//         public static void main(String[] args) {
//             int arr[]={1,0,1,1,0};
//             int x =findMaxConsecutiveOnes(arr);
//             System.out.println(x);
//         }
// }

// Leetcode Problem 1004: Max Consecutive Ones III - window(sum) ki value jaise hii kamm hui size size se +k k0 maaf kar do 
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0] k = 2
// Output: 6
// Solutin - find  Longest subArray which contain at most 2 zero 


// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int left =0;
//         int sum=0;
//         int n=nums.length;
//        int  window  =0 ;
//        int ans =0;

//         for(int right=0;right<n;right++){
//             window = window+nums[right];
//             while(window +k <right-left+1){
//                 window =window - nums[left];
//                 left++;
//             }
//             ans = Math.max(ans, right-left+ 1);
//         }


//         return ans ;
//     }
// }


// LeetCode 2090 | K Radius Subarray Averages Solution
// Input: nums = [7,4,3,9,1,8,5,2,6], k = 3
// Output: [-1,-1,-1,5,4,4,-1,-1,-1]
// Explanation:
// - avg[0], avg[1], and avg[2] are -1 because there are less than k elements before each index.
// - The sum of the subarray centered at index 3 with radius 3 is: 7 + 4 + 3 + 9 + 1 + 8 + 5 = 37.
//   Using integer division, avg[3] = 37 / 7 = 5.
// - For the subarray centered at index 4, avg[4] = (4 + 3 + 9 + 1 + 8 + 5 + 2) / 7 = 4.
// - For the subarray centered at index 5, avg[5] = (3 + 9 + 1 + 8 + 5 + 2 + 6) / 7 = 4.
// - avg[6], avg[7], and avg[8] are -1 because there are less than k elements after each index.

import java.util.Arrays;
class  Sliding_winodw {
    // Method to calculate the average of subarrays of length 2*k + 1 centered at each element
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long window = 0; // To hold the sum of the current window
        int temp[] = new int[n]; // Array to store the result
        Arrays.fill(temp, -1); // Fill the array with -1 as default values
        int idx = 2 * k + 1; // Size of the subarray
        int kk = k;

        // If the window size is greater than the array length, return the default array
        if (idx > n) {
            return temp;
        }

        // Calculate the sum of the first window
        for (int i = 0; i < idx; i++) {
            window = window + nums[i];
        }

        // Set the average for the first valid window position
        temp[kk] = (int) (window / idx);

        // Slide the window across the array
        for (int i = idx; i < n; i++) {
            window = window + nums[i] - nums[i - idx]; // Update window sum by adding the next element and removing the first element of the previous window
            temp[++k] = (int) (window / idx); // Calculate and store the average
        }

        return temp; // Return the resulting array
    }

    public static void main(String[] args) {
      Sliding_winodw solution = new Sliding_winodw();
        int[] nums = {7,4,3,9,1,8,5,2,6}; // Sample input array
        int k = 3; // Window radius
        int[] result = solution.getAverages(nums, k); // Call the method with the input array and window size

        // Print the result
        System.out.println("Averages of subarrays:");
        for (int avg : result) {
            System.out.print(avg + " ");
        }
    }
}



// LeetCode 643: Maximum Average Subarray I
// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

// public class Sliding_winodw {


//     public static int  MaximumAverageSubarray(int arr[], int n, int k){
//         int right =0;
//         int left =0;
//         int windowsum =0;
//         int ans =0 ;

//         for(right =0;right<k;right++){
//             windowsum = windowsum+arr[right];
//         }

//         ans = windowsum / k ;

//         for(right =k;right<n;right++){
//             windowsum = windowsum+arr[right] - arr[right-k];
//             ans  = Math.max(ans,windowsum/k);
//         }
//         return ans ;
      

//     }

//     public static void main(String[] args) {
//         int arr[] = {1,12,-5,-6,50,3} ;
//         // int arr[] = {2,1,5,1,3,2} ;
//         int  k =4;
//         int n = arr.length;
//         int x =MaximumAverageSubarray(arr,n,k);
//         System.out.println(x);

//     }
// }

// Another Mehtod 

// public class Sliding_winodw {
//     public static int MaximumAverageSubarray(int arr[], int k , int n){


//         int windowSum = 0;
//         int windowavg =0;
//         int maxsum =0;
//         for (int i = 0; i < n-k+1; i++) {
//             windowSum = windowSum+arr[i];  
//         }
//         maxsum = windowSum;


//         for (int i = k; i < arr.length; i++) {
//             windowSum = windowSum+arr[i] - arr[i-k];
//             maxsum = Math.max(maxsum, windowSum);

//         }

//         windowavg = maxsum / k ;

//         return windowavg ;


//     }

//     public static void main(String[] args) {
//                 // int arr[] = {2,1,5,1,3,2} ;
//                 int arr[] = {1,12,-5,-6,50,3} ;
//                 int  k =4;
//                 int n = arr.length;
//                 System.out.println(MaximumAverageSubarray(arr, k, n));
//     }
// }



// LeetCode 209 - Minimum Size Subarray Sum
// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.

// public class Sliding_winodw {

//     public static int SubaaraySum(int arr[], int n, int target){
//         int right =0;
//         int left =0;
//         int ans =n+1;
//         int windowSum =0;

//         for(right =0;right<n;right++){
//             windowSum =  windowSum+arr[right];
//             while (windowSum>=target) {
//                 ans = Math.min(ans,right-left+1);
//                 windowSum = windowSum-arr[left];
//                 left++;
                
//             }

//         }
//         return ans ;
//     }

//     public static void main(String[] args) {
//         int arr[]={2,3,1,2,4,3};
//         int n = arr.length;
//         int target =7;
//        int x = SubaaraySum(arr, n, target);
//        System.out.println(x);
//     }
// }

// Q. 13 Maximum Subarray

// public class array_Question {

//     public static int Kadane(int arr[], int n) {
//         int ans = Integer.MIN_VALUE; // Initialize with minimum value
//         int window = 0; // Variable to store the sum of the current subarray

//         for (int right = 0; right < n; right++) {
//             window += arr[right]; // Add the current element to the window

//             // Update the maximum sum found so far
//             ans = Math.max(ans, window);

//             // If the window becomes negative, reset it to zero
//             if (window < 0) {
//                 window = 0;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int n = arr.length;
//         System.out.println(Kadane(arr, n)); // Expected output: 6
//     }
// }






