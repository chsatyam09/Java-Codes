
//Q.0 Sorting of an array 

// import java.util.Arrays;

// public class array_Question {
//     static void consecutive(int arr[]){

//          Arrays.sort(arr);

//          for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i] + " ");
//          }
//     }

//     public static void main(String[] args) {
//         int arr[]={8,2,6,9,4,5,3};
//         consecutive(arr);
        
//     }
// }

// Another method 

// public class  array_Question  {
//     public static void main(String[] args) {
//         int arr[]={8,2,6,9,4,5,3};
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[i] > arr[j]){
//                     int temp = arr[i] ;
//                   arr[i] = arr[j];
//                     arr[j]= temp ;

//                 }
                
//             }
            
//             System.out.print(arr[i]+ " ");
//         }
//     }
// }

// Another Method

// import java.util.Arrays;

// public class array_Question {

//     public static void main(String[] args) {
//         int arr[] = {8, 2, 6, 9, 4, 5, 3};

//         Arrays.sort(arr);

//         // Print the sorted array using Arrays.toString()
//         System.out.println(Arrays.toString(arr));
//         // Arrays.toString(arr): This method is part of the java.util.Arrays class. It takes an array as an argument and returns a string representation of the array.
//     }
// }


// Q.1  Reverse an array of integers 

// ------------another method for reversing a Array ------------------

// public class array_Question {

//     public static void main(String[] args) {
//         int arr[]={12,33,34,55,66};
//         for(int i=arr.length-1; i>=0;i--){
//             System.out.println(arr[i]);
//         }
//     }
// }

// ------------another method for reversing a Array ------------------

// public class array_Question {
//   public static void main(String[] args) {
//         int arr[]={12,93,34,55,66};
//         int i=0 ; int j=arr.length-1 ;
//         while(i<j){

//             int t =arr[i];
//             arr[i]=arr[j];
//             arr[j]=t  ;
//             i++;
//             j-- ;
//         }
//         for( i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
       
// for( j=0;j<arr.length;j++){
//     System.out.print(arr[j]+" ");
// }

//     }
// }

// ------------another method for reversing a Array ------------------

// public class array_Question {

//     static void Reverse(int arr[]){

//         int i=0 ;
//         int j=arr.length-1 ;
//         if(i<j){

//             int t =arr[i];
//             arr[i]=arr[j];
//             arr[j]=t  ;
//             i++;
//             j-- ;


//         }
//     }


//     public static void main(String[] args) {
//         int arr[]={12,23,34,55,66};
//         for(int i=0; i < arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }

//   System.out.println("");

//         Reverse(arr); 


//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
       
//     }
// }





// ---------------------------------------------------------------------------------------------------------------------------


//Q.2 find LARGEST element in an array 

// class array_Question{
//     public static void main(String[] args) {
//         int arr[]={12,14,16,18,20};
//         int max=arr[0];
      
//         for (int i = 0; i < 5; i++) {
//             if(arr[i]>max){
//                 max=arr[i];
//             }
            
//         }
//         System.out.println(max);
//     }
// }

// ------------ Another mehtod LARGEST element in an array --------------

// public class array_Question {
//     static int largest(int arr[]){

//         int max=0 ;
//         max=arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i]>max){
//                 max=arr[i];
//             }
            
//         }
//   return max ; 
//     }

//     public static void main(String[] args) {
//         int arr[]={12,14,20,40,29};
//         System.out.println(largest(arr));
//     }
// }


// ---------------------------------------------------------------------------------------------------------------------------



//  Q.2 find  MINIMUM element in an array 


// class array_Question{
//     public static void main(String[] args) {
//         int arr[]={83,367,4367,11,456};
//         int min=arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]<min){
//                 min=arr[i];
//             }
            
//         }
//         System.out.println(min);
//     }
// }

// ===============     Another mehtod to find MINIMUM element in an array  ========================

// class array_Question{


//     static int minimum(int arr[]){

//         int min=0 ;
//         min=arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i]<min){
//                 min=arr[i];
//             }
            
//         }

//         return min;

//     }


//     public static void main(String[] args) {
//         int arr[]={22,13,15,3,466,};
//         System.out.println(minimum(arr));
        
//     }
// }

// ---------------------------------------------------------------------------------------------------------------------------


// Q.2.1 find  SECOND largest element in an array 

// class array_Question{
//     static int secondlargest(int arr[]){
//         int max1=0 ;
//         int max2=0 ;
        
//         if (arr[0]>arr[1]) {
    
//             max1=arr[0];
//             max2=arr[1];
//         }
        
//         else{
//             max1=arr[1];
//             max2=arr[0];
        
//         }


//     for (int i = 2; i < arr.length; i++) {
//         if(arr[i]>max1){
//             max2=max1 ;
//             max1=arr[i]; 
    
//         }
    
//         else if (arr[i]>max2){
          
//             max2=arr[i] ;
//         }
        
//     }

//     return max2 ;
// }

//    public static void main(String[] args) {
//     int arr[]={ 20,40,6,25,30,88};
//     System.out.println(secondlargest(arr));
    

// }
// }



// ---------------------------------------------------------------------------------------------------------------------------



//Q.2.1  find SECOND MINIMUM element in an array 

// class array_Question {


//     static int secondminimum(int arr[]){

//         int min1=0 ;
//         int min2=0;

//         if(arr[0]<arr[1]){
//             min1=arr[0];
//             min2=arr[1];
//         }

//         else {
//             min1=arr[1];
//             min2=arr[0];
//         }

//         for (int i = 1; i < arr.length; i++) {

//             if(arr[i]<arr[0]){
//                 min1=arr[i];

//             }

//             else if (arr[i]<arr[1]){
//                 min2=arr[i];
//             }
            
//         }
//         return min2;

//     }


//     public static void main(String[] args) {
//         int arr[]={12,45,754,22,5,745};
//         System.out.println(secondminimum(arr));
        
//     }
// }

// ---------------------------------------------------------------------------------------------------------------------------

// Q.3  Find Kth  max and Min element in array 


// kthLargest 
 

// import java.util.Arrays;
// import java.util.Collections;

// class array_Question{
// 	public static int kthLargest(Integer[] arr, int K)
    
// 	{
//         int n=arr.length;
// 		// Sort the given array
// 		Arrays.sort(arr);

// 		// Return K'th element in
// 		// the sorted array
// 		return arr[n-K];
// 	}

// 	// driver's code
// 	public static void main(String[] args)
// 	{
// 		Integer arr[] =  { 12, 3, 5, 7, 19 };
// 		int  K = 2;

// 		// Function call
// 		System.out.print("K'th smallest element is "+ kthLargest(arr, K));
// 	}
// }

        // ====================================  maximum another method  =============================================================================

// public class array_Question {

// //     // sorting code ascending order
//     public static int Sort(int arr[],int K){
//             int temp =0 ;
//             int n= arr.length;
//             for (int  i=0;i<arr.length;i++){
//                 for (int j =i+1; j < arr.length; j++) {
//                     if(arr[j]<arr[i]){
//                         temp=arr[i];
//                         arr[i]=arr[j];
//                         arr[j]=temp ;
//                     } 
//                 }
//             }
//             return arr[n-K];
//         }
//         public static void main(String[] args) {
//             int arr[]={8,1,3,2,6,7};  
//             int K=4;

//         System.out.println();

//          Sort(arr,K);

//          System.out.println(Sort(arr,K));

//     }
// }

    // ====================================  smallest another method  =============================================================================

//     Find Kth   Min element in array 

// MINIMUM
// public class array_Question {
//     static int minimum(int arr[],int k){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[i]>arr[j]){
//                     int temp= arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp ;
//                 }
                
//             }
            
//         }
//         return arr[k-1];
//     }

//     public static void main(String[] args) {
//         int arr[]={1,2,12,13,14,16,19,23,298};
//         int k=4 ;
//         System.out.println(minimum(arr, k));
//     }
// }

// ==================================== another method  =============================================================================

//  kthSmallest

// import java.util.Arrays;
// import java.util.Collections;

// class array_Question{
// 	public static int kthSmallest(Integer[] arr, int K)
// 	{
// 		// Sort the given array
// 		Arrays.sort(arr);

// 		// Return K'th element in
// 		// the sorted array
// 		return arr[K - 1];
// 	}

// 	// driver's code
// 	public static void main(String[] args)
// 	{
// 		Integer arr[] = { 12, 3, 5, 7, 19 };
// 		int K = 2;

// 		// Function call
// 		System.out.print("K'th smallest element is "+ kthSmallest(arr, K));
// 	}
// }


// --------------------------------------------------------------------------------------------------------------------// 

// Q.4 G;iven an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo//  


// public class array_Question {
// public static void main(String[] args) {
//     int arr[]={0,1,0,1,2,0,2,0,2,1,0,1,2,0,0};  
//         System.out.println(" array before sorting");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+ " ");
        
// }

// int temp =0 ;
//         for (int  i=0;i<arr.length;i++){
//             for (int j =i+1; j < arr.length; j++) {
//                 if(arr[j]<arr[i]){
//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp ;

//                 }
                
//             }
//         }
//         System.out.println(" array After sorting");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
    
// }
    
// }
// ================== Another method =======================================

// public class array_Question {
// static void Sort(int arr[]){
//         int temp =0 ;
//         for (int  i=0;i<arr.length;i++){
//             for (int j =i+1; j < arr.length; j++) {
//                 if(arr[j]<arr[i]){
//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp ;

//                 }
                
//             }
     
//         }
        
//     }
//     public static void main(String[] args) {
//         int arr[]={0,1,0,1,2,0,2,0,2,1,0,1,2,0,0}; 
   
//     Sort(arr);

//     System.out.println(" array After sorting");
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]+" ");
//     }
        
//     }

// }

// --------------------------------------------------------------------------------------------------------------------// 

// Q.4.1 Array is sorted or not TRue or False 
// public class array_Question {

//     public static void main(String[] args) {
//         boolean flag=true;
//          int arr[]={12,14,17,18,22,};
//          for (int i = 1; i < arr.length; i++) {
//             if(arr[i]<arr[i-1]){
//                 flag=false ;
//                 System.out.println(  "array is not Sorted:" + i);
//                 break ;
//             }
            
//          }

//          if(flag== true){
//             System.out.println("array is sorted ");
//          }
//     }
// }

// Another method 

// public class array_Question {

//     public static void main(String[] args) {
//         boolean flag=true;
//          int arr[]={12,14,17,18,22,9,5};
//          for (int i = 0; i < arr.length-1; i++) {
//             if(arr[i]>arr[i+1]){
//                 flag=false ;
//                 System.out.println(  "array is not Sorted:" + i);
//                 break ;
//             }
            
//          }

//          if(flag== true){
//             System.out.println("array is sorted ");
//          }
//     }
// }

// Another method 


// public class array_Question{

//  static boolean Soreted(int arr[]){

//     for (int i = 1; i < arr.length; i++) {

//         if(arr[i]<arr[i-1]){
//              return false ;
//         }

        
//     }
//     return true ;

//  }
//     public static void main(String[] args) {
        
//         int arr[]={ 12,14,15,16,17,19};
//         System.out.println(Soreted(arr));
//     }
// }
// ---------------------------------------------------------------------------------------------------------------------------
// Q.4.2  Remove Duplicates in sorted  array 


// using hashset;

// import java.util.HashSet;

// public class array_Question {

//     public static void main(String[] args) {
//         int arr[]={12,12,13,14,14,14,15,16,19};
//         HashSet<Integer> hs = new HashSet<>();
//         for (int i = 0; i < arr.length; i++) {
//             hs.add(arr[i]);
//         }
  
//         for (int no:hs) {
//             System.out.println(no);
            
//         }

//     }
// }


// 
// temp variable ke sath 

// public class array_Question {

//     public static void main(String[] args) {
//         int arr[]={2,2,3,3,4,5,6,6,7};
//         int temp[]= new int [arr.length];
//         int j=0;
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]!=arr[i+1]){
//                 temp[j]=arr[i];
//                 j++;

//             }
//         }
//         temp[j]= arr[arr.length-1];

//         for(int i=0;i<arr.length;i++){    // arr.length ki jagan j alr do 
//             System.out.print(temp[i]+" ");
//         }
//     }
    
// }

// Mehtod 2 

// without temp variable

// public class array_Question {

//     public static void main(String[] args) {
//         int j=0;
//         int arr[]={1,2,2,3,3,4,5,5};
//         for (int i = 0; i < arr.length-1; i++) {
//             if(arr[i]!=arr[i+1]){
//                 arr[j]=arr[i];
//                 j++ ;

//             }
            
//         }
//         arr[j]=arr[arr.length-1];

//         for (int i = 0; i <j+1; i++) {
//             System.out.print(arr[i]+" ");
            
//         }
//     }
// }







// ---------------------------------------------------------------------------------------------------------------------------
// // Q.4.3  Remove Duplicates in unsorted  array 

// // hashset duplicate element store nhi karta 

// import java.util.HashSet;
// public class array_Question {

//     public static void main(String[] args) {
        
//         int arr[]={12,33,12,9,12,22,33,9};

//         HashSet<Integer> hs= new HashSet<>();
//         for (int i = 0; i < arr.length; i++) {
            
//             hs.add(arr[i]);
//         }

//         for(int no:hs){
//             System.out.print(no+" ");
//         }
//     }
// }


// ---------------------------------------------------------------------------------------------------------------------------
// // Q.4.4  fing Duplicates in  array and print only duplicates element


// public class array_Question {

//     public static void main(String[] args) {
//         int arr[]={2,2,3,3,4,5,6,6,7};
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == arr[i+1]){
//                 System.out.println(arr[i]);
//             }
            
//         }
//     }
// }






// --------------------------------------------------------------------------------------------------------------------------- 

// Q.4.5 Find Sub Array Of An Array 


// public class array_Question {
//     static void subarray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             for (int j = i; j < arr.length; j++) {
//                 for (int k = i; k<=j; k++) {
//                     System.out.print(arr[k]+ " ");
                    
//                 }
//                 System.out.println(" ");
//             }
           
//         }    
//     }
    
// public static void main(String[] args) {
//     int arr[]={1,2,3,4,5};
//     subarray(arr);
    
// }
    
// }




// ---------------------------------------------------------------------------------------------------------------------------



//Q. 4.6  Find Span of array {Span= max-min}

// public class array_Question {
//     static int Span(int arr[]){
//         int max =0;
//         int min =0;

//         max=arr[0];
//         min=arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//             else if (arr[i]<min) {
//                 min=arr[i];
//             }
//         }

//         return max-min ;
   
//     }

//     public static void main(String[] args) {
//         int arr[]={20,42,88,99,6};
//         System.out.println(Span(arr));
//     }
// }


// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.4.7 Count of smaller or equal element in arraay

// samjh nhi aaya 


// public class array_Question {
    
//     static int binarySearch(int arr[], int x){
//         int low =0;
//          int high=arr.length-1; ;
      

//                 while (low<=high) {
//                     int mid = (low+high)/2;
//                     if(arr[mid]==x){
//                         return mid  ;
//                     }
//                     else if (arr[mid] > x) {
//                         high = mid - 1;
         
//                     } else {
//                       low = mid + 1;
//                     }     
            
//         }
//         return +1;
//     }

//     public static void main(String[] args) {
//         int arr[]={2,6,12,18,21,26,33,42};
//         int x=26 ;

//         int count = binarySearch(arr, x);

//         System.out.println("Count of smaller or equal elements: " + count);
//     }

    
// }

// -------------------------------------------------------------------------------------------------------------------------------------------------------

//  Q.4.8   Search the given element in array 

// public class array_Question {

//     public static void main(String[] args) {
        

//         int arr[]={12,23,45,67,26,49};
//         int x=260 ;
//         boolean flag=false;
//         for (int i = 0; i < arr.length; i++) {


//             if(arr[i]==x){
//                 System.out.println(x + " elememnt is found in array " + " at index "+ i);
//                 flag=true;
//                 break ;
//             }
            
//         }
//         if(flag==false){
//             System.out.println("element not found in array");
//         }
//     }
// }
    


    // -------------------------------------------------------------------------------------------------------------------------------------------------------
    // Q.4.9  merege two array 

    // public class array_Question {
    
    //     public static void main(String[] args) {
    //         int arr1[]={10,20,30};
    //         int arr2[]={40,50,60,70};
    //         int temp[]=new int[arr1.length+ arr2.length];
    //         for (int i = 0; i < arr1.length; i++) {
    //             temp[i]=arr1[i];
                
    //         }
    //         for (int i= 0; i< arr2.length; i++) {
    //             temp[arr1.length+i]=arr2[i];
                
    //         }
    //         for (int i = 0; i < temp.length; i++) {
    //             System.out.print(temp[i]+ " ");
                
    //         }
    //     }
    // }
// // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4.10  Sort the given array 


// public class array_Question {

//     public static void main(String[] args) {
//         int arr[] = {12, 23, 298, 11, 21, 33, 78, 27};

//         for (int i = 0; i < arr.length; i++) {

//             int temp = 0;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
//                     temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }




// // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// // Q.5 Move all the negative elements to one side of the array


// public class array_Question {

//     public static void main(String[] args) {
//         int arr[] = {12, 23, -22, -12, -2, 22, -45, 29};
//         int temp[] = new int[arr.length];

//         int j = 0;

//         // Copy positive numbers to temp
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > 0) {
//                 temp[j++] = arr[i];
//             }
//         }

//         // Copy negative numbers to temp
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < 0) {
//                 temp[j++] = arr[i];
//             }
//         }

//         // Print the result
//         for (int i = 0; i < temp.length; i++) {
//             System.out.print(temp[i] + " ");
//         }
//     }
// }

// Another method 


// public class array_Question {

//     public static void main(String[] args) {
//         int arr[] = {2, 3, -2, -1, 6, -9};

//         // Using two pointers approach
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             // Move left pointer to the right until a negative element is found
//             while (left <= right && arr[left] >= 0) {
//                 left++;
//             }

//             // Move right pointer to the left until a positive element is found
//             while (left <= right && arr[right] < 0) {
//                 right--;
//             }

//             // Swap elements at left and right pointers
//             if (left <= right) {
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//                 left++;
//                 right--;
//             }
//         }

//         // Print the modified array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.6 Find the Union and Intersection of the two sorted arrays.

// public class array_Question {
//     static void Union(int arr1[],int arr2[],int m , int n){
//         int i=0 ;int j=0 ;
//         while(i<m & j<n) { 
     
//                 if(arr1[i]<arr2[j]){
//                     System.out.print(arr1[i++]+" ");
                 
//                 }
//                 else if (arr1[i]>arr2[j]){
//                     System.out.print(arr2[j++]+" ");
                
//                 }
              
//                 else if (arr1[i]==arr2[j]) {
//                     System.out.print(arr2[j++]+ " ");
//                     i++;
//                 }
                
//     }
//     // koi baach jaye uske lie hai ye 2 condition 
//             while (i<m) {
//                 System.out.println(arr1[i++]+" ");
             
//             }

//             while (j<n) {
//                 System.out.println(arr2[j++]+" ");
          
//             }

//         }
//     public static void main(String[] args) {
//         int arr1[]={1,3,4,5,7};
//         int arr2[]={2,3,5,6};
//         int m=arr1.length ;
//         int n=arr2.length ;
//         Union(arr1, arr2, n, n);
        
//     }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.7 Write a program to cyclically rotate an array by one.

// public class array_Question{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//             int x = arr[arr.length-1];
//             for (int i=arr.length-1 ;  i>0 ;i--) {
//                 arr[i]=arr[i-1];
                
//             }

//             arr[0]=x;
//             for (int i= 0; i < arr.length; i++) {
//                 System.out.print(arr[i]+" ");
                
//             }
        
//     }
// }



// --------------------------------------------------------------------------------------------------------------------// 

// Q.8 find Largest sum contiguous Subarray [V. IMP] 
// without Kadane's algorithm 


// public class array_Question {
//     public static int  maxs (int arr[]){ 
//     int maxsum= 0;


//     for(int i=0;i<arr.length;i++){
//         int sum=0 ;
//         for (int j = i; j < arr.length; j++) {
//              sum = sum + arr[j];
//             if( maxsum< sum){
//                 maxsum = sum ;

//             }
//         }
//     }
//     return maxsum ;

// }

//     public static void main(String[] args) {
//         int arr[]={-1,3,4,-2 };
//         System.out.println(maxs(arr));
      
//     }
// }


// Another method 


// public class array_Question {

//     public static void main(String[] args) {
//         int arr[]={-1,3,4,-2};
//         int sum=0;
//         int maxsum =0;
//         for (int i = 0; i < arr.length; i++) {
//             sum = 0;  // Reset sum for each new starting point
//             for (int j = i; j < arr.length; j++) {
            
//                 sum=sum+arr[j];

//                 if(maxsum<sum){
//                     maxsum=sum ;
//                 }
                
//             }
            
//         }
//         System.out.println(maxsum);
        
//     }
// }


// --------------------------------------------------------------------------------------------------------------------// 
// Q>9 Minimise the maximum difference between heights [V.IMP]

// import java.util.Arrays;

// public class array_Question {
//     public static int getmiddiff(int arr[],int k ){
//         if(arr.length==1){
//             return  0 ;
//         }

//         Arrays.sort(arr);

//         int min=arr[0]+k;
//        int max=arr[arr.length-1]-k;
//          int diff =max-min ;
//          return diff ;
// }


//     public static void main(String[] args) {
//         int arr[]={3,2,12,17,15,18,211};
//         int  k=3;
//       System.out.println(getmiddiff(arr, k));

//     }
// }







// --------------------------------------------------------------------------------------------------------------------// 
// // // Q.10 Minimum no. of Jumps to reach end of an array

// public class array_Question {
//     static int jump(int arr[]){
//         if(arr.length<=1) return  0 ;
    
//     int max=arr[0];
//     int steps = arr[0];
//     int jump =1 ;

//     for (int i = 1; i < arr.length; i++) {
//     if(i==arr.length-1) return jump ;
//     if (i+arr[i]>max) max =1+arr[i];
//     steps -- ;
//     if(steps==0){
//         jump++ ;
//         steps=max-1 ;
//     }
        
//     }

// return jump ;



//     }
//     public static void main(String[] args) {
//         int arr[]={1,3,5,8,9,2,6,7,6,8,9};
//         int j =jump(arr);
//         System.out.print(j);
        
//     }
// }



// --------------------------------------------------------------------------------------------------------------------// 

// Q.11 === 4.2

// find duplicate in an array of N+1 Integers

// public class array_Question {
//     public static void Duplicate(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[i]==arr[j]) {
//                     System.out.print(arr[i]+ " ");
                    
//                 }
                
//             }
            
//         }
//     }


//     public static void main(String[] args) {
//         int arr[]={ 2,2,3,3,4,6,6};
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+ " " );
            
//         }
//         System.out.println();

// Duplicate(arr);
//     } 
// }


// Another Method 


// public class array_Question {

//     public static void main(String[] args) {
//         int j=0;
//         int arr[]={1,2,2,3,3,4,5,5};
//         for (int i = 0; i < arr.length-1; i++) {
//             if(arr[i]!=arr[i+1]){
//                 arr[j]=arr[i];
//                 j++ ;

//             }
            
//         }
//         arr[j]=arr[arr.length-1];

//         for (int i = 0; i <j+1; i++) {
//             System.out.print(arr[i]+" ");
            
//         }
//     }
// 




// --------------------------------------------------------------------------------------------------------------------// 

// Q.12 Merge 2 sorted arrays without using Extra space.


// with extra space 

// public class Rough {

//     public static void main(String[] args) {
//         int arr1[]={10,20,30};
//         int arr2[]={40,50,60,70};
//         int temp[]=new int[arr1.length + arr2.length];
//         for (int i = 0; i < arr1.length; i++) {
//             temp[i]=arr1[i];
            
//         }
//         for (int i = 0; i < arr2.length; i++) {
//             temp[arr1.length + i]=arr2[i];
            
//         }

//         for (int i = 0; i < temp.length; i++) {
//             System.out.print(temp[i]+ " ");
            
//         }
        
        
//     }
// }

// Another method 

// public class array_Question {

//     static void Merge(int arr1[], int arr2[], int m, int n) {
//         int temp = 0;
    
//         for (int i = 0; i < m; i++) {
//             if (arr1[i] > arr2[0]) {
//                 // Swap elements in arr1 and arr2
//                 temp = arr1[i];
//                 arr1[i] = arr2[0];
//                 arr2[0] = temp;
    
//                 // Update arr2 to maintain its sorted order
//                 int j = 0;
//                 while (j + 1  < n && arr2[j] > arr2[j + 1]) {
//                     temp = arr2[j];
//                     arr2[j] = arr2[j + 1];
//                     arr2[j + 1] = temp;
//                     j++;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr1[]={1,2,6,8};
//         int arr2[]={3,5,7};
//         int m=arr1.length;
//         int n=arr2.length;
//         Merge(arr1,arr2,m,n);


//         for (int i = 0; i < m; i++) {
//             System.out.print(arr1[i]+ " ");
//         }

//         System.out.println();

//         for (int j = 0; j < n; j++) {
//             System.out.print(arr2[j]+ " ");
//         }
//     }
// }


// --------------------------------------------------------------------------------------------------------------------// 

// Q.13 Kadane's Algo [V.V.V.V.V IMP]   similar to Q.8
// KADANE'S ALGORITHM == Maximum Subarray 


// public class array_Question {
//     static int maxSubArray(int arr[]){
//         int sum=0;
//         int maxsum=0;
//         for (int i = 1; i < arr.length; i++) {

//             // join 
//             if(sum>=0){
//                 sum += arr[i];
//             }
//             // tum sarre loss me ho( -ve) mai apna dandha khud start karunga 

//             else if(sum<0){
//                 sum= arr[i];
//             }

//             if (sum>maxsum){
//                 maxsum = sum ;
//             }
            
//         }
//         return maxsum ;
//     }

//     public static void main(String[] args) {
//         int arr[]={ -2,1,-3,4,-1,2,1,-5,4};
//         System.out.print(maxSubArray(arr));
//     }
// }

// --------------------------------------------------------------------------------------------------------------------// 
// Q.14 Merge Intervals

// stack is used here 

// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.Stack;

// public class array_Question {
    
//     public static void mergeInterval(Interval arr[]) {

//         // Test if the given set has at least one interval ;
//         if (arr.length <= 0) {
//             return;
//         }
//         Stack<Interval> stack = new Stack<>();

//         Arrays.sort(arr, new Comparator<Interval>() {
//             public int compare(Interval i1, Interval i2) {
//                 return i1.start - i2.start;
//             }

//         });
//         stack.push(arr[0]);
//         for (int i = 1; i < arr.length; i++) {

//             // get interval from stack top
//             Interval top = stack.peek();
//             if (top.end < arr[i].start)
//                 stack.push(arr[i]);

//             else if (top.end < arr[i].end) {
//                 top.end = arr[i].end;
//                 stack.pop();
//                 stack.push(top);
//             }
//         }

//         // print content of stack

//         System.out.println("The merged intervals are : ");
//         while (!stack.isEmpty()) {
//             Interval t = stack.pop();
//             System.out.println("[" + t.start + ", " + t.end + " ]");
//         }

//     }

//     public static void main(String[] args) {
//         Interval arr[] = new Interval[4];
//         arr[0] = new Interval(1, 3);
//         arr[1] = new Interval(2, 4);
//         arr[2] = new Interval(5, 7);
//         arr[3] = new Interval(6, 8);
//         mergeInterval(arr);
//     }

//     static class Interval {
//         int start, end;

//         Interval(int start, int end) {
//             this.start = start;
//             this.end = end;
//         }
//     }
// }



// --------------------------------------------------------------------------------------------------------------------// 

// Q.15 Next Permutation


// import java.util.Arrays;

// public class array_Question {

//     public static void nextPermutation(int[] arr) {
//         // Step 1: Find the first pair (arr[i], arr[i+1]) such that arr[i] < arr[i+1]
//         int i = arr.length - 2;
//         while (i >= 0 && arr[i] >= arr[i + 1]) {
//             i--;
//         }

//         // Step 2: If no such pair exists, reverse the array and return
//         if (i == -1) {
//             reverse(arr, 0, arr.length - 1);
//             return;
//         }

//         // Step 3: Find the smallest element to the right of arr[i] and greater than arr[i]
//         int j = arr.length - 1;
//         while (arr[j] <= arr[i]) {
//             j--;
//         }

//         // Step 4: Swap arr[i] with the smallest element to the right of arr[i] and greater than arr[i]
//         swap(arr, i, j);

//         // Step 5: Reverse the subarray to the right of arr[i]
//         reverse(arr, i + 1, arr.length - 1);
//     }

//     // Utility method to reverse a subarray
//     private static void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             swap(arr, start, end);
//             start++;
//             end--;
//         }
//     }

//     // Utility method to swap two elements in an array
//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2,1,3};
        
//         System.out.println("Original Permutation: " + Arrays.toString(arr));

//         // Find the lexicographically next greater permutation
//         nextPermutation(arr);

//         System.out.println("Next Permutation: " + Arrays.toString(arr));
//     }
// }



// --------------------------------------------------------------------------------------------------------------------// 

// Find Ceil & Floor Of An Number In A Sorted Array ..

// public class array_Question {
//      public static int ceil (int arr[],int key ){

//         // BINARY SEARCH FOR CEIL 
//         int  low = 0 ;
//         int  high = arr.length-1 ;
//         int mid =0 ;


//         while(low<=high){
//             mid=(low+high)/2 ;

//             if(key==arr[mid]){
//                 return arr[mid] ;

//             }

    //         else  if (key<arr[mid]){
    //             high=mid-1;
    //             low=low;
    //         }
    //         else if (key>arr[mid]){
    //             low=mid+1 ;
    //             high=high ;
    //         }
    //     }
    //     return arr[low];  // CEIL 

    //  }


    //  public static int floor (int arr[],int key ){

    //       // BINARY SEARCH FOR FLOOR
    //     int  low = 0 ;
    //     int  high = arr.length-1 ;
    //     int mid =0 ;

    //     while(low<=high){
    //         mid=(low+high)/2 ;

    //         if(key==arr[mid]){
    //             return arr[mid] ;

    //         }

    //          else if (key<arr[mid]){
    //             high=mid-1;
    //             low=low;
    //         }
    //         else if (key>arr[mid]){
    //             low=mid+1 ;
    //             high=high ;
    //         }
    //     }
    //     return arr[high];  // FLOOR
        
    //  }



//     public static void main(String[] args) {
//         int arr[]={19,23,56,61,72,88,92};
//         int key =68 ;
//   System.out.println(ceil(arr, key));
//   System.out.println(floor(arr, key));
    
// }
// }


// --------------------------------------------------------------------------------------------------------------------// 

// public class array_Question {
//      public static int ceil (int arr[],int key,int low,int high , int mid  ){

        


//         while(low<=high){
//             mid=(low+high)/2 ;

//             if(key==arr[mid]){
//                 return arr[mid] ;

//             }

//             else  if (key<arr[mid]){
//                 high=mid-1;
//                 low=low;
//             }
//             else if (key>arr[mid]){
//                 low=mid+1 ;
//                 high=high ;
//             }
//         }
//         return arr[low];

//      }

//      public static int floor (int arr[],int key, int low,int high , int mid ){

//         while(low<=high){
//             mid=(low+high)/2 ;

//             if(key==arr[mid]){
//                 return arr[mid] ;

//             }

//              else if (key<arr[mid]){
//                 high=mid-1;
//                 low=low;
//             }
//             else if (key>arr[mid]){
//                 low=mid+1 ;
//                 high=high ;
//             }
//         }
//         return arr[high];
        
//      }



//     public static void main(String[] args) {
//         int arr[]={19,23,56,61,72,88,92};
//         int key =68 ;
// int  low = arr[0] ;
//         int  high = arr[arr.length-1] ;
//         int mid =0 ;
//   System.out.println(ceil(arr, key));
//   System.out.println(floor(arr, key));
    
// }
// }
// --------------------------------------------------------------------------------------------------------------------// 

//  Q.16 <-> Array Count Inversion <-> 

// brute force method 
// public class array_Question {

//     public static void main(String[] args) {
//         int arr[]={8,4,2,1};
//         int id =0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]>arr[j]){
//                   id++;
//                 }
//             }
//         }
//         System.out.println(id);
//     }
// }

// optimal method 

// public class array_Question {

//     public static void main(String[] args) {
//         int id =0 ;
//         int arr[]={8,4,2,1};
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]>arr[i+1]);
//             id++;
//         }
//         System.out.println(id);
//     }
// }



// --------------------------------------------------------------------------------------------------------------------// 

//   Q.17 Array Best time to buy and Sell stock <-> 



// Another method  ye wala smjh aagya mujhe 

// public class array_Question {


//     static int maxprofit(int stock[]){
//        int  maxprofit =0 ;
//        int buy=stock[0];



//         for (int i = 1; i < stock.length; i++) {
//             // buying
//             if(buy>stock[i]){
//                 buy = stock[i];
//             }



//             // selling 
//             else if(stock[i]-buy > maxprofit){
//                 maxprofit = stock[i]-buy ;

//             }

     
            
//         }
//         return maxprofit ;
//     }


//     public static void main(String[] args) {
//         int stock[]={7,8,1,9,6,4};
//         int result =maxprofit(stock);
//         System.out.println(result);
        
//     }
    
// }

// Another method

// public class array_Question {

//     public static void main(String[] args) {
//         int currentprice=Integer.MAX_VALUE ;
//         // int currentprice = 0 ;  ye kyu nhi hoga 
//         int profit =0 ;
//         int arr[]={7,1,5,3,6,4};
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]<currentprice){
//                 currentprice = arr[i];
             
//             }

//             else if(arr[i]-currentprice > profit){
//                 profit = arr[i]-currentprice ;
           
//             }
            
//         }
//         System.out.println(profit);
//     }
// }













// --------------------------------------------------------------------------------------------------------------------// 

//  Q.18   Array find all pairs on integer array whose sum is equal to given number <->

// public class array_Question {

//     public static void main(String[] args) {
//         int arr[]={1,5,7,-1};
//         int sum=6 ;
//         int count=0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[i]+arr[j]== sum)
//                 count ++;
                
//             }
            
//         }
//         System.out.println(count);
//     }
// }






// --------------------------------------------------------------------------------------------------------------------// 
// //   Q.19  Array find common elements In 3 sorted arrays <->

// public class array_Question {

//     static void common(int arr1[], int arr2[], int arr3[]) {
//         int i = 0;
//         int j = 0;
//         int k = 0;

//         while (i < arr1.length && j < arr2.length && k < arr3.length) {
//             if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
//                 System.out.println(arr1[i]);
//                 i++;
//                 j++;
//                 k++;
//             } else if (arr1[i] < arr2[j]) {
//                 i++;
//             } else if (arr2[j] < arr3[k]) {
//                 j++;
//             } else {
//                 k++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr1[] = {1, 2, 5, 10, 20, 40, 80};
//         int arr2[] = {6, 7, 20, 80, 100};
//         int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
//         common(arr1, arr2, arr3);
//     }
// }





// --------------------------------------------------------------------------------------------------------------------// 

//     Q.20  Array Rearrange the array in alternating positive and negative items with O(1) extra space .<-> 


// public class array_Question {

//     // swap naam ka function/method phle hii define kar dia 
//     static void swap(int arr[], int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void rearrange(int arr[]) {
//         int n = arr.length;
//         int i = 0;
//         int j = n - 1;

//         // Shift all the negative elements to one side
//         while (i <= j) {
//             while (i <= j && arr[i] > 0) {
//                 i++;
//             }
//             while (i <= j && arr[j] < 0) {
//                 j--;
//             }

//             if (i <= j) {
//                 swap(arr, i, j);
//                 i++;
//                 j--;
//             }
//         }

//         // Alternating the positive and negative elements
//         int k = 0;
//         while (k < n && i < n) {
//             swap(arr, k, i);
//             i = i + 1;
//             k = k + 2;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
//         rearrange(arr);

//         // Print the rearranged array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



// --------------------------------------------------------------------------------------------------------------------// 

//   Q.21   Array Find if there is any subarray with sum equal to 0 ;

// Another method  0(n^2)

// public class array_Question {

//     public static void main(String[] args) {
        
//         int arr[] = {4, 3, -3, 1, 6};
//         boolean flag = false;

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == 0) { 
//                     flag = true;
//                     System.out.println("true: Elements at indices " + i );
//                     break;
//                 }
//             }
//             if (flag) {
//                 break;
//             }
//         }

//         if (!flag) {
//             System.out.println("false");
//         }
//     }
// }

// Another mthod 0(n)

// import java.util.HashMap;

// public class array_Question {

//     static boolean hasSubarraySumZero(int arr[]) {
//         HashMap<Integer, Integer> h = new HashMap<>();
//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum =  arr[i] + sum ;

//             // If the current sum is 0 or has been seen before, a subarray with sum 0 exists
//             if (sum == 0 || h.containsKey(sum) || arr[i]==0) {
//                 return true;
//             }
//         }

//         // No subarray with sum 0 found
//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 2, -3, 1, 6};
//         boolean result = hasSubarraySumZero(arr);

//         if (result) {
//             System.out.println("Subarray with sum 0 exists.");
//         } else {
//             System.out.println("No subarray with sum 0 found.");
//         }
//     }
// }


// --------------------------------------------------------------------------------------------------------------------// 


//  22 . Array Find factorial of a large number <-> 

// BigInteger: BigInteger is a class in Java that belongs to the java.math package. 
// It is used for representing arbitrary-precision integers. 
// This means it can handle integers of any size, limited only by the available memory.

// Normal  factorial  

// import java.math.BigInteger;
// public class array_Question {

//     public static void main(String[] args) {
//         BigInteger result = BigInteger.ONE;
//         int n = 20;

//         for (int i = 1; i <= n; i++) {
//             result = result.multiply(BigInteger.valueOf(i));
//         }

//         System.out.println(result);
//     }
// }

// Another method

// import java.math.BigInteger;

// public class array_Question {

//     static BigInteger findFactorial(int n) {
//         BigInteger result = BigInteger.ONE;

//         for (int i = 2; i <= n; i++) {
//             result = result.multiply(BigInteger.valueOf(i));
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int n = 20; // Replace with the desired number

//         BigInteger factorial = findFactorial(n);

//         System.out.println("Factorial of " + n + " is: " + factorial);
//     }
// }

// --------------------------------------------------------------------------------------------------------------------// 

//   Q.23   Array find maximum product subarray == kadane's algorithm 

// public class array_Question {

//     public static void main(String[] args) {
//         int product=1 ;
//         int maxproduct =0 ;
//         int arr[]={1,2,3,4,5,6};
//         for (int i = 0; i < arr.length; i++) {

//        if(product>=0){
//          product = arr[i] * product ;
//     }
//     else if(product<0){
//         product= arr[i];
//     }
//     if (product>maxproduct){
//        maxproduct = product ;
//        }
            
//         }
//         System.out.println(maxproduct);
//     }
// }


// --------------------------------------------------------------------------------------------------------------------// 

// Q.24 Array Find longest coinsecutive subsequence. <-> 



// Another method

// import java.util.Arrays;

// public class array_Question {
//     static int  consecutive(int arr[]){

        
//         int count = 0 ;
//          Arrays.sort(arr);

//          for (int i = 1; i < arr.length; i++) {
//             if(arr[i]== arr[i-1]+1){
//                 count++ ;
//              }
//          }

//        return count; 
//     }

//     public static void main(String[] args) {
//         int arr[]={8,2,6,9,4,5,3};
//         int result = consecutive(arr);
//         System.out.println(result);
        
//     }
// }

// Another method


// import java.util.Arrays;
// public class array_Question {
//     static void consecutive(int arr[]){
//         int count=0 ;
//         Arrays.sort(arr) ;

//         for(int i=1;i<arr.length;i++){
//             if(arr[i]==arr[i-1]+1){
//                 count ++;
//             }
//         }
//         System.out.println(count);
        
//     }
//     public static void main(String[] args) {
//         int arr[]={8,2,6,9,4,5,3};
//         consecutive(arr);
//     }
// }





// --------------------------------------------------------------------------------------------------------------------// 

// Q.25 Given an array of size n and a number k, find all elements that appear more than " n/k " times. 

// public class array_Question {
//     static void appear(int arr[], int k) {
//         int n = arr.length;
//         int x = n / k;

//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             for (int j = 0; j < n; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }

//             if (count > x) {
//                 System.out.println("Element: " + arr[i] + ", Count: " + count);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 1, 2, 2, 3, 2, 2, 3, 1, 1, 1, 3, 5, 4};
//         int k = 4;
//         appear(arr, k);
//     }
// }


// Another method   O(nlogn)

// import java.util.Arrays;
// public class  array_Question {
//     static void appear(int arr[], int k) {
//         int n = arr.length;
//         int x = n / k;
//         // int count = 1;

//         Arrays.sort(arr);

//         for (int i = 0; i < arr.length; i++) {

//             int count =1 ;

//             while (i+1<n && arr[i]==arr[i+1]) {
//                 count++ ;
//                 i++ ;
                
//             }
//             if(count>x){
//                 System.out.println("Element: " + arr[0] + ", Count: " + count );
//             }
//             i++ ;
//             }
//         }
    

//     public static void main(String[] args) {
//         int arr[] = {1, 1, 2, 2, 3, 2, 2, 3, 1, 1, 1, 3, 5, 4,8,9,2,2};
//         int k = 4;
//         appear(arr, k);
//     }

// }

// Another method   O(nlogn)

// import java.util.Arrays;

// public class array_Question {
//     static void appear(int arr[], int k) {
//         int n = arr.length;
//         int x = n / k;
//         int count = 0;

//         Arrays.sort(arr);
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] == arr[i - 1]) {
//                 count++;
//             } else if (arr[i] != arr[i - 1]) {
//                 break;
//             }
//         }

//         System.out.println("Element: " + arr[0] + ", Count: " + count);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 1, 2, 2, 3, 2, 2, 3, 1, 1, 1, 3, 2, 2};
//         int k = 4;
//         appear(arr, k);
//     }
// }


// // --------------------------------------------------------------------------------------------------------------------// 
// Q.26  Array Maximum profit by buying and selling a share atmost twice ;






// // --------------------------------------------------------------------------------------------------------------------// 
//  Q.27  Array Find whether an array is a subset of another array


// public class array_Question {

//     public static void main(String[] args) {
//         int arr1[] = {11, 1, 13, 21, 3, 7};
//         int arr2[] = {11, 3, 7, 11};
//         int n = arr1.length;
//         int m = arr2.length;
//         boolean flag = false;

//         for (int i = 0; i < arr2.length; i++) {
//             for (int j = 0; j < arr1.length; j++) {
//                 if (arr2[i] == arr1[j]) {
//                     flag = true;
//                 }
//             }
//         }

//         if (flag=true) {
//             System.out.println("TRue");
//         }


//         if (!flag) {
//             System.out.println("false");
//         }
//     }
// }



//  // --------------------------------------------------------------------------------------------------------------------// 
//   Q.28 Array Find the triplet that sum to a given value. 

// public class array_Question {

//     public static void main(String[] args) {
//         int arr[] = {9, 3, 4, 1, 6, 12};
//         int x = 24;
//         boolean flag = false;
//         int iVal = -1, jVal = -1, kVal = -1;

//         for (int i = 0; i < arr.length -2; i++) {
//             for (int j = i + 1; j < arr.length-1 ; j++) {
//                 for (int k = j + 1; k < arr.length; k++) {
//                     if (arr[i] + arr[j] + arr[k] == x) {
//                         flag = true;
//                         iVal = i;
//                         jVal = j;
//                         kVal = k;
//                     }
//                 }
//             }
//         }

//         if (flag) {
//             System.out.println("true: " + arr[iVal] + " + " + arr[jVal] + " + " + arr[kVal] + " = " + x);
//         } else {
//             System.out.println("false");
//         }
//     }
// }




//   // --------------------------------------------------------------------------------------------------------------------//  
//   Q. 29 Array Trapping Rain water problem .


// time complexity = 0(n^2)

// public class array_Question {

//     static int trap(int arr[]){
//         int result= 0;
//         for (int i = 1; i <= arr.length-2; i++) {

//             int lb =arr[i];
//             for (int j = 0; j <= i-1; j++) {
//                 if(arr[j]> lb){
//                     lb= arr[j];
//                 }
                
//             }
//             int rb =arr[i];
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[j]> rb){
//                     rb= arr[j];
//                 }
                
//             }

//             int wl ;
//             if(rb>lb){
//                 wl =lb;
//             }
//             else{
//                 wl=rb ;
//             }

//             int tw ;
//             tw = wl -arr[i];
//             result = result + tw ;
            
//         }
//         return result ;
//     }

//     public static void main(String[] args) {
//         int arr[]={4,2,0,3,2,5};
//         System.out.println(trap(arr));

//     }
// }

// time complexity = 0(n)
// public class array_Question {

//     static int trap(int arr[]) {
//         int result = 0;
//         int[] lb = new int[arr.length];
//         int[] rb = new int[arr.length];

//         lb[0] = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             lb[i] = Math.max(arr[i], lb[i - 1]);
//         }

//         rb[arr.length - 1] = arr[arr.length - 1];
//         for (int i = arr.length - 2; i >= 0; i--) {
//             rb[i] = Math.max(arr[i], rb[i + 1]);
//         }

//         for (int i = 0; i < arr.length; i++) {
//             result += Math.min(lb[i], rb[i]) - arr[i];
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 2, 0, 3, 2, 5};
//         System.out.println(trap(arr));
//     }
// }












//   // --------------------------------------------------------------------------------------------------------------------// 
//   Q.30 Array Chocolate Distribution problem .



// import java.util.Arrays;

// public class array_Question {

//     public static int chocolate(int arr[], int m, int n) {
//         Arrays.sort(arr);

//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i + m - 1 < n; i++) {
//             int diff = arr[i + m - 1] - arr[i];
//             if (diff < min)
//                 min = diff;
//         }
//         return min;
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
//         int n = arr.length;
//         int m = 5;
//         System.out.println(chocolate(arr, m, n));
//     }
// }





//   // --------------------------------------------------------------------------------------------------------------------// 
//    Q.31 Array Smallest Subarray with sum greater than a given value .



// public class array_Question{

//     public static int smallestSubarray(int arr[], int x) {
//         int minLength = arr.length + 1;

//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum = arr[j]+ sum;

//                 // Check if the current subarray has a sum greater than x
//                 if (sum > x && (j - i + 1) < minLength) {
//                     minLength = j - i + 1;
//                 }
//             }
//         }

//         return minLength;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 4, 45, 6, 10, 19};
//         int x = 51;

//         int result = smallestSubarray(arr, x);

//         if (result == arr.length + 1) {
//             System.out.println("No subarray found");
//         } else {
//             System.out.println("Smallest subarray length with sum greater than " + x + ": " + result);
//         }
//     }
// }





//    // --------------------------------------------------------------------------------------------------------------------// 
//     Q.32 Array Three way partitioning of an array around a given value .



// public class array_Question {

//     public static void main(String[] args) {
//         int arr[] = {1, 14, 5, 4, 54, 87};
        
//         // Bubble sort
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 // Swap elements
//                 int temp = arr[i];
//                 arr[i] = arr[i + 1];
//                 arr[i + 1] = temp;
//             }
//         }

//         // Print the sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//     // --------------------------------------------------------------------------------------------------------------------// 
//     Q.33 Array Minimum swaps required bring elements less equal K together .




//     // --------------------------------------------------------------------------------------------------------------------// 
//     Q.34 Array Minimum no. of operations required to make an array palindrome .



//     // --------------------------------------------------------------------------------------------------------------------// 
//     Q.35  Array Median of 2 sorted arrays of equal size 



//     // --------------------------------------------------------------------------------------------------------------------// 
//     Q.36 Array Median of 2 sorted arrays of different size.


//     // --------------------------------------------------------------------------------------------------------------------// 