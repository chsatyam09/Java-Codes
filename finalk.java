
// FINAL
// If you don't want the ability to override existing attribute values,
// declare attributes as final:

// final class
// if a claas is marked as final then class will not participated in inheritance , if we try to do so it will show compilation error ..

// final method
// if a method  is marked as final then method will not participated in inheritance ,  but we can't override (make any chnage) if we try to do so it will show compilation error ..

// final variable
// if a variable is marked as final then it value traeted as constant  , if we try to do so it will show compilation error ..

// final
// final class  = aagr class ko final karoge tooh wo inherit nhi hoga dusre extended class me or sub class me
// final variable = agr  variable ko final kaorge tooh uska value chnage nhi kar skte aage
// fianl method = agr  method ko final kaorge tooh wo inherit hoga dusre extended class me or sub class me  lekin usko aap override nhi kr skte  mtlb usme kuch chnages nhi karna hai


// final variable

// public class final {
//   final int x = 10;
//   final double PI = 3.14;

//   public static void main(String[] args) {
//     Main myObj = new Main();
//     myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//     myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
//     System.out.println(myObj.x);
//   }
// }

// // or


// public class finalk {

//     public static void main(String[] args) {
//         final int x  =10 ;
//         x= 30 ;
//         System.out.println(x); // error

//     }
// }

// // ================================================================================================

// // final mehtod

  class Animal{

     void sleep(){
         System.out.println("animal is sleeping ");
     }

  }
     class Tiger extends Animal {


         void sleep(){
             System.out.println("animal is sleeping from 10 hhours ");  // method overriding
         }

     }

     public class finalk {

         public static void main(String[] args) {
              Tiger r = new Tiger() ;
              r.sleep();
         }
     }

//   ye same code hai abss  method  me final laga hai isme

    //  class Animal{

    //         final void sleep(){
    //             System.out.println("animal is sleeping ");
    //         }

    //      }
    //         class Tiger extends Animal {

    //             void sleep(){
    //                 System.out.println("animal is sleeping from 10 hhours ");   // method can not be overridden
    //             }

    //         }

    //         public class finalk {

    //             public static void main(String[] args) {
    //                  Tiger r = new Tiger() ;
    //                  r.sleep();
    //             }
    //         }




    // // ================================================================================================

// // final class

//  class Animal{

//     void sleep(){
//         System.out.println("animal is sleeping ");
//     }

//  }
//     class Tiger extends Animal {   // class  overloading


//         void sleep(){
//             System.out.println("animal is sleeping from 10 hhours ");
//         }

//     }

//     public class finalk {

//         public static void main(String[] args) {
//              Tiger r = new Tiger() ;
//              r.sleep();
//         }
//     }

//   ye same code hai abss  class me final laga hai isme

    //  final class Animal{    // class ko final declared kar dia tooh aab ye class inherit nhi ho payegi

    //         void sleep(){
    //             System.out.println("animal is sleeping ");
    //         }

    //      }
    //         class Tiger extends Animal {


    //             void sleep(){
    //                 System.out.println("animal is sleeping from 10 hhours ");
    //             }

    //         }

    //         public class finalk {

    //             public static void main(String[] args) {
    //                  Tiger r = new Tiger() ;
    //                  r.sleep();
    //             }
    //         }














