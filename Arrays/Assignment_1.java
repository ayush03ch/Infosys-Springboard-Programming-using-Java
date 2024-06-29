class Teacher {
    private String teacherName;
    private String subject;
    private double salary;

    public Teacher(String teacherName, String subject, double salary) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + teacherName + ", Subject: " + subject + ", Salary: " + salary);
    }
}

class Tester {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alex", "Java Fundamentals", 1200);
        Teacher teacher2 = new Teacher("John", "RDBMS", 800);
        Teacher teacher3 = new Teacher("Sam", "Networking", 900);
        Teacher teacher4 = new Teacher("Maria", "Python", 900);

        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};

        for (Teacher teacher : teachers) {
            teacher.displayDetails();
        }
    }
}
