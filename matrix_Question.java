// write a program to convert 2d array to 1d array in simple java programming language 

// public class matrix_Question {

//     public static int[] convertTo1D(int[][] arr) {
//         int rows = arr.length;
//         int cols = arr[0].length;

//         int[] result = new int[rows * cols];
//         int index = 0;

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 result[index++] = arr[i][j];
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[][] twoDArray = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };
//         System.out.println("Original 2D Array:");
//         for (int[] row : twoDArray) {
//             for (int element : row) {
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }

//          // method calling 
//          int[] oneDArray = convertTo1D(twoDArray);

//         System.out.println("\nConverted 1D Array:");
//         for (int element : oneDArray) {
//             System.out.print(element + " ");
//         }
//     }
// }




// Q.1 Spiral traversal on a Matrix <->

// import java.util.ArrayList;
// import java.util.List;

// class matrix_Question {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         ArrayList<Integer> res = new ArrayList<Integer>();
//         int top = 0, bottom = matrix.length - 1;
//         int left = 0, right = matrix[0].length - 1;

//         while (left <= right && top <= bottom) {
//             // Left------>>>> right top are constant
//             for (int i = left; i <= right; i++) {
//                 res.add(matrix[top][i]);
//             }
//             top++;
//             // top----->bottom
//             for (int i = top; i <= bottom; i++) {
//                 res.add(matrix[i][right]);
//             }
//             right--;

//             if (!(left <= right && top <= bottom)) {
//                 break;
//             }

//             // right----->>>>>left
//             for (int i = right; i >= left; i--) {
//                 res.add(matrix[bottom][i]);
//             }
//             bottom--;

//             // bottom---->>>top
//             for (int i = bottom; i >= top; i--) {
//                 res.add(matrix[i][left]);
//             }
//             left++;
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         // Example usage
//         MatrixQuestion matrixQuestion = new MatrixQuestion();
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         List<Integer> result = matrixQuestion.spiralOrder(matrix);
//         System.out.println(result);
//     }
// }

// --------------------------------------------------------------------------
// Q.2 Search an element in a matriix <-> 

// Time complexity 0(m*n);

// public class matrix_Question {

//     public static boolean searchMatrix(int[][] matrix, int target) {
//         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//             return false; // Invalid input
//         }

//         int rows = matrix.length;
//         // int cols = matrix.length;
//         int cols = matrix[0].length;

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == target) {
//                     return true; // Target found
//                 }
//             }
//         }

//         return false; // Target not found
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 4, 7, 11},
//             {2, 5, 8, 12},
//             {3, 6, 9, 16},
//             {10, 13, 14, 17}
//         };

//         int target = 9;

//         boolean result = searchMatrix(matrix, target);

//         if (result) {
//             System.out.println("Target " + target + " found in the matrix.");
//         } else {
//             System.out.println("Target " + target + " not found in the matrix.");
//         }
//     }
// }

// Time complexity 0(m+n);

// public class matrix_Question {

//     static boolean search(int arr[][], int target){
//         int i = 0;
//         int j = arr[0].length -1 ;
//         while(i< arr.length && j>=0){
//       if(arr[i][j] == target){
//         return true ;
//       }
//       else if(arr[i][j]>target){
//         j-- ;
//       }
//       else
//       i++ ;
//         }
//         return false ; 
//     }

//     public static void main(String[] args) {
//         int arr[][] ={
//             {1, 4, 7, 11},
//             {2, 5, 8, 12},
//             {3, 6, 9, 16},
//             {10, 13, 14, 17} 

//         };
//         int target = 9 ;
//         boolean result = search(arr, target);
//         System.out.println(result);
//     }
// }





// --------------------------------------------------------------------------
// Q.3 Find median in a row wise sorted matrix

// brute force technique 

// import java.util.Arrays;
// public class matrix_Question {

//     public static double findMedian(int[][] matrix) {
//         // Convert the 2D matrix to a 1D array
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         int[] flattenedArray = new int[rows * cols];
//         int index = 0;

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 flattenedArray[index++] = matrix[i][j];
//             }
//         }

//         // Sort the flattened array
//         Arrays.sort(flattenedArray);

//         // Find the median
//         int length = flattenedArray.length;

//         if (length % 2 == 0) {
//             // If the length is even, average the middle two elements
//             int mid1 = length / 2 - 1;
//             int mid2 = length / 2;
//             return (flattenedArray[mid1] + flattenedArray[mid2]) / 2.0;
//         } else {
//             // If the length is odd, return the middle element
//             int mid = length / 2;
//             return flattenedArray[mid];
//         }
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 3, 5},
//             {2, 6, 9},
//             {3, 6, 9}
//         };
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         System.out.println("Original Matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         double median = findMedian(matrix);
//         System.out.println("\nMedian of the Matrix: " + median);
//     }
// }


// Another Method 

































// --------------------------------------------------------------------------
// Q.4 Find row with maximum no. of 1's 


// rahul batayega 
// // brute force

// public class matrix_Question {

//     public static int findMaxOnesRow(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         int onesCount = 0;
//         int maxOnesCount = 0;

//         for (int i = 0; i < rows; i++) {
//             onesCount =0 ;
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 1) {
//                     onesCount++;
//                 }
//             }
//             if (onesCount > maxOnesCount) {
//                 maxOnesCount = onesCount;
//             }
       
//         }
//         return maxOnesCount ;
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {0, 1, 1, 1},
//             {0, 0, 1, 1},
//             {1, 1, 1, 1},
//             {0, 0, 0, 1}
//         };

//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         System.out.println("Original Matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         int maxOnesRow = findMaxOnesRow(matrix);

//         System.out.println("\n Row with Maximum 1's : " + findMaxOnesRow(matrix) );
//     }
// }


// Another Method  


// public class matrix_Question {

//     public static int findMaxRow(int[][] arr) {
//         int rows = arr.length;
//         int cols = arr[0].length;

//         int maxRow = -1;  // Variable to store the row with the maximum number of 1's
//         int row = 0;
//         int col = cols - 1;  // Start from the top-right corner

//         while (row < rows && col >= 0) {
//             if (arr[row][col] == 1) {
//                 // Move left to find more 1's in the current row
//                 maxRow = row;
//                 col--;
//             } else {
//                 // Move down to the next row
//                 row++;
//             }
//         }

//         return maxRow;
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//                 {0, 1, 1, 1},
//                 {0, 0, 1, 1},
//                 {1, 1, 1, 1},
//                 {0, 0, 0, 1}
//         };

//         System.out.println("Row with maximum 1's: " + findMaxRow(matrix));
//     }
// }



// --------------------------------------------------------------------------
// Q.5 Print elements in sorted order using row-column wise sorted matrix <->


// import java.util.Arrays;

// public class matrix_Question {

//     public static void printSortedMatrix(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         // Flatten the matrix into a 1D array
//         int[] flattenedArray = new int[rows * cols];
//         int index = 0;

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 flattenedArray[index++] = matrix[i][j];
//             }
//         }

//         // Sort the flattened array
//         Arrays.sort(flattenedArray);

//         // Print the sorted elements back in matrix format
//         index = 0;
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(flattenedArray[index++] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//                 {5, 2, 9},
//                 {1, 8, 4},
//                 {7, 3, 6}
//         };

//         System.out.println("Original Matrix:");
//         for (int[] row : matrix) {
//             for (int element : row) {
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("\nSorted Matrix:");
//         printSortedMatrix(matrix);
//     }
// }



// --------------------------------------------------------------------------
// Q.6 Maximum size rectangle 











// --------------------------------------------------------------------------
// Q.7 Matrix Find a specific pair in matrix .
















// --------------------------------------------------------------------------
// Q.8 Rotate matrix by 90 degrees <->
// time complexity: O(m * n)
// space complexity: O(1)


// --------------------------------------------------------------------------
// Q.9 Kth smallest element in a row-cpumn wise sorted matrix <-> 



// --------------------------------------------------------------------------
// Q.10Common elements in all rows of a given matrix



// --------------------------------------------------------------------------

//Q.11  Find The Transpose Of A Matrix ;

// public class matrix_Question {

//     public static void main(String[] args) {
//         int arr[][]={

//             {1,6,11,16,21},
//             {2,7,12,17,22},
//             {3,8,13,18,23},
//             {4,9,14,19,24},
//             {5,10,15,20,25}
//         };

//         int rows= arr.length;
//         int cols=arr[0].length ;
//         int result[][]=new int [rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 result[j] [i ] = arr[i][j];
                
//             }
            
//         }
        
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j <cols; j++) {
//                 System.out.print(result[i][j]+ " ");
                
//             }
//             System.out.println();
            
//         }
//     }
// }

// Another method  
// REDUCING THE SPACE COMPLEXITY 

// public class matrix_Question {

//     public static void main(String[] args) {
//         int arr[][]={

//             {1,6,11,16,21},
//             {2,7,12,17,22},
//             {3,8,13,18,23},
//             {4,9,14,19,24},
//             {5,10,15,20,25}
//         };

//         int rows= arr.length;
//         int cols=arr[0].length ;
//         for (int i = 0; i < rows; i++) {
//             for (int j = i+1; j < cols; j++) {
//                 int temp =arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]= temp ;
                
//             }
            
//         }
        
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j <cols; j++) {
//                 System.out.print(arr[i][j]+ " ");
                
//             }
//             System.out.println();
            
//         }
//     }
// }
// --------------------------------------------------------------------------

// Q.12  How To Reverse The Columns Of A 2D Matrix;


// public class matrix_Question {
//     public static void main(String[] args) {
//         int arr[][] = {
//             {1, 6, 11, 16, 21},
//             {2, 7, 12, 17, 22},
//             {3, 8, 13, 18, 23},
//             {4, 9, 14, 19, 24},
//             {5, 10, 15, 20, 25}
//         };

//         for (int i = 0; i < arr.length; i++) {
//             int left = 0;
//             int right = arr[i].length - 1;

//             while (left < right) {
//                 int temp = arr[i][left];
//                 arr[i][left] = arr[i][right];
//                 arr[i][right] = temp;
//                 left++;
//                 right--;
//             }
            
//             // Print the reversed row
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// --------------------------------------------------------------------------


