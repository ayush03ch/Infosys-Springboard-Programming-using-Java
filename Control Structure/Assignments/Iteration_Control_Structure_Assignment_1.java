class Tester {
	public static void main(String[] args) {
		// Implement your code here 
        System.out.print("Enter the Number: ");
        Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
        scanner.close();
		
        int reverse = 0;
        int temp = number;
        while(temp > 0){
            int d = temp % 10;
            reverse = reverse*10 + d; 
            temp /= 10;
        }
        if(reverse == number){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
	}
}

