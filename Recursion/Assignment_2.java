class Tester {
    public static double findHPSum(int num) {
        //Implement your code here and change the return value 
        if (num == 1) {
            return 1.0;
        }
        return (1.0 / num) + findHPSum(num - 1);
    }

    public static void main(String args[]) {
        System.out.println(findHPSum(3));
    }
}
