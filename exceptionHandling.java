
// Without exception 

// public class exceptionHandling {
// public static void main(String[] args) {
//     int num1=10;
//     int num2=0;
//     int result =0;
//     result = num1/num2;
//     System.out.println(result);  // java.lang.ArithmeticException: ( exception occur )
//      System.out.println("hello"); // abnormal terminate hua hai program islie helo print nhi hua hai
// } 
// }

 

//========================================  Handling The Exception Using Try Catch ======================================== 

// try block - risky code
// whenever we write a statement and if the statement is error suspecting statement or risky code then put that code in the try block 

// catch block -  handling code
// the main purpose of catch block is to handle the exception which are throw by try block 
// note- catch block will not execute if their is no exception in try block 



//  class exceptionHandling {

//     public static void main(String[] args) {
        
//         int num1=10;
//         // int num2=5;
//         int num2=0;
//         int result=0 ;

//         try{
//             result= num1/num2 ;
//             System.out.println("in the try block");
//         }
//         catch(Exception e){ // e kiss type ka exception hai wo bata raha hai 
//             System.out.println("Something went wrong :"+ e);
//         }
//         System.out.println(result);
//         System.out.println("bye");
//     }
// }


// ========================================  The throw keyword  ======================================== 

// Throw Keyword Definition: The Throw keyword in Java allows you to throw an exception explicitly in the code.
// Throw keyword is used to throw the user define or customise expection object to the JVM expectedly .
// throw keyword in java is used to throw an exception explicitly.
// When an exception is explicitly thrown, it means that the developer has specifically written code to create and trigger an exception in response to a certain condition or situation.
// throw keyword me hum bata dete hai kon sa exception throw karna hai 
// The throw statement allows you to create a custom error.
// The throw statement is used together with an exception type. 
// throw key catch block ke aandr use karoge 
// There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

// if (balance < withdrawAmount) {
//     throw new InsufficientBalanceException("You have insufficient balance");
// }


// public class exceptionHandling {
//     static void checkAge(int age) {
//       if (age < 18) {
//         // throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//         throw new AbstractMethodError("Access denied - You must be at least 18 years old.");
//       }
//       else {
//         System.out.println("Access granted - You are old enough!");
//       }
//     }
  
//     public static void main(String[] args) {
//       checkAge(18); // Set age to 15 (which is below 18...)
//     }
//   }

// example-2

// class exceptionHandling {

//     public static void main(String[] args) {
        
//         int num1=10;
//         // int num2=5;
//         int num2=0;
//         int result=0 ;

//         try{
//             result= num1/num2 ;
//             System.out.println("in the try block");
//         }
//         catch(Exception e){ // e kiss type ka exception hai wo bata raha hai 
//             System.out.println("Something went wrong :");
//             throw e ; // iske neeche walla kuch execute nhi hoga except finally 
//         }
//         System.out.println(result);
//         System.out.println("bye");
//     }
// }


// ========================================  The throws keyword  ======================================== 




public class exceptionHandling {


    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
            
        }
        
    }
    
}




















// public void withdraw(double amount) throws InsufficientBalanceException {
//     if (balance < withdrawAmount) {
//         throw new InsufficientBalanceException("You have insufficient balance");
//     }
//  }


// public class exceptionHandling {
//     static void checkAge(int age) throws ArithmeticException {
//       if (age < 18) {
//         throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//       }
//       else {
//         System.out.println("Access granted - You are old enough!");
//       }
//     }
  
//     public static void main(String[] args) {
//       checkAge(15); // Set age to 15 (which is below 18...)
//     }
//   }



//========================================  different types of Exception ======================================== 


// public class exceptionHl {

//     public static void main(String[] args) {
        
//         int num1=10;
//         // int num2=5;
//         int num2=0;
//         int result=0 ;

//         try{
//             result= num1/num2 ;
//             System.out.println("in the try block");
//         }
//         catch(ArithmeticException e){ // e kiss type ka exception hai wo bata raha hai   //  command dabao orr  ArithmeticException ispe click karo 
//             System.out.println("Cannot divide by zero :"+ e);
//         }
//         System.out.println(result);
//         System.out.println("bye");
//     }
// }


// public class exceptionHl {

//     public static void main(String[] args) {
        
//         int arr[]={1,2,3,4};

//         try{

//             System.out.println(arr[9]);
//         }
//         catch(ArrayIndexOutOfBoundsException e){ // e kiss type ka exception hai wo bata raha hai   //  command dabao orr ArrayIndexOutOfBoundsException ispe click karo 
          
//         }

//         System.out.println("bye Sayam");
//     }
// }
// ========================================  multiple try and catch block  ======================================== 


// public class exceptionHandling {

//     public static void main(String[] args) {
        
//         try {
//             int a=10;
//             int b=0;
//             int c=0 ;
//             c=a/b;
//             System.out.println(c);
            
//         } 
        
        
//         catch (ArithmeticException e) {
            
//             System.out.println("can't divide by 0");
//         }

//         try {
            
//             int arr[]={12,23,4,56,3};
//             System.out.println(arr[9]);
//         } 
        
//         catch (ArrayIndexOutOfBoundsException e) {
            
//             System.out.println("beyond the array list");
//         }

//         System.out.println("bye");
//     }
// }

// ===================================  Multiple catch block ( catch block ka exception aalg aalg hona chaiye )   ===============================


// public class exceptionHandling {

//     public static void main(String[] args) {
        
//         try{

//             int a=10;
//             int b= 10 ;
//             int c=0;
//              c=a/b;
//             System.out.println(c);

//             int arr[]={12,22,34,56,3};
//             System.out.println(arr[3]);

//             String str=null;
//            System.out.println(str.toUpperCase());
//         }

//         catch(ArithmeticException a){

//             System.out.println(" can't divide Airthmetic excepection");
//         }

//         catch(ArrayIndexOutOfBoundsException b){

//             System.out.println("can't acess array exception");

//         }

//         catch(NumberFormatException c ){
//             System.out.println(" can't chnage the format");

//         }
//         catch(Exception e){ // ye sarre type ke exception ko handle krta hai  // default exception handler 
//             System.out.println("some expection in your code that has not be mentioned by programmer so it handled by default exception handler ");
//         }
//     }
// }

// Example-2

// public class exceptionHandling {

//     public static void main(String[] args) {
        
//         try{
//             String str=null;
//            System.out.println(str.toUpperCase());
//         }

//         catch(ArithmeticException a){

//             System.out.println(" can't divide Airthmetic excepection");
//         }

//         catch(ArrayIndexOutOfBoundsException b){

//             System.out.println("can't acess array exception");

//         }

//         catch(NumberFormatException c ){
//             System.out.println(" can't chnage the format");

//         }
//         catch(Exception e){ // ye sarre type ke exception ko handle krta hai  // default exception handler 
//             System.out.println("some expection in your code that has not be mentioned by programmer so it handled by default exception handler ");
//         }
//     }
// }



















// ===========================================================================  Multiple try block / nested try block    ====================================================  

// ek try block ke andr dusra try block 


// public class exceptionHandling{    
//     public static void main(String args[]){   
//     //outer try block   
//      try{    
//      //inner try block 1  
//        try{    
//         System.out.println("going to divide by 0");    
//         int b =39/0;    
//       }  
//        //catch block of inner try block 1  
//        catch(ArithmeticException e)  
//        {  
//          System.out.println(e);  
//        }    
          
       
//        //inner try block 2  
//        try{    
//        int a[]=new int[5];    
     
//        //assigning the value out of array bounds  
//         a[5]=4;    
//         }  
     
//        //catch block of inner try block 2  
//        catch(ArrayIndexOutOfBoundsException e)  
//        {  
//           System.out.println(e);  
//        }    
     
         
//        System.out.println("other statement");    
//      }  
//      //catch block of outer try block  
//      catch(Exception e)  
//      {  
//        System.out.println("handled the exception (outer catch)");  
//      }    
       
//      System.out.println("normal flow..");    
//     }    
//    }  

// ===========================================================================  Multiple csatch block / nested catch  block    ==========================================================


// ek catch block ke andr dusra catch block 

















// ========================================  The finally statement lets you execute code, after try...catch, regardless of the result: ======================================== 

// public class exceptionHandling {
//     public static void main(String[] args) {
//       try {
//         int[] myNumbers = {1, 2, 3};
//         System.out.println(myNumbers[10]);
//         System.out.println("hello ji");
//       } 
//       catch (Exception e) {
//         System.out.println("Something went wrong." + e );

//       }
//        finally {
//         System.out.println("The 'try catch' is finished.");
//       }
//       System.out.println("bye bye");
//     }
//   }



// ========================================================================================================================


// ========================================================================================================================

// try-catch Vs throws in java 


// statement-1
// try{
//     statement-2
//     statement-3
//     statement-4
// }
// catch(xxx e){
//     statement-5
  
// }
// finally{
//     statement-6
// }
// statement-7

// Q.1 if there is no excepection raised 
// statement-1,2,3,4,6,7 // normal termination

// Q.1 if there is excepection in Stattemnt-3  and the corresponding catch block is matched .
// statement-1,2,,5,6,7 // normal termination

// Q.1 if there is excepection in Stattemnt-3  and the corresponding catch block is not  matched .
// statement-1,2,6 // abnormal termination =  directly go to default exception handler  islie 7 nhi hoga

// if there is excepection in Stattemnt-5;
// statement-1,2,3,4,6, // Abnormal termination = =  directly go to default exception handler  islie 7 nhi hoga

// if there is excepection in Stattemnt-6;
// statement-1,2,3,4,5, // Abnormal termination =  directly go to default exception handler  islie 7 nhi hoga


// if there is excepection in Stattemnt-7;
// statement-1,2,3,4,5,6, // Abnormal termination 

// if there is excepection in Stattemnt-1;
// statement- // Abnormal termination =  directly go to default exception handler  islie 1,2,3,4,5,6,7 nhi hoga


// ========================================================================================================================