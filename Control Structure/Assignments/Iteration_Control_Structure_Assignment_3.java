class Tester {
	public static void main(String[] args) {
		// Implement your code here 
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int temp = number;
        int sum=0;
        while (temp>0) {
            sum += temp%10;
            temp /= 10;
        }
        if(number%sum==0){
            System.out.printf("%d is divisible by sum of its digits",number);
        } 
        else{
            System.out.printf("%d is not divisible by sum of its digits",number);
        }
	}
}
