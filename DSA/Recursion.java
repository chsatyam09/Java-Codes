

// Base case 
// Recursive call
// Small Work 


// Recursion and function calling are both mechanisms used to execute code in a program, but they have distinct characteristics:

// Function Calling:

// A function call is a direct invocation of a function by name, passing any necessary arguments.
// The execution flow jumps to the function's definition, executes the code within the function, and then returns to the calling point.
// Function calls can be nested, meaning a function can call another function within its body.
// Function calls are typically used for modularizing code and reusing common operations.
// Recursion:

// Recursion is a special type of function calling where a function calls itself directly or indirectly.
// It involves breaking down a problem into smaller, similar subproblems and solving each subproblem recursively.
// A recursive function must have a base case that terminates the recursion and prevents an infinite loop.
// Recursion can be used to solve problems that have a natural recursive structure, such as factorial, Fibonacci numbers, and tree traversals.

// --------------------------------------------------------------------------
// Factorial using Recursion 


// public class Recursion {

//     // Recursive method to calculate the factorial of a number
//     public static int factorial(int n) {
//         // // Base case: factorial of 0 or 1 is 1
//         if (n <=1) {
//             return 1 ;
//         }
//         else{
//     // Recursive case: multiply n by the factorial of (n - 1)
//     return n * factorial(n - 1);
//         }

//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int result = factorial(n); // Call the recursive factorial method
//         System.out.println("Factorial of " + n + " is: " + result);
//     }
// }

// public class String_Question {

//     public static void factorial(int n){
//       int sum =1;
//      for (int i = n; i > 0; i--) {
//        sum = sum*i ;
//      }
//      System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         int n = 5 ;
//         factorial(n);
//     }
// }

// --------------------------------------------------------------------------

// print 1 to n using Recursion

// public class Recursion {

//     public static void repetition(int n){

//         if(n<0){
//             return ;
//         }
//         // else{
//         //     repetition(n-1);
//         //     System.out.println(n);
//         // }
//         else{
//             System.out.println(n);
//             repetition(n-1);
//         }
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         repetition(n);
        

//     }
// }

// --------------------------------------------------------------------------

// Sum of Array using Recursion

// public class Recursion {

//     public static int sum(int[] input) {

//         int sum = 0;

//         // Step 1: Base case (array is empty or not)
//         if (input.length == 0) {
//             return sum;
//         }

//         // Step 2: Create a new array with all elements except the first
//         int[] arr = new int[input.length - 1];
//         for (int i = 1; i < input.length; i++) {
//             arr[i - 1] = input[i];
//         }

//         // Step 3: Recursive call
//         sum = sum + sum(arr);

//         // Step 4: Add the first element to the sum
//         sum = sum + input[0];

//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] input = {1, 2, 3, 4, 5};
//         int result = sum(input);
//         System.out.println("Sum of the array elements: " + result);
//     }
// }

// --------------------------------------------------------------------------

// Multiplication  of Array using Recursion

// public class Recursion {

//     public static int product(int[] input) {

//         int product = 1;

//         // Step 1: Base case (array is empty or not)
//         if (input.length == 0) {
//             return product;
//         }

//         // Step 2: Create a new array with all elements except the first
//         int[] arr = new int[input.length - 1];
//         for (int i = 1; i < input.length; i++) {
//             arr[i - 1] = input[i];
//         }

//         // Step 3: Recursive call
//         product = product * product(arr);

//         // Step 4: Multiply the first element to the product
//         product = product * input[0];

//         return product;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int result = product(arr);
//         System.out.println("Product of the array elements: " + result);
//     }
// }