// method_overriding = inheritance ka concept hai 
// parameter or method dono same hoga 
// class different hoga 
// example -  class Human  , class boy extends Human

// --------------------------------------------------------------------------------------------// --------------------------------------------------------------------------------------------
// when we have two classes i.e. base class and  extended class and the method name in both classes is  same,
// And we have created the object of derived  class ,
//   And  when calling the derived class method , the derived class method will be called and not the base class method.
// then Here we can say that the derived  class method override the base class method and this is called method overriding ; 







    // class Human {
    //      void eat (){
    //         System.out.println("human is eating ");
    //     }
    // }

    //   class boy extends Human {
    //      void eat (){
    //         System.out.println("boy is eating ");
    //     }
    // }

    //      public  class method_overriding {  

    // public static void main(String[] args) {
    //     Human obj = new boy();
    //     obj.eat();
    // }
    // }




// --------------------------------------------------------------------------------------------

// class A{
//     public void message(){
//         System.out.println(" hellow world how are you");
//     }
// }
//     class B extends A{
//         public void message(){
//             System.out.println("hello india how are you");
//         }
//     }

//     public class method_overriding {
    
//         public static void main(String[] args) {
            
//             A obj = new B();
//             obj.message();


 

//         }
//     }


// Base class object bana hai isme by default constructor 
// when we call the child class constructor  to create object , then  constructor of base class with no argument gets automatically called in derived class constructor  ;
    


    

