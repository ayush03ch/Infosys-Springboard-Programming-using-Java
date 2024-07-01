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
		int sum = 0;
		int totalSubjects = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		this.averageMarks = sum / totalSubjects;// Calculating averageMarks
		System.out.println("Average Marks : " + this.averageMarks);
	}
}

class Tester {
	public static void main(String[] args) {
		Student student1 = new Student();
		int[] marks = { 96, 65, 76 };
		student1.setMarks(marks);
		student1.calculateAverageMarks();
	}
}
