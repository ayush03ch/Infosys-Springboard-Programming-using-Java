import java.util.Scanner;

public class Selection_Control_Assignment_4 {
    public static void main(String[] args) {
        int vegPlate = 12;
        int nonVegPlate = 15;

        int first3km = 0;
        int next3km = 1;
        int remaining = 2;
        
        Scanner scan = new Scanner(System.in);

        char typeOfFood = scan.next().charAt(0);
        int orderQuantity = scan.nextInt();
        int distance = scan.nextInt();
        scan.close();

        if ((typeOfFood != 'V' && typeOfFood != 'N') || orderQuantity < 1 || distance <= 0) {
            System.out.println(-1);
            return;
        }

        int foodCost = 0;
        if (typeOfFood == 'V') {
            foodCost = vegPlate * orderQuantity;
        } else if (typeOfFood == 'N') {
            foodCost = nonVegPlate * orderQuantity;
        }

        // delivery charges
        int deliveryCharges = 0;
        if (distance > 0 && distance <= 3) {
            deliveryCharges = first3km;
        } else if (distance > 3 && distance <= 6) {
            deliveryCharges = first3km + (distance - 3) * next3km;
        } else if (distance > 6) {
            deliveryCharges = first3km + (3 * next3km) + (distance - 6) * remaining;
        }

        // final bill amount
        int finalBillAmount = foodCost + deliveryCharges;

        System.out.println(finalBillAmount);
    }
}
