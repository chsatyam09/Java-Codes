// 2D array is matrix
// Yes, a 2D array is often referred to as a matrix. 
// In programming, a matrix is a two-dimensional data structure where data elements are arranged in rows and columns. 
// Each element in the matrix is identified by two indices: the row index and the column index.

// int[][] matrix = {
//     {1, 2},
//     {4, 5},
//     {7, 8}
// };
// row = 3 = i ;
// column = 2 = j ;


// 2-D Array 


// JAB VALUES PATA HAI 

 public class matrix {
  public static void main(String[] args) {
     int num[][]={{5,3},{6,7},{9,3}};
  
    
     for(int i=0;i<3;i++){  // row
         for(int j=0;j<2;j++){  // column
             System.out.print(num[i][j]+" ");
         }
         System.out.println(" ");
     }
  }
    
 }

// public class array {

//     public static void main(String[] args) {
        
//         int arr[ ] [ ]={ {2,3},{4,5},{55,56} };
//         for(int i=0;i<arr.length;i++){
//             for (int j = 0; j < arr.length-1; j++) {
//                 System.out.print(arr[i][j]+  " ");
                
//             }
//             System.out.println(" ");
//         }
//     }
// }


// another method

// JAB VALUES NHI PATA HAI 
// public class array {
//  public static void main(String[] args) {
//     int num[][]=new int [3][2];  // 3 row 2 column 
//     num[0][0]=05;
//     num[0][1]=15;
//     num[1][0]=25;
//     num[1][1]=35;
//     num[2][0]=45;
//     num[2][1]=55;
//     for(int i=0;i<=2;i++){
//         for(int j=0;j<=1;j++){
//             System.out.print(num[i][j]+" ");
//         }
//         System.out.println(" ");
//     }
//  }
    
// }

// JAB VALUES NHI PATA HAI 

// public class array {

//     public static void main(String[] args) {
        
//         int arr[] []= new int[3][2];

//        for(int i=0;i<arr.length;i++){
//         for (int j = 0; j < arr.length-1; j++) {
//             System.out.print(arr[i][j] + " ");
            
//         }
//         System.out.println();
//        }

//     }
// }



// number of rows fixed hai but
// number of column fixed nhi hai
// JAB VALUES PATA HAI


// public class array {
//  public static void main(String[] args) {
//     int num[][]={{5,3,4,7},{6,7},{9,3,8}};
  
    
//     for(int i=0;i<=2;i++){
//         for(int j=0;j<num[i].length;j++){
//             System.out.print(num[i][j]+" ");
//         }
//         System.out.println(" ");
//     }
//  }
    
// }

// number of rows fixed hai but
// number of column fixed nhi hai
// JAB VALUES NHI PATA HAI 


// public class array {
//  public static void main(String[] args) {
//     int num[][]=new int [3][];
//     // // harr row ko pakda or mention kar dia kitna column hai sabme 
//     num[0]=new int[4];
//     num[1]=new int[2];
//     num[2]=new int[3];
//     num[0][0]=05;
//     num[0][1]=15;
//     num[1][0]=25;
//     num[1][1]=35;
//     num[2][0]=45;
//     num[2][1]=55;
//     for(int i=0;i<=2;i++){
//         for(int j=0;j<=1;j++){
//             System.out.print(num[i][j]+" ");
//         }
//         System.out.println(" ");
//     }
//  }
    
// }

//--------------------------------------------------------------------------------

// public class matrix {

//     public static void main(String[] args) {
//         // Creating a 2D array (matrix)
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         // Accessing elements in the matrix
//         int element = matrix[1][2]; // Accessing the element in the second row and third column (value: 6)

//         // Displaying the matrix
//         System.out.println("Matrix:");
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println(); // Move to the next line for the next row
//         }
//     }
// }

//--------------------------------------------------------------------------------

// Rotation of Matrix
// import java.util.*;
// import java.io.*;


// public class matrix {
    
//     public static void rotatedMatrix(int[][] arr){
//         // Step 1: Transpose the 2D array
//         int m = arr.length;
//         int n = arr[0].length;

//         for(int i=0; i<m; i++){
//             for(int j=i; j<n; j++){
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }
//         }

//         // Step 2: Swap the left and right side elements
//         for(int i=0; i<m; i++){
//             int li = 0;
//             int ri = n-1;

//             while(li < ri){
//                 int temp = arr[i][li];
//                 arr[i][li] = arr[i][ri];
//                 arr[i][ri] = temp;

//             li++;
//             ri--;
//             }
//         }
//     }
    
    
    
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };

//         // function calling
//         rotatedMatrix(arr);

//         for(var mat:arr){
//             System.out.println(Arrays.toString(mat));
//         }
//     }
// }









//--------------------------------------------------------------------------------


// for each / enchanced for loop 
// 1-D ARRAY 

// public class array {
//     public static void main(String[] args) {
//         int num[]={5,6,7,8,};
//         for(int n:num){
//             System.out.println(n);
//         }
//     } 
// }

// public class array {

//     public static void main(String[] args) {
//         int num[]= new int[4];
//         num[0]=5;
//          num[1]=9;
//           num[2]=7;
//            num[3]=6;
//                    for(int n:num){
//             System.out.println(n);
//         }
//     }
// }

// 2-D ARRAY 
// public class array {
//  public static void main(String[] args) {
//     int num[][]={{5,3,5,6},{6,7,7,8,},{9,3,9,8}};
  
    
//     for(int n[]:num){
//         for(int b:n){
//             System.out.print(b+" ");
//         }
//         System.out.println(" ");
//     }
//  }
    
// }

// public class array {
//  public static void main(String[] args) {
//     int num[][]=new int [3][2];
//     num[0][0]=05;
//     num[0][1]=15;
//     num[1][0]=25;
//     num[1][1]=35;
//     num[2][0]=45;
//     num[2][1]=55;
//   for(int n[]:num){
//         for(int b:n){
//             System.out.print(b+" ");
//         }
//         System.out.println(" ");
//     }
//  }
    
// }


//--------------------------------------------------------------------------------