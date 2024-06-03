class Tester {
    public static void main(String[] args) {
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = pi * radius * radius;
        System.out.println("Area of the circle = " + area);

        scanner.close();
    }
}
