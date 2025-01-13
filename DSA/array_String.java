// --------------------------------------------------Sliding Winodw Problem
// ------------------------------------------------------
// Master Leetcode 485: A Step-by-Step Guide to Max Consecutive Ones
// Example Problem: Maximum Sum of Subarray of Size K
// LeetCode 643: Maximum Average Subarray of Size K
// LeetCode 209 - Minimum Size Subarray Sum
// Leetcode 487 Walkthrough: Finding the Longest Streak of Ones with One Flip
// Leetcode Problem 1004: Max Consecutive Ones III
// LeetCode 2090 | K Radius Subarray Averages Solution
// -------------------------------------------------------------------------------------------------------------------
// Arrays.toString(" ") ;
// Searching time jab bhi reduce karni hai tooh use - Sorting , Hashing
// jab bhi 2 array gien ho try to use this - while (i < m && j < n) {
// Subarray ke questions use - Sliding window
// Sliding Window technique - // right-left+1 = current length of the subarray ;

// Hashset Doesn't conatin Duplicates element
// PriorityQueue me data humesha order me store hota hai // use poll and peek
// . peek() will return the item at the head of the queue without removing it,
// while . poll() will return the head of the queue and remove it.
// HashMap<Integer,Integer> hs = new HashMap<>(); - Hashmap store variable and
// occurence coubt // Hashmap - keySet() , get() , put , remove(),
// containsKey(key): Returns true if the map contains the specified key.
// containsValue(value): Returns true if the map contains the specified value.
// ArrayList<Integer> ls = new ArrayList<>(); set , get

// ------------------------------------------------------------------------------------------------------------------
// Anagram
// Panagram
// Palindrome

// ------------------------------------------------------------------------------------------------------------------------------
// Difference Between Subarray and Subset:

// Subarray A contiguous part of the array.
// Subset Any combination of elements from the array.
// Subarray Order The order of elements is maintained.
// Subset The order of elements does not matter.
// Subarray Contiguity Elements must be contiguous.
// Subset Elements can be selected from anywhere.
// Subarray Size Can have sizes ranging from 1 to the size of the array.
// Subset Can include the empty set and the array itself.

// ------------------------------------------------------------------------------------------------------------------
// Array Sort the array <->
// Array Reverse the array <->
// Array Reverse the array from the Specific point <->
// Array Sum of array digits , // Annonymous array
// Array Find the Largest element in an array <->
// Array Find the Smallest element in an array <->
// Array Find the Largest and Smallest element in an array <->
// Array Find SECOND largest element in an array
// Array Find SECOND Minium element in an array
// Array Find the "Kth" max and min element of an array <->
// Array Q.4 Given an array which consists of only 0, 1 and 2. Sort the array
// without using any sorting algo <->
// Array Array is sorted or not TRue or False
// Array Remove Duplicates in sorted array
// Array Remove Duplicates in unsorted array
// Array find Duplicates in array and print only duplicates element only once
// Array Find Sub Array Of An Array
// Array Find Span of array {Span= max-min}
// Array Count of smaller or equal element in arraay
// Array Search the given element in array
// Array merege two array with extra Space
// Array merege two sorted array without any extra Space
// Array merege two unsorted array and make it sorted
// Array print 1 to n without loop
// Array Move all the negative elements to one side of the array
// Array Move all the negative elements to one side of the array and sort them
// in order <->
// 6.ArrayFind the Union and Intersection of the two sorted arrays. <->
// Array Write a program to cyclically rotate an array by one. <->
// Array Write a program to cyclically rotate an array by k. <->
// Array find Largest sum contiguous Subarray [V. IMP] <->
// Array Minimise the maximum difference between heights [V.IMP] <->
// 10.Array Minimum no. of Jumps to reach end of an array <->
// Array find duplicate in an array of N+1 Integers <->
// Array Merge 2 sorted arrays without using Extra space. <->
// Array Kadane's Algo [V.V.V.V.V IMP] <->
// 14.Array Merge Intervals <->
// Array Next Permutation <->
// Array Count Inversion <->
// Array Best time to buy and Sell stock <->
// Array find all pairs on integer array whose sum is equal to given number <->
// Array find common elements In 3 sorted arrays <->
// Array Rearrange the array in alternating positive and negative items with
// O(1) extra space <->
// 20. Array Find if there is any subarray with sum equal to 0 <->
// Array Find factorial of a large number <->
// Array find maximum product subarray <->
// Array Find longest coinsecutive subsequence <->
// Array Given an array of size n and a number k, fin all elements that appear
// more than " n/k " times. <->
// Array Maximum profit by buying and selling a share atmost twice <->
// Array Find whether an array is a subset of another array <->
// Array Find the triplet that sum to a given value <->
// Array Trapping Rain water problem <->
// Array Chocolate Distribution problem <->
// Array Smallest Subarray with sum greater than a given value <->
// Array Three way partitioning of an array around a given value <->
// Array Minimum swaps required bring elements less equal K together <->
// Array Minimum no. of operations required to make an array palindrome <->
// Array Median of 2 sorted arrays of equal size <->
// Array Median of 2 sorted arrays of different size
// ------------------------------------------------------------------------------------------------------------------
// 9,14,15,15.1 ,
// ------------------------------------------------------------------------------------------------------------------
// Array Sort the array <->
// Array Reverse the array <->
// Array Find the maximum and minimum element in an array <->
// Array Find the "Kth" max and min element of an array <->
// Array Given an array which consists of only 0, 1 and 2. Sort the array
// without using any sorting algo <->
// Array Move all the negative elements to one side of the array <->
// Array Find the Union and Intersection of the two sorted arrays. <->
// Array Write a program to cyclically rotate an array by one. <->
// Array find Largest sum contiguous Subarray [V. IMP] <->
// Array Minimise the maximum difference between heights [V.IMP] <->
// Array Minimum no. of Jumps to reach end of an array <->
// Array find duplicate in an array of N+1 Integers <->
// Array Merge 2 sorted arrays without using Extra space. <->
// Array Kadane's Algo [V.V.V.V.V IMP] <->
// Array Merge Intervals <->
// Array Next Permutation <->
// Array Count Inversion <->
// Array Best time to buy and Sell stock <->
// Array find all pairs on integer array whose sum is equal to given number <->
// Array find common elements In 3 sorted arrays <->
// Array Rearrange the array in alternating positive and negative items with
// O(1) extra space <->
// Array Find if there is any subarray with sum equal to 0 <->
// Array Find factorial of a large number <->
// Array find maximum product subarray <->
// Array Find longest coinsecutive subsequence <->
// Array Given an array of size n and a number k, fin all elements that appear
// more than " n/k " times. <->
// Array Maximum profit by buying and selling a share atmost twice <->
// Array Find whether an array is a subset of another array <->
// Array Find the triplet that sum to a given value <->
// Array Trapping Rain water problem <->
// Array Chocolate Distribution problem <->
// Array Smallest Subarray with sum greater than a given value <->
// Array Three way partitioning of an array around a given value <->
// Array Minimum swaps required bring elements less equal K together <->
// Array Minimum no. of operations required to make an array palindrome <->
// Array Median of 2 sorted arrays of equal size <->
// Array Median of 2 sorted arrays of different size

// --------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------- String

// Reverse a String
// Check whether a String is Palindrome or not
// Find Duplicate characters in a string
// Why strings are immutable in Java?
// Write a Code to check whether one string is a rotation of another
// Write a Program to check whether a string is a valid shuffle of two strings
// or not
// Count and Say problem
// Write a program to find the longest Palindrome in a string.[ Longest
// palindromic Substring]
// Find Longest Recurring Subsequence in String
// Print all Subsequences of a string.
// Print all the permutations of the given string
// Split the Binary string into two substring with equal 0's and 1’s
// Word Wrap Problem [VERY IMP].
// EDIT Distance [Very Imp]
// Find next greater number with same set of digits. [Very Very IMP]
// Balanced Parenthesis problem.[Imp]
// Word break Problem[ Very Imp]
// Rabin Karp Algo
// KMP Algo
// Convert a Sentence into its equivalent mobile numeric keypad sequence.
// Minimum number of bracket reversals needed to make an expression balanced.
// Count All Palindromic Subsequence in a given String.
// Count of number of given string in 2D character array
// Search a Word in a 2D Grid of characters.
// Boyer Moore Algorithm for Pattern Searching.
// Converting Roman Numerals to Decimal
// Longest Common Prefix
// Number of flips to make binary string alternate
// Find the first repeated word in string.
// Minimum number of swaps for bracket balancing.
// Find the longest common subsequence between two strings.
// Program to generate all possible valid IP addresses from given string.
// Write a program tofind the smallest window that contains all characters of
// string itself.
// Rearrange characters in a string such that no two adjacent are same
// Minimum characters to be added at front to make string palindrome
// Given a sequence of words, print all anagrams together
// Find the smallest window in a string containing all characters of another
// string
// Recursively remove all adjacent duplicates
// String matching where one string contains wildcard characters
// Function to find Number of customers who could not get a computer
// Transform One String to Another using Minimum Number of Given Operation
// Check if two given strings are isomorphic to each other
// Recursively print all sentences that can be formed from list of word lists

// --------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------- String

// 1. Reverse a String
// 2. Check whether a String is Palindrome or not
// 3. Find Duplicate characters in a string
// 4. Why strings are immutable in Java?
// 5. Write a Code to check whether one string is a rotation of another
// 6. Write a Program to check whether a string is a valid shuffle of two
// strings or not
// 7. Count and Say problem
// 8. Write a program to find the longest Palindrome in a string.[ Longest
// palindromic Substring]
// 9. Find Longest Recurring Subsequence in String
// 10. Print all Subsequences of a string.
// 11 .Print all the permutations of the given string
// 12. Split the Binary string into two substring with equal 0's and 1’s
// 13. Word Wrap Problem [VERY IMP].
// 14 .EDIT Distance [Very Imp]
// 15. Find next greater number with same set of digits. [Very Very IMP]
// 16. Balanced Parenthesis problem.[Imp]
// 17. Word break Problem[ Very Imp]
// 18. Rabin Karp Algo
// 19. KMP Algo
// 20. Convert a Sentence into its equivalent mobile numeric keypad sequence.
// 21. Minimum number of bracket reversals needed to make an expression
// balanced. Count All Palindromic Subsequence in a given String.
// 22. Count of number of given string in 2D character array
// 23. Search a Word in a 2D Grid of characters.
// 24. Boyer Moore Algorithm for Pattern Searching.
// 25. Converting Roman Numerals to Decimal
// 26. Longest Common Prefix
// 27. Number of flips to make binary string alternate
// Find the first repeated word in string.
// Minimum number of swaps for bracket balancing.
// Find the longest common subsequence between two strings.
// Program to generate all possible valid IP addresses from given string.
// Write a program tofind the smallest window that contains all characters of
// string itself.
// Rearrange characters in a string such that no two adjacent are same
// Minimum characters to be added at front to make string palindrome
// Given a sequence of words, print all anagrams together
// Find the smallest window in a string containing all characters of another
// string
// Recursively remove all adjacent duplicates
// String matching where one string contains wildcard characters
// Function to find Number of customers who could not get a computer
// Transform One String to Another using Minimum Number of Given Operation
// Check if two given strings are isomorphic to each other
// Recursively print all sentences that can be formed from list of word lists
