

// Q.1.1 How to find the ASCII value to any string

// char me store karwao ek ek index char ch = str.charAt(i);
// now convert that charcter to int then print , // int asciiValue = (int) ch;

// -------------------------------------------------------------------------------------------------
// Q.1.2 Sort the String According to Acii vlaue

// String ko char Array me convert karo , // char[] charArray = str.toCharArray();
// use Arrays.sort

//  Convert the sorted character array back to a string
// String sortedStr = new String(charArray);

// then print with loop // or convert back to string
// and then print
// -------------------------------------------------------------------------------------------------
// Q.1.3 java program to print A to Z alphabets

// normally for loop chalo or A to z

// -------------------------------------------------------------------------------------------------
// Q.2 How to count the size of string without using length() function ;

// String ko convert karo char Array me
// then with the help of for each loop print the charArray

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.2 How to count the no of space in string ?
// Start traversing the loop
// if arr[i]=' ' && arr[i+1]!=' '
// count++
// ---------------------------------------------------------------------------------------------------------------------
// Q.2.3 How to count the size of array without space ?
// if (arr[i] != ' ') {
// count++;

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.4 How To Count Occurrences of a SPECIFIC Character in a String ;
// stirng ko char array me convert karo;
// set char targetChar = 'a';
// loop chaloa and find if (ch[i] == targetChar) { count ++ ;

// or

// loop chalo and replaceAll"a" with ""

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.5 Remove White Spaces in a String
// str.replaceAll("\\s","");
// str.replaceAll("\\s{2,}"," ");
// ---------------------------------------------------------------------------------------------------------------------
// Q.2.6 how to Remove a specific word in a String
// str.replaceAll("x","a");
// ---------------------------------------------------------------------------------------------------------------------
// Q.2.7 after remmoving a specific character tell the size of String
// ---------------------------------------------------------------------------------------------------------------------
// Q.2.8 No junk characters , delete the junk character ?
// str.replaceAll( "[^a-zA-Z0-9]","")
// ---------------------------------------------------------------------------------------------------------------------

// Q.2.9 No Alternating characters , how many deletion we required ?
// you don't have to delete character you just have tell how many adjacent
// character's are there or how many deletion is required

// normally for loop and compare with next element and count++;
// ---------------------------------------------------------------------------------------------------------------------
// Q.2.10 No Alternating characters , delete the alternating character ?
// String banao , phle element ko phle append karwao
// then for looop and do compaoriosn str.chatAt(i) != str.chatAt(i-1) then
// result.append(str.charAt(i));
// ---------------------------------------------------------------------------------------------------------------------
// Q.14 String remove all adjacent duplicates. <->
// Original String: acaaabbbacdddd
// String after removing adjacent duplicates: acac

// loop chalo chalo
// condition se check karo and add elemnt in new string
// to print last element if me condition laga do i ==str.length()|| -- ---
// right oneMore loop and skip the same iteration
// i++; // Skip the last duplicate character

// ---------------------------------------------------------------------------------------------------------------------

// Q.14 String Recursively remove all adjacent duplicates. <->
// // for this case: abccbccba
// // it is giving abbba but it should be null

// same as remove all adjacent duplicates.
// bass
// check length and last me ye method define kie ho usko call karwa lena
// ---------------------------------------------------------------------------------------------------------------------

// Q.2.11 Java Program to Convert and Int to String

// String str = Integer.toString();

// ---------------------------------------------------------------------------------------------------------------------
// How to convert an String to int in Java?

// Int num = Integer.parseInt();

// ---------------------------------------------------------------------------------------------------------------------
// 2.12 How to convert an integer Array to String in Java?

// stirng str = Arrays.toString();

// ---------------------------------------------------------------------------------------------------------------------
// 2.13 How to convert an char Array to String in Java?

// String str= String.valueOf(ch);

// ---------------------------------------------------------------------------------------------------------------------

// How to convert an String to char Array in Java?

// char arr[]= new char[15];
// str.getChars(0,10,arr,0);

// ---------------------------------------------------------------------------------------------------------------------
// 2.14 How to convert an char to String in Java?

// String charAsString = String.valueOf(myChar);

// ---------------------------------------------------------------------------------------------------------------------
// 2.15 Write a java program to CAPITALIZE each word in string?

// spliting based on space
// loop chalao or substring ki hlep lo

// ---------------------------------------------------------------------------------------------------------------------
// 2.16) Write a java program to TOGGLE each word in string?
// We can tOGGLE each word of a string by the help of split(), toLowerCase(),
// toUpperCase() and substring() methods.
// ---------------------------------------------------------------------------------------------------------------------
// In Java, how can two strings be COMPARED?
// Comparing Two Strings Using equals(), equalsIgnoreCase() & compareTo()
// compareToIgnoreCase() Methods

// str1.equals(str2); d D are differnent
// str1.equalsIgnoreCase(str2); d D are Same

// str1.compareTo(str2); integer output // result will be a positive integer
// (case-sensitive comparison)

// str1.compareToIgnoreCase(str2); integer output // result will be zero
// (case-insensitive comparison)

// ---------------------------------------------------------------------------------------------------------------------

// Q.2,16.1 Why strings are immutable in Java? <->

// ---------------------------------------------------------------------------------------------------------------------
// In Java, how can two strings be COMPARED?
// ---------------------------------------------------------------------------------------------------------------------

// Q. 3 First Unique Character in a String .

// create a Integer array of 26 size
// Convert the string to lowercase to handle both uppercase and lowercase
// uniformly
// Store frequency of all characters
// Traverse and check for the first character with frequency 1

// ---------------------------------------------------------------------------------------------------------------------
// Q. 4 • Valid Parentheses
// Stack banao
// if - opening bracket hai toooh stack me dalo ;
// else -
// if -Aggr closing bracket hai toooh check stack is empty or not
// if empty mtlb clsoing se phle koi opening bracket thi hii nhi return false ;
// if it is not empty then check closing is mactching with opening or not , if
// no return false ;
// if it is not empty then check cloisng is mactching if it matching then pop ;
// and check lasty stack is empty or not

// ---------------------------------------------------------------------------------------------------------------------
// Q. 5 Longest Substring Without Repeating Characters -
// String str = "abcadabb"; - 4
// idea - remember the character and index of that character so whenever it come
// again you will remove all the elements till that elemet/ index ;
//

// map banao hashmap ka
// convert to charArray
// loop chalao
// map me store karwate jao
// check if that element is present or not if not return -1 ;
// if(idx !=-1) res print karwao
// length of substring = right -1 - left +1
// every time you have to incremnt left
// idx must be >= left , beacusse peeche walla z already store hai map me

// ---------------------------------------------------------------------------------------------------------------------
// Q.6 Return all Susbstring Characters

// 2 for loop chalao
// and for printing used Str.substring(i,j);
// This means that the substring will include characters from index i up to but
// not including index j.
// ---------------------------------------------------------------------------------------------------------------------
// Q.6.1 Print all Subsequences of a string

// we can skip charcater and it must be in increasing order only

// Recursion tree

// ---------------------------------------------------------------------------------------------------------------------
// Q.7 Longest Common Prefix

// uppar 2 common compariosn ka code likh dia
// neeche common ko bar bar call karwao and find longest

// ---------------------------------------------------------------------------------------------------------------------
// Q.8 Implement strStr() - Link

// GeekforGeek
// for
// output = 4 (first Occurence)

// ek for loop chalao
// Extract a substring from haystack starting at index i with the length of the
// needle
// Check if the extracted substring matches the needle

// ---------------------------------------------------------------------------------------------------------------------
// Q.9 • String to Integer
// Implement (atoi)

// int num=Integer.parseInt(str);
// or
// Ignore leading whitespaces
// Check if the next character is a '+' or '-'
// less than 9 and greater than 0

// ---------------------------------------------------------------------------------------------------------------------
// Q.10• Wildcard Matching
// ---------------------------------------------------------------------------------------------------------------------
// Q.11 Minimum Window Substring
// https://www.youtube.com/watch?v=26E3K8Njm7M
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
// Q.12 Regular Expression Matching

// ---------------------------------------------------------------------------------------------------------------------
// Q.13 • Longest Substring with At Least K Repeating Characters
// store the frequency of each character in Map
// if any charcter frequency is less than k then that's the posiotion of split

// we create two varibale start and end
// and we will iterate through complete string as soon as we find the point k
// and less then 0 , that's the posiotion of split
// for the second part we will start pointer and start checking till we don;t
// reach to end

// -----------------------------------------------------------------------------

// Q.14 Remove Duplicates In string
// use HashSet

// --------------------------------------------------------------------------------------------------------------------------------
// Q. 15 LeetCode 3 Solution in Hindi | Longest Substring Without Repeating
// Characters

// Same as Question Number - 5