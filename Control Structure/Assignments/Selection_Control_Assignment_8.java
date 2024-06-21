import java.util.Scanner;

public class Selection_Control_Assignment_8 {
    public static void main(String[] args) {
		// Implement your code here 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean divisibleBy3 = number%3==0;
        boolean divisibleBy5 = number%5==0;

        if(divisibleBy3 && divisibleBy5) System.out.println("Zoom");
        else if(divisibleBy3) System.out.println("Zip");
        else if(divisibleBy5) System.out.println("Zap");
        else System.out.println("Invalid");
	}
}
