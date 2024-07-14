// compile time polymorphism 
// method method_overloading= in a single class same method with  different parameter
// Method overloading-
// Ek class me 2 method hai dono method ka naan same hai but parameter different hai .
// Whenever a class contain more than one method with same name and both method
// Have different different parameter is called method overloading  .

// public class method_overloading {

//     void add(int x , int y ){
//         int z=x+y;
//         System.out.println(z);
//     }
//       void  add(int x , int y,int z ){
//         int p=x+y+z;
//           System.out.println(p);

//     }
//     public static void main(String[] args) {
// method_overloading obj = new method_overloading();
// obj.add(100,200);
// obj.add(100,200,300);
// }
    
// }

// -----------------------------------------------------------------

// public class method_overloading {

//     void sum(){
//         int x=100;
//         int y=200;
//         int z=x+y;
//         System.out.println(z);

//     }

//     void sum(int x,int y){
//         int z=x+y;
//         System.out.println(z);
//     }
    
//     public static void main(String[] args) {
        
//        method_overloading obj =new method_overloading();
//        obj.sum();
//        obj.sum(1000,2000);
//     }
// }
// -----------------------------------------------------------------

// class method_overloading30 {

//      void sum(int x, int y){
//             int z= x+y;
//             System.out.println(z);
//         }
//           void  sum(float x, float y,float z){
//             float p= x+y+z;
//                System.out.println(p);
//         }
//      public static void main (String agrs[]){
        
//            method_overloading30 obj = new method_overloading30();
//         obj.sum(100,200);
//         obj.sum(100.34f,200.45f,700.44f);
//      }

    // }

// -----------------------------------------------------------------

// class A{
//      public int  add1(int n1,int n2){
//         int result=n1+n2;
//         return result;
//      }

// }
// class method_overloading{
//     public static void main(String[] args) {
        
//         A obj=new A();
//         int result=obj.add1(3,4);
//         System.out.println(result);

//     }
// }



// -----------------------------------------------------------------
// comparision 

// in c,c++
// do method banaana pdta hai add1,add2

// class calc{
//      public int  add1(int n1,int n2){
//         int result=n1+n2;
//         return result;
//      }
//        public int  add2(int n1,int n2,int n3){
//         int result=n1+n2+n3;
//         return result;
//      }
// }
// class method_overloading{
//     public static void main(String[] args) {
        
//         calc obj=new calc();
//         int result=obj.add1(3,4);
//         int result =obj.add2(3,4,5);
//         System.out.println(result);
//         System.out.println(res1);
//     }
// }


// // in java 
// do method banaana pdta hai lekin name same add,add

// class calc{
//      public int  add(int n1,int n2){
//         int result=n1+n2;
//         return result;
//      }
//        public int  add(int n1,int n2,int n3){
//         int result=n1+n2+n3;
//         return result;
//      }
// }
// class method_overloading{
//     public static void main(String[] args) {
        
//         calc obj=new calc();
//         int result=obj.add(3,4);
//         int res1 =obj.add(3,4,5);
//         System.out.println(result);
//         System.out.println(res1);
//     }
// }

// -----------------------------------------------------------------
// Method Overloading
// public class method_overloading {
//   static int plusMethodInt(int x, int y) {
//     return x + y;
//   }
  
//   static double plusMethodDouble(double x, double y) {
//     return x + y;
//   }
  
//   public static void main(String[] args) {
//     int myNum1 = plusMethodInt(8, 5);
//     double myNum2 = plusMethodDouble(4.3, 6.26);
//     System.out.println("int: " + myNum1);
//     System.out.println("double: " + myNum2);
//   }
// }

// -----------------------------------------------------------------