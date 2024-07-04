class Tester {

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
    
    public static int findMax(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

    public static int findMin(int num1, int num2) {
        return (num1 < num2 ? num1 : num2);
    }

    public static void main(String args[]) {
        System.out.println(findGCD(5, 10));
        System.out.println(findGCD(14, 21));
        System.out.println(findGCD(100, 200));
        System.out.println(findGCD(13, 13));
    }
}
