
// Encapsulation
// The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

// declare class variables/attributes as private
// provide public get and set methods to access and update the value of a private variable

class Student{
	private int age;
	private String name;

	public void setAge(int age)
	{
		this.age=age;
		
	}
	public int getAge()
	{
		return age; 
	}
	public void setName(String name)
	{
		this.name="Navin";
		
	}
	public String getName()
	{
		return name; 
	}
	public void show()
	{
	System.out.println(age+" "+name);
	}
}
public class getter_setter{
	public static void main(String[] args){
	Student obj=new Student();
	Student obj1=new Student();
	obj.setAge(18);
	obj1.setAge(25);
	obj.setName("Navin");
	obj1.setName("kiran");
	int stud1Age=obj.getAge();
	String stud1Name=obj.getName();
	System.out.println(stud1Age);
	}
}
// ===================================================================================================================================================================================================

// example -1

// public class Person {
//   private String name; // private = restricted access

//   // Get
//   public String getName() {
//     return name;
//   }

//   // Set
//   public void setName(String newName) {
//     this.name = newName;
//   }
// }

// public class encapsulation {
//   public static void main(String[] args) {
//     Person myObj = new Person();
//     myObj.name = "John";  // error
//     System.out.println(myObj.name); // error 
//   }
// }

// If the variable was declared as public, we would expect the following output:
// However, as we try to access a private variable, we get an error:

// Instead, we use the getName() and setName() methods to access and update the variable:

// public class encapsulation {
//   public static void main(String[] args) {
//     Person myObj = new Person();
//     myObj.setName("John"); // Set the value of the name variable to "John"
//     System.out.println(myObj.getName());
//   }
// }

// // Outputs "John"

// ===================================================================================================================================================================================================
// class A{

//     private int value ; // data hiding  // private variable

//     public void setValue (int x) // data abstraction  // public method 
//     {

//         value=x;
//     }

//     public int  getValue ()  
//     {
//         return value;

//     }
// }

// class getter_setter {
//     public static void main(String[] args) {
        
//         A r = new A();
//         r.setValue(100) ;
//         System.out.print(r.getValue());
//     }
// }

// ===================================================================================================================================================================================================



// public class Student {

//     private int age;
//     private String name;

//     // Getter method for age
//     public int getAge() {
//         return age;
//     }

//     // Setter method for age
//     public void setAge(int age) {
//         // You can add validation or constraints here if needed
//         this.age = age;
//     }

//     // Getter method for name
//     public String getName() {
//         return name;
//     }

//     // Setter method for name
//     public void setName(String name) {
//         // You can add validation or constraints here if needed
//         this.name = name;
//     }
// }


// public class getter_setter {

//     public static void main(String[] args) {

//         // Creating an object of the Student class
//         Student student = new Student();

//         // Using setter methods to set values
//         student.setAge(20);
//         student.setName("John Doe");

//         // Using getter methods to retrieve values
//         System.out.println("Name: " + student.getName());
//         System.out.println("Age: " + student.getAge());
//     }
// }





