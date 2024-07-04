class Tester {

    public static int[] reverseArray(int numbers[], int startIndex, int endIndex) {
        //Implement your code here and change the return value accordingly
        if(startIndex >= endIndex) return numbers;
        else{
            int temp = numbers[startIndex];
            numbers[startIndex] = numbers[endIndex];
            numbers[endIndex] = temp;
            return reverseArray(numbers,++startIndex,--endIndex);
        }
    }
    
    public static void main(String args[]) {
        int numbers[] = new int[] { 1, 2, 3, 4, 5, 6 };

        int reversedNumbers[] = reverseArray(numbers, 0, numbers.length - 1);
        System.out.println("Reversed array");
        for (int number : reversedNumbers) {
            System.out.println(number);
        }
    }
}
