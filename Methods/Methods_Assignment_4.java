import java.util.Scanner;

class Rectangle {
    //Implement your code here   
    public float length;
    public float width;
    
    public double calculateArea(){
        double result = (this.length*this.width);
        result =  Math.round(result * 100.0) / 100.0;
        return result;
    }
    
    public double calculatePerimeter(){
        double result =  2*(this.length + this.width);
        result =  Math.round(result * 100.0) / 100.0;
        return result;
    }
    
}

public class Methods_Assignment_4 {

	public static void main(String args[]) {
		
		Rectangle rectangle=new Rectangle();
		Scanner scan = new Scanner(System.in);
		//Assign values to the member variables of Rectangle class
		rectangle.length = scan.nextInt();
		rectangle.width = scan.nextInt();
        scan.close();
        
		//Invoke the methods of the Rectangle class to calculate the area and perimeter
		double res1 = rectangle.calculateArea();
		double res2 = rectangle.calculatePerimeter();
		
		//Display the area and perimeter using the lines given below
		System.out.println("Area of the rectangle is " + res1);
		System.out.println("Perimeter of the rectangle is "+ res2);
	}

}
