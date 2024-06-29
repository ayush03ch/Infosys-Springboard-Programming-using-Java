class Tester {

    public static int[] findNumbers(int num1, int num2) {
        int[] numbers = new int[6];
        
        if (num1 >= num2) {
            return numbers;
        }

        int index = 0;

        for (int i = num1; i <= num2; i++) {
            if (i > 9 && i < 100) { 
                int sumOfDigits = (i / 10) + (i % 10);
                if (sumOfDigits % 3 == 0 && i % 5 == 0) {
                    if (index < 6) {
                        numbers[index] = i;
                        index++;
                    }
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int[] numbers = findNumbers(num1, num2);
        if (numbers[0] == 0) {
            System.out.println("There is no such number!");
        } else {
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] == 0) {
                    break;
                }
                System.out.println(numbers[index]);
            }
        }
    }
}
