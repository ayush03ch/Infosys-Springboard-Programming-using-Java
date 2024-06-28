public class Tester{
    
    public static int calculateSumOfEvenNumbers(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++)
            if(numbers[i] %2==0)
                sum += numbers[i];
        return sum;
    }
    
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}
}
