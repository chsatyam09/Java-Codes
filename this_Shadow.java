// If both local variable and instant variable have same name inside the method then
//  it will be resolved in Name- clash and JVM will always give preference for local variable this approach is called shadowing problem;


//  Whenever the name of instance and local variable both are same than our run time environment jvmn  get confused 
//  that which one is local variable and which one is instance variable to avoid this problem we should use this keyword.



//  The this keyword refers to the current object/ in a method or constructor.
// this keyword represent/refer to current class ko  orr .(dot) ka mtlb uske andrr
//  The most common use of the this keyword is to eliminate the confusion between class attributes and parameters
//   with the same name (because a class attribute is shadowed by a method or constructor parameter).


//   this keyword example 

// Same naam ka variable (a) class me hai or  same naam ka variable (a) method me bhi ..
// Dono ka scope aalg aalg hai..
// islie Compile time error aayega nhi ..
// Aagr method me value assign kia a = 11; 
// Tooh wo method variable ke a me value store hoga kyuki nearby variable ussi method me define hai .....

// Agar mujhe Jo class ka variable a hai usmein value assign karna hai uss particular method se ..
//  ya FIR use variable (a) ko jo class mein define hai usko call karna hai method  ke andar..
//  tohh i will use this keyword 
//  this keyword represent/refer to current class ko  orr .(dot) ka mtlb uske andrr


// public class this_Shadow {
//     int a ; // class a ;

//     public static void main(String[] args) {
//         int a  ;
//         a=11;

//         this.a=7;  // Assigning the value to a in class ;
//     }

    
// }



// class A {
//     int a = 10;
// }

// class B extends A {
//     int a = 20;

//     void show(int a) {
//         System.out.println(a);         // Parameter 'a' // 30
//         System.out.println(this.a);    // Instance variable 'a' of class B // 20

//     }

//     public static void main(String[] args) {
//         B obj1 = new B();
//         obj1.show(30);
//     }
// }

// class this_Shadow {
//     public static void main(String[] args) {
      
//         // for loop
//         for (int i = 1; i <= 10; ++i) {

//             // if the value of i is 5 the loop terminates  
//             if (i == 5) {
//                 continue;
//             }      
//             System.out.println(i);
//         }   
//     }
// }



