// Multitasking - isme dependency hota ,ek task execute ho raha hai tooh dusra task wait karega , ek process ke aandr multiple task hota hai ,  
// minimize execution time 
// performing multiple task at a single task ;
// maximize the CPU utilization ;
// can be achieved by -  multiprocessing ,multithreading

// ========================================================================================================================================================

// // Multiprocessing in Java (process-Based multitasking)- 
// Executing serval tasks simultaneously where each task is a seprate independent  process such type of multitasking is called "process based multitasking".
// Example
// typing a java program
// listening to a song
// downloading the file from internet
// Process based multitasking is best suited at "os level".
// when one system is connected to multiple processor in order to complete the task
// In process-based multitasking, two or more processes and programs can be run concurrently;
// Multiprocessing in Java is purely based on the number of processors available on the host computer.
//  Every process initiated by the user is sent to the CPU (processor).
// It loads the registers on the CPU with the data related to the assigned proces.

// ========================================================================================================================================================

// Multithreading in Java (Thred-Based multitasking)-   single program ke aandr multiple task hote hai, each task is callled thread  and each task/thread execute seprately ;

// Thred-Based - thread(t1),thread(t2);program will get  will get divide  in two smaller program called threads;
// Executing several tasks simultaneously where each task is a separate independent part of the  same Program, 
// is called  "Thread based MultiTasking".
//   	Each independent part is called a "Thread".
// 1. This type of multitasking is best suited at "Programmatic level".
// The main advantages of multitasking is to reduce the response time of the system and to improve the 
// performance.
// 2. The main important application areas of multithreading are
//      a. To implement multimedia graphics
//      b. To develop web application servers
//      c. To develop video games
// 3. Java provides inbuilt support to work with threads through API called 
//     Thread,Runnable,ThreadGroup,ThreadLocal,...
// 4. To work with multithreading, java developers will code only for 10% remaining 
//     90% java API will take care..
// executing multiple threads at a single time  without dependency of other thread is called multithreading.
// reduce time ,increase cpu performance ;
// In thread-based multitasking, two or more threads can be run concurrently.
// Multithreading in Java is a similar approach to multiprocessing. However, there are some fundamental differences between the two. 
// Instead of a physical processor, multithreading involves virtual and independent threads.
// It assigns each process with one or more threads based on their complexity. Each thread is virtual and independent of the other.
//  This makes process execution much safer. If a thread or two are terminated during an unexpected situation, the process execution will not halt.


//  Difference between Multitasking, Multiprocessing and Multithreading ?







// ========================================================================================================================================================



// THREAD?
// thread is a pre-defined class which is available in jva.lang() package ,
// thread is a basic unit of cpu and it is well known for independent execution ; 
// Threads allows a program to operate more efficiently by doing multiple things at the same time.

// Main thread in java = ek thread by default jvm bana deta hai .

// public class multithreating {

//     public static void main(String[] args) {
//         System.out.println("hello world ");
//         System.out.println("before chnaging ");
//         String name = Thread.currentThread().getName();  // thread ka information
//         System.out.println("the name of main threas iss == "+name);
//         System.out.println(" the priority of main thread is == "+Thread.currentThread().getPriority());

//         System.out.println("After chnaging ");
//         Thread t = Thread.currentThread();
//         t.setPriority(1);
//         t.setName("pw");

//         String name1 = Thread.currentThread().getName();  // thread ka information
//         System.out.println("the name of main threas iss == "+name1);
//         System.out.println(" the priority of main thread is == "+ Thread.currentThread().getPriority());
//     }

// }


// ========================================================================================================================================================

// Creating a Thread
// There are two ways to create a thread.

// It can be created by extending the Thread class
// by implementing Runnable inetrface  or overriding its run() method:



// 1) Java Thread Example by extending Thread class

// class multithreating extends Thread{  
// public void run(){  
// System.out.println("thread is running...");  
// }  
// public static void main(String args[]){  
// multithreating t1=new multithreating();  
// t1.start();  
//  }  
// } 


// class Mythread extends Thread{

//     public void run(){
//         System.out.println("child thread");
//     }

// }

// public class multithreating {

//     public static void main(String[] args) {
//         System.out.println("main thread");


//         Mythread t =new Mythread() ;  // object banaya Mythread ka , but sarri cheeze jo thread  me hai wo inherit ho chuki hai mythread me 
//         t.start();
//     }
// }

// MyThread naam ki humne class banai jo ki extend kar rahi hai thread class ko 
// jo ki  ki thread class mein jitne bhi properties hai method sarri yaha pe inherit ho jaati hai Mythread me ..
// Mythread naam ka aapane jo object banaya hai na vo equivalent ho gaya kya aapane thread ke object banaya hai..
// Kyunki jo bhi third class ke andar hai vah sari chijen inherit Ho gai MyThread mein

// ========================================================================================================================================================

// example for achieving multithreading by extending the thread class 

// import java.util.Scanner;
// class Calc extends Thread{ // thread ke saare method or properties calc me inherit ho chuke hai

//     public void run()
//     {
//         System.out.println("Calculation Task Started");

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Please enter first number");
//         int num1=sc.nextInt();

//         System.out.println("Please enter 2nd number");
//         int num2=sc.nextInt();

//         int res=num1+num2;

//         System.out.println(res);
//         System.out.println("Calculation Task Ended");

//         System.out.println("****************************************************");
//     }
// }

// class Message extends Thread{   // thread ke saare method or properties message me inherit ho chuke hai

//     public void run()
//     {
//         System.out.println("Displaying important message task");
//         try{
//             for(int i=0;i<3;i++)
//             {
//                 System.out.println("Focus is important to master skills");
//                 Thread.sleep(2000);
//             }
//         }
//         catch(Exception e)
//         {
//             System.out.println("Some problem");
//         }
//         System.out.println("Displaying import message task ended");

//     }
// }

// public class multithreating
// {
//     public static void main(String[] args) 
//     {
        
//         System.out.println("Main Thread started");

//         Calc t1=new Calc();

//         Message t2=new Message();

//         t1.start();
//         t2.start(); 
//     }
    
// }



// ========================================================================================================================================================


// 2) Java Thread Example by implementing Runnable interface


// class  multithreating implements Runnable{  
// public void run(){  
// System.out.println("thread is running...");  
// }  
  
// public static void main(String args[]){  
//     multithreating m1=new  multithreating();  
// Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
// t1.start();  
//  }  
// }  


// import java.util.Scanner;
// class Calc1 implements Runnable{ // thread ke saare method or properties calc me inherit ho chuke hai

//     public void run()
//     {
//         System.out.println("Calculation Task Started");

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Please enter first number");
//         int num1=sc.nextInt();

//         System.out.println("Please enter 2nd number");
//         int num2=sc.nextInt();

//         int res=num1+num2;

//         System.out.println(res);
//         System.out.println("Calculation Task Ended");

//         System.out.println("****************************************************");
//     }
// }

// class Message1 implements Runnable{   // thread ke saare method or properties message me inherit ho chuke hai

//     public void run()
//     {
//         System.out.println("Displaying important message task");
//         try{
//             for(int i=0;i<3;i++)
//             {
//                 System.out.println("Focus is important to master skills");
//                 Thread.sleep(2000);
//             }
//         }
//         catch(Exception e)
//         {
//             System.out.println("Some problem");
//         }
//         System.out.println("Displaying import message task ended");

//     }
// }

// public class multithreating
// {
//     public static void main(String[] args) 
//     {
        
//         System.out.println("Main Thread started");

//         Calc c1=new Calc();
//         Message m1=new Message();


//         Thread t1 =new Thread(c1);
//         Thread t2=new Thread(m1);

//         t1.start();
//         t2.start(); 
//     }
    
// }
// ========================================================================================================================================================

// // extends Thread vs implements Runnable

// When we extend Thread class, we can’t extend any other class even we require and 
// When we implement Runnable, we can save a space for our class to extend any other class in future or now.
// When we extend Thread class, each of our thread creates unique object and associate with it.
//  When we implements Runnable, it shares the same object to multiple threads.

// // Java program to illustrate defining Thread 
// // by extending Thread class 

// Here we cant extends any other class 
class Test extends Thread 
{ 
	public void run() 
	{ 
		System.out.println("Run method executed by child Thread"); 
	} 
	public static void main(String[] args) 
	{ 
		Test t = new Test(); 
		t.start(); 
		System.out.println("Main method executed by main thread"); 
	} 
} 

// Java program to illustrate defining Thread 
// by implements Runnable interface 
class Geeks { 
	public static void m1() 
	{ 
		System.out.println("Hello Visitors"); 
	} 
} 

// Here we can extends any other class 
class Test extends Geeks implements Runnable { 
	public void run() 
	{ 
		System.out.println("Run method executed by child Thread"); 
	} 
	public static void main(String[] args) 
	{ 
		Test t = new Test(); 
		t.m1(); 
		Thread t1 = new Thread(t); 
		t1.start(); 
		System.out.println("Main method executed by main thread"); 
	} 
} 

// ============================================================================

// ThreadScheduler

// A component of Java that decides which thread to run or execute and which thread to wait is called a thread scheduler in Java.
//  In Java, a thread is only chosen by a thread scheduler if it is in the runnable state. However, 
//  if there is more than one thread in the runnable state, it is up to the thread scheduler to pick one of the threads and ignore the other ones.
//   There are some criteria that decide which thread will execute first. There are two factors for scheduling a thread i.e. Priority and Time of arrival.

// Priority: Priority of each thread lies between 1 to 10. 
// If a thread has a higher priority, it means that thread has got a better chance of getting picked up by the thread scheduler.

// Time of Arrival: Suppose two threads of the same priority enter the runnable state, then priority cannot be the factor to pick a thread from these two threads.
//  In such a case, arrival time of thread is considered by the thread scheduler. A thread that arrived first gets the preference over the other threads.

// If multiple threads are waiting to execute,then which thread will execute 1st is decided by ThreadScheduler 
// which is part of JVM.

// In the case of MultiThreading we can't predict the exact output, only possible output we can expect.

// Since jobs of threads are important,we are not interested in the order of execution; it should  just  execute such 
// that performance  should be improved.

// ============================================================================

// diff b/w t.start() and t.run()

// if we call t.start() and seperate thread will be created which is responsible to execute the run() method.

// if we call t.run(), no separate thread will be created, rather the method will be called just like a normal method 
// by main thread.

// Main difference is that when program calls start() method a new Thread is created and code inside run() method is executed in new Thread
//  while if you call run() method directly no new Thread is created and code inside run() will execute on the current Thread.


// ============================================================================
// Java Thread start() method
// The start() method of thread class is used to begin the execution of thread. The result of this method is two threads that are running concurrently: 
// the current thread (which returns from the call to the start method) and the other thread (which executes its run method).

// The start() method internally calls the run() method of Runnable interface to execute the code specified in the run() method in a separate thread.

// The start thread performs the following tasks:
// It stats a new thread
// The thread moves from New State to Runnable state.
// When the thread gets a chance to execute, its target run() method will run.
// IllegalThreadStateException - This exception throws if the start() method is called more than one times.

// Example 1: By Extending thread class
// public class StartExp1 extends Thread  
// {    
//     public void run()  
//     {    
//         System.out.println("Thread is running...");    
//     }    
//     public static void main(String args[])  
//     {    
//         StartExp1 t1=new StartExp1();    
//         // this will call run() method  
//         t1.start();    
//     }    
// }  
// // ============================================================================
// If we are not overriding run() method

// If we are not Overriding run() method then Thread class run() method will be executed which has an empty 
// implementation and  hence we won't get any output.


// eg::

// class MyThread extends Thread{}

// class ThreadDemo{

// 	public static void main(String... args){

// 		MyThread t=new MyThread();

// 		t.start();

// 	}

// }
// ============================================================================
// Overloading of run() method

// We can overload the run() method but Thread class start() will always call run() with zero argument.

// if we overload run method with arguments, then we need to explicitly call argument based run method and it 
// will be executed just like normal method.
// ============================================================================
// Life cycle of a Threaed
// New / Born = New: Whenever a new thread is created, it is always in the new state.
// Ready / Runnable
// Running
// waiting / Blocked
// Terminated / Dead


// ============================================================================
// Different approach for creating a Thread?

//  A. extending Thread class

//  B. implementing Runnable interface


// Which approach is the best approach?
// * implements Runnable interface is recommended becoz our class can extend another class through which 
// inheritance benefit can be brought into our class1
// * Internally performance and memory level is also good when we work with interfaces1
// *  if we work with extended features then we will miss out inheritance benefit because already our class has 
// inherited the feature from "Thread class", so we normally don't prefere  extended approach rather 
// implements approach is used in real time for working with  "MultiThreading".
// ============================================================================
// join() and isAlive() methods
// ============================================================================
// interrupt() method
// ============================================================================
// Synchronization in Java(synchronized keyword)
// ============================================================================
// Dead lock 
// ============================================================================