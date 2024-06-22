class Tester {
	public static void main(String[] args) {
		// Implement your code here 
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();
        
        int temp = X;
        int product=X;
        while(temp>0){
            product *= temp % 10;
            temp /= 10;
        }
        if(product == Y){
            System.out.printf("%d is a seed of %d",X,Y);
        }
        else{
            System.out.printf("%d is not a seed of %d",X,Y);
        }
    }
}
