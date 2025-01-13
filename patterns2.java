
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// solution -

// public class patterns2 {

// public static void main(String[] args) {
// for(int i =0;i<5;i++){
// for(int j=0;j<5;j++){
// System.out.print(" *");
// }
// System.out.println();
// }
// }
// }

// ---------------------------------------------------------------------------



// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// Solution - 2 star pattern will formed here 


// public class patterns2 {
// public static void main(String[] args) {
// for(int i =0;i<5;i++){
// for(int j=0;j<=i;j++){
// System.out.print("* ");
// }
// System.out.println(" ");
// }

// for(int i =0;i<4;i++){
// for( int j=i;j<4;j++){
// System.out.print("* ");
// }
// System.out.println();
// }

// }
// }

// ---------------------------------------------------------------------------



// *
// * *
// * * *
// * * * *
// * * * * *

// Solution -
// public class patterns2 {

// public static void main(String[] args) {
// for (int i = 0; i <=5; i++) {
// for (int j = 0; j<=i; j++) {
// System.out.print(" *");

// }
// System.out.println();
// }
// }
// }

// ---------------------------------------------------------------------------



// * * * * *
// * * * *
// * * *
// * *
// *

// Solution -

// public class patterns2 {
// public static void main(String[] args) {
// for (int i = 0; i <=5; i++) {
// for (int j = i; j<=5; j++) {
// System.out.print(" *");
// }
// System.out.println();
// }
// }
// }

// ---------------------------------------------------------------------------


//       * 
//      ** 
//     *** 
//    **** 
//   ***** 
//  ****** 
// ******* 

// soluton- Space + Star 


// public class patterns2 {

// public static void main(String[] args) {
// for (int i = 0; i <=6; i++) {
// for (int j = i; j <=5; j++) {
// System.out.print(" ");
// }
// for (int k = 0; k <= i; k++) {
// System.out.print("*");

// }
// System.out.println(" ");

// }
// }
// }

// ---------------------------------------------------------------------------


// ******* 
//  ****** 
//   ***** 
//    **** 
//     *** 
//      ** 
//       * 

// soluton- Space + Star 

// public class patterns2 {
// public static void main(String[] args) {
// for (int i = 0; i<7; i++) {
// for (int j = 1; j<=i; j++) {
// System.out.print(" ");
// }
// for (int k = i; k <7; k++) {
// System.out.print("*");

// }
// System.out.println(" ");
// }
// }
// }

// ---------------------------------------------------------------------------



//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 

// Solution - SPace + Star/Space

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 0; i <=5; i++) {
//             for (int j = i; j <5; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <=i; k++) {
//                 System.out.print(" *");
//             }
//             System.out.println(" ");
            
//         }
//     }
// }

// ---------------------------------------------------------------------------


//       * 
//      *** 
//     ***** 
//    ******* 
//   ********* 
//  *********** 
// *************

// Solution - SPace + Star/multiplication logic

// public class patterns2 {

// public static void main(String[] args) {
// for (int i = 0; i <=7; i++) {
// for (int j = i; j <7; j++) {
// System.out.print(" ");

// }
// for (int k =1;k <=2*i-1; k++) {
// System.out.print("*");

// }
// System.out.println(" ");

// }
// }
// }
// ---------------Another Method

// public class patterns2 {

// public static void main(String[] args) {
// for (int i = 1; i <=7; i++) {
// for (int j = i; j <7; j++) {
// System.out.print(" ");

// }
// for (int k =1;k <=2*i-1; k++) {
// System.out.print("*");

// }
// System.out.println(" ");

// }
// }
// }

// 
// ---------------Another Method

// public class patterns2 {

// public static void main(String[] args) {
// for (int i = 0; i <=7; i++) {
// for (int j = i; j<7; j++) {
// System.out.print(" ");
// }
// for (int k = 0; k <=i; k++) {
// System.out.print("*");

// }
// for (int l = 1; l<=i; l++) {
// System.out.print("*");
// }

// System.out.println(" ");
// }

// }
// }

// ---------------------------------------------------


// * * * * * * * *  
//  * * * * * * *  
//   * * * * * *  
//    * * * * *  
//     * * * *  
//      * * *  
//       * *  
//        *  

// Solution - Space + Star/Space

// public class patterns2 {

//     public static void main(String[] args) {
        // for (int i = 1; i <=8; i++) {
        //     for (int j = 1; j<i; j++) {
        //         System.out.print(" ");
                
        //     }
        //     for (int k = i; k<=8; k++) {
        //         System.out.print("* ");
                
        //     }
        //     System.out.println(" ");
        // }
//     }
// }




// ---------------------------------------------------------------------------


// ********* 
//  ******* 
//   ***** 
//    *** 
//     * 


// public class patterns2 {

// public static void main(String[] args) {
// for (int i = 1; i<=8; i++) {
// for (int j = 1; j<i; j++) {
// System.out.print(" ");
// }
// for (int k=9; k>=(2*i)-1 ; k--) {
// System.out.print("*");
// }
// System.out.println(" ");
// }
// }
// }
// ---------------------------------------------------------------------------


// *           
//  *          
//   *         
//    *        
//     *       
//      *      
//       *     
//        *    
//         *   
//          *  
//           * 

// public class patterns2 {

// public static void main(String[] args) {
// int n=12;
// for (int i = 1; i < n; i++) {
// for (int j = 1; j <n; j++) {
// if(i==j){
// System.out.print("*");
// }
// else{
// System.out.print(" ");
// }

// }
// System.out.println(" ");

// }
// }

// }

// ---------------------------------------------------------------------------

//          *  
//         *   
//        *    
//       *     
//      *      
//     *       
//    *        
//   *         
//  *          
// *           
    

// public class patterns2 {

// public static void main(String[] args) {
// int n=12;
// for (int i = 1; i < n; i++) {
// for (int j = 1; j <n; j++) {
// if(i+j==(n-1)){
// System.out.print("*");
// }
// else{
// System.out.print(" ");
// }

// }
// System.out.println(" ");

// }
// }

// ---------------------------------------------------------------------------


//          * 
//         * * 
//        *   * 
//       *     * 
//      *       * 
//     *         * 
//    *           * 
//   *************** 


// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=8; i++) {
//             for ( int j = i; j < 8; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2*i-1; k++) {
//                 if(k==1||k==2*i-1||i==8){ 
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Anotehr Method

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=4; i++) {
//             for ( int j = 1; j <=7; j++) {
//                if (i+j==5 || j-i==3 || i==4) {
//                 System.out.print("*");
//                }
//                else{
//                 System.out.print(" ");
//                }
//             }
//             System.out.println(" ");
              
//             }

//         }
//     }


// ---------------------------------------------------------------------------


// ********* 
//  *     * 
//   *   * 
//    * * 
//     * 

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i <=8; i++) {
//             for (int j = 1; j<i; j++) {
//                 System.out.print(" ");
                
//             }
//             for (int k = 9; k>=2*i-1; k--) {
//                 if (k==9|| k==2*i-1 ||i==1) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }


// ---------------------------------------------------------------------------


// * * * * * * * * * * 
// * * * * * * * * * 
// * * * * * * * * 
// * * * * * * * 
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * * * 
// * * * * * * * 
// * * * * * * * * 
// * * * * * * * * * 

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 0; i <=8; i++) {
//             for (int j = i; j <=9; j++) {
//                 System.out.print("* ");
                
//             }
//             System.out.println( );
//         }
//             for (int i = 0; i<=8; i++) {
//                 for (int j = 0; j<=i  ; j++) {
//                     System.out.print("* ");
                    
//                 }
//                 System.out.println( );
                
//             }
            
//         }
//     }




// ---------------------------------------------------------------------------



// *         * 
//  *       *  
//   *     *   
//    *   *    
//     * *     
//      *      
//     * *     
//    *   *    
//   *     *   
//  *       *  
// *         * 

//  public class patterns{
//     public static void main(String[] args) {
//         int n=11;
//         for (int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if ( i==j||i+j==n-1 ){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// ---------------------------------------------------------------------------

// *         * 
// **       ** 
// * *     * * 
// *  *   *  * 
// *   * *   * 
// *    *    * 
// *   * *   * 
// *  *   *  * 
// * *     * * 
// **       ** 
// *         * 
//  public class patterns{
//     public static void main(String[] args) {
//         int n=11;
//         for (int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if ( i==j||i+j==n-1||j==0|| j==n-1 ){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// ---------------------------------------------------------------------------

// ************ 
// **        ** 
// * *      * * 
// *  *    *  * 
// *   *  *   * 
// *    **    * 
// *    **    * 
// *   *  *   * 
// *  *    *  * 
// * *      * * 
// **        ** 
// ************ 
// public class patterns {

//     public static void main(String[] args) {
//         int n=12;
//         for(int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if ( j==0||j==n-1||i==j||i+j==n-1||i==0||i==n-1){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// ---------------------------------------------------------------------------

// *********** 
// *   * *   * 
// *  *   *  * 
// * *     * * 
// **       ** 
// *         * 
// **       ** 
// * *     * * 
// *  *   *  * 
// *   * *   * 
// *********** 
// solution:
// public class patterns2 {

//     public static void main(String[] args) {
//         int n=11; 
//     //    (n) iska odd even se figure teeda meeda ho jaata hai 
//         for(int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if (i==0 ||i==n-1 || j==0||j==n-1|| i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 ||i+j==(n-1)+(n-1)/2 ){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// ---------------------------------------------------------------------------

//      *      
//     * *     
//    *   *    
//   *     *   
//  *       *  
// *         * 
//  *       *  
//   *     *   
//    *   *    
//     * *   
//      * 
// public class patterns {

//     public static void main(String[] args) {
//         int n=11;
//         // n even likhe se value odd ho jayegi kyuki n 0 se start hai or figure gadbada jayega
//         for(int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if(i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==(n-1)+(n-1)/2){
//                   System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// ---------------------------------------------------------------------------


//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *
//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *



// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 0; i <=6; i++) {
//             for (int j = i; j<6; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j <=i; j++) {
//                 System.out.print("* ");
                
//             }
//             System.out.println(" ");
            
//         }
//         for (int i = 0; i<=5; i++) {
//             for (int j = 0; j<=i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k=5; k>=i; k--) {
//                 System.out.print("* ");
                
//             }
//             System.out.println(" ");
            
//         }

//     }
// }


// ---------------------------------------------------------------------------


// * * * * * *  * * * * * * 
// * * * * *      * * * * * 
// * * * *          * * * * 
// * * *              * * * 
// * *                  * * 
// *                      * 
// *                      * 
// * *                  * * 
// * * *              * * * 
// * * * *          * * * * 
// * * * * *      * * * * * 
// * * * * * *  * * * * * * 
// solution 

//   public class patterns2 {
//     public static void main(String[] args) {
  
   
//     // upper half of the pattern
//     for(int i = 0; i < 6; i++) 
//     {
//         for(int j = 0; j < (12); j++)
//         { 
//             if(i + j <= 6 - 1)  // upper left triangle
//               System.out.print("*");
//             else
//                 System.out.print(" ");
//             if((i + 6) <= j)  // upper right triangle
//               System.out.print("*");
//             else
//                System.out.print(" ");
//         }
//         System.out.println(" ");
//     }
//     // bottom half of the pattern
//     for(int i = 0; i < 6; i++)
//     {
//         for(int j = 0; j < 12; j++)
//         {
//             if(i >= j)  //bottom left triangle
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//             if(i >= (2 * 6 - 1) - j)  // bottom right triangle
//               System.out.print("*");
//             else
//                System.out.print(" ");
//         }
//         System.out.println(" ");
//     }

//     }
// }

// ---------------------------------------------------------------------------


// *         * * * * * *
// *         *
// *         *
// *         *
// *         *
// * * * * * * * * * * * 
//           *         * 
//           *         * 
//           *         * 
//           *         * 
// * * * * * *         * 


// public class patterns2{

//     public static void main(String[] args) {
//         int n=11;
//         for (int i = 0; i<=n; i++) {
//             for(int j=0;j<=n;j++){
//               if(i==(n-1)/2 || j==(n-1)/2 || j==0 && i<(n-1)/2 || j==n && i>(n-1)/2 || i==0 && j>(n-1)/2 || i==n && j<(n-1)/2 ){
//                 System.out.print("*");
//               }
//               else{
//                 System.out.print(" ");
//               }
//             }
//             System.out.println("");
            
//         }
//     }
// }
// ---------------------------------------------------------------------------

//   * * *    
// *   *   *  
// * *   * *  
// *   *   *  
//   * * *    

// public class patterns2{

//         public static void main(String[] args) {
//                 for (int i = 0; i <5; i++) {
//                         for (int j = 0; j <5; j++) {
//                                 if (i==j || i+j==5-1) {
//                                         System.out.print("  ");
                                        
//                                 }
//                                 else{
//                                         System.out.print("* ");
//                                 }
                                
//                         }
//                         System.out.println(" ");
                        
//                 }
//         }

    
// }
// ---------------------------------------------------------------------------

//   * * *    
// *       *  
// *       *  
// *       *  
//   * * *    

// public class patterns2{

//         public static void main(String[] args) {
//                 for (int i = 1; i <=5; i++) {
//                         for (int j = 1; j <=6; j++) {
//                                 if (i==1 && j>1 && j<5 || i==5 && j>1 && j<5  || j==1 && i>1 && i<5 || j==6 && i>1 && i<5) {
//                                         System.out.print("* ");
                                        
//                                 }
//                                 else{
//                                         System.out.print(" ");
//                                 }
                                
//                         }
//                         System.out.println(" ");
                        
//                 }
//         }

    
// }
// ---------------------------------------------------------------------------

//                ***               
//            ***********           
//          ***************         
//        *******************       
//       *********************      
//      ***********************     
//     *************************    
//    ***************************   
//    ***************************   
//   *****************************  
//   *****************************  
//  ******************************* 
//  ******************************* 
//  ******************************* 
//  ******************************* 
// *********************************
// *********************************
// *********************************
//  ******************************* 
//  ******************************* 
//  ******************************* 
//  ******************************* 
//   *****************************  
//   *****************************  
//    ***************************   
//    ***************************   
//     *************************    
//      ***********************     
//       *********************      
//        *******************       
//          ***************         
//            ***********           
//                ***         


// import java.util.Scanner;
// public class patterns2 {
// public static void main(String[] args) { // circle star pattern in java
// int xcord, ycord, radious, diameter, point ; 
// Scanner sc = new Scanner(System.in); 
// System.out.print(" Enter the  Radious - ");

// radious = sc.nextInt();
// diameter = 2 * radious;
// for(int i=0; i<=diameter; i++) { 
//         for (int j=0; j<=diameter; j++) { 
//                 xcord = radious - i ;
//                    ycord = radious- j ;
// point = xcord* xcord + ycord * ycord ;
// if (point <= radious * radious +1) {
// System.out.print ("*");
// }
// else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// ---------------------------------------------------------------------------



//  ****       
// *    *      
// *    *      
// *    *      
// *    *      
// ******      
// *    *      
// *    *      
// *    *      
// *    *      
// *    * 

// public class patterns2 {

//   public static void main(String[] args) {
//     int n=12;
//     for (int i = 0; i <=n-1; i++) {
//       for (int j = 0; j <=(n-1)/2; j++) {
//         if(i==0 && j>0 && j<(n-1)/2 || i==(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0){
//           System.out.print("*");
//         }
//         else{
//           System.out.print(" ");
//         }
        
//       }
//       System.out.println(" ");
      
//     }
//   }
// }



// ---------------------------------------------------------------------------

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

// public class patterns2 {

//   public static void main(String[] args) {
//     for (int i = 0; i <=5; i++) {
//       for (int j = 0; j <=i; j++) {
//         System.out.print("*");
//       }
//   for (int j = i; j<5; j++) {
//     System.out.print(" ");
//   }
//   for (int j = i; j<5; j++) {
//     System.out.print(" ");
//   }
//     for (int k = 0; k<=i; k++) {
//       System.out.print("*");
//     }
//     System.out.println(" ");
// }

// // -------------------------------------------
//       for (int i = 0; i <=5; i++) {
//         for (int j =i; j<=5; j++) {
//           System.out.print("*");
//         }
//   for (int j = 0; j<i; j++) {
//     System.out.print(" ");
//   }
//   for (int j = 0; j<i; j++) {
//     System.out.print(" ");
//   }
//     for (int k = i; k<=5; k++) {
//       System.out.print("*");
//     }
//     System.out.println(" ");
// }
//   }
// }

// ---------------------------------------------------------------------------

// *          * 
// **         * 
// * *       ** 
// *  *     * * 
// *   *   *  * 
// *    * *   * 
// *     *    * 
// *    * *   * 
// *   *   *  * 
// *  *     * * 
// * *       ** 
// **         * 


// for (int j = 0; j <=11; j++) {
//     if (j==11|| j==0 || i==j || i+j==12) {
//       System.out.print("*");
      
//     }
//     else{
//       System.out.print(" ");
//     }
      
//   }
//   System.out.println(" ");



// ---------------------------------------------------------------------------

// ***********
// *         *
// * ******* *
// * ******* *
// * ******* *
// * ******* *
// * ******* *
// * ******* *
// * ******* *
// *         *
// ***********


// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 0; i <=11; i++) {
//             for (int j = 0; j<=11; j++) {
//                if(i==0 ||i==11 || j==0 || j==11 ){
//                 System.out.print("*");
//                }
        
//                else if ( i==1 && j>=1 && j<11 || i==10 && j>=1 && j<11 ){
//                 System.out.print(" ");
//                }
//                else{
//                 System.out.print("*");
//                }
                
//             }
//             System.out.println(" ");
            
//         }
//     }
// }


// ---------------------------------------------------------------------------

// ************ 
// *          * 
// *##########* 
// *##########* 
// *##########* 
// *##########* 
// *##########* 
// *##########* 
// *##########* 
// *##########* 
// *          * 
// ************ 

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 0; i <=11; i++) {
//             for (int j = 0; j<=11; j++) {
//                if(i==0 ||i==11 || j==0 || j==11){
//                 System.out.print("*");
//                }
//                else if (i==1 && j>=1 && j<11 || i==10 && j>=1 && j<11) {
//                 System.out.print(" ");
//                }
//                else{
//                 System.out.print("#");
//                }
                
//             }
//             System.out.println(" ");
            
//         }
//     }
// }
// ---------------------------------------------------------------------------


//   write your Name in Capital - SATYAM

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 0; i <=11; i++) {

//             // for (int m = 0; m<=25; m++) { System.out.print(" ");} // for spacing 

//             // prirnt S 
//             for (int j = 0; j <=11; j++) {
//               if (i==0|| i==(5) || i==11 || j==0&&i<=5 || j==11 && i>=6) {
//                 System.out.print("*");
                
//               }
//               else{
//                 System.out.print(" ");
//               }
                
//             }
//             System.out.print(" ");
//             System.out.print(" ");
//             System.out.print(" ");
//             System.out.print(" ");
//             System.out.print(" ");

//             // print A 

//             for (int j = 0; j <=11; j++) {
//                 if (j==0 && i>0 || j==11&& i>0 || i==6 || i==0&& j>0 && j<11 ) {
//                   System.out.print("*");
                  
//                 }
//                 else{
//                   System.out.print(" ");
//                 }
                  
//               }
//               System.out.print(" ");
//               System.out.print(" ");
//               System.out.print(" ");
//               System.out.print(" ");
//               System.out.print(" ");

//                                // print Y

//                                for (int j = 0; j <=11; j++) {
//                                 if (i==0|| j==5) {
//                                   System.out.print("*");
                                  
//                                 }
//                                 else{
//                                   System.out.print(" ");
//                                 }
                                  
//                               }
//                               System.out.print(" ");
//                               System.out.print(" ");
//                               System.out.print(" ");
//                               System.out.print(" ");
//                               System.out.print(" ");

//                       // print T

//             for (int j = 0; j <=11; j++) {
//                 if ( j==5 && i>=4 || i==j&&j<=5 || i+j==10 && i<6 ) {
//                   System.out.print("*");
                  
//                 }
//                 else{
//                   System.out.print(" ");
//                 }
                  
//               }
//               System.out.print(" ");
//               System.out.print(" ");
//               System.out.print(" ");
//               System.out.print(" ");

//               System.out.print(" ");


//                                           // print A
//                                           for (int j = 0; j <=11; j++) {
//                                             if (j==0 && i>0 || j==11&& i>0 || i==6 || i==0&& j>0 && j<11 ) {
//                                               System.out.print("*");
                                              
//                                             }
//                                             else{
//                                               System.out.print(" ");
//                                             }
                                              
//                                           }
//               System.out.print(" ");
//               System.out.print(" ");
//               System.out.print(" ");
//               System.out.print(" ");
//               System.out.print(" ");

//                                           // print M

//             for (int j = 0; j <=11; j++) {
//                 if (j==11|| j==0 || i==j && j<=6|| i+j==11 && i<=6) {
//                   System.out.print("*");
                  
//                 }
//                 else{
//                   System.out.print(" ");
//                 }
                  
//               }
//               System.out.println(" ");  
//         } //  for
//     } // static
// } // class 







// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i <=5; i++) {
//             for (int j = 1; j <=5; j++) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------

// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4
// 5 5 5 5 5

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i <=5; i++) {
//             for (int j = 1; j <=5; j++) {
//                 System.out.print(i+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------

// 5 5 5 5 5
// 4 4 4 4 4
// 3 3 3 3 3
// 2 2 2 2 2
// 1 1 1 1 1

// public class patterns2 {

//         public static void main(String[] args) {
//             for (int i = 5; i>=1; i--) {
//                 for (int j = 1; j <=5; j++) {
//                     System.out.print(i+" ");
                    
//                 }
//                 System.out.println();
                
//             }
            
//         }
//     }

// ---------------------------------------------------------------------------


// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1

// public class patterns2 {

//         public static void main(String[] args) {
//             for (int i = 1; i<=5; i++) {
//                 for (int j=5; j>=1; j--) {
//                     System.out.print(j+" ");
                    
//                 }
//                 System.out.println();
                
//             }
            
//         }
//     }

// ---------------------------------------------------------------------------

// 1 0 1 0 1
// 1 0 1 0 1
// 1 0 1 0 1
// 1 0 1 0 1
// 1 0 1 0 1

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i <=5; i++) {

//             int num ;
//             if(i%2==0){
//                 num=0 ;
//                 System.out.print(num);
//             }
//             else{
//                 num=1 ;
//                 System.out.print(num);
//             }

//             for (int j = 1; j < 5; j++) {
//                 if(num==1){
//                     num=0;
//                 }
//                 else{
//                     num=1;
//                 }
//                 System.out.print(num);
                
//             }
//             System.out.println();
//         }
//     }
// }


// Another method 

// public class patterns2 {
// public static void main(String[] args) {


//     for (int i = 0; i < 5; i++) {

//         for (int j = i; j < 5 + i; j++) {
//             if (j % 2 == 0)
//                 System.out.print("1");
//             else
//                 System.out.print("0");
//         }
//         System.out.println();
//     }

// }
// }
// ---------------------------------------------------------------------------


//      1
//    2  3
//   4  5  6
//  7 8  9  10

// public class patterns2{

//     public static void main(String[] args) {
//         int rows = 4; // Number of rows in the triangle
//         int count = 1; // Starting number

//         for (int i = 1; i <= rows; i++) {
//             // Print leading spaces
//             for (int j = rows; j > i; j--) {
//                 System.out.print("  ");
//             }
//             // Print numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(count + " ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }
// }

// ---------------------------------------------------------------------------

//         1 
//       1 2 1 
//     1 2 3 2 1 
//   1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 
//   1 2 3 4 3 2 1 
//     1 2 3 2 1 
//       1 2 1 
//         1

// public class patterns2 {

//     public static void main(String[] args) {
//         int n = 5; 

//         // Upper part of the diamond
//         for (int i = 1; i <= n; i++) {
//             // Print leading spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print("  ");
//             }
//             // Print increasing numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             // Print decreasing numbers
//             for (int j = i - 1; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         // Lower part of the diamond
//         for (int i = n - 1; i >= 1; i--) {
//             // Print leading spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print("  ");
//             }
//             // Print increasing numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             // Print decreasing numbers
//             for (int j = i - 1; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// ---------------------------------------------------------------------------

// 5 4 3 2 1
// 4 3 2 1
// 3 2 1
// 2 1
// 1

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=5; i++) {
//             for (int j = 5; j>=i; j--) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }


// ---------------------------------------------------------------------------

// 5 5 5 5 5
// 4 4 4 4
// 3 3 3
// 2 2
// 1

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 5; i>=1; i--) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print(i+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }


// ---------------------------------------------------------------------------

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=5; i++) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=5; i++) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print(i+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------

// 5
// 5 4
// 5 4 3
// 5 4 3 2
// 5 4 3 2 1

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 5; i>=1; i--) {
//             for (int j = 5; j>=i; j--) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }
// ---------------------------------------------------------------------------


// 5 
// 4 4 
// 3 3 3 
// 2 2 2 2 
// 1 1 1 1 1 

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 5; i>=1; i--) {
//             for (int j = 5; j>=i; j--) {
//                 System.out.print(i+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------

// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=5; i++) {
//             for (int j = i; j>=1; j--) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }


// ---------------------------------------------------------------------------

// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=5; i++) {
//             for (int j = 5; j>=i; j--) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------



// 1 2 3 4 5
// 2 3 4 5
// 3 4 5
// 4 5
// 5

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=5; i++) {
//             for (int j = i; j<=5; j++) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------

// 1 1 1 1 1
// 2 2 2 2
// 3 3 3
// 4 4
// 5

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 1; i<=5; i++) {
//             for (int j = 5; j>=i; j--) {
//                 System.out.print(i+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }


// ---------------------------------------------------------------------------


// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class patterns2 {

//     public static void main(String[] args) {
//         for (int i = 5; i>=1; i--) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }
// ---------------------------------------------------------------------------


// 1 2 3 4 5 6 7 8 9 
// 1 2 3 4 5 6 7 8  
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 
// 1 2 3 4 5  
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1  

// public class patterns2 {
//     public static void main(String[] args) {
//         for (int i = 9; i>=1; i--) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
            
//         }
        
//     }
// }


// ---------------------------------------------------------------------------

// 1 2 3 4 5 6 7 8 9 
// 2 3 4 5 6 7 8 9 
// 3 4 5 6 7 8 9 
// 4 5 6 7 8 9 
// 5 6 7 8 9 
// 6 7 8 9 
// 7 8 9 
// 8 9 
// 9 

// public class patterns2 {
//     public static void main(String[] args) {
//         for (int i = 1; i<=9; i++) {
//             for (int j = i; j<=9; j++) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }
// ---------------------------------------------------------------------------

// 9 
// 8 9 
// 7 8 9 
// 6 7 8 9 
// 5 6 7 8 9 
// 4 5 6 7 8 9 
// 3 4 5 6 7 8 9 
// 2 3 4 5 6 7 8 9 
// 1 2 3 4 5 6 7 8 9 

// public class patterns2 {
//     public static void main(String[] args) {
//         for (int i = 9; i>=1; i--) {
//             for (int j = i; j<=9; j++) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }
// ---------------------------------------------------------------------------
// 2 3 4 5 6 7 8 9 
// 3 4 5 6 7 8 9 
// 4 5 6 7 8 9 
// 5 6 7 8 9 
// 6 7 8 9 
// 7 8 9 
// 8 9 

// public class patterns2 {
//     public static void main(String[] args) {
//         for (int i = 1; i<=9; i++) {
//             for (int j = i+1; j<=9; j++) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }



// ---------------------------------------------------------------------------




// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10 11
// 1 2 3 4 5 6 7 8 9 10 11 12
// 1 2 3 4 5 6 7 8 9 10 11 12 13
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14

// public class patterns2 {
//     public static void main(String[] args) {
//         for (int i = 1; i<=14; i++) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }



// ---------------------------------------------------------------------------

// 1 0 1 0 1
// 1 0 1 0 1 0
// 1 0 1 0 1 0 1
// 1 0 1 0 1 0 1 0
// 1 0 1 0 1 0 1 0 1
// 1 0 1 0 1 0 1 0 1 0
// 1 0 1 0 1 0 1 0 1 0 1
// 1 0 1 0 1 0 1 0 1 0 1 0
// 1 0 1 0 1 0 1 0 1 0 1 0 1
// 1 0 1 0 1 0 1 0 1 0 1 0 1 0
// 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1

// public class patterns2 {

//     public static void main(String[] args) {
//         for(int i=0;i<=10;i++){
//             for (int j = 0; j <=5+i; j++) {
//                 if (j%2==0) {
//                     System.out.print("0 ");

                    
//                 }
//                 else{
//                     System.out.print("1 ");
//                 }
                
//             }
//             System.out.println(" ");
//         }
//     }
// }


// ---------------------------------------------------------------------------


// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


// public class patterns2 {
//     public static void main(String[] args) {
//         int k=1;
//         for (int i = 1; i<=5; i++) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print(k++ +" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------

// 1 
// 2 6 
// 3 7 10
// 4 8 11 13  
// 5 9 12 14 15 

// public class patterns2 {
//     public static void main(String[] args) {
//         for (int i = 1; i<=5; i++) {

//             int num=i ; 
//             for (int j = 1; j<=i; j++) {
//                 System.out.print(num);
//                 num=num+5-j;
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }

// ---------------------------------------------------------------------------


// 1 2 3 
// 6 5 4 
// 7 8 9 
// 12 11 10
// 13 14 15 

// public class patterns2 {

//     public static void main(String[] args) {
//         int count = 0;
//         int rows = 5;
//         int cols = 3;

//         for (int i = 1; i <= rows; i++) {
//             if (i % 2 != 0) {
//                 // For odd rows, print in increasing order
//                 for (int j = 1; j <= cols; j++) {
//                     count++;
//                     System.out.print(count + " ");
//                 }
//             } else {
//                 // For even rows, print in decreasing order
//                 int temp = count + cols;
//                 for (int j = temp; j > count; j--) {
//                     System.out.print(j + " ");
//                 }
//                 count = temp;
//             }
//             System.out.println();
//         }
//     }
// }



// ---------------------------------------------------------------------------


// 3 2 1  
// 4 5 6  
// 9 8 7  
// 10 11 12  
// 15 14 13 

// public class patterns2 {

//     public static void main(String[] args) {
//         int count =0 ;
//         for (int i = 0; i <5; i++) {
//             if(i%2 !=0){

//                 for(int j=1;j<=3;j++){
//                     count = count+1;
//                     System.out.print(count+" ");
//                 }
//             }
//             else{

//                 int temp = count+1 ;

//                 for (int j =count+3;j>=temp;j--) {
//                     count = count+1;
//                     System.out.print(j+" ");
                    
//                 }
//             }
//             System.out.println(" ");
            
//         }
//     }
// }



// ---------------------------------------------------------------------------




// 1 2 3
// 4 5 6 
// 7 8 9 
// 10 11 12
// 13 14 15

// public class patterns2 {

//     public static void main(String[] args) {
//         int count=0 ;
//         for (int i = 1; i <=5; i++) {
//             for (int j =1; j<=3; j++) {

//                 count= count+1 ;
//                 System.out.print(count+" ");
                
//             }
//             System.out.println(" ");
            
//         }
//     }
// }

// ---------------------------------------------------------------------------

// 01 02 03 04 05
// 06 07 08 09 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25



// public class patterns2{

//     public static void main(String[] args) {
//         int count = 1; // Starting number
//         int rows = 5;  // Number of rows
//         int cols = 5;  // Number of columns

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.printf( "%02d ",count++);
//             }
//             System.out.println();
//         }
//     }
// }

// ---------------------------------------------------------------------------

// 1 2 3 4 5
// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9

// public class patterns2 {

//     public static void main(String[] args) {
//         int rows = 5;  // Number of rows

//         for (int i = 0; i < rows; i++) {
//             for (int j = 1; j <= rows; j++) {
//                 System.out.print((i + j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// ---------------------------------------------------------------------------

// 0 0 0 0 0 0 0 
// 0 1 0 0 0 0 0 
// 0 0 2 0 0 0 0 
// 0 0 0 3 0 0 0 
// 0 0 0 0 4 0 0 
// 0 0 0 0 0 5 0 
// 0 0 0 0 0 0 6 

// public class patterns2 {

//     public static void main(String[] args) {
//         int size = 7; 

//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 if (i == j) {
//                     System.out.print(i + " ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// ---------------------------------------------------------------------------


// 1
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1

// public class patterns2 {

//     public static void main(String[] args) {
//         int max = 7; 

//         // Upper part of the pattern
//         for (int i = 1; i <= max; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         // Lower part of the pattern
//         for (int i = max - 1; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// ---------------------------------------------------------------------------


// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 
// 1 2 3 4 5 6 7 

// public class patterns2 {

//     public static void main(String[] args) {
//         int max = 7; // The maximum number of elements in the widest row

//         // Decreasing part of the pattern
//         for (int i = max; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         // Increasing part of the pattern
//         for (int i = 2; i <= max; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }







