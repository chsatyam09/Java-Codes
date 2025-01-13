
// ===================================================== lovebabbar  =====================================================

// ---------------------------------------------------------------------------------------------------------------------
// Q.1 String Reverse a String.

// start the loop form the end , // uisng noramlString and CharAt / String str = "Satyam";

// using character Array / char arr[] = {'S', 'A', 'T', 'Y', 'A', 'M'};

// Using Stringbuffer StringBuilder reverse method

// ---------------------------------------------------------------------------------------------------------------------
// Q. 1.2 Java Program to Reverse Each Word of a String
// Example –
// Input: Java Programming
// Output: avaJ gnimmargorP

// frist split on the basis of whitespaces and strore in a string array ;
// ek for loop chlao  and store  the first charcater into another string 
// ek orr loop chalo reverse me and stroe it inot and string aarray
// last store the revword in fianl string 


// ---------------------------------------------------------------------------------------------------------------------
// Q.1.3 Java Program to Reverse Sentence By words
// INPUT = I.LKE.THIS.PROGRAM ;
// OUTPUT = PROGRAM.THIS.LIKE.I ;

// frist split on the basis of whitespaces and strore in a string array ;
// ek for loop chlao last se and start printing
// ---------------------------------------------------------------------------------------------------------------------
// Q.2 String Check whether a String is Palindrome or not .
// ek new string banao ;
// peeche se for loop chalo and store in new storing 
// comapre with equals method
// ---------------------------------------------------------------------------------------------------------------------

// Q.2.1 Java Program to find longest substring without repetition
// Q. 5 Longest Substring Without Repeating Characters -
// String str = "abcadabb"; - 4
// idea - remember the character and index of that character so whenever it come
// again you will remove all the elements till that elemet/ index ;
//// variable length sliding window ki problem hai
// HashMap

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
// Q.2.2 Longest Palindrome | leetcode 409

// yaha pe string ko todd jodd ke ek new string banao jo longest Longest
// Palindrome ho , length batana hai
// palindrome is basically two types odd length and even length palindrome ;
// All evenn frequency and odd frequency character only one odd times in the
// middle or odd frequency character make it to even times

// even length wall sab aayega
// odd length wala sabse bada waala ayega
// and rest odd walle me -1 karke add karo

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.3 find the Longest palindromic substring ?(Adjacent )
// https://www.youtube.com/watch?v=QfZvw8_jz1w

// palindrome substring ka length even hoga ya odd hoga right ;
// Check for even-length palindromes (center is between i-1 and i)
// even length me just bagal walle se compare karte chalo ;
// int l = i - 1;
// int h = i;

// Check for odd-length palindromes (center is i)
// odd length me just bagal se ek aage walle se compare karte chalo ;
// l = i - 1;
// h = i + 1;

// or
// Find All subset and ten find the longest palindromic substring among all .

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.4 find the Longest palindromic subsequence ? (Not Adjacent)

// Solution - 1: Recursive Basic Solution
// - We start from start = 0 & end = length - 1
// - If values at start & end indexes are equal then add 2 and recursively check
// for remaining start + 1 & end - 1
// - It's not matching, then Get the maximum of lps(start, end - 1), lcs(start +
// 1, end)

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.5 Minimum characters to be added at front to make string palindrome <->

// -----------------------------------------------------------------------------

// Q.2.6 Minimum number of insertion in a string to make it a palindrome

// -----------------------------------------------------------------------------
// Q.2.7 Minimum number of Deletion in a string to make it a palindrome

// we can also say this as No of deletion in a string to make it a longest
// palindrome

// -----------------------------------------------------------------------------

// Q. 2.8 ANAGRAM PROGRAM
// An anagram is a word or phrase formed by rearranging the letters of another
// word or phrase, typically using all the original letters exactly once.
// Steps to Check if Two Strings Are Anagrams:
// Length Check:

// If the two strings have different lengths, they cannot be anagrams.
// Sorting Method:

// Sort both strings alphabetically.
// If the sorted strings are identical, then the original strings are anagrams.
// Frequency Count Method:

// Count the frequency of each character in both strings.
// If the frequency counts for all characters match, the strings are anagrams.
// ex- cat /act
// ex-listen /silent
// ex-rat / art

// Steps to perform anagram program :
// 1.remove space
// check the kength of both the String
// 2.first string se map pe character dalte raho 
// 3. Second  string se map pe character hatate raho raho 
// 4. lastly check 0 hai ya nhi .


// Anothe method

// Steps to perform anagram program :
// 1.remove space
// check the kength of both the String
// 2.convert to lower_case
// 3.convert to an array char
// 4. To check they both are anagram or not use sort method to sort the Array

// Anothe method

// Steps to perform anagram program :
// 1.remove space
// check the kength of both the String
// 2.convert to lower_case
// 3.convert to an array char
// 4. to check they both are anagram or not do charCount[word - 'a']++; and then
// charCount[word - 'a']-- if any number left with 1 or -1 then it is not a
// Anagram
// ---------------------------------------------------------------------------------------------------------------------
// Q.2 9 Group Anagrams

// ---------------------------------------------------------------------------------------------------------------------
// Q.2.10 PANGRAM PROGRAM
// A pangram is a sentence that contains every letter of the alphabet at least
// once.

// Steps to perform PANGRAM program :
// 1.remove space
// check the length of both the String
// 2.convert to lower_case
// 3.convert to an array char
// 4. to check they both are anagram or not do charCount[word - 'a']++; and then
// charCount[word - 'a']++ if any number left with 0 then it is not a panagram

// ---------------------------------------------------------------------------------------------------------------------
// Q.3 String Find Duplicate characters in a string <->
// start the two loop with
// i =0;
// and j =i+1;
// ch[i] == ch[j] rpint ch[i] ;

// Another Method

// use map

// ---------------------------------------------------------------------------------------------------------------------

// Q.4 String Why strings are immutable in Java? <->
// ---------------------------------------------------------------------------------------------------------------------

// Q.5 String Write a Code to check whether one string is a rotation of another
// <->
// left = x;
// right = n-x;
// length of both stirng must be equal
// we will do each roation and compare it is match or not
// String+String = conatin goal

// ANother Mehod

// s.length or goal.length dono same hona chaiye or s me s jodd dia or usme
// check karo goal present hai ya nhi
// if(s.length()== goal.length() && (s+s).contains(goal)){
// ---------------------------------------------------------------------------------------------------------------------

// Q.6 String Write a Program to check whether a string is a valid shuffle of
// two strings or not <->
// String str1 = "abc";
// String str2 = "123";
// String shuffle1 = "a1b2c3";

// length compare karo phle of not matchig return false ;
// Sort karo sabko
// while(k<shuffle1.length()){
// if{
// str1 se shuffle1 ko compare karo
// }

// else{
// str2 se shuffle1 ko compare karo
// }
// }

// -----------------------------------------------------------------------------
// Q.6.1 Shuffle Strings
// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
// Output: "leetcode"

// String or indices given hoga
// Create a character array to store the rearranged characters
// so just start the for loop

// CharAt(i) ki value arr[indices(i)] me store karwa do

// ---------------------------------------------------------------------------------------------------------------------
// Q.7 String Count and Say problem <->
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
// solution - Frequency then element
// ---------------------------------------------------------------------------------------------------------------------

// Q.8 Palindrome Partitioning

// ---------------------------------------------------------------------------------------------------------------------

// Q.10 String Print all Subsequences of a string. <->
// abc = a,b,c,ab,bc,ac,abc
// we don't want duplicates that's why we are using set here

// ---------------------------------------------------------------------------------------------------------------------

// Q.10.1 Print the PowerSet/ subset of the given string <->

// ---------------------------------------------------------------------------------------------------------------------
// Q.10.2 String Print all the permutations of the given string <->

// ---------------------------------------------------------------------------------------------------------------------
// Q.10.3 String Print all the substring of the given string <->
// ---------------------------------------------------------------------------------------------------------------------
// 10.4 String Longest Common Prefix <->

// ---------------------------------------------------------------------------------------------------------------------

// Q. 10.5 Find the Adjacent repeated character in string. <->

// -----------------------------------------------------------------------------------------

// Q.10.6 String Minimum number of swaps for bracket balancing. <->

// ek skip karo ek ko swap karo

// ---------------------------------------------------------------------------------------------------------------------

// Q. 10.7 String Find the longest common subsequence between two strings. <->
// ---------------------------------------------------------------------------------------------------------------------
// Q. 10.8 String Program to generate all possible valid IP addresses from given
// string. <->

// IP addresses - 32 bit , 4 octets and 3 dots(.) , allowed 0-255 , No char
// ---------------------------------------------------------------------------------------------------------------------
// Q. 10.9 write a program to check it is valid ip address or not ?
// check whether a given string represents a valid IPv4, IPv6, or an invalid IP
// address
// IP addresses - 32 bit , 4 octets and 3 dots(.) , allowed 0-255 , No char

// ---------------------------------------------------------------------------------------------------------------------
// Q.12 String Rearrange characters in a string such that no two adjacent are
// same <->

// if the frequency od the any character in stirng is greater than n+1/2
// we will count the frequency of every character
// we will start placing the charcter one by one leaving the one space (ek chod
// ke ek )
// end me pahuch gaye tooh dubra start se start karnge fill karna

// ---------------------------------------------------------------------------------------------------------------------
// Q.14 String remove all adjacent duplicates. <->
// while loop chalao then check arr[i] != arr[i+1] then add arr[i] to result
// again // Skip all adjacent duplicates
// Skip the last duplicate character

// ------------------------------------------------------------------------------------
// Q.14 String Recursively remove all adjacent duplicates <->
// for this case: abccbccba
// it is giving abbba but it should be null

// Same as Adjacent bass yaha pe recursion ki help se again and again call
// karwao

// ---------------------------------------------------------------------------------------------------------------------
// Q.16 String Transform One String to Another using Minimum Number of Given
// Operation <->

// abd
// bad
// output - 1

// GeeksforGeeks
// forGeeksGeeks
// output - 3

// ek map banao check character or number of times character repeated store
// karwao;
// agian traverse the loop and i-- whenever the same number matches
// at last check saare 0 ho gyae tooh aage ka process check hoga else return
// false ;

// i or j pointer banao ;
// i dalo abd pe
// j dalo bad pe
// and compare if matches i-- and j--
// if not matches count++ and move i-- j will stay there

// ---------------------------------------------------------------------------------------------------------------------
// Q.17 String Check if two given strings are isomorphic to each other <->
// LeetCode 205
// isomorphic = replacement of each word with same letter

// Create a map to store character mappings
// start the for loop and store into the charcter
// Get the character from string s
// Get the character from string t
// Put the mapping of ss to tt in the map
// Check if the character ss is already present in the map then ss value will be
// equal value of tt .
// Check if the character ss is already mapped and if the mapped value is
// different from tt return false
// if the the character ss is already present in the map ans tt value is not
// present in the map return flase

// ---------------------------------------------------------------------------------------------------------------------

// Q.18 String Recursively print all sentences that can be formed from list of
// word lists
// Q. 18 LeetCode 290 Solution Word Pattern

// ye question isomorphic se related hai so prepared According to that
// Same as isomorphic bass yaha pe ek character or word ko compare karwao
