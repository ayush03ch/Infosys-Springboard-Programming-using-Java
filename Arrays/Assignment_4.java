class Student {
    private int[] marks;
    private char[] grade;

    public Student(int[] marks) {
        setMarks(marks);
        grade = new char[marks.length];
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void findGrade() {
        char[] grade = new char[marks.length];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 92) grade[i] = 'E';
            else if (marks[i] >= 85) grade[i] = 'A';
            else if (marks[i] >= 70) grade[i] = 'B';
            else if (marks[i] >= 65) grade[i] = 'C';
            else tempGrades[i] = 'D';
        }
        setGrade(grades);
    }
    public void setGrade(char[] grade) {
        this.grade = grade;
    }
    public int[] getMarks() {
        return marks;
    }
    public char[] getGrade() {
        return grade;
    }
}

class Tester {
    public static void main(String[] args) {
        int[] marks = {79, 87, 97, 65, 78, 99, 66};
        Student student = new Student(marks);
        student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
        char[] grades = student.getGrade();
        for (int index = 0; index < grades.length; index++) {
            System.out.print(grades[index] + " ");
        }
    }
}
