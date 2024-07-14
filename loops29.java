
// public class loops29 {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3, 4, 5};

//         // Using traditional for loop
//         System.out.println("Using traditional for loop:");
//         for (int i = 0; i < numbers.length; i++) {
//             // Step 1: Access each element by index
//             System.out.println("Number: " + numbers[i]);
//         }

//         // Using enhanced for loop
//         System.out.println("\nUsing enhanced for loop:");
//         for (int number : numbers) {
//             // Step 2: Access each element directly
//             System.out.println("Number: " + number);
//         }

//                 // Using enhanced for loop
//                 System.out.println("\nUsing enhanced for loop:");
//                 for (int x : numbers) {
//                     // Step 2: Access each element directly
//                     System.out.println("Number: " + x);
//                 }
//     }
// }




// for loop 
// public class loops {
//     public static void main(String[] args) {
//         for(int i=1;i<5;i++){
//             System.out.println(i);
//         }
//     }
    
// }

// public class loops29 {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for (int j=1;j<=5;j++){
//                 System.out.print(i);
//             }
//             System.out.println(" ");
//         }
//     }
// }


//  while loop
// public class loops {

//     public static void main(String[] args) {
//         int i=1;
//         while (i<=10) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }


// do while loop 
// public class loops {

//     public static void main(String[] args) {
//         int i=1;
//         do{
//             System.out.println(i);
//             i++;
//         }
//         while(i<10);
//     }
// }


// "for-each" loop 

// for (type variableName : arrayName) {
//     // code block to be executed
//   }

//   String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// for (String i : cars) {
//   System.out.println(i);
// }


// class ForEachExample1{  
//     public static void main(String args[]){  
//      int arr[]={12,13,14,44};  
//      int total=0;  
//      for(int i:arr){  
//        total=total+i;  
//      }  
//     System.out.println("Total: "+total);  
//    }   
//   } 