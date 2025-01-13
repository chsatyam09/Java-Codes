
// Matrix	Spiral traversal on a Matrix	<->
// Matrix	Search an element in a matriix	<->
// Matrix	Find median in a row wise sorted matrix	<->
// Matrix	Find row with maximum no. of 1's	<->
// Matrix	Print elements in sorted order using row-column wise sorted matrix	<->
// Matrix	Maximum size rectangle	<->
// Matrix	Find a specific pair in matrix	<->
// Matrix	Rotate matrix by 90 degrees	<->
// Matrix	Kth smallest element in a row-cpumn wise sorted matrix	<->
// Matrix	Common elements in all rows of a given matrix



// write a program to convert 2d array to 1d array 

// public class matrix_Question {

// public static int[] convertTo1D(int[][] arr) {
// int rows = arr.length;
// int cols = arr[0].length;

// int[] result = new int[rows * cols];
// int index = 0;

// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// result[index++] = arr[i][j];
// }
// }

// return result;
// }

// public static void main(String[] args) {
// int[][] twoDArray = {
// {1, 2, 3},
// {4, 5, 6},
// {7, 8, 9}
// };
// System.out.println("Original 2D Array:");
// for (int[] row : twoDArray) {
// for (int element : row) {
// System.out.print(element + " ");
// }
// System.out.println();
// }

// // method calling
// int[] oneDArray = convertTo1D(twoDArray);

// System.out.println("\nConverted 1D Array:");
// for (int element : oneDArray) {
// System.out.print(element + " ");
// }
// }
// }
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------------------------------------------
// Q.1 Spiral traversal on a Matrix <->

// import java.util.ArrayList;
// import java.util.List;

// class matrix_Question {
// public List<Integer> spiralOrder(int[][] matrix) {
// ArrayList<Integer> res = new ArrayList<Integer>();
// int top = 0, bottom = matrix.length - 1;  
// int left = 0, right = matrix[0].length - 1;   // matrix.length - 1 gives you the index of the last row, not the last column.

// while (left <= right && top <= bottom) {
// // Left------>>>> right top are constant
// for (int i = left; i <= right; i++) {
// res.add(matrix[top][i]);
// }
// top++;
// // top----->bottom
// for (int i = top; i <= bottom; i++) {
// res.add(matrix[right][i]);
// }
// right--;

// if (!(left <= right && top <= bottom)) {
// break;
// }

// // right----->>>>>left
// for (int i = right; i >= left; i--) {
// res.add(matrix[bottom][i]);
// }
// bottom--;

// // bottom---->>>top
// for (int i = bottom; i >= top; i--) {
// res.add(matrix[i][left]);
// }
// left++;
// }

// return res;
// }

// public static void main(String[] args) {
// // Example usage
// matrix_Question matrixQuestion = new matrix_Question();
// int[][] matrix = {
// {1, 2, 3},
// {4, 5, 6},
// {7, 8, 9}
// };

// List<Integer> result = matrixQuestion.spiralOrder(matrix);
// System.out.println(result);
// }
// }

// --------------------------------------------------------------------------
// Q.2 Search an element in a matriix <->
// Search In A Row Wise And Column Wise Sorted Matrix

// Time complexity 0(m*n);

// public class matrix_Question {

//     public static int[] searchMatrix(int[][] matrix, int target) {
//         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//             return new int[]{-1, -1}; // Invalid input, return -1, -1 to indicate not found
//         }

//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == target) {
//                     return new int[]{i, j}; // Target found, return its position
//                 }
//             }
//         }

//         return new int[]{-1, -1}; // Target not found, return -1, -1
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 4, 7, 11},
//             {2, 5, 8, 12},
//             {3, 6, 9, 16},
//             {10, 13, 14, 17}
//         };

//         int target = 9;

//         int[] result = searchMatrix(matrix, target);

//         if (result[0] != -1) {
//             System.out.println("Target " + target + " found in the matrix at index (" + result[0] + ", " + result[1] + ").");
//         } else {
//             System.out.println("Target " + target + " not found in the matrix.");
//         }
//     }
// }


// Another Mehtod 

// Time complexity 0(m+n);

// public class matrix_Question {

//     static int[] search(int arr[][], int target) {
//         int i = 0;
//         int j = arr[0].length - 1;

//         while (i < arr.length && j >= 0) {
//             if (arr[i][j] == target) {
//                 return new int[]{i, j}; // Return the indices if the target is found
//             } else if (arr[i][j] > target) {
//                 j--; // Move left if the current element is greater than the target
//             } else {
//                 i++; // Move down if the current element is less than the target
//             }
//         }
//         return new int[]{-1, -1}; // Return -1, -1 if the target is not found
//     }

//     public static void main(String[] args) {
//         int arr[][] = {
//             {1, 4, 7, 11},
//             {2, 5, 8, 12},
//             {3, 6, 9, 16},
//             {10, 13, 14, 17}
//         };

//         int target = 9;
//         int[] result = search(arr, target);

//         if (result[0] != -1) {
//             System.out.println("Target " + target + " found at index (" + result[0] + ", " + result[1] + ").");
//         } else {
//             System.out.println("Target " + target + " not found in the matrix.");
//         }
//     }
// }






// --------------------------------------------------------------------------
// Q.3 Find median in a row wise sorted matrix ? 
// Median In Matrix

// brute force technique

// import java.util.Arrays;
// public class matrix_Question {

// public static double findMedian(int[][] matrix) {
// // Convert the 2D matrix to a 1D array
// int rows = matrix.length;
// int cols = matrix[0].length;

// int[] flattenedArray = new int[rows * cols];
// int index = 0;

// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// flattenedArray[index++] = matrix[i][j];
// }
// }

// // Sort the flattened array
// Arrays.sort(flattenedArray);

// // Find the median
// int length = flattenedArray.length;

// if (length % 2 == 0) {
// // If the length is even, average the middle two elements
// int mid1 = length / 2 - 1;
// int mid2 = length / 2;
// return (flattenedArray[mid1] + flattenedArray[mid2]) / 2.0;
// } else {
// // If the length is odd, return the middle element
// int mid = length / 2;
// return flattenedArray[mid];
// }
// }

// public static void main(String[] args) {
// int[][] matrix = {
// {1, 3, 5},
// {2, 6, 9},
// {3, 6, 9}
// };
// int rows = matrix.length;
// int cols = matrix[0].length;
// System.out.println("Original Matrix:");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// System.out.print(matrix[i][j] + " ");
// }
// System.out.println();
// }

// double median = findMedian(matrix);
// System.out.println("\nMedian of the Matrix: " + median);
// }
// }

// Another Method

// --------------------------------------------------------------------------
// Q.4 Find row with maximum no. of 1's
//  Row with Maximum 1's

// // brute force

// public class MatrixQuestion {

//     public static int findMaxOnesRow(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         int maxOnesCount = 0;
//         int rowIndex = -1;
//         int onesCount = 0;

//         for (int i = 0; i < rows; i++) {
//              onesCount = 0;
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 1) {
//                     onesCount++;
//                 }
//             }
//             if (onesCount > maxOnesCount) {
//                 maxOnesCount = onesCount;
//                 rowIndex = i; // Update the row index with the highest number of 1's
//             }
//         }
//         return rowIndex; // Return the row index with the maximum 1's
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

//         System.out.println("\nRow with Maximum 1's: " + maxOnesRow);
//     }
// }


// ------------- Another Method

// public class MatrixQuestion {

//     public static int[] findMaxRow(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         int maxRowIndex = -1; // To store the index of the row with maximum 1's
//         int j = cols - 1;     // Start from the last column
//         int i = 0;            // Start from the first row
//         int countOfOnes = 0;  // To store the number of 1's in the row with the maximum 1's
        
//         while (i < rows && j >= 0) {
//             if (matrix[i][j] == 1) {
//                 maxRowIndex = i; // Update the row index
//                 countOfOnes = cols - j; // Update the count of 1's
//                 j--;
//             } else {
//                 i++; //  // Move down to the next row
//             }
//         }
        
//         return new int[] {maxRowIndex, countOfOnes}; // Return an array with the row index and count of 1's
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {0, 1, 1, 1},
//             {0, 0, 1, 1},
//             {1, 1, 1, 1},
//             {0, 0, 0, 1}
//         };

//         int[] result = findMaxRow(matrix);
//         System.out.println("Row with maximum 1's: " + result[0]);
//         System.out.println("Number of 1's in that row: " + result[1]);
//     }
// }


    

// --------------------------------------------------------------------------
// Q.5 Print elements in sorted order using row-column wise sorted matrix <->
// Sorted Matrix

// import java.util.Arrays;
// public class matrix_Question {

// public static void printSortedMatrix(int[][] matrix) {
// int rows = matrix.length;
// int cols = matrix[0].length;

// // Flatten the matrix into a 1D array
// int[] flattenedArray = new int[rows * cols];
// int index = 0;

// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// flattenedArray[index++] = matrix[i][j];
// }
// }

// // Sort the flattened array
// Arrays.sort(flattenedArray);

// // Print the sorted elements back in matrix format
// index = 0;
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// System.out.print(flattenedArray[index++] + " ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// int[][] matrix = {
// {5, 2, 9},
// {1, 8, 4},
// {7, 3, 6}
// };

// System.out.println("Original Matrix:");
// for (int[] row : matrix) {
// for (int element : row) {
// System.out.print(element + " ");
// }
// System.out.println();
// }

// System.out.println("\nSorted Matrix:");
// printSortedMatrix(matrix);
// }
// }

// --------------------------------------------------------------------------
// Q.6 Maximum size rectangle
//  Maximum Size Rectangle Sub-matrix With All 1's

// The idea is to treat each row of the matrix as the base of a histogram where each column's value represents the height of the histogram's bar. 
// By iterating over each row, you update the height of each column and then calculate the largest rectangle that can be formed using the heights.

// import java.util.*;
// public class Solution {

//     public static int maximalAreaOfSubMatrixOfAll1(int[][] matrix, int n, int m) {
//         if (matrix.length == 0) return 0;
//         int[] heights = new int[m];
//         int maxArea = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == 1) {
//                     heights[j] += 1;
//                 } else {
//                     heights[j] = 0;
//                 }
//             }
//             maxArea = Math.max(maxArea, maxRectangleArea(heights));
//         }
        
//         return maxArea;
//     }

//     private static int maxRectangleArea(int[] heights) {
//         Stack<Integer> stack = new Stack<>();
//         int maxArea = 0;
//         int index = 0;
        
//         while (index < heights.length) {
//             if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
//                 stack.push(index++);
//             } else {
//                 int height = heights[stack.pop()];
//                 int width = stack.isEmpty() ? index : index - stack.peek() - 1;
//                 maxArea = Math.max(maxArea, height * width);
//             }
//         }
        
//         while (!stack.isEmpty()) {
//             int height = heights[stack.pop()];
//             int width = stack.isEmpty() ? index : index - stack.peek() - 1;
//             maxArea = Math.max(maxArea, height * width);
//         }
        
//         return maxArea;
//     }
// }
// --------------------------------------------------------------------------
// Q.6.1 Largest Rectangular in Histogram
// --------------------------------------------------------------------------
// Q.6.2 Maximum Area Square

// --------------------------------------------------------------------------
// Q.7 Matrix Find a specific pair in matrix .



// --------------------------------------------------------------------------
// Q.8.1 Transpose of a matrix ;
// Daigonal elemtns ko ignore kar do and swap rest of them . a[i][j] = a[j][i] 

// Wrong logic 
// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int n =matrix.length ;
//         int m=matrix[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 swap(matrix[i][j],matrix[j][i]);
//             }
//         }
//         static void swap(int[][] matrix, int i , int j ){
//             int temp = matrix[i][j];
//             matrix[i][j] = matrix[j][i];
//             matrix[j][i] = temp ;

//         }
        
//     }
// }

// Right logic 
// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int n = matrix.length; // Assuming the matrix is square (n x n)
        
//         // Iterate only over the upper triangle of the matrix (excluding the diagonal)
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 swap(matrix, i, j);
//             }
//         }
        
//         return matrix; // The matrix is transposed in place
//     }

//     // Swap function to swap elements at matrix[i][j] and matrix[j][i]
//     private void swap(int[][] matrix, int i, int j) {
//         int temp = matrix[i][j];
//         matrix[i][j] = matrix[j][i];
//         matrix[j][i] = temp;
//     }
// }

// Another Method 
// Another Method 

// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int n = matrix.length;      // Number of rows
//         int m = matrix[0].length;   // Number of columns
        
//         // Create a new matrix for the transposed result
//         int[][] transposedMatrix = new int[m][n];
        
//         // Fill the transposed matrix with values from the original matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 transposedMatrix[j][i] = matrix[i][j];
//             }
//         }
        
//         return transposedMatrix; // Return the new transposed matrix
//     }
// }
// --------------------------------------------------------------------------
// Q.8.2 Reverse  of a matrix ;

// import java.util.Arrays;

// public class Solution {

//     // Method to reverse each row of the matrix
//     public static void reverseMatrixRows(int[][] matrix) {
//         int n = matrix.length;
//         for (int i = 0; i < n; i++) {
//             reverseArray(matrix[i]);
//         }
//     }

//     // Helper method to reverse an array
//     private static void reverseArray(int[] array) {
//         int left = 0;
//         int right = array.length - 1;
//         while (left < right) {
//             int temp = array[left];
//             array[left] = array[right];
//             array[right] = temp;
//             left++;
//             right--;
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         // Reverse each row of the matrix
//         reverseMatrixRows(matrix);
//         System.out.println("Matrix after reversing each row:");
//         printMatrix(matrix);

//     }

//     // Method to print the matrix
//     private static void printMatrix(int[][] matrix) {
//         for (int[] row : matrix) {
//             System.out.println(Arrays.toString(row));
//         }
//     }
// }

// ANother Method 

// import java.util.Arrays;

// public class Solution {

//     // Method to reverse the columns of the matrix
//     public static void reverseMatrixColumns(int[][] matrix) {
//         int n = matrix.length;  // Number of rows
//         int m = matrix[0].length; // Number of columns

//         // Reverse the elements within each column
//         for (int j = 0; j < m; j++) {
//             for (int i = 0; i < n / 2; i++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[n - i - 1][j];
//                 matrix[n - i - 1][j] = temp;
//             }
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         // Reverse the columns of the matrix
//         reverseMatrixColumns(matrix);
//         System.out.println("Matrix after reversing the columns:");
//         printMatrix(matrix);
//     }

//     // Method to print the matrix
//     private static void printMatrix(int[][] matrix) {
//         for (int[] row : matrix) {
//             System.out.println(Arrays.toString(row));
//         }
//     }
// }

// --------------------------------------------------------------------------
// Q.8 Rotate matrix by 90 degrees <-> Clock iwse 

// import java.util.Arrays;

// public class Solution {

//     // Method to rotate the matrix by 90 degrees clockwise
//     public static void rotateMatrix90DegreesClockwise(int[][] matrix) {
//         // Step 1: Transpose the matrix
//         transposeMatrix(matrix);

//         // Step 2: Reverse each row
//         reverseRows(matrix);
//     }

//     // Method to transpose the matrix (convert rows to columns)
//     private static void transposeMatrix(int[][] matrix) {
//         int n = matrix.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//     }

//     // Method to reverse each row of the matrix
//     private static void reverseRows(int[][] matrix) {
//         int n = matrix.length;
//         for (int i = 0; i < n; i++) {
//             int left = 0;
//             int right = matrix[i].length - 1;
//             while (left < right) {
//                 int temp = matrix[i][left];
//                 matrix[i][left] = matrix[i][right];
//                 matrix[i][right] = temp;
//                 left++;
//                 right--;
//             }
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         // Rotate the matrix by 90 degrees clockwise
//         rotateMatrix90DegreesClockwise(matrix);
//         System.out.println("Matrix after 90-degree clockwise rotation:");
//         printMatrix(matrix);
//     }

//     // Method to print the matrix
//     private static void printMatrix(int[][] matrix) {
//         for (int[] row : matrix) {
//             System.out.println(Arrays.toString(row));
//         }
//     }
// }


// --------------------------------------------------------------------------
// Q.8 Rotate matrix by 90 degrees <-> Anti closk wise 

// import java.util.Arrays;

// public class Solution {

//     // Method to rotate the matrix by 90 degrees counterclockwise
//     public static void rotateMatrix90DegreesCounterclockwise(int[][] matrix) {
//         // Step 1: Transpose the matrix
//         transposeMatrix(matrix);

//         // Step 2: Reverse each column
//         reverseColumns(matrix);
//     }

//     // Method to transpose the matrix (convert rows to columns)
//     private static void transposeMatrix(int[][] matrix) {
//         int n = matrix.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//     }

//     // Method to reverse each column of the matrix
//     private static void reverseColumns(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for (int j = 0; j < m; j++) {
//             int top = 0;
//             int bottom = n - 1;
//             while (top < bottom) {
//                 int temp = matrix[top][j];
//                 matrix[top][j] = matrix[bottom][j];
//                 matrix[bottom][j] = temp;
//                 top++;
//                 bottom--;
//             }
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         // Rotate the matrix by 90 degrees counterclockwise
//         rotateMatrix90DegreesCounterclockwise(matrix);
//         System.out.println("Matrix after 90-degree counterclockwise rotation:");
//         printMatrix(matrix);
//     }

//     // Method to print the matrix
//     private static void printMatrix(int[][] matrix) {
//         for (int[] row : matrix) {
//             System.out.println(Arrays.toString(row));
//         }
//     }
// }



// --------------------------------------------------------------------------
// Q.9 Kth smallest element in a row-column wise sorted matrix <->
// Kth Minimum Floor



// --------------------------------------------------------------------------
// // Q.10 Common elements in all rows of a given matrix
// Common Elements Present In All Rows Of Matrix

// import java.util.*;
// class CommonMatrixElements
// {
//   public static void main(String args[])
//   {
//     // Input
//     int mat[][] =
//    {
//        {1, 2, 1, 4, 8},
//        {8, 7, 8, 5, 1},
//        {8, 7, 7, 3, 1},
//        {8, 1, 2, 7, 9},
//    };
//    // Funtion call
//    commonElements(mat,mat.length,mat[0].length);
//   }

//   public static void commonElements(int Mat[][], int r, int c)
//   {
//     // Map
//     HashMap<Integer,Integer> map = new HashMap<>();

//     for(int i=0;i<c;i++)
//     {
//       map.put(Mat[0][i],1);
//     }

//       for(int i=1;i<r;i++)
//       {
//         for(int j=0;j<c;j++)
//         {
//           // Store and avoid duplicate elements of same row
//           if(map.containsKey(Mat[i][j]) && map.get(Mat[i][j])==i)
//           {
//             map.put(Mat[i][j],map.get(Mat[i][j])+1);
//           }

//           if(i==r-1 && map.containsKey(Mat[i][j]) && map.get(Mat[i][j])==r)
//           {
//             System.out.print(Mat[i][j]+" ");
//           }
//         }
//       }

//   }
// }

// second approach (without data structure)

import java.util.*;
class Maincodes
{
  public static void main(String args[])
  {
    // Input
    int mat[][] =
   {
       {1, 2, 1, 4, 8},
       {8, 7, 8, 5, 1},
       {8, 7, 7, 3, 1},
       {8, 1, 1, 7, 9},
   };
   // Funtion call
   commonElements(mat,mat.length,mat[0].length);
  }
  // function to check if there is any duplicate elements in the firstRow
  public static boolean seen(int arr[],int element,int end)
  {
    for(int i=0;i<end;i++)
    {
      if(element==arr[i]) return true;
    }
    return false;
  }
  public static void commonElements(int Mat[][], int r, int c)
  {
    // pick one by one element of the first row and check if they are present in all rows.
    for(int firstRow=0;firstRow<c;firstRow++)
    {
      // pick element
      int element=Mat[0][firstRow];
      // if duplicate then skip the element
      if(seen(Mat[0],element,firstRow)) continue;
      // variable for tracking rows.
      int count=0;
      // if element is not present in anyone of the row then skip the element.
      int flag=0;
      // traverse from 1st to last row
      for(int row=1;row<r;row++)
      {
        for(int col=0;col<c;col++)
        {
          // if element is found then increment the counter
          if(element==Mat[row][col])
          {
            count++;
            // if present in last row and count is equal to row-1, then print it
            if(row==r-1 && count==r-1)
              System.out.println(element);
              // if count is same as row then break to avoid adding duplicates
            else if(row!=r-1 && count==row)
              break;
              // if element not present in the current row then set flag to 1,
            else
            {
              flag=1;
              break;
            }
          }
        }
        // break the outer loop and check for next element.
        if(flag==1) break;
      }
    }
  }
}

// --------------------------------------------------------------------------

// Q.11 Find The Transpose Of A Matrix ;

// public class matrix_Question {

// public static void main(String[] args) {
// int arr[][]={

// {1,6,11,16,21},
// {2,7,12,17,22},
// {3,8,13,18,23},
// {4,9,14,19,24},
// {5,10,15,20,25}
// };

// int rows= arr.length;
// int cols=arr[0].length ;
// int result[][]=new int [rows][cols];
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// result[j] [i ] = arr[i][j];

// }

// }

// for (int i = 0; i < rows; i++) {
// for (int j = 0; j <cols; j++) {
// System.out.print(result[i][j]+ " ");

// }
// System.out.println();

// }
// }
// }

// Another method
// REDUCING THE SPACE COMPLEXITY

// public class matrix_Question {

// public static void main(String[] args) {
// int arr[][]={

// {1,6,11,16,21},
// {2,7,12,17,22},
// {3,8,13,18,23},
// {4,9,14,19,24},
// {5,10,15,20,25}
// };

// int rows= arr.length;
// int cols=arr[0].length ;
// for (int i = 0; i < rows; i++) {
// for (int j = i+1; j < cols; j++) {
// int temp =arr[i][j];
// arr[i][j]=arr[j][i];
// arr[j][i]= temp ;

// }

// }

// for (int i = 0; i < rows; i++) {
// for (int j = 0; j <cols; j++) {
// System.out.print(arr[i][j]+ " ");

// }
// System.out.println();

// }
// }
// }
// // --------------------------------------------------------------------------

// Q.12 How To Reverse The Columns Of A 2D Matrix;

// public class matrix_Question {
// public static void main(String[] args) {
// int arr[][] = {
// {1, 6, 11, 16, 21},
// {2, 7, 12, 17, 22},
// {3, 8, 13, 18, 23},
// {4, 9, 14, 19, 24},
// {5, 10, 15, 20, 25}
// };

// for (int i = 0; i < arr.length; i++) {
// int left = 0;
// int right = arr[i].length - 1;

// while (left < right) {
// int temp = arr[i][left];
// arr[i][left] = arr[i][right];
// arr[i][right] = temp;
// left++;
// right--;
// }

// // Print the reversed row
// for (int j = 0; j < arr[i].length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

// // --------------------------------------------------------------------------
