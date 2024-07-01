abstract class Student{
    //Implement your code here
    private String studentName;
    private int[] testScores;
    private String testResult;
    
    public Student(String studentName){
        this.studentName = studentName;
    }
    public void setTestScore(int testNumber, int testScore){
        this.testScores[testNumber] = testScore;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setTestResult(String testResult){
        this.testResult = testResult;
    }
    public abstract void generateResult(){};
    
    public String getStudentName(){
        return this.studentName;
    }
    public String getTestResult(){
        return this.testResult;
    }
    public int[] getTestScores(){
        return this.testScores;
    }
}

class UndergraduateStudent{
    //Implment your code here
    public UndergraduateStudent(String studentName){
        this.studentName = studentName;
    }
    public void generateResult(){
        int averageScore;
        for(int score : testScores) averageScore += score;
        averageScore /= testScores.length();
        
        if(averageScore >= 60) this.testResult = "Pass";
        else this.testResult = "Fail";
    }
}

class GraduateStudent{
    //Implment your code here
    public GraduateStudent(String studentName){
        this.studentName = studentName;
    }
    public void generateResult(){
        int averageScore;
        for(int score : testScores) averageScore += score;
        averageScore /= testScores.length();
        
        if(averageScore >= 70) this.testResult = "Pass";
        else this.testResult = "Fail";
    }    
}

class Tester {

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }
}
