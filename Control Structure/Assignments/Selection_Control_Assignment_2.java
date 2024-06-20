import java.util.Scanner;

public class Selection_Control_Assignment_2 {
    public static void main(String[] args) {
        // Implement your code here
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("The equation has no real root");
        } else if (discriminant == 0) {
            double root = -b / (2.0 * a);
            System.out.println("The root is: " + root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            System.out.printf("The roots are: %.2f and %.2f%n", root1, root2);
        }
        scan.close();   
    }
}
