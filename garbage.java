

public class Garbage {

    public static void main(String[] args) {
        Garbage r = new Garbage(); // Create an instance of the Garbage class // Garbage ka object banaya

        r = null; // Set the reference 'r' to null, making the object eligible for garbage collection.

        System.gc(); // Request garbage collection, but there is no guarantee it will be immediately executed.
    }

    // The finalize method is called by the garbage collector before reclaiming the memory of the object.
    protected void finalize() throws Throwable {   //  to check my Grabage collector work's fine 
        // This method can be overridden to perform cleanup operations before the object is garbage collected.
        // However, it's generally not recommended to rely on finalize for critical cleanup, as its execution is not guaranteed.
    }
}









public class Garbage {

    public static void main(String[] args) {
        Garbage r = new Garbage(); // Create an instance of the Garbage class

        r = null; // Set the reference 'r' to null, making the object eligible for garbage collection.

        Runtime.getRuntime().gc(); // Request garbage collection using the Runtime class.

        // Note: Explicitly invoking garbage collection manually is generally unnecessary and discouraged in regular application code.
        // The JVM's automatic garbage collection is designed to handle memory management efficiently.

        // Additionally, it's important to mention that the effectiveness of manual garbage collection requests
        // depends on the JVM implementation and the specific garbage collector in use.
        // In many cases, the JVM may choose to ignore explicit requests for garbage collection.
    }
}
