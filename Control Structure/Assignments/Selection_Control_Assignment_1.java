class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int sum = num1+num2;
		
		if(num1 != num2){
		    sum *= 2;
		}
		System.out.print(sum);
	}
}

