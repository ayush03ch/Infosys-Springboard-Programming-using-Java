class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rateOfInterest * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}
