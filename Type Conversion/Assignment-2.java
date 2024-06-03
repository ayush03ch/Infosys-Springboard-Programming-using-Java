class Tester {
    public static void main(String[] args) {
        double celsius = ((fahrenheit - 32) / 9) * 5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        System.out.println("Temperature in Celsius = " + celsius);

        scanner.close();
    }
}
