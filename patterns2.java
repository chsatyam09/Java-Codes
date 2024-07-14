
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

// public class patterns2{
//     public static void main(String[] args) {
//         for(int i=0 ;i<5 ; i++){
//             for(int j=0 ;j<5 ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// ---------------------------------------------------------------------------

// ****** 
// *    * 
// *    * 
// *    * 
// *    * 
// ****** 


// public class patterns2 {

//     public static void main(String[] args) {
//         int n=6;
//         for (int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0 ||j==0 ||i==n-1 ||j==n-1){
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

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 


// public class patterns2{
//     public static void main(String[] args) {
//         for(int i=1 ;i<=5 ; i++){
//             for(int j=1 ;j<=i ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// ---------------------------------------------------------------------------

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

// public class patterns2{
//     public static void main(String[] args) {
//         for(int i=1 ;i<=5 ; i++){
//             for(int j=i ;j<=5 ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }



// ---------------------------------------------------------------------------


// ******* 
//  ****** 
//   ***** 
//    **** 
//     *** 
//      ** 
//       * 

// public class patterns2{
//     public static void main(String[] args ){
//         for (int i=0; i<=6; i++){
//             for (int j = 0; j <i; j++) {
//                 System.out.print(" ");
                
//             }
//             for (int k = i; k <=6; k++) {
//                 System.out.print("*");
                
//             }
//             System.out.println(" ");
//         }

//     }
// }


// ---------------------------------------------------------------------------


//      * 
//     ** 
//    *** 
//   **** 
//  ***** 
// ****** 

// public class patterns2{
//     public static void main(String[] args ){
//         for (int i=0; i<=6; i++){
//             for (int j = i; j <=6; j++) {
//                 System.out.print(" ");
                
//             }
//             for(int k=0;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }

//     }
// }

// ---------------------------------------------------------------------------

//     *  
//    * *  
//   * * *  
//  * * * *  
// * * * * *  

// public class patterns2{
//     public static void main(String[] args) {
//         for (int i = 0; i <=5; i++) {
//             for (int j = i; j <5; j++) {
                
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <=i; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
            
//         }
//     }
// }

// ---------------------------------------------------------------------------

//          * 
//         *** 
//        ***** 
//       ******* 
//      ********* 
//     *********** 
//    ************* 
//   *************** 

// public class patterns2{
//     public static void main(String[] args) {
//         for (int i = 1; i <=8; i++) {
//             for (int j = i; j <8; j++) {
                
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <=2*i-1; k++) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
            
//         }
//     }
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



// public class patterns2{
//     public static void main(String[] args) {
//         for(int  i=1;i<=8;i++){
//             for(int j=i;j<8;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){

//                 if(k==1 || i==8 ||k==2*i-1){
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





// * * * * *  
//  * * * *  
//   * * *  
//    * *  
//     *  

// class patterns2 {
//     public static void main(String[] args) {
//         for (int i = 0; i <=5; i++) {
//             for (int j = 0; j<i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k=i;k<=5 ; k++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
            
//         }
//     }
// }


// ********* 
//  ******* 
//   ***** 
//    *** 
//     * 


// class patterns2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <=5; i++) {
//             for (int j = 1; j<i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k=9;k>=2*i-1 ; k--){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
            
//         }
//     }
// }




// ********* 
//  *     * 
//   *   * 
//    * * 
//     * 



//      *  
//     * *  
//    * * *  
//   * * * *  
//  * * * * *  
// * * * * * *  
// * * * * * *  
//  * * * * *  
//   * * * *  
//    * * *  
//     * *  
//      *  

// class patterns2{
//     public static void main(String[] args) {
//         for(int i=0;i<=5;i++){
//             for(int j=i;j<=5;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0 ;k<=i;k++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//         for(int i=0;i<=5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=i ;k<=5;k++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
 


// *  
// * *  
// * * *  
// * * * *  
// * * * * *  
// * * * *  
// * * *  
// * *  
// *  



// ************** 
// *            * 
// *            * 
// ************** 


// class patterns2{
//     public static void main(String[] args) {
//         for(int i=0;i<=4;i++){
//             for (int j=0;j<=17;j++){
            
//                 if(i==0 || i==4 || j==0 || j==17){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
        
//         System.out.println(" ");
//         }

//     }
// }

// ****** 
// *    * 
// ****** 
// *    * 
// *    * 
// *    * 

// class patterns2{
//     public static void main(String[] args) {
//         for(int i=0;i<=9;i++){
//             for (int j=0;j<=7;j++){
            
//                 if(i==0 || i==5 || j==0 || j==7){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
        
//         System.out.println(" ");
//         }

//     }
// }

// second method 

// class patterns2{
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=0;i<=n;i++){
//             for (int j=0;j<=n;j++){
            
//                 if(i==0 || i==n/2 || j==0 || j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
        
//         System.out.println(" ");
//         }

//     }
// }


// *    * 
// *    * 
// ****** 
// *    * 
// *    * 
// *    * 




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





// class patterns2{
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=0;i<=n;i++){
//             for (int j=0;j<=n;j++){
            
//                 if(i==0 && j>0 && j<=n-1 || i==n/2 || j==0 && i>0 || j==n  && i>0){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
        
//         System.out.println(" ");
//         }

//     }
// }










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
//          *  
//         *   
//        *    
//       *     
//      *      
//     *       
//    *        
//   *         
//  *  


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


// class patterns2{
//     public static void main(String[] args) {
//         int n =10;
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=n;j++){
               
//                 if(i==0|| i==n||j==0||j==n || i+j==5 || j-i==5|| i-j==5 || i+j==15)
               
//                 {
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

// class patterns2{
//     public static void main(String[] args) {
//         int n =10;
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=n;j++){
               
//                 if(  i+j==5 || j-i==5|| i-j==5 || i+j==15)
               
//                 {
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


// class patterns2{
//     public static void main(String[] args) {
//         int n=11;
//         for(int  i = 0;i<=n;i++){
//             for(int j=0;j<=n;j++){
//                 if(i==0 || i==n || j==0 || j==n || i+j<=5 || i-j>=5  || j-i>=5 || i+j>=15 ){
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

// another method 

// public class patterns2{
//     public static void main(String[] args) {
//         int n=11 ; 
//         for(int i=0 ;i<n ; i++){
//             for(int j=0 ;j<n ; j++){
        
//                 if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||
//                 i==0 && j>=(n-1)/2 || j==n-1 && i<=(n-1)/2 || j-i>=(n-1)/2||
//                 j==0 && i>=(n-1)/2|| i==(n-1)&& j<=(n-1)/2 || i-j>=(n-1)/2 ||
//     //          j==(n-1) && i>=(n-1)/2 || i==(n-1)&& j>=(n-1)/2 || i+j>=15 ){
//                 j==(n-1) && i>=(n-1)/2 || i==(n-1)&& j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2 ){

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



// class patterns2{
//     public static void main(String[] args) {
//         int n=15 ;

//         for (int i = 0; i <n; i++) {

//             for(int j=0;j<n;j++){
//                 if(i==0 && j>=(n-1)/2 ||j==0 && i<=(n-1)/2 ||i==n-1 && j<=(n-1) /2 ||j==n-1 && i>=(n-1)/2 || j==(n-1)/2 || i==(n-1)/2){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
            
//         }
//     }










// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5 


// 1 0 1 0 1  
// 1 0 1 0 1  
// 1 0 1 0 1  
// 1 0 1 0 1  
// 1 0 1 0 1 


// 1 1 1 1 1  
// 2 2 2 2 2  
// 3 3 3 3 3  
// 4 4 4 4 4  
// 5 5 5 5 5 

// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  

// 5 5 5 5 5  
// 4 4 4 4 4  
// 3 3 3 3 3  
// 2 2 2 2 2  
// 1 1 1 1 1 


// 5 4 3 2 1  
// 5 4 3 2 1  
// 5 4 3 2 1  
// 5 4 3 2 1  
// 5 4 3 2 1  


// 1  
// 1 2  
// 1 2 3  
// 1 2 3 4  
// 1 2 3 4 5  


// 5 4 3 2 1  
// 4 3 2 1  
// 3 2 1  
// 2 1  
// 1  


// 5 5 5 5 5  
// 4 4 4 4  
// 3 3 3  
// 2 2  
// 1  


// 1  
// 2 2  
// 3 3 3  
// 4 4 4 4  
// 5 5 5 5 5  

// 5
// 5 4 
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1 


// 1
// 2 1
// 3 2 1 
// 4 3 2 1 
// 5 4 3 2 1


// 5 4 3 2 1
// 5 4 3 2
// 5 4 3 
// 5 4 
// 5

// 1 2 3 4 5 
// 2 3 4 5 
// 3 4 5 
// 4 5 
// 5 


// 1 1 1 1 1  
// 2 2 2 2  
// 3 3 3  
// 4 4  
// 5 


// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 


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


// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


//         1  
//       1 2  
//     1 2 3  
//   1 2 3 4  
// 1 2 3 4 5 

//      1  
//     1 2  
//    1 2 3  
//   1 2 3 4  
//  1 2 3 4 5 

