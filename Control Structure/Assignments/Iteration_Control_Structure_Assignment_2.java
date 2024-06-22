class Tester{
	public static void main(String[] args) {
		// Implement your code here 
        Scanner scanner = new Scanner(System.in);
        
		System.out.print("Enter the number of heads: ");
        int heads = scanner.nextInt();
        System.out.print("Enter the number of legs: ");
        int legs = scanner.nextInt();
        scanner.close();
        
        // Check if the input can make a valid number of rabbits and chickens
        if (legs % 2 != 0 || heads > legs / 2 || legs > 4 * heads) {
            System.out.println("No solution");
        } 
        else{
            // using concept of Linear Equations 
            // c=chickens, r=rabits 
            // c + r = heads    =>  c = heads - r      -----> eq-1
            // c*2 + r*4 = legs =>  2(c + 2*r) = legs  -----> eq-2
            // substititue eq-1 in eq-2 
            // 2((heads-r) + 2*r) = legs   => 2(heads + r) = legs
            // r = legs/2  - heads;

            int c,r;
            r = legs/2 - heads;
            c = heads - r;

            // If the number of rabbits or chickens is negative, it's an invalid solution
            if (r < 0 || c < 0) {
                System.out.println("No solution");
            } else {
                System.out.println("Number of chickens: " + c);
                System.out.println("Number of rabbits: " + r);
            }
        }        
        scanner.close();
	}
}
