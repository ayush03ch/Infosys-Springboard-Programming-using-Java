class Calculator {

	// Implement your code here
	public double findAverage(int number1,int number2,int number3){
	    double average = ((double)number1 + (double)number2 + (double)number3)/3;
	    return Math.round(average * 100.0)/100.0 ;
	}
}

class Tester {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		// Invoke the method findAverage of the Calculator class and display the average
		int a =12, b=8, c=15;
		double avg;
		avg = calculator.findAverage(a,b,c);
		System.out.print(avg);
	}
}
