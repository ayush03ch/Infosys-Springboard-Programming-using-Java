class Calculator {
	// Implement your code here
	public int num;
	public int sumOfDigits(){
	    int sum=0;
	    while(this.num >0){
	        sum += this.num%10;
	        this.num /= 10;
	    }
	    return sum;
	}

}

public class Methods_Assignment_3 {
	public static void main(String args[]) {

		Calculator calculator = new Calculator();
        calculator.num = 6547;
        int sum = calculator.sumOfDigits();
		System.out.print(sum);

	}
}
