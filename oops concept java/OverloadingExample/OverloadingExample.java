public class OverloadingExample {

    // Method with one integer parameter
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Method with two integer parameters
    public void display(int a, int b) {
        System.out.println("Arguments: " + a + ", " + b);
    }

    // Method with one string parameter
    public void display(String s) {
        System.out.println("Argument: " + s);
    }

    // Main method to test overloading
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        // Calling the method with different parameters
        obj.display(5); // Calls the method with one int parameter
        obj.display(10, 20); // Calls the method with two int parameters
        obj.display("Hello"); // Calls the method with one String parameter
    }
}
