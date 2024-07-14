// inner class -
// member= non static
// Static
// Anonymous

// class A
// {

//     public void show()
//     {
//         System.out.println("in A show");
//     }
//     static class B  // inner class 
//     {
//         public void display()
//         {
//             System.out.println("in display");
//         }
//     }
// }

// public class InnerDemo {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.show();

//         A.B obj1 = new A.B(); // inner class object 
//         obj1.display();
//     }
// }


// Annonymous inner class

// not a example of Annonymous inner class 
// interface car {

//     void drive();
// }

// public class lambdaexp{
//     public static void main(String[] args) {
//         car obj = new car();
//         obj.car ;  // this will not work bcz car ka koi implementation hii nhi hai  drive method me 
//     }
// }

// Example-

// interface car {
//     void drive();
// }
// public class lambdaexp{
//     public static void main(String[] args) {
//         car obj = new car(){

//         public void drive(){  // implementation yaha pe drive kar dia 
//             System.out.println("I will drive....");
//         }
//     };
//     obj.drive(); // or yaha pe object bana dia
//     }
// }
// ==============================================================================================================================
//=========================================  Lambda Expressions =====================================================

// whwy Lambda Expressions are introduced in java 
// 1.code optimization
// 2. to bring the functionaal programming features in java 

// lamda expression is an anonymous function 
// i.e.
// no return-type ;
// not having modifier ;
// not having any return type ;




// A lambda expression never executed on it's own . 
// it is always used with functional interface ;
// functional interface -
// A functional interface in java is an interface which has only abstarct method ;
// Abstract method wo method hai jiska koi body nhi hota .. only implementations
// they are also called as single abstarct method 
// it can have any number of default or static methods along with object class method 
// runnable , actionlistner , comparable are some of the example of functional interface ;
// lambda can have o parameter or multiple parameter 
// if body has only statement then we can remove curly brackets { };
// compiler guess the situation - int lagane ki bhi jarurat nhi hai 
// no return keyword 
// if only one parameter remove small brackets ;




// 1.Java lambda expression are the Java first step into functional programming
// 2.It is an Anonymous function that does not have a name and does not belongs to any class
// 3.Provide a clear and concise way to represent method interface via an expression
// 4.It provide the implementation of functional interface and simplifies the software development
// 5.

// Synatx = parameter -> expression body 
// -> arrow operator is introduced in java through lambda expression that divides into two parts i.e parameter and body ;

// ==============================================================================================================================================


// Steps to make any function to lambda expression
// 1. remove modifier ; = private hata do ;
// 2.remove return type ; = void hata do ;
// 3. remove method name  ; = Sayhello hata do ;
// 4. place arrow ; = -> ye laga do 
// if body has only statement then we can remove curly brackets { };
// compiler guess the situation - int lagane ki bhi jarurat nhi hai 
// no return keyword 
// if only one parameter remove small brackets ;

// ex-
// private void Sayhello(){
//     System.out.println(" hello world ")
// }

// ()-> System.out.println(" hello world ");

// ==============================================================================================================================================
// Without lambda expression

// public void printname(){
//     System.out.println(" Satyam");
// }

// // with lambda expression

// ()->System.out.println("satyam");
// ==============================================================================================================================================
// private void add(int a , int b){
//     system.out.println(a+b);

// }

// (int a , int b)->{system.out.println(a+b);}

// or

// ( a ,  b)->system.out.println(a+b); 


// // ==============================================================================================================================================

// private void  getStringLength(String str){
//    return str.length();

// }

// (String str)->{return str.length()}

// or 

// str-> str.length();

// ==============================================================================================================================================
// Without Lambda Expression

// interface Drawable{  
//     public void draw();  
// }  
// public class LambdaExpressionExample {  
//     public static void main(String[] args) {  
//         int width=10;  
  
//         //without lambda, Drawable implementation using anonymous class  
//         Drawable d=new Drawable(){  
//             public void draw(){System.out.println("Drawing "+width);}  
//         };  
//         d.draw();  
//     }  
// } 

// Java Lambda Expression Example


// @FunctionalInterface  //It is optional  
// interface Drawable{  
//     public void draw();  
// }  
  
// public class LambdaExpressionExample2 {  
//     public static void main(String[] args) {  
//         int width=10;  
          
//         //with lambda  
//         Drawable d2=()->{  
//             System.out.println("Drawing "+width);  
//         };  
//         d2.draw();  
//     }  
// } 

// ==============================================================================================================================================


// Without using lambda 



// interface Greetings {
//     String greet();
// }

// class ImplGreetings implements Greetings {
//     @Override
//     public String greet() {
//         return "Good Morning";
//     }
// }

// class lambdaexp {
//     public static void main(String[] args) {
//         Greetings g = new ImplGreetings();
//         String greeting = g.greet();
//         System.out.println(greeting);
//     }
// }

// with lambda

// interface Greetings {
//     String greet();
// }

// class lambdaexp {
//     public static void main(String[] args) {
//         Greetings g = ()-> {return "Good morning"; };
//         System.out.println(g.greet());
   
//     }
// }

// ==============================================================================================================================






















// ==============================================================================================================================