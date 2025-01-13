public class variables {

    static int id = 101; // Static Variable
    String name = "Satyam"; // Instance Variable

    void method() {
        String surname = "Jaat"; // Local Variable
        System.out.println("Surname: " + surname); // Print local variable
    }

    public static void main(String[] args) {
        int age = 18; // Local Variable
        System.out.println("Age: " + age); // Print local variable

        // Access static variable directly
        System.out.println("ID: " + variables.id);

        // Create an instance of Variables to access instance variables and methods
        variables obj = new variables();
        System.out.println("Name: " + obj.name); // Access instance variable
        obj.method(); // Call non-static method
    }
}

