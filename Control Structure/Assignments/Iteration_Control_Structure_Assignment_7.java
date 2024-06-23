class Tester {
    public static void main(String[] args) {
		// Implement your code here 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Second number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        if(number1 > number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        for(int i=1; i<=number2; i++){
            if((number1*i)%number2 == 0){
                System.out.println("The LCM of " + number1 + " and " + number2 + " is: " + (number1*i));
                break;
            }
        }
	}
}
