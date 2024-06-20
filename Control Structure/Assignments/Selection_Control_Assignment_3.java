import java.util.Scanner;

public class Selection_Control_Assignment_3 {
    public static void main(String[] args) {
		// Implement your code here 
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        scan.close();

        int product;
        if(c == 7){ product = -1; }
        else if(b == 7){ product = c;}
        else if(a == 7){ product = b*c; }
        else { product = a*b*c; }
        
        System.out.println(product);
	}
}
