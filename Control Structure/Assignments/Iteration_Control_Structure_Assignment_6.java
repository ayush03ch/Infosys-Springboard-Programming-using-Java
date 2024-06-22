class Tester{
    public static void main(String[] args) {
		// Implement your code here 
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> digits = new ArrayList<>();
        int temp = number;
        while(temp > 0){
            digits.add(temp % 10);
            temp /= 10;
        }
        int index=0;
        int sum = 0;
        for(int i=digits.size()-1; i>=0; i--){
            if(index % 2 != 0){
                sum += Math.pow(digits.get(i), 2);
            }
            index++;
        }
        if(sum % 9 == 0){
            System.out.println(number + " is a lucky number.");
            } 
        else {
            System.out.println(number + " is not a lucky number.");
        }
    }
}
