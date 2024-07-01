class Student {
    private String name;
    private int[] marks;
    private float averageMarks;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getAverageMarks() {
		return averageMarks;
	}
	public void setAverageMarks(float averageMarks) {
		this.averageMarks = averageMarks;
	}
    
	public void calculateAverageMarks() {
		int sum=0;
		int totalSubjects=0;
		//outer try block
		try {
			//inner try block
			try {
				for (int i = 0; i <marks.length;i++) {
				    sum+=marks[i];
			    }
				this.averageMarks=sum/totalSubjects;//Exception will be raised as totalSubjects is 0 
				System.out.println("Average Marks: "+ this.averageMarks);
			}
			//inner catch block
			catch(ArithmeticException e) {
		            //This block will only execute if any Arithmetic exception occurs in try block
				    System.out.println("Divide by Zero exception occurred!");
			    }
			catch(ArrayIndexOutOfBoundsException e) {
				//This block will only execute if any ArrayIndexOutOfBoundsException occurs in try block
				System.out.println("Array index out of range exception occurred!");
			} 
		}
		//outer catch block
		catch(Exception e) {
			//This block will handle all types of exceptions that occur in try block
			System.out.println("Some error occurred!");
		}
	   
	}
}

class Tester{
	public static void main(String[] args) {
		Student student1 = new Student();
		int[] marks = {96,65,76};
		student1.setMarks(marks);
		student1.calculateAverageMarks();
	}
}

