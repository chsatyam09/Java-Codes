

// lovebabbar waalle Questions Neche se start hai 
// -------------------------------------------------------------------------------------

// Q.3 First Unique Character in a String
// techtricks
// ans - e index 1

// public class String_Question2 {

// public static int firstUniqChar(String str) {
// int n = str.length();
// int[] frequency = new int[26];

// // Convert the string to lowercase to handle both uppercase and lowercase
// uniformly
// str = str.toLowerCase();

// // Store frequency of all characters
// for (int i = 0; i < n; i++) {
// frequency[str.charAt(i) - 'a']++;
// }
// // // 'l' - 'a': Subtracts the ASCII value of 'a' (97) from the ASCII value
// of 'l' (108), resulting in 11. 108-97 =11
// // // frequency[11]: Accesses the element at index 11 in the frequency array.
// // // ++: Increments the value at frequency[11], which initially might be 0,
// to 1.

// // Traverse and check for the first character with frequency 1
// for (int i = 0; i < n; i++) {
// if (frequency[str.charAt(i) - 'a'] == 1) {
// return i;
// }
// }

// // Return -1 if no unique character is found
// return -1;
// }

// public static void main(String[] args) {
// String str = "techtricks";
// int index = firstUniqChar(str);
// System.out.println(index); // Output should be 0 for 'L'
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// 4 )• Valid Parentheses / Parenthesis Checker

// Java program for checking
// balanced brackets

// import java.util.*;
// public class String_Question2 {

// public static boolean isParenthesisMatching(String str) {
// Stack<Character> stack = new Stack<>();

// for (int i = 0; i < str.length(); i++) {
// char cur = str.charAt(i);

// if (isOpen(cur)) {
// stack.push(cur);
// } else {
// if (stack.isEmpty()) {
// return false;
// } else if (!isMatching( stack.peek(),cur)) { // stack.peek() == top element
// return false;
// } else {
// stack.pop();
// }
// }
// }

// return stack.isEmpty();
// }

// public static boolean isOpen(char cur) {
// return cur == '(' || cur == '[' || cur == '{';
// }

// public static boolean isMatching(char a, char b) {
// return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b ==
// '}');
// }

// public static void main(String[] args) {
// String str = "([{ }])";
// boolean result = isParenthesisMatching(str);
// System.out.println("Is the string balanced? " + result);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.5 Longest Substring Without Repeating Characters

// variable length sliding window ki problem hai
// HashMap

// import java.util.HashMap;
// import java.util.Map;

// public class String_Question2 {

// public static int substring(String str){

// int res=0; // store result
// int left =0; // starting pointer
// int right =0;
// char[]arr = str.toCharArray();
// Map<Character,Integer> map = new HashMap<>();
// for ( right = 0; right< arr.length; right++) {
// int idx = map.getOrDefault(arr[right],-1); // checking character is present
// or not if not return -1 ; if yes then index leke aaye

// if(idx !=-1 && idx>=left){ // we want -1 for unqiue character
// res = Math.max(res,right-1-left+1); // right-1-left+1 = length of substring
// left = idx+1;

// }
// map.put(arr[right], right); // store character and index

// }
// return Math.max(res,right-1-left+1) ; // if only one character then if
// condition will not execute with will return 0 everytime
// }
// public static void main(String[] args) {
// String str = "abcadabb";
// // String str = "bbbbb";
// int x = substring(str);
// System.err.println(x);

// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.6 Return all Susbstring Characters

// public class String_Question2 {

// public static void printAllSubstrings(String str) {
// // Outer loop to pick the starting index
// for (int i = 0; i < str.length(); i++) {
// // Inner loop to pick the ending index
// for (int j = i + 1; j <= str.length(); j++) {
// // Print the substring from index i to j-1
// System.out.println(str.substring(i, j)); // This means that the substring
// will include characters from index i up to but not including index j.
// }
// }
// }

// public static void main(String[] args) {
// String str = "abc";
// System.out.println("All substrings of the string '" + str + "' are:");
// printAllSubstrings(str);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------

// Q.6.1 Print all Subsequences / subset of a string

// public class String_Question2 {

// // Function to print all subsequences of the given string
// public static void printSubsequences(String str) {
// // Start with an empty string and the original string
// generateSubsequences(str, "", 0);
// }

// // Recursive function to generate subsequences
// private static void generateSubsequences(String str, String current, int
// index) {
// // Base case: if index reaches the length of the string, print the current
// subsequence
// if (index == str.length()) {
// System.out.println(current);
// return;
// }

// // Two recursive calls:
// // 1. Exclude the current character and move to the next index
// generateSubsequences(str, current, index + 1);

// // 2. Include the current character and move to the next index
// generateSubsequences(str, current + str.charAt(index), index + 1);
// }

// public static void main(String[] args) {
// String str = "abc"; // Example string
// System.out.println("All Subsequences of the string '" + str + "':");
// printSubsequences(str);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.7 Longest Common Prefix -

// public class String_Question2 {

// public static String common(String s1, String s2) {
// int n = Math.min(s1.length(), s2.length());
// StringBuilder sb = new StringBuilder();

// for (int i = 0; i < n; i++) {
// if (s1.charAt(i) == s2.charAt(i)) {
// sb.append(s1.charAt(i));
// } else {
// break;
// }
// }

// return sb.toString(); // return string me karna hai islie convert
// StringBuilder to String
// }

// public static String longestCommonPrefix(String[] strs) {
// if (strs.length == 0) {
// return "";
// }

// String res = strs[0]; // flower is stored here

// for (int i = 1; i < strs.length; i++) { // The for loop iterates through the
// remaining strings
// res = common(res, strs[i]); // For each string strs[i], it updates res to be
// the common prefix of res and strs[i] using the common method.
// }

// return res;
// }

// public static void main(String[] args) {
// String[] strs = {"flower", "flow", "flight"};
// String longestPrefix = longestCommonPrefix(strs);
// System.out.println("Longest common prefix: " + longestPrefix);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.8 Implement strStr()

// GeekforGeek
// for
// output = 4 (first Occurence)

// public class String_Question2 {

// // Function to find the first occurrence of the substring (needle) in the
// main string (haystack)
// public static int strStr(String haystack, String needle) {
// // If the needle is empty, return 0 as per the problem requirements
// if (needle.isEmpty()) {
// return 0;
// }

// // Get the lengths of the haystack and needle
// int haystackLength = haystack.length();
// int needleLength = needle.length();

// // Loop through the haystack, stopping when the remaining characters are
// fewer than the needle
// for (int i = 0; i < haystackLength - needleLength + 1; i++) {

// // Extract a substring from haystack starting at index i with the length of
// the needle
// // Check if the extracted substring matches the needle
// if(haystack.substring(i, i + needleLength).equals(needle)){
// return i ;
// }
// }

// // Return -1 if the needle is not found in the haystack
// return -1;
// }

// public static void main(String[] args) {
// // Example usage:
// String haystack = "hello world";
// String needle = "world";
// int index = strStr(haystack, needle);
// if (index != -1) {
// System.out.println("Substring found at index: " + index);
// } else {
// System.out.println("Substring not found");

// }
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.9 • String to Integer (atoi) / Implement (atoi)

// public class String_Question2 {
// public static void main(String[] args) {
// String str = "1234w";

// int num = Integer.parseInt(str);

// System.out.println(num);

// }
// }
// Another method

// public class String_Question2 {

// public static int atoi(String str,int n) {
// int result = 0;
// int i = 0;
// int sign = 1;

// // Ignore leading whitespaces
// while (i < n && str.charAt(i) == ' ') {
// i++;
// }

// // Check if the next character is a '+' or '-'
// if (i < n && str.charAt(i) == '+') {
// sign = 1;
// i++;
// } else if (i < n && str.charAt(i) == '-') {
// sign = -1;
// i++;
// }

// // while (i < n) {
// // if (str.charAt(i) < '0' || str.charAt(i) > '9') {
// // return -1;
// // }

// // Traverse the string and convert characters to numbers
// while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
// result = result * 10 + str.charAt(i) - '0';
// i++;
// }

// return result * sign;
// }

// public static void main(String[] args) {
// String str = "w5623 what";
// int n = str.length();
// int integerValue = atoi(str,n);
// System.out.println("Integer value: " + integerValue);
// }
// }

// //
// ---------------------------------------------------------------------------------------------------------------------
// Q.10 Wildcard Matching - Link
// Example 1:

// Input: s = "aa", p = "a"
// Output: false
// Explanation: "a" does not match the entire string "aa".
// Example 2:

// Input: s = "aa", p = "*"
// Output: true
// Explanation: '*' matches any sequence.
// Example 3:

// Input: s = "cb", p = "?a"
// Output: false
// '?' - Matches any single character
// Explanation: '?' matches 'c', but the second letter is 'a', which does not
// match 'b'.

// ---------------------------------------------------------------------------------------------------------------------
// Q.11 Minimum Window Substring
// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C'
// from string t.

// Example 1:

// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C'
// from string t.
// Example 2:

// Input: s = "a", t = "a"
// Output: "a"
// Explanation: The entire string s is the minimum window.
// Example 3:

// Input: s = "a", t = "aa"
// Output: ""
// Explanation: Both 'a's from t must be included in the window.
// Since the largest window of s only has one 'a', return empty string.

// import java.util.HashMap;
// import java.util.Map;

// class Solution {
// public String minWindow(String s, String t) {
// if (s == null || s.length() == 0 || t == null || t.length() == 0) {
// return "";
// }

// // Frequency map for characters in t
// Map<Character, Integer> targetFreq = new HashMap<>();
// for (char c : t.toCharArray()) {
// targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
// }

// // Frequency map for characters in the current window
// Map<Character, Integer> windowFreq = new HashMap<>();
// int left = 0, right = 0;
// int required = targetFreq.size();
// int formed = 0; // Tracks how many characters in the current window match
// targetFreq
// int minLength = Integer.MAX_VALUE;
// int start = 0; // Starting index of the minimum window

// // Expand the window with the right pointer
// while (right < s.length()) {
// char c = s.charAt(right);
// windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

// // Check if current character count matches the target character count
// if (targetFreq.containsKey(c) && windowFreq.get(c).intValue() ==
// targetFreq.get(c).intValue()) {
// formed++;
// }

// // Contract the window with the left pointer when all target characters are
// included
// while (left <= right && formed == required) {
// c = s.charAt(left);

// // Update the result if this window is smaller than previously found windows
// if (right - left + 1 < minLength) {
// minLength = right - left + 1;
// start = left;
// }

// // Remove the leftmost character from the window
// windowFreq.put(c, windowFreq.get(c) - 1);
// if (targetFreq.containsKey(c) && windowFreq.get(c).intValue() <
// targetFreq.get(c).intValue()) {
// formed--;
// }

// left++; // Move left pointer to shrink the window
// }

// right++; // Move right pointer to expand the window
// }

// // Return the minimum window substring or empty string if no valid window is
// found
// return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start +
// minLength);
// }

// // Main method to test the solution
// public static void main(String[] args) {
// Solution solution = new Solution();

// // Test cases
// System.out.println(solution.minWindow("ADOBECODEBANC", "ABC")); // Output:
// "BANC"
// System.out.println(solution.minWindow("a", "a")); // Output: "a"
// System.out.println(solution.minWindow("a", "aa")); // Output: ""
// System.out.println(solution.minWindow("aa", "aa")); // Output: "aa"
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.12 • Regular Expression Matching

// Problem Statement - Given an input string (s) and a pattern (p), implement
// regular expression matching with support for '.' and '*' where:

// '.' Matches any single character.​​​​
// '*' Matches zero or more of the preceding element.
// The matching should cover the entire input string (not partial).

// Example 1:

// Input: s = "aa", p = "a"
// Output: false
// Explanation: "a" does not match the entire string "aa".

// Example 2:

// Input: s = "aa", p = "a*"
// Output: true
// Explanation: '*' means zero or more of the preceding element, 'a'. Therefore,
// by repeating 'a' once, it becomes "aa".

// Example 3:

// Input: s = "ab", p = ".*"
// Output: true
// Explanation: ".*" means "zero or more (*) of any character (.)".

// Example 4:

// Input: s = "aab", p = "c*a*b"
// Output: true
// Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore,
// it matches "aab".

// Example 5:

// Input: s = "mississippi", p = "mis*is*p*."
// Output: false

// ---------------------------------------------------------------------------------------------------------------------
// Q.13 • Longest Substring with At Least K Repeating Characters
// https://www.youtube.com/watch?v=YSQVDVRQyA4
// Example 1:

// Input: s = "aaabb", k = 3
// Output: 3
// Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
// Example 2:

// Input: s = "ababbc", k = 2
// Output: 5
// Explanation: The longest substring is "ababb", as 'a' is repeated 2 times and
// 'b' is repeated 3 times.

// // Test cases
// System.out.println(solution.longestSubstring("aaabb", 3)); // Output: 3
// System.out.println(solution.longestSubstring("ababbc", 2)); // Output: 5
// System.out.println(solution.longestSubstring("aaabbbccc", 3)); // Output: 9
// System.out.println(solution.longestSubstring("abbacdec", 2)); // Output: 4
// System.out.println(solution.longestSubstring("aaabbccc", 3)); // Output: 3

// class Solution {
// public int longestSubstring(String s, int k) {
// // Frequency array to count occurrences of each character
// int[] freq = new int[26];
// // Convert string to character array
// char[] str = s.toCharArray();

// // Count the frequency of each character in the string
// for (char c : str) {
// int index = c - 'a';
// freq[index]++;
// }

// boolean valid = true;
// int start = 0;
// int maxLen = 0;

// // Iterate through the string
// for (int end = 0; end < s.length(); end++) {
// // Check if the current character has a valid frequency within the required
// range
// if (freq[str[end] - 'a'] > 0 && freq[str[end] - 'a'] < k) {
// // Split the string at the invalid character and call the function
// recursively
// String subString = s.substring(start, end);
// maxLen = Math.max(maxLen, longestSubstring(subString, k));
// start = end + 1;
// valid = false;
// }
// }

// // If the substring is valid, return its length
// if (valid) {
// return s.length();
// } else {
// // Recursively call the function for the remaining part
// return Math.max(maxLen, longestSubstring(s.substring(start), k));
// }
// }

// // Main method to test the solution
// public static void main(String[] args) {
// Solution solution = new Solution();

// // Test cases
// System.out.println(solution.longestSubstring("aaabb", 3)); // Output: 3
// System.out.println(solution.longestSubstring("ababbc", 2)); // Output: 5
// System.out.println(solution.longestSubstring("aaabbbccc", 3)); // Output: 9
// System.out.println(solution.longestSubstring("abcde", 2)); // Output: 0
// System.out.println(solution.longestSubstring("aaabbccc", 2)); // Output: 7
// }
// }

// Another method

// public class String_Question2{
// // Main function to find the longest substring with at least k repeating
// characters
// public int longestSubstring(String s, int k) {
// // Convert string to char array and call the helper function
// return helper(s.toCharArray(), 0, s.length(), k);
// }

// // Helper function that uses divide and conquer approach
// int helper(char[] ch, int start, int end, int k) {
// // Base case: if the length of the substring is less than k, return 0
// if (end - start < k) return 0;

// // Array to store the frequency of each character in the current substring
// int[] count = new int[26];
// // Count the frequency of each character
// for (int i = start; i < end; i++) {
// count[ch[i] - 'a']++;
// }

// // Iterate over the substring to find invalid characters (frequency < k)
// for (int i = start; i < end; i++) {
// // If a character's frequency is less than k, split and recurse
// if (count[ch[i] - 'a'] < k) {
// int j = i + 1;
// // Move j to the next character that's not invalid
// while (j < end && count[ch[j] - 'a'] < k) {
// j++;
// }
// // Recursively call helper for left and right substrings divided by the
// invalid character
// return Math.max(helper(ch, start, i, k), helper(ch, j, end, k));
// }
// }
// // If no invalid characters found, return the length of the current substring
// return end - start;
// }

// // Main method to test the solution
// public static void main(String[] args) {
// String_Question2 solution = new String_Question2();

// // Test cases
// System.out.println(solution.longestSubstring("aaabb", 3)); // Output: 3
// System.out.println(solution.longestSubstring("ababbc", 2)); // Output: 5
// System.out.println(solution.longestSubstring("aaabbbccc", 3)); // Output: 9
// System.out.println(solution.longestSubstring("abbacdec", 2)); // Output: 4
// System.out.println(solution.longestSubstring("aaabbccc", 3)); // Output: 3
// }
// }

// --------------------------------------------------------------------------------------------------------------------------------
// Q. 14 Remove Duplicates In string

// import java.util.HashSet;

// public class String_Question2 {

// public static void main(String[] args) {
// String str = "Satyam Raj Chaudhary";
// char[] arr = str.toCharArray();
// HashSet<Character> hashSet = new HashSet<>();

// for (int i = 0; i < arr.length; i++) {
// hashSet.add(arr[i]);
// }

// // Print the unique characters from the HashSet
// for (char ch : hashSet) {
// System.out.print(ch + " ");
// }
// }
// }

// Another Mehtod

// import java.util.HashSet;

// public class String_Question {

// public static void main(String[] args) {
// String str = "Satyam Raj Chaudhary";
// char[] arr = str.toCharArray();
// HashSet<Character> hashSet = new HashSet<>();
// int index = 0;

// for (int i = 0; i < arr.length; i++) {
// // If the character is not already in the set, add it
// if (!hashSet.contains(arr[i])) {
// hashSet.add(arr[i]);
// arr[index++] = arr[i]; // Place the unique character in the current position
// }
// }

// // Create a new string from the unique characters
// String uniqueStr = new String(arr, 0, index);
// System.out.println("String after removing duplicates: " + uniqueStr);
// }
// }

// import java.util.*;
// public class String_Question {

// public static void main(String[] args) {

// String str = "coconut";

// Set<Character> set = new LinkedHashSet<Character>();

// for(int i=0;i <str.length();i++) {

// set.add(str.charAt(i));

// }

// StringBuffer sb = new StringBuffer();

// for(Character c : set) {

// sb.append(c); // The append() method in Java is used to add new characters or
// strings to the end of a StringBuilder or StringBuffer object.
// It returns a reference to the modified object, allowing for method chaining.

// }

// System.out.println(sb);

// }

// }

// --------------------------------------------------------------------------------------------------------------------------------
// Q. 15 LeetCode 3 Solution in Hindi | Longest Substring Without Repeating
// Characters

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a
// substring.

// Same as Question Number - 5






















// ===================================================== lovebabbar =====================================================

// Q.1 Reverse a String <->

// public class String_Question {
// public static void main(String[] args) {
// String str="satyam ";
// for (int i = str.length()-1; i >=0; i--) {

//     System.out.print(str.charAt(i));
// }
// }
// }

// Another Mehtod 

// public class String_Question {
//     public static void main(String[] args) {
//     String str="satyam ";
//     String result="";
    
//     for (int i = str.length()-1; i >=0; i--) {
    
//         result=result+str.charAt(i) ;
//     }
    
//     System.out.println(result);
//     }
//     }

// ANother Method

// public class String_Question {
// public static void main(String[] args) {
// String str = "Satyam";
// char ch[] = str.toCharArray();
// StringBuilder sb = new StringBuilder();
// for (int i = str.length()-1; i >=0; i--) {
// sb.append(ch[i]);
// }
// System.out.println(sb.toString());
// }
// }

// shortcut- method

// public class String_Question {
// public static void main(String[] args) {

// StringBuffer r= new StringBuffer("pw-skills");
// System.out.println(r);
// System.out.println(r.reverse());
// }
// }

// Another Method

// public class String_Question {
// public static void main(String[] args) {
// String str ="Satyam";

// // Method 3: Using a loop and char array
// char[] charArray = str.toCharArray();
// int start = 0;
// int end = charArray.length - 1;

// while (start < end) {
// char temp = charArray[start];
// charArray[start] = charArray[end];
// charArray[end] = temp;
// start++;
// end--;
// }

// String reversedStr = new String(charArray);
// System.out.println("Reversed string using a loop and char array: " +
// reversedStr);
// }
// }
// ----------------------------------------------------------------------------------------------------------------------------

// Q. 1.2 Java Program to Reverse Each Word of a String

// Example –
// Input: Java Programming
// Output: avaJ gnimmargorP

// public class Rough {

//     public static void main(String[] args) {
//         String str = "Satyam raj Choufhary ";

//        String words[]=  str.split(" ");
//        String revString="";


//        for (int i = 0; i < words.length; i++) {
//         String word = words[i];
//                String reWord="";

//         for (int j = word.length()-1;j>=0;j--) {
//             reWord =  reWord + word.charAt(j);

//         }

//         revString = revString + reWord + " " ;
        
//        }

//        System.out.println(revString);


//     }
// }
// // Another Mehtod

// public class String_Question {

// public static void main(String[] args) {
// String str = "java Code"; // Input string
// String words[] = str.split(" "); // Split the string into words

// String revString = ""; // To store the final reversed string

// // Loop through each word
// for (String word : words) {
// String revWord = ""; // To store the reversed individual word
// // Reverse the current word
// for (int i = word.length() - 1; i >= 0; i--) {
// revWord = revWord + word.charAt(i); // Add each character in reverse order
// }
// revString = revString + revWord + " "; // Append the reversed word to the
// final string
// }

// System.out.println(revString.trim()); // Print the final reversed string
// }
// }
// ----------------------------------------------------------------------------------------------------------------------------

// Q.1.3 Java Program to Reverse Sentence By words

// INPUT = We are Learning java ;
// OUTPUT = java Learning are we ;

// public class String_Question {
// public static void main(String[] args) {
// String str = "We are Learning java" ;
// String Array[]= str.split(" ");
// for (int i = Array.length-1; i>=0;i--) {
// System.out.print(Array[i]+ " ");

// }

// }
// }

// INPUT = I.LKE.THIS.PROGRAM ;
// OUTPUT = PROGRAM.THIS.LIKE.I ;

// public class String_Question {
// public static void main(String[] args) {
// String str = "I.LKE.THIS.PROGRAM";
// String Array[] = str.split("\\.");
// for (int i = Array.length - 1; i >= 0; i--) {
// System.out.print(Array[i] + " ");
// }
// }
// }
// ---------------------------------------------------------------------------------------------------------------------

// Q.2 String Check whether a String is Palindrome or not <->

// EX- MADAM
// EX-NITIN
// EX-2552

// public class String_Question {
// public static void main(String[] args) {
// String s1="NITIN";
// String s2="";
// for (int i = s1.length()-1; i>=0; i--) {
// s2=s2+s1.charAt(i);

// }
// if(s1.equals(s2)){
// System.out.println("THIS IS A PALIDROME");
// }
// else{
// System.out.println("THIS IS NOT PALIDROME");
// }
// }
// }

// Another Mehtod

// public class String_Question {

// public static void main(String[] args) {
// String s1 = "nitin";
// int start = 0;
// int end = s1.length() - 1;

// while (start < end) {
// if (s1.charAt(start) != s1.charAt(end)) {
// System.out.println("This is not a palindrome");
// return;
// }
// start++;
// end--;
// }

// System.out.println("This is a palindrome");
// }
// }

// Another Mehtod

// public class String_Question {

// // Function to check if a string is a palindrome
// public static boolean isPalindrome(String str) {
// // Normalize the string: remove spaces, punctuation, and convert to lowercase
// str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

// // Initialize two pointers: one at the beginning and one at the end of the string
// int left = 0;
// int right = str.length() - 1;

// // Compare characters while moving towards the center
// while (left < right) {
// if (str.charAt(left) != str.charAt(right)) {
// return false; // Not a palindrome
// }
// left++;
// right--;
// }

// return true; // It's a palindrome
// }

// public static void main(String[] args) {
// String str = "madam";

// if (isPalindrome(str)) {
// System.out.println("'" + str + "' is a palindrome.");
// } else {
// System.out.println("'" + str + "' is not a palindrome.");
// }
// }
// }
// ---------------------------------------------------------------------------------------------------------------------
// Q.2.1 Java Program to find longest substring without repetition
// https://www.youtube.com/watch?v=sqxer2ynS6U&list=PLF9tovyahfL2pF-DWH7WQyuN_Cmz64DTT&index=21
// https://www.youtube.com/watch?v=ocBU0tKwX1g

// String str = "abcadabb"; - 4

// variable length sliding window ki problem hai
// HashMap

// import java.util.*;
// class String_Question {
// public static void lengthOfLongestSubstring(String s) {
// String longestSubstring = null;
// int lengthOfLongestSubstring = 0;
// Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
// char[] arr = s.toCharArray();
// int start = 0;

// for (int i = 0; i < arr.length; i++) {
// char ch = arr[i];
// if (!map.containsKey(ch)) {
// map.put(ch, i);
// }
// else{
// i = map.get(ch);
// map.clear();
// }
// if(map.size() > lengthOfLongestSubstring){
// lengthOfLongestSubstring = map.size();
// longestSubstring = map.keySet().toString();
// }

// }

// System.out.println(lengthOfLongestSubstring);
// System.out.println(longestSubstring);
// }

// public static void main(String[] args) {
// // lengthOfLongestSubstring("rsdhghkhjdrsbng");
// // lengthOfLongestSubstring("Satyam");
// // lengthOfLongestSubstring("abcadabb");
// // lengthOfLongestSubstring("bbbbb");
// lengthOfLongestSubstring("abbac");
// }
// }

// Another mehtod 

// import java.util.HashMap;
// import java.util.Map;

// public class String_Question {

// public static int substring(String str){

// int res=0; // store result
// int left =0; // starting pointer
// int right =0;
// char[]arr = str.toCharArray();
// Map<Character,Integer> map = new HashMap<>();
// for ( right = 0; right< arr.length; right++) {
// int idx = map.getOrDefault(arr[right],-1); // checking character is present or not if not assign idx =  -1 ; if yes then index leke aaye

// if(idx !=-1 && idx>=left){ // we want -1 for unqiue character
// res = Math.max(res,right-1-left+1); // right-1-left+1 = length of substring
// left = idx+1;

// }
// map.put(arr[right], right); // store character and index

// }
// return Math.max(res,right-1-left+1) ; // if only one character then if condition will not execute with will return 0 everytime
// }
// public static void main(String[] args) {
// String str = "abcadabb";
// // String str = "bbbbb";
// int x = substring(str);
// System.err.println(x);

// }
// }


// ---------------------------------------------------------------------------------------------------------------------
// Q.2.2 Longest Palindrome | leetcode 409
// abccccdd
// aabbbbbcccdd

// yaha pe string ko todd jodd ke ek new string banao jo longest Longest
// Palindrome ho , length batana hai
// palindrome is basically two types odd length and even length palindrome ;

// All evenn frequency and odd frequency character only one odd times in the
// middle or odd frequency 3 character make it to even 2 times

// import java.util.HashMap;

// class String_Question {

//     public int longestPalindrome(String s) {
//         HashMap<Character, Integer> hm = new HashMap<>();
        
//         // Count the occurrences of each character
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             hm.put(c, hm.getOrDefault(c, 0) + 1);
//         }

//         int ans = 0;
//         boolean isFirstOdd = false;

//         // Calculate the length of the longest palindrome
//         for (Character key : hm.keySet()) {
//             if (hm.get(key) % 2 == 0) {
//                 ans += hm.get(key);
//             } else {
//                 if (!isFirstOdd) {
//                     ans += hm.get(key);
//                     isFirstOdd = true;
//                 } else {
//                     ans += hm.get(key) - 1;
//                 }
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         String_Question sq = new String_Question();
//         String str = "abccccdd";
        
//         // Find and print the longest palindrome length
//         int result = sq.longestPalindrome(str);
//         System.out.println("The length of the longest palindrome that can be built is: " + result);
//     }
// }


// ---------------------------------------------------------------------------------------------------------------------

// Q.2.3 String Write a program to find the longest Palindrome in a string.[Longest palindromic Substring] <->
// substring - continous
// Subsequence - is not mandotry to be continous
// every - substring is a subsequence but every subsequence is not substring
// Order of both Subsequence and substring is same


// public class String_Question {
// public static void longPalinSub(String s) {
// int start = 0, end = 1;
// // Check for even-length palindromes (center is between i-1 and i)
// for (int i = 1; i < s.length(); i++) {

// int l = i - 1;
// int h = i;
// while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
// if (h - l + 1 > end) {
// start = l;
// end = h - l + 1;
// }
// l--;
// h++;
// }
// // Check for odd-length palindromes (center is i)

// l = i - 1;
// h = i + 1;
// while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
// if (h - l + 1 > end) {
// start = l;
// end = h - l + 1;
// }
// l--;
// h++;
// }
// }

// System.out.println(s.substring(start, start + end));
// }

// public static void main(String[] args) {
// String s = "acvghgvpbab";
// longPalinSub(s);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.4 find the Longest palindromic subsequence ?

// public class String_Question {
// // Recursive function to find the length of the longest palindromic
// subsequence
// public static int lps(String str, int start, int end) {
// // Base case: if the starting index is greater than the end index
// if (start > end) {
// return 0;
// }

// // Base case: if the starting index is equal to the end index (single
// character)
// if (start == end) {
// return 1;
// }

// // If characters at the current start and end are equal
// if (str.charAt(start) == str.charAt(end)) {
// return 2 + lps(str, start + 1, end - 1);
// }

// // If characters at start and end are not equal, find max by excluding either
// character
// return Math.max(lps(str, start + 1, end), lps(str, start, end - 1));
// }

// // Main method to test the lps function
// public static void main(String[] args) {
// // Example test cases
// String str1 = "abefbac";
// String str2 = "racecar";
// String str3 = "abcda";
// String str4 = "acdfefghjat";
// String str5 = "abefbaccabfeba";

// // Output the results for each test case
// System.out.println("Longest Palindromic Subsequence length for '" + str1 +
// "': " + lps(str1, 0, str1.length() - 1)); // Output: 3
// System.out.println("Longest Palindromic Subsequence length for '" + str2 +
// "': " + lps(str2, 0, str2.length() - 1)); // Output: 7
// System.out.println("Longest Palindromic Subsequence length for '" + str3 +
// "': " + lps(str3, 0, str3.length() - 1)); // Output: 3
// System.out.println("Longest Palindromic Subsequence length for '" + str4 +
// "': " + lps(str4, 0, str4.length() - 1)); // Output: 2
// System.out.println("Longest Palindromic Subsequence length for '" + str5 +
// "': " + lps(str5, 0, str5.length() - 1)); // Output: 1
// }
// }

// Another Mehtod

// class Solution {
// public int longestPalindromeSubseq(String s) {
// // Call the recursive helper function with initial start and end indices
// return lps(s, 0, s.length() - 1);
// }

// // Recursive helper function to find the longest palindromic subsequence
// private int lps(String str, int start, int end) {
// if (start > end) {
// return 0;
// }

// // Base case: if the starting index is equal to the end index (single
// character)
// if (start == end) {
// return 1;
// }

// // If characters at the current start and end are equal
// if (str.charAt(start) == str.charAt(end)) {
// return 2 + lps(str, start + 1, end - 1);
// }

// // If characters at start and end are not equal, find max by excluding either
// character
// return Math.max(lps(str, start + 1, end), lps(str, start, end - 1));
// }

// public static void main(String[] args) {
// Solution solution = new Solution();

// // Example test case
// String input = "abebeac";
// int result = solution.longestPalindromeSubseq(input);

// // Output the result
// System.out.println("The length of the longest palindromic subsequence is: " +
// result);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.5 Minimum characters to be added at front to make string palindrome. <->

// -----------------------------------------------------------------------------

// Q.2.6 Minimum number of insertion in a string to make it a palindrome

// reverse karek usme add kar do (maximum insrtion hogaya )

// -----------------------------------------------------------------------------
// Q.2.7 Minimum number of Deletion in a string to make it a palindrome

// public class String_Question {
// public static int minDeletionsToMakeStringPalindrome(String str) {
// if(str == null || str.length() == 0) {
// return 0;
// }

// return str.length() - lpsBottomUp(str, str.length());
// }

// public static int lpsBottomUp(String str, int n) {
// int[][] arr = new int[n][n];

// for (int i = 0; i < str.length(); i++) {
// arr[i][i] = 1;
// }

// for(int i = n - 2; i >= 0; i--) {
// for(int j = i + 1; j < n; j++) {

// if(str.charAt(i) == str.charAt(j)) {
// arr[i][j] = 2 + arr[i + 1][j - 1];
// } else {
// arr[i][j] = Math.max(arr[i + 1][j], arr[i][j - 1]);
// }
// }
// }

// return arr[0][n - 1];
// }

// public static void main(String[] args) {
// String str = "abefbac";

// System.out.println(minDeletionsToMakeStringPalindrome(str));
// }

// }

// -----------------------------------------------------------------------------

// ANAGRAM PROGRAM
// Q.2.8
// Steps to perform anagram program :
// 1.remove space
// 2. check the length of both String
// 3.convert to lower_case
// 3.convert to an array char
// 4.Sort ex- a= 65
// compare array


// import java.util.HashMap;
// import java.util.Map;

// class Solution {

//     public boolean isAnagram(String s, String t) {
//         int sl = s.length();
//         int tl = t.length();

//         // If lengths differ, they cannot be anagrams
//         if (sl != tl) {
//             return false;
//         }

//         Map<Character, Integer> map = new HashMap<>();

//         // Increment count for characters in 's' and decrement for characters in 't'
//         for (int i = 0; i < sl; i++) {
//             Character sc = s.charAt(i);
//             Character st = t.charAt(i);

//             map.put(sc, map.getOrDefault(sc, 0) + 1);
//             map.put(st, map.getOrDefault(st, 0) - 1);
//         }

//         // If any value in the map is not zero, return false
//         for (int count : map.values()) {
//             if (count != 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();

//         String s = "anagram";
//         String t = "nagaram";

//         boolean result = solution.isAnagram(s, t);
//         System.out.println("Are the strings \"" + s + "\" and \"" + t + "\" anagrams? " + result);

//         // Example of non-anagram
//         String s2 = "rat";
//         String t2 = "car";

//         boolean result2 = solution.isAnagram(s2, t2);
//         System.out.println("Are the strings \"" + s2 + "\" and \"" + t2 + "\" anagrams? " + result2);
//     }
// }




// Another Mehtod 

// import java.util.Arrays;

// public class String_Question {

// public static void main(String[] args) {
// String s1 = " School Master ";
// String s2 = " The Classroom";

// // Removing white spaces from both strings
// s1 = s1.replace(" ", "");
// s2 = s2.replace(" ", "");

// // Check the length of both strings; if they are not equal, they cannot be anagrams
// if (s1.length() != s2.length()) {
// System.out.println("THIS IS NOT an anagram");
// return;
// }

// // Convert both strings to lowercase to make the comparison case-insensitive
// s1 = s1.toLowerCase();
// s2 = s2.toLowerCase();

// // Convert both strings to character arrays
// char[] ar1 = s1.toCharArray();
// char[] ar2 = s2.toCharArray();

// // Sort the character arrays
// Arrays.sort(ar1);
// Arrays.sort(ar2);

// // Compare the sorted arrays
// if (Arrays.equals(ar1, ar2)) {
// System.out.println("THIS IS AN ANAGRAM");
// } else {
// System.out.println("THIS IS NOT an anagram");
// }
// }
// }

// Another Mehtod

// public class String_Question {

// public static void main(String[] args) {
// String s1 = " School Master ";
// String s2 = " The Classroom";

// // Remove all spaces from both strings
// s1 = s1.replace(" ", "");
// s2 = s2.replace(" ", "");

// // Check the length of both strings; if they are not equal, they cannot be anagrams
// if (s1.length() != s2.length()) {
// System.out.println("THIS IS NOT an anagram");
// return;
// }

// // Convert both strings to lowercase to make the comparison case-insensitive
// s1 = s1.toLowerCase();
// s2 = s2.toLowerCase();

// // Check if the strings are anagrams using frequency counting
// if (areAnagrams(s1, s2)) {
// System.out.println("THIS IS AN ANAGRAM");
// } else {
// System.out.println("THIS IS NOT an anagram");
// }
// }

// // Helper method to check if two strings are anagrams using frequency arrays
// private static boolean areAnagrams(String s1, String s2) {
// // Create an array to count the frequency of each character (26 letters of the alphabet)
// int[] charCount = new int[26];

// // Increment the count for each character in the first string
// for (char word : s1.toCharArray()) {
// charCount[word - 'a']++;
// }

// // Decrement the count for each character in the second string
// for (char word : s2.toCharArray()) {
// charCount[word - 'a']--;
// }

// // Check if all counts are zero, which means the strings are anagrams
// // The array charCount should be all zeros if the strings are anagrams because each character in s1 is perfectly balanced by the same character in s2.
// for (int count : charCount) {
// if (count != 0) {
// return false;
// }
// }

// return true;
// }
// }

// ---------------------------------------------------------------------------------------------------------------------

// Q.2 9 Group Anagrams
// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:

// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form
// each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to
// form each other.

// import java.util.*;

// public class String_Question {
// public static List<List<String>> groupAnagrams(String[] strs) {
// // HashMap to store sorted string as key and list of anagrams as value
// Map<String, List<String>> map = new HashMap<>();

// // Loop through each string in the input array
// for (String str : strs) {
// // Convert the string to a char array and sort it to create the key
// char[] charArray = str.toCharArray();
// Arrays.sort(charArray);
// String sortedStr = new String(charArray); // wapas string bana deta hai

// // If the sorted string is not in the map, add it with an empty list
// if (!map.containsKey(sortedStr)) {
// map.put(sortedStr, new ArrayList<>());
// }

// // Add the original string to the list of its corresponding sorted key
// map.get(sortedStr).add(str);
// }

// // Return the values of the map as a list of lists
// return new ArrayList<>(map.values());
// }

// public static void main(String[] args) {
// // Example input
// String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

// // Get the grouped anagrams
// List<List<String>> result = groupAnagrams(strs);

// // Print the result
// System.out.println(result);
// }
// }

// -----------------------------------------------------------------------------

// PANGRAM PROGRAM
// Q.2.10
// A to Z sarre letters hone chaiye

// public class string
// {
// public static void main(String[] args)
// {
// boolean flag=false;
// String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";

// // this line for removing white spaces
// str=str.replace(" ", "");

// // this line for converting to lower case ;
// // str=str.toLowerCase() ;

// // this line for converting to an char array
// char []ch=str.toCharArray();

// // create an empty array of total alphabet Size
// int arr[]=new int[26];

// for(int i=0;i<ch.length;i++)
// {
// arr[ch[i]-65]++; // T=84 - 65 = 19 new array i.e arr me 19 .. o ki jagah 1 ho
// jayegaa
// }
// for(int i=0;i<arr.length;i++)
// {
// if(arr[i]==0)
// {
// System.out.println("Its not pangram");
// flag=true;
// }
// }

// if(flag==false)
// {
// System.out.println("Its pangram");
// }
// }
// }
// ---------------------------------------------------------------------------------------------------------------------

// Q.3 Find Duplicate characters in a string <->
// print Duplicate Characters only

// public class String_Question {

// public static void main(String[] args) {
// String str = "Automation";
// int count = 0;
// char[] ch = str.toCharArray();

// for (int i = 0; i < ch.length; i++) {
// boolean isDuplicate = true;
// for (int j = i + 1; j < ch.length; j++) {
// if (ch[i] == ch[j] && isDuplicate) {
// System.out.println("Duplicate character in String is: " + ch[i]);
// count++;
// }
// }
// }

// System.out.println("Duplicate characters count: " + count);
// }
// }

// Another Mehtod

// import java.util.HashMap;
// import java.util.Map;

// public class String_Question {

// public static void main(String[] args) {
// String str = "arun motootri";
// char[] ca = str.toCharArray();

// Map<Character, Integer> map = new HashMap<>();

// for (char c : ca) {
// map.put(c, map.getOrDefault(c, 0) + 1);
// }

// System.out.println("Characters appearing more than once:");
// for (Map.Entry<Character, Integer> entry : map.entrySet()) {
// if (entry.getValue() > 1) {
// System.out.println(entry.getKey() + ": " + entry.getValue());
// }
// }
// }
// }

// -----------------------------------------------------------------------------
// Q.4 Why strings are immutable in Java? <->

// immmutable - objects whose contents can'not be chamged ..
// immmutable String or objects that cannot be modified once it is created. but
// we can only hnage the refrence to the objects
// String is immutable in java because of the security synchronization and
// concurrency ,caching and class loading .

// Thread Safety:
// Immutability makes strings inherently thread-safe. Since strings cannot be
// modified,

// Caching:
// String literals are cached in a special string pool in Java.
// When you create a new string literal with the same value as an existing one,
// the JVM reuses the existing object from the pool.
// This helps in conserving memory and improving performance.they can be safely
// shared among multiple threads without the need for external synchronization
// mechanisms.

// Security:
// Strings are widely used in various security-related operations, such as
// storing passwords or cryptographic keys.
// Immutability ensures that once a string is created, its value cannot be
// changed, preventing unintended modifications

// public class String_Question {

// public static void main(String[] args) {
// String s1=new String("hello world "); // heap me banaega or ek copy scp me
// (refrence stack se s1)
// String s2= "hello ji";// scp me banaega (refrence stack se s2)
// String s3= " hello world "; // s1 ka jo copy tha scp me s3 usse refrence lega
// (refrence stack se s3)
// String s4 = new String("hello ji");
// s2.concat("satyam "); // dekha chnage nhi hua ek baar jo scp me baan gaya wo
// chnage nhyi hoga
// s2=s2.concat("Satyam"); //this is possible ,value chnage nhi hua hai , pura
// ka pura new hii bana hai

// // string constant pool (scp) me same element dubara nhi banega orr ek baar
// value baan gaya tooh change bhi nhi hoga

// System.out.println(s1);
// System.out.println(s2);
// System.out.println(s3);
// System.out.println(s4);
// }
// }

// The sort(String str) function is necessary because Java strings are
// immutable, meaning that once a string is created, it cannot be changed.
// Therefore, to sort the characters in a string, you need to:

// Convert the string into a character array (because arrays are mutable).
// Sort the character array.
// Convert the sorted character array back into a string.

// -------------------------------------------------------------------------------------------------------------

// Q.5 String Write a Code to check whether one string is a rotation of another
// <->
// Check If One String Is A Rotation Of Another String

// public class String_Question {

// static boolean isRotation(String s , String goal){
// if(s.length()== goal.length() && (s+s).contains(goal)){
// return true ;
// }
// else{
// return false ;
// }
// }
// public static void main(String[] args) {
// String s="abcde";
// String goal="cdeab";
// System.out.println(isRotation(s, goal));

// }
// }

// -----------------------------------------------------------------------------
// Q.6 String Write a Program to check whether a string is a valid shuffle of
// two strings or not <->

// Shuffle two Strings

// import java.util.*;
// public class String_Question {
// public static boolean isValidShuffle(String str1, String str2, String
// shuffle) {

// // length finding and matching
// int len1 = str1.length();
// int len2 = str2.length();
// int lenShuffle = shuffle.length();

// if (len1 + len2 != lenShuffle) {
// return false;
// }

// // Sorting all String
// str1=sort(str1);
// str2=sort(str2);
// shuffle=sort(shuffle);

// int i = 0, j = 0, k = 0;

// while (k < lenShuffle) {
// if (i < len1 && str1.charAt(i) == shuffle.charAt(k)) {
// i++;
// } else if (j < len2 && str2.charAt(j) == shuffle.charAt(k)) {
// j++;
// } else {
// return false;
// }
// k++;
// }

// return true;
// }

// // ye nhi samjh aaya
// private static String sort(String input) {
// char[] charArray = input.toCharArray();
// Arrays.sort(charArray);
// return new String(charArray);
// }

// public static void main(String[] args) {
// String str1 = "abc";
// String str2 = "123";
// String shuffle1 = "a1b2c3";
// String shuffle2 = "bca321";
// String shuffle3 = "ac312b";

// System.out.println(isValidShuffle(str1, str2, shuffle1));
// System.out.println(isValidShuffle(str1, str2, shuffle2));
// System.out.println(isValidShuffle(str1, str2, shuffle3));
// }
// }
// -----------------------------------------------------------------------------

// Q.6.1 Shuffle Strings

// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
// Output: "leetcode"
// Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

// class String_Question {
// public String restoreString(String s, int[] indices) {
// char arr[] = new char[s.length()];
// for(int i=0;i<s.length();i++)
// {
// arr[indices[i]] = s.charAt(i);
// }
// String res = String.valueOf(arr);
// return res;
// }
// }

// Another Method

// class String_Question {
// public String restoreString(String s, int[] indices) {
// // Create a character array to store the rearranged characters
// char[] arr = new char[s.length()];

// // Loop through the string to place each character in the correct position
// for (int i = 0; i < s.length(); i++) {
// arr[indices[i]] = s.charAt(i);
// }

// // Convert the character array back to a string and return it
// return new String(arr);
// }

// public static void main(String[] args) {
// Solution solution = new Solution();

// // Example string and indices array
// String s = "codeleet";
// int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

// // Call the restoreString method and print the result
// String restoredString = solution.restoreString(s, indices);
// System.out.println("Restored String: " + restoredString); // Output:
// "leetcode"
// }
// }
// -----------------------------------------------------------------------------

// Recusrion

// public class String_Question {
// public static void recursive(int n){
// if(n<0){
// return ;
// }
// else{
// recursive(n-1);
// System.out.println(n);
// }
// }

// public static void main(String[] args) {
// int n =10;
// recursive(n);

// }
// }

// -----------------------------------------------------------------------------

// Q.7 String Count and Say problem <->
// Count And Say

// Q.3322251
// soluton - two 3 ,three 2 ,one 5,one 1 = " 23321511" ;
// no of count of element and that element frequency and element = count and i

// Example 2:
// Input: n = 4
// Output: 1211
// Explanation: phle frquentcy then element
// countAndSay(1) = "1"
// countAndSay(2) = say 1 ko dekho i.e."1" = one time 1 = "11"
// countAndSay(3) = say 2 ko dekho i.e."11" = two time 1's = "21"
// countAndSay(4) = say 3 ko dekho i.e."21" = one time 2 + one time 1 = "12" +
// "11" = "1211"
// extra
// countAndSay(5) = say 4 ko dekho i.e."1211" = one time 1 + one time 2 + two
// time 1 = "11" + "12" + "21"= "111221"

// koi bhi vlaue nikale ke lie peeche waala vlaue ki jarurat hai islie we used
// recusrion

// import java.io.*;
// public class Solution
// {
// public static String writeAsYouSpeak(int n)
// {
// if (n == 1) return "1";

// // Recursion
// String s = writeAsYouSpeak(n - 1);
// String res = "";
// int counter = 1;

// for (int i = 0; i < s.length(); i++) {
// if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
// counter++;
// } else {
// res = res + counter + s.charAt(i);
// counter = 1; // Reset counter for the next different character
// }
// }

// return res;
// }
// }

// Another Mehtod

// public class String_Question {

// public String countAndSay(int n) {
// // Base case: if n is 1, return "1"
// if (n == 1) return "1";

// // Recursively get the previous term
// String s = countAndSay(n - 1);
// StringBuilder res = new StringBuilder();
// int counter = 1;

// // Iterate through the string to construct the count-and-say sequence
// for (int i = 0; i < s.length(); i++) {
// // Count consecutive characters
// if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
// counter++;
// } else {
// // Append count and character to the result
// res.append(counter).append(s.charAt(i));
// counter = 1;
// }
// }

// return res.toString();
// }

// public static void main(String[] args) {
// String_Question obj = new String_Question();

// // Specify the desired sequence number n
// int n = 5; // Change this value to test other sequences

// // Call the countAndSay method and print the result
// String result = obj.countAndSay(n);
// System.out.println("Count and Say sequence for n = " + n + " is: " + result);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.8 Palindrome Partitioning

// import java.util.*;

// public class String_Question {

// // Function to check if a given string is a palindrome
// private static boolean isPalindrome(String s) {
// int left = 0, right = s.length() - 1;
// while (left < right) {
// if (s.charAt(left) != s.charAt(right)) {
// return false;
// }
// left++;
// right--;
// }
// return true;
// }

// // Helper function for backtracking to find all partitions
// private static void backtrack(String s, int start, List<String> path,
// List<List<String>> result) {
// if (start >= s.length()) {
// result.add(new ArrayList<>(path));
// return;
// }

// for (int end = start + 1; end <= s.length(); end++) {
// String substring = s.substring(start, end);
// if (isPalindrome(substring)) {
// path.add(substring);
// backtrack(s, end, path, result);
// path.remove(path.size() - 1); // Backtrack
// }
// }
// }

// // Main function to get all palindromic partitions
// public static List<List<String>> partition(String s) {
// List<List<String>> result = new ArrayList<>();
// backtrack(s, 0, new ArrayList<>(), result);
// return result;
// }

// public static void main(String[] args) {
// String s = "aab";
// List<List<String>> partitions = partition(s);

// for (List<String> partition : partitions) {
// System.out.println(partition);
// }
// }
// }

// -----------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.10 String Print all Subsequences of a string. <->
// Subsequences - order same rahega
// Subsequence - is not mandotry to be continous
// abc - “a” , “b” , “c” , “ab” , “bc” , “ac”, “abc”

// -----------------------------------------------------------------------------

// Q.10.1 Print the SuperSet/ PowerSet/ subsets of the given string <->
// abc - “a” , “b” , “c” , “ab” , “bc” , “ac”, “abc”

// import java.util.ArrayList;
// import java.util.List;

// public class String_Question {

// public static void powerset(String s, int i, String cur, List<String> result)
// {
// if (i == s.length()) {
// result.add(cur);
// return;
// }

// powerset(s, i + 1, cur + s.charAt(i), result);
// powerset(s, i + 1, cur, result);
// }

// public static List<String> generatePowerset(String s) {
// List<String> result = new ArrayList<>();
// powerset(s, 0, "", result);
// return result;
// }

// public static void main(String[] args) {
// String s = "abc";
// List<String> powerSet = generatePowerset(s);

// System.out.println("Powerset of " + s + ": " + powerSet);
// }
// }

// -----------------------------------------------------------------------------

// Q.10.2 String Print all the permutations of the given string. <->
// Sample Input 1:
// cba
// Sample Output 1:
// abc
// acb
// bac
// bca
// cab
// cba

// public class StringPermutations {

// // Function to swap characters at two indices in a char array
// private static void swap(char[] array, int i, int j) {
// char temp = array[i];
// array[i] = array[j];
// array[j] = temp;
// }

// // Function to print permutations of the string
// private static void permute(char[] array, int l, int r) {
// if (l == r) {
// System.out.println(new String(array));
// } else {
// for (int i = l; i <= r; i++) {
// swap(array, l, i);
// permute(array, l + 1, r);
// swap(array, l, i); // backtrack
// }
// }
// }

// public static void main(String[] args) {
// String str = "ABC";
// char[] array = str.toCharArray();
// permute(array, 0, array.length - 1);
// }
// }

// Another Mehtod

// public class String_Question {
// // Method to print all permutations of the given string
// public static void printPermutations(String str) {
// // Call the helper method with an empty prefix and the full string
// permute("", str);
// }

// // Recursive helper method to generate permutations
// private static void permute(String prefix, String str) {
// int n = str.length();
// // Base case: if the string is empty, print the prefix
// if (n == 0) {
// System.out.println(prefix);
// } else {
// // Recursively generate permutations by fixing each character
// for (int i = 0; i < n; i++) {
// permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1,
// n));
// }
// }
// }

// public static void main(String[] args) {
// String input = "abc"; // Replace with your desired string
// System.out.println("Permutations of '" + input + "':");
// printPermutations(input);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.10.3 String Print all the substring of the given string <->

// public class String_Question {
// // Method to print all substrings of the given string
// public static void printSubstrings(String str) {
// int n = str.length();

// // Iterate over all possible start indices
// for (int start = 0; start < n; start++) {
// // Iterate over all possible end indices
// for (int end = start + 1; end <= n; end++) {
// // Extract and print the substring from start to end index
// System.out.println(str.substring(start, end));
// }
// }
// }

// public static void main(String[] args) {
// String input = "abc"; // Replace with your desired string
// System.out.println("Substrings of '" + input + "':");
// printSubstrings(input);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// 10.4 String Longest Common Prefix <->

// public class String_Question {

// public static String common(String s1, String s2) {
// int n = Math.min(s1.length(), s2.length());
// StringBuilder sb = new StringBuilder();

// for (int i = 0; i < n; i++) {
// if (s1.charAt(i) == s2.charAt(i)) {
// sb.append(s1.charAt(i));
// } else {
// break;
// }
// }

// return sb.toString(); // return string me karna hai islie convert
// StringBuilder to String
// }

// public static String longestCommonPrefix(String[] strs) {
// if (strs.length == 0) {
// return "";
// }

// String res = strs[0]; // flower is stored here

// for (int i = 1; i < strs.length; i++) { // The for loop iterates through the
// remaining strings
// res = common(res, strs[i]); // For each string strs[i], it updates res to be
// the common prefix of res and strs[i] using the common method.
// }

// return res;
// }

// public static void main(String[] args) {
// String[] strs = {"flower", "flow", "flight"};
// String longestPrefix = longestCommonPrefix(strs);
// System.out.println("Longest common prefix: " + longestPrefix);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q. 10.5 Delete the repeated character in string. <->

// import java.util.LinkedHashSet;
// import java.util.Set;

// public class String_Question {
// // Method to remove repeated characters from a string
// public static String removeDuplicates(String str) {
// // Use LinkedHashSet to maintain order and remove duplicates
// Set<Character> charSet = new LinkedHashSet<>();

// // Add each character to the set
// for (char c : str.toCharArray()) {
// charSet.add(c);
// }

// // Build the result string without duplicates
// StringBuilder result = new StringBuilder();
// for (char c : charSet) {
// result.append(c);
// }

// return result.toString();
// }

// public static void main(String[] args) {
// String input = "programming"; // Replace with your desired string
// System.out.println("Original String: " + input);
// String result = removeDuplicates(input);
// System.out.println("String after removing duplicates: " + result);
// }
// }

// -----------------------------------------------------------------------------------------

// Q.10.6 String Minimum number of swaps for bracket balancing. <->
// Answer ME COUNT RETURN KARNA HAI NA KI SWAP KARKE DIKHANA HAI

// Example 1:
// Input: s = "][]["
// Output: 1
// Explanation: You can make the string balanced by swapping index 0 with index
// 3.
// The resulting string is "[[]]".

// Example 2:
// Input: s = "]]][[["
// Output: 2
// Explanation: You can do the following to make the string balanced:
// - Swap index 0 with index 4. s = "[]][][".
// - Swap index 1 with index 5. s = "[[][]]".
// The resulting string is "[[][]]".

// import java.util.*;
// class Solution {

// public int minSwaps (String s) {
// Stack<Character> stack = new Stack<Character>();
// for(int i=0;i<s.length();i++){
// char ch = s.charAt(i);
// if(ch == '[') {
// stack.push(ch); }
// else { if(stack.isEmpty() || stack.peek() == ']'){
// stack.push(ch); }
// else { stack.pop();
// }
// }
// }
// int totalBrackets = stack.size();
// int closedBrackets = totalBrackets/2;
// return (closedBrackets+1)/2 ;
// }

// }

// ---------------------------------------------------------------------------------------------------------------------

// Q. 10.7 String Find the longest common subsequence between two strings. <->

// public class String_Question {
// static int solve(String a, String b, int i, int j) {
// if (i == a.length() || j == b.length()) {
// return 0;
// }

// int ans = 0;

// if (a.charAt(i) == b.charAt(j)) {
// ans = 1 + solve(a, b, i + 1, j + 1);
// } else {
// ans = Math.max(solve(a, b, i + 1, j), solve(a, b, i, j + 1));
// }
// return ans;
// }

// public static void main(String[] args) {
// String a = "abcdef";
// String b = "abc";
// System.out.println(solve(a, b, 0, 0));
// }
// }
// ---------------------------------------------------------------------------------------------------------------------

// Q. 10.8 String Program to generate all possible valid IP addresses from given

// Input: s = "25525511135"
// Output: ["255.255.11.135","255.255.111.35"]

// import java.util.ArrayList;
// import java.util.List;

// public class RestoreIpAddresses {

// public static boolean isValid(String segment) {
// int value = Integer.parseInt(segment);
// return value >= 0 && value <= 255 && (segment.length() == 1 ||
// !segment.startsWith("0"));
// }

// public static List<String> restoreIpAddresses(String s) {
// List<String> result = new ArrayList<>();
// int n = s.length();

// if (n < 4 || n > 12) {
// return result;
// }

// backtrack(s, 0, 0, result);
// return result;
// }

// private static void backtrack(String s, int start, int dots, List<String>
// result) {
// if (dots == 3 && start == s.length()) {
// result.add(s);
// return;
// }

// for (int i = start + 1; i <= s.length(); i++) {
// String segment = s.substring(start, i);
// if (isValid(segment)) {
// backtrack(s, i, dots + 1, result);
// }
// }
// }

// public static void main(String[] args) {
// String s = "25525511135";
// List<String> ipAddresses = restoreIpAddresses(s);
// System.out.println(ipAddresses);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------

// Q. 10.9 write a program to check it is valid ip address or not ?
// check whether a given string represents a valid IPv4, IPv6, or an invalid IP
// address
// import java.util.ArrayList;
// import java.util.List;

// public class RestoreIpAddresses {

// public static boolean isValid(String s1, String s2, String s3, String s4) {
// if (s1.startsWith("0") || s2.startsWith("0") || s3.startsWith("0") ||
// s4.startsWith("0")) {
// return false;
// }

// int n1 = Integer.parseInt(s1), n2 = Integer.parseInt(s2), n3 =
// Integer.parseInt(s3), n4 = Integer.parseInt(s4);
// return n1 >= 0 && n1 <= 255 && n2 >= 0 && n2 <= 255 && n3 >= 0 && n3 <= 255
// && n4 >= 0 && n4 <= 255;
// }

// public static List<String> restoreIpAddresses(String A) {
// List<String> ans = new ArrayList<>();

// for (int i = 1; i < A.length(); i++) {
// String s1 = A.substring(0, i);
// for (int j = i + 1; j < A.length(); j++) {
// String s2 = A.substring(i, j);
// for (int k = j + 1; k < A.length(); k++) {
// String s3 = A.substring(j, k);
// String s4 = A.substring(k);

// if (isValid(s1, s2, s3, s4)) {
// ans.add(s1 + "." + s2 + "." + s3 + "." + s4);
// }
// }
// }
// }

// return ans;
// }

// public static void main(String[] args) {
// String A = "25525511135";
// List<String> ipAddresses = restoreIpAddresses(A);
// System.out.println(ipAddresses);
// }
// }

// Another method

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class String_Question {

// static String validIPv4orIPv6(String IP) {
// String ipv4Pattern
// ="^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
// String ipv6Pattern = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

// Pattern patternIPv4 = Pattern.compile(ipv4Pattern);
// Pattern patternIPv6 = Pattern.compile(ipv6Pattern);

// Matcher matcherIPv4 = patternIPv4.matcher(IP);
// Matcher matcherIPv6 = patternIPv6.matcher(IP);

// if (matcherIPv4.matches()) {
// return "IPv4";
// } else if (matcherIPv6.matches()) {
// return "IPv6";
// } else {
// return "Invalid";
// }
// }

// public static void main(String[] args) {
// String IP = "174.192.30.70";
// System.out.println(validIPv4orIPv6(IP));
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.12 String Rearrange characters in a string such that no two adjacent are

// import java.util.HashMap;
// import java.util.Map;

// public class StringRearrangement {

// private static char getMaxCountChar(Map<Character, Integer> count) {
// char chMax = ' ';
// int maxCount = 0;

// for (Map.Entry<Character, Integer> entry : count.entrySet()) {
// if (entry.getValue() > maxCount) {
// maxCount = entry.getValue();
// chMax = entry.getKey();
// }
// }

// return chMax;
// }

// public static String rearrangeString(String str) {
// int n = str.length();
// if (n == 0) {
// return "";
// }

// Map<Character, Integer> count = new HashMap<>();
// for (char ch : str.toCharArray()) {
// count.put(ch, count.getOrDefault(ch, 0) + 1);
// }

// char chMax = getMaxCountChar(count);
// int maxCount = count.get(chMax);

// if (maxCount > (n + 1) / 2) {
// return "-1";
// }

// char[] res = new char[n];
// Arrays.fill(res, ' ');

// int ind = 0;
// while (maxCount > 0) {
// res[ind] = chMax;
// ind += 2;
// maxCount = count.getOrDefault(chMax, 0) - 1;
// count.put(chMax, maxCount);
// }

// for (char ch : count.keySet()) {
// while (count.get(ch) > 0) {
// ind = (ind >= n) ? 1 : ind;
// res[ind] = ch;
// ind += 2;
// int charCount = count.get(ch) - 1;
// count.put(ch, charCount);
// }
// }

// return new String(res);
// }

// public static void main(String[] args) {
// String str = "aaadbbcc";
// String rearrangedStr = rearrangeString(str);
// System.out.println(rearrangedStr); // Output: "abcbadac"
// }
// }

// Another Mehotd

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

// public class StringRearrangement {

// private static char getMaxCountChar(int[] count) {
// int max = 0;
// char ch = ' ';

// for (int i = 0; i < 26; i++) {
// if (count[i] > max) {
// max = count[i];
// ch = (char) ('a' + i);
// }
// }

// return ch;
// }

// public static String rearrangeString(String str) {
// int n = str.length();
// if (n == 0) {
// return "";
// }

// int[] count = new int[26];
// for (char ch : str.toCharArray()) {
// count[ch - 'a']++;
// }

// char chMax = getMaxCountChar(count);
// int maxCount = count[chMax - 'a'];

// if (maxCount > (n + 1) / 2) {
// return "-1";
// }

// char[] res = new char[n];
// Arrays.fill(res, ' ');

// int ind = 0;
// while (maxCount > 0) {
// res[ind] = chMax;
// ind += 2;
// maxCount--;
// }
// count[chMax - 'a'] = 0;

// for (int i = 0; i < 26; i++) {
// while (count[i] > 0) {
// ind = (ind >= n) ? 1 : ind;
// res[ind] = (char) ('a' + i);
// ind += 2;
// count[i]--;
// }
// }

// return new String(res);
// }

// public static void main(String[] args) {
// String str = "geeksforgeeks";
// String rearrangedStr = rearrangeString(str);
// System.out.println(rearrangedStr); // Output: "abcbadac"
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.14 String remove all adjacent duplicates. <->

// public class String_Question {
// // Method to remove adjacent duplicates from a string
// public static String removeAdjacentDuplicates(String str) {
// StringBuilder result = new StringBuilder();
// int i = 0; // Initialize the index

// while (i < str.length()) {
// // If the current character is not the same as the next one add it into
// result
// if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
// result.append(str.charAt(i));
// i++;
// } else {
// // Skip all adjacent duplicates
// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// i++;
// }
// i++; // Skip the last duplicate character
// }
// }

// return result.toString();
// }

// public static void main(String[] args) {
// String input = "acaaabbbacdddd";
// System.out.println("Original String: " + input);
// String result = removeAdjacentDuplicates(input);
// System.out.println("String after removing adjacent duplicates: " + result);
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.14 String Recursively remove all adjacent duplicates. <->

// for this case: abccbccba
// it is giving abbba but it should be null

// public class String_Question {
// // Method to remove adjacent duplicates recursively
// public static String removeAdjacentDuplicates(String str) {
// // Base case: if the string is empty or has only one character, return it as
// is
// if (str.length() <= 1) {
// return str;
// }

// StringBuilder result = new StringBuilder();
// int i = 0; // Initialize the index

// while (i < str.length()) {

// // If the current character is not the same as the next one add it into
// result
// if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
// result.append(str.charAt(i));
// i++;
// } else {
// // Skip all adjacent duplicates
// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// i++;
// }
// i++; // Skip the last duplicate character
// }
// }
// // This line converts the StringBuilder object result into a regular String
// object named newStr.
// String newStr = result.toString();

// // If no adjacent duplicates were removed, return the current string
// if (newStr.length() == str.length()) {
// return newStr;
// }
// // This comparison checks if the length of newStr (the string after removing
// adjacent duplicates) is the same as the original input string (str).
// // If the lengths are equal, it means no adjacent duplicates were removed
// during this iteration because the length didn’t change.

// // Recursively remove duplicates in the new string
// return removeAdjacentDuplicates(newStr);
// }

// public static void main(String[] args) {
// String input = "abccbccba";
// System.out.println("Original String: " + input);
// String result = removeAdjacentDuplicates(input);
// System.out.println("String after removing adjacent duplicates: " +
// (result.isEmpty() ? "null" : result));

// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.16 String Transform One String to Another using Minimum Number of Given
// Operation <->

// GeeksforGeeks
// forGeeksGeeks
// output - 3

// import java.util.*;
// public class Transform {

// public static int transform(String A, String B) {
// int n = A.length();
// int m = B.length();

// if (n != m) {
// return -1;
// }

// Map<Character, Integer> mp = new HashMap<>();

// for (int i = 0; i < n; i++) {
// mp.put(A.charAt(i), mp.getOrDefault(A.charAt(i), 0) + 1);
// }

// for (int i = 0; i < m; i++) {
// mp.put(B.charAt(i), mp.getOrDefault(B.charAt(i), 0) - 1);
// }

// for (int count : mp.values()) {
// if (count != 0) {
// return -1;
// }
// }

// int i = n - 1, j = m - 1, ans = 0;

// while (i >= 0 && j >= 0) {
// while (i >= 0 && A.charAt(i) != B.charAt(j)) {
// ans++;
// i--;
// }
// i--;
// j--;
// }

// return ans;
// }

// public static void main(String[] args) {
// String A = "abcde";
// String B = "edcba";

// int result = transform(A, B);
// System.out.println(result); // Output: 4
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q.17 String Check if two given strings are isomorphic to each other. <->
// Master LeetCode 205 with the Best Solution!

// isomorphic = replacement of each word with same letter

// import java.util.HashMap;
// import java.util.Map;

// class String_Question {

// // Method to check if two strings are isomorphic
// public boolean isIsomorphic(String s, String t) {
// Map<Character, Character> map = new HashMap<>(); // Create a map to store
// character mappings

// // Iterate through the characters of the strings
// for (int i = 0; i < s.length(); i++) {
// char ss = s.charAt(i); // Get the character from string s
// char tt = t.charAt(i); // Get the character from string t

// // Check if the character ss is already mapped and if the mapped value is
// different from tt
// if ((map.containsKey(ss) && map.get(ss) != tt) ||
// (!map.containsKey(ss) && map.values().contains(tt))) {
// return false; // Return false if the mapping condition fails
// }

// map.put(ss, tt); // Put the mapping of ss to tt in the map
// }

// return true; // Return true if all characters can be consistently mapped
// }

// // Main method to test the isIsomorphic function
// public static void main(String[] args) {
// String_Question solution = new String_Question(); // Create an instance of
// the Solution class

// // Test cases
// String s1 = "egg";
// String t1 = "add";
// System.out.println("Is '" + s1 + "' isomorphic to '" + t1 + "'? " +
// solution.isIsomorphic(s1, t1)); // Expected: true

// String s2 = "foo";
// String t2 = "bar";
// System.out.println("Is '" + s2 + "' isomorphic to '" + t2 + "'? " +
// solution.isIsomorphic(s2, t2)); // Expected: false

// String s3 = "paper";
// String t3 = "title";
// System.out.println("Is '" + s3 + "' isomorphic to '" + t3 + "'? " +
// solution.isIsomorphic(s3, t3)); // Expected: true
// }
// }

// ---------------------------------------------------------------------------------------------------------------------
// Q. 18 LeetCode 290 Solution in Hindi | Word Pattern
// character to string mapping hai

// import java.util.HashMap;
// import java.util.Map;

// public class String_Question {

// public boolean wordPattern(String pattern, String s) {
// Map<Character, String> map = new HashMap<>();
// String[] arr = s.split(" ");

// if (arr.length != pattern.length()) {
// return false;
// }

// for (int i = 0; i < pattern.length(); i++) {
// char c = pattern.charAt(i);
// String word = arr[i];

// if ((map.containsKey(c) && !map.get(c).equals(word)) ||
// (!map.containsKey(c) && map.values().contains(word))) {
// return false;
// }

// map.put(c, word);
// }

// return true;
// }

// public static void main(String[] args) {
// String_Question solution = new String_Question();

// String pattern1 = "abba";
// String s1 = "dog cat cat dog";
// System.out.println(solution.wordPattern(pattern1, s1)); // Output: true

// String pattern2 = "abba";
// String s2 = "dog cat dog cat";
// System.out.println(solution.wordPattern(pattern2, s2)); // Output: false

// String pattern3 = "aaaa";
// String s3 = "dog cat dog dog";
// System.out.println(solution.wordPattern(pattern3, s3)); // Output: false
// }
// }
