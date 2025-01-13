// import java.util.ArrayList;
// import java.util.List;
// import java.util.Collections;

// public class Student implements Comparable<Student> {
//     private Integer id;
//     private String name;
//     private Integer roll;

//     // Constructor
//     public Student(Integer id, String name, Integer roll) {
//         this.id = id;
//         this.name = name;
//         this.roll = roll;
//     }

//     // Getters
//     public Integer getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public Integer getRoll() {
//         return roll;
//     }

//     // Implementing the compareTo method for natural ordering by roll number
//     @Override
//     public int compareTo(Student o) {   // o.roll ka jayda  hai this.roll se tooh he will rerun   return 1 ;
//                                        // o.roll ka kaam hai this.roll se tooh he will rerun   return -1 ;
//         return this.roll - o.roll;     // o.roll ka equal hai this.roll se tooh he will rerun   return 0;
//     }

//     // toString method for easy printing of Student objects
//     @Override
//     public String toString() {
//         return "Student{id=" + id + ", name='" + name + "', roll=" + roll + '}';
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         // Creating a few Student objects
//         Student student1 = new Student(1, "Alice", 101);
//         Student student2 = new Student(2, "Bob", 102);
//         Student student3 = new Student(3, "Charlie", 100);

//         // Creating a list of students
//         List<Student> students = new ArrayList<>();
//         students.add(student1);
//         students.add(student2);
//         students.add(student3);

//         System.out.println("Original List:");
//         for (Student student : students) {
//             System.out.println(student);
//         }

//         // Sorting the list of students by roll number
//         Collections.sort(students);

//         // Printing the sorted list
//         System.out.println("\nSorted List by Roll Number:");
//         for (Student student : students) {
//             System.out.println(student);
//         }
//     }
// }

// // o.roll ka jayda  hai this.roll se tooh he will rerun   return 1 ;
// // o.roll ka kaam hai this.roll se tooh he will rerun   return -1 ;

// // o.roll ka equal hai this.roll se tooh he will rerun   return 0;


// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;


// public class Student {

//     public static void main(String[] args) {
        
//         Comparator<Integer> com = new Comparator<Integer>() {
//             public int compare(Integer i , Integer j ){
//                 if (i%10>j%10) 
//                 return 1 ;

//                 else
//                 return -1 ;
        
//             }
            
//         };

// List<Integer> num=new ArrayList<>();
// 		num.add(22);
// 		num.add(35);
// 		num.add(41);
// 		num.add(78);
// 		num.add(14);
// 		num.add(51);

//         System.out.println(num);
//         Collections.sort(num);
//         System.out.println(num);
//         Collections.sort(num,com);
//         System.out.println(num);
//     }
// }