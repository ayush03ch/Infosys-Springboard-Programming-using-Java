class Tester {
	public static void main(String[] args) {
		// Implement your code here 
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int temp = number;
        int sum = 0;
        while(temp>0){
            sum += Math.pow(temp%10 , 3);
            temp /= 10;
        }
        if(sum == number){
            System.out.println(number + " is an Armstrong number.");
        }
        else{
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
