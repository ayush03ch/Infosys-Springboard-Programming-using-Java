import java.util.Scanner;

public class Selection_Control_Assignment_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of $5 notes available: ");
        int fiveDollarNotes = scanner.nextInt();
        System.out.print("Enter the number of $1 notes available: ");
        int oneDollarNotes = scanner.nextInt();

        System.out.print("Enter the purchase amount: ");
        int purchaseAmount = scanner.nextInt();
        scanner.close();
        
        int maxFiveDollarNotesNeeded = Math.min(purchaseAmount / 5, fiveDollarNotes);

        for (int i = maxFiveDollarNotesNeeded; i >= 0; i--) {
            int remainingAmount = purchaseAmount - (i * 5);

            if (remainingAmount <= oneDollarNotes) {
                System.out.println("Number of $5 notes used: " + i);
                System.out.println("Number of $1 notes used: " + remainingAmount);
                return;
            }
        }

        System.out.println(-1);
    }
}
