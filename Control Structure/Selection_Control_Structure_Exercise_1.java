class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = 0;
        
        if(num1 >= num2){
            if(num1 >= num3) { max = num1; }
            else { max = num3; }
        }
        else{
            if(num2 >= num3) { max = num2; }
            else { max = num3; }
        }

        System.out.println("Maximum number is: " + max);

        scanner.close();
    }
}
