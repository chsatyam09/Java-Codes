// ------------------------- Comparable
package Sort;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class example {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Alice", 101));
        students.add(new Student(2, "Bob", 102));
        students.add(new Student(3, "Charlie", 100));

        System.out.println("Original List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting the list of students by roll number
        Collections.sort(students);

        // Printing the sorted list
        System.out.println("\nSorted List by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

// -------------------------- Comparator
// package Sort;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class example {
// public static void main(String[] args) {
// // Creating a list of students
// List<Student> students = new ArrayList<>();
// students.add(new Student(1, "Alice", 101));
// students.add(new Student(4, "Bob", 102));
// students.add(new Student(3, "Charlie", 100));

// System.out.println("Original List:");
// for (Student student : students) {
// System.out.println(student);
// }

// // Sorting the list of students by ID using IdComparator
// Collections.sort(students, new IdComparator());

// // Printing the sorted list
// System.out.println("\nSorted List by ID:");
// for (Student student : students) {
// System.out.println(student);
// }
// // Sorting the list of students by NAme using NameComparator

// List<Student> students1 = new ArrayList<>(students);

// Collections.sort(students1, new NameComparator());

// // Printing the sorted list
// System.out.println("\nSorted List by Name:");
// for (Student student1 : students1) {
// System.out.println(student1);
// }}}