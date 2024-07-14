// REvision not a stack queston

// import java.util.Scanner;

// public class stacks {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of elements you want to enter:");
// int x = sc.nextInt();

// System.out.println("Enter the elements:");
// int[] elements = new int[x];
// for (int i = 0; i < x; i++) {
// elements[i] = sc.nextInt();
// }

// for (int i = 0; i < elements.length; i++) {
// System.out.print(elements[i] + " ");
// }
// }
// }
// =================================================================================================================================================================================
// Q. print a stack by taking input from user

// import java.util.Scanner;
// import java.util.Stack;

// public class stacks {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the no of elemnts you want in stack :");
// int x = sc.nextInt();
// System.out.println("enter the elemnts you want in stack :");
// for (int i = 0; i <x; i++) {
// int p = sc.nextInt();
// st.push(p);

// }
// System.out.println(st);

// }
// }
// ==========================================================================================================================================================================

// Q. print a stack
// import java.util.Stack;

// public class stacks {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(10);
// st.push(100);
// st.push(1000);
// st.push(10000);
// st.push(100000);
// System.out.println(st);

// }
// }

// ==========================================================================================================================================================================

// Q. print reverse a stack in same stack

// import java.util.Stack;

// public class stack_Question {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(10);
// st.push(100);
// st.push(1000);
// st.push(10000);
// st.push(100000);
// System.out.println(st.reversed());

// }
// }

// ===================================================================== Another
// method with just function

// import java.util.Stack;

// public class stack_Question {

// public static void displayrev(Stack<Integer> s) {
// s.push(6);

// }

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(10);
// st.push(9);
// st.push(8);
// st.push(7);
// st.push(6);
// st.push(5);
// st.push(4);
// st.push(3);
// st.push(2);
// st.push(1);
// System.out.print(st);
// System.out.println();
// displayrev(st);

// System.out.print(st);

// }
// }

// ================
// ===================================================================== Another
// method ye imp hai
// using extra stack

// import java.util.Stack;

// public class stack_Question {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(10);
// st.push(9);
// st.push(8);
// st.push(7);
// st.push(6);
// st.push(5);
// st.push(4);
// st.push(3);
// st.push(2);
// st.push(1);
// System.out.println("Original Stack: " + st);

// Stack<Integer> gt = new Stack<>();
// // Pop elements from the original stack(st) and push into the temporary
// stack(gt)
// while (st.size()>0) {
// gt.push(st.pop());

// }

// Stack<Integer> rt = new Stack<>();
// // Pop elements from the temporary stack(gt) and push into the temporary
// stack(rt)
// while (gt.size()>0) {
// rt.push(gt.pop());

// }

// // Pop elements from the temporary stack(rt) and push back into the
// original(st)
// while (rt.size()>0) {
// st.push(rt.pop());

// }

// System.out.println("Reversed Stack: " + st);
// }
// }

// ===================================================================== using
// recursion hai ye
// =====================================================================
// without using any extra stack

// import java.util.Stack;

// public class stack_Question {

// // Function to print the stack in reverse order using recursion
// public static void printReverse(Stack<Integer> stack) {
// if (!stack.isEmpty()) {
// // Remove the top element from the stack
// int top = stack.pop();

// // Recursively call the function to print the remaining elements
// printReverse(stack);

// // Print the top element
// System.out.print(top + " ");

// // Push the top element back onto the stack
// stack.push(top);
// }
// }

// public static void main(String[] args) {
// Stack<Integer> stack = new Stack<>();
// stack.push(1);
// stack.push(2);
// stack.push(3);
// stack.push(4);
// stack.push(5);

// System.out.println("Original Stack: " + stack);

// System.out.print("Stack in reverse order: ");
// printReverse(stack);
// }
// }

// ==========================================================================================================================================================================
// Q.2 ek stack ke value leke dusre stack me Reverse me print karwao

// import java.util.Stack;

// public class stacks {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(10);
// st.push(100);
// st.push(1000);
// st.push(10000);
// st.push(100000);
// System.out.println(st);

// Stack<Integer> rt = new Stack<>();
// while (st.size()>0) {
// rt.push(st.pop());
// }
// System.out.println(rt);

// }
// }

// ==========================================================================================================================================================================
// ek stack ke value leke dusre stack me same order me print karwao
// 32:56 Q.3 : Copy stack into another in same order

// import java.util.Stack;
// public class stacks {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>() ;
// st.push(10);
// st.push(29);
// st.push(48);
// st.push(78);
// System.out.println(st);

// Stack<Integer> rt = new Stack<>() ;
// while (st.size()>0) {
// rt.push(st.pop());
// }
// Stack<Integer> pt = new Stack<>() ;
// while (rt.size()>0) {
// pt.push(rt.pop());

// }
// System.out.println(pt);
// }
// }

// ==========================================================================================================================================================================
// 45:37 Q4 : Push at bottom iterative

// import java.util.Stack;

// public class stack_Question {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(4);
// st.push(3);
// st.push(2);
// st.push(1);
// System.out.println("Stack before any change: " + st);

// Stack<Integer> gt = new Stack<>();

// while (st.size()>0) {
// gt.push(st.pop());

// }

// st.push(5); // Insert the new element at the bottom

// while (gt.size()>0) {
// st.push(gt.pop());

// }

// System.out.println("Stack after inserting 5 at the bottom: " + st);
// }
// }

// =================================================================================
// Another method Push at bottom Recursively ;

// import java.util.Stack;

// public class stack_Question {

// // Function to push an element to the bottom of a stack recursively
// public static void pushToBottom(Stack<Integer> stack, int element) {
// // Base case: if the stack is empty, push the element onto the stack
// if (stack.isEmpty()) {
// stack.push(element);
// return;
// }

// // Remove the top element from the stack
// int top = stack.pop();

// // Recursively push the element to the bottom of the stack
// pushToBottom(stack, element);

// // Push the removed top element back onto the stack
// stack.push(top);
// }

// public static void main(String[] args) {
// Stack<Integer> stack = new Stack<>();
// stack.push(1);
// stack.push(2);
// stack.push(3);

// System.out.println("Original Stack: " + stack);

// int element = 4;
// pushToBottom(stack, element);

// System.out.println("Stack after pushing " + element + " to the bottom: " +
// stack);
// }
// }

// ==========================================================================================================================================================================
// 45:37 Q4.1 : Push at any index - iterative

// import java.util.Stack;

// public class stack_Question {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(4);
// st.push(3);
// st.push(2);
// st.push(1);
// System.out.println("Stack before any change: " + st);

// Stack<Integer> gt = new Stack<>();

// while (st.size()>0) {
// gt.push(st.pop());

// }

// while (gt.size()>0) {
// if(gt.size() == 1){
// st.push(500); // Insert the new element at the bottom
// }
// st.push(gt.pop());

// }

// System.out.println("Stack after inserting 5 at the bottom: " + st);
// }
// }

// ==========================================================================================================================================================================
// Q.5 Pop at bottom - iterative
// import java.util.Stack;

// public class stack_Question {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(4);
// st.push(3);
// st.push(2);
// st.push(1);
// System.out.println("Stack before any change: " + st);

// Stack<Integer> gt = new Stack<>();

// while (st.size()>1) { // remove last index elemnt
// gt.push(st.pop());

// }

// while (gt.size()>1) {
// st.push(gt.pop());

// }

// System.out.println("Stack after inserting 5 at the bottom: " + st);
// }
// }

// ================================================================ another
// method Pop at bottom - recursively

// import java.util.Stack;

// public class stack_Question {

// // Function to pop an element from the bottom of the stack using recursion
// public static void popBottom(Stack<Integer> stack, int bottom) {
// if (stack.isEmpty()) {
// // If the stack is empty, push the bottom element
// stack.push(bottom);
// return;
// }

// // Pop the top element from the stack
// int top = stack.pop();

// // Recursively call the function until the stack becomes empty
// popBottom(stack, bottom);

// // Push the top element back onto the stack
// stack.push(top);
// }

// public static void main(String[] args) {
// Stack<Integer> stack = new Stack<>();
// stack.push(1);
// stack.push(2);
// stack.push(3);
// stack.push(4);
// stack.push(5);

// System.out.println("Original Stack: " + stack);

// // Pop an element from the bottom of the stack (e.g., bottom = 3)
// int bottom = 3;
// popBottom(stack, bottom);

// System.out.println("Stack after popping " + bottom + " from the bottom: " +
// stack);
// }
// }

// ==========================================================================================================================================================================
// Q.5.1 Pop at any index - iterative
// import java.util.Stack;

// public class stack_Question {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(4);
// st.push(3);
// st.push(2);
// st.push(1);
// System.out.println("Stack before any change: " + st);

// Stack<Integer> gt = new Stack<>();

// while (st.size()>0) {
// gt.push(st.pop());

// }

// while (gt.size()>0) {
// if(gt.size() == 2){
// st.pop(); // remove index 2 element
// }
// st.push(gt.pop());

// }

// System.out.println("Stack after inserting 5 at the bottom: " + st);
// }
// }

// ==========================================================================================================================================================================
// 1:03:13 Q6 : reverse display stack recursively

// import java.util.Stack;

// public class stack_Question {

// public static void displayrev(Stack<Integer> st) {
// if (st.size() == 0)
// return;

// int top = st.pop();
// System.out.print(top + " ");
// displayrev(st);
// st.push(top);

// }

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(10);
// st.push(9);
// st.push(8);
// st.push(7);
// st.push(6);
// st.push(5);
// st.push(4);
// st.push(3);
// st.push(2);
// st.push(1);
// System.out.print(st);
// System.out.println();
// displayrev(st);
// }
// }
// ==========================================================================================================================================================================
// Underflow

// ==========================================================================================================================================================================

// ==========================================================================================================================================================================