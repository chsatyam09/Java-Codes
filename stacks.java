// ● Introduction to stacks
// ● Types of operations on stacks
// ● Stacks in C++ STL
// ● Overflow
// ● Underflow
// ● Array implementation of stacks
// ● Linked list implementation of stacks
// ● Advantages of array implementation of stacks
// ● Advantages of linked list implementation of stacks

// import java.util.Stack;
// public class stack_basics {

// public static void main(String[] args) {

// Stack<Integer> st = new Stack() ;
// st.push(107840);
// st.push(108730);
// st.push(12300);
// st.push(1298300);
// st.push(17800);
// System.out.println(st);
// System.out.println(st.push(20));
// System.out.println(st);
// System.out.println(st.peek()); // value return kar deta hai sirf
// System.out.println(st);
// System.out.println(st.pop()); // permanately nikal deta hai stack se
// System.out.println(st);
// System.out.println("Size of Stack is :"+ st.size());
// System.out.println(st.empty());

// while (st.size()>1) {
// st.pop();

// }
// System.out.println(st.peek()); // last element nikal dia
// }
// }

// =================================================================================================================================================================================

// REvision not a  stack queston

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
// Q. print a  stack by taking input from user 

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

// Q. print a  stack

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

// // ==========================================================================================================================================================================

// // Q.1 print reverse a stack in same stack 

// import java.util.Stack;

// public class stacks {

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

// Another method 

// import java.util.Stack;

// public class stacks {

//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         st.push(10);
//         st.push(9);
//         st.push(8);
//         st.push(7);
//         st.push(6);
//         st.push(5);
//         st.push(4);
//         st.push(3);
//         st.push(2);
//         st.push(1);
//         System.out.println("Original Stack: " + st);

//         Stack<Integer> gt = new Stack<>();

//         // Pop elements from the original stack and push into the temporary stack
//     while (st.size()>0) {
//         gt.push(st.pop());
        
//     }

//         // Pop elements from the temporary stack and push back into the original stack
//         while (gt.size()>0) {
//             st.push(gt.pop());
            
//         }

//         System.out.println("Reversed Stack: " + st);
//     }
// }


// ==========================================================================================================================================================================
//Q.2 ek stack ke value leke dusre stack me Reverse me print karwao

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
// 45:37 Q2 : Push at bottom / any index - iterative

// ==========================================================================================================================================================================

// ==========================================================================================================================================================================

// ==========================================================================================================================================================================