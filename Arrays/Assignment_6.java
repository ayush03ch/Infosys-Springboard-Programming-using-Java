class Tester {
    public static int findTotalCount(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 1, 5, 100, -20, 6, 0, 0};
        int[] numbers2 = {5, 6, 6, 6, 12, 1, 1, 0, 0};

        System.out.println("Count of adjacent occurrence in first array: " + findTotalCount(numbers1));
        System.out.println("Count of adjacent occurrence in second array: " + findTotalCount(numbers2));
    }
}
