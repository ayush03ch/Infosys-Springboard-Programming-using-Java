class Faculty {
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary + (basicSalary * bonusPercentage / 100) + (basicSalary * carAllowancePercentage / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
}

class OfficeStaff extends Faculty {
    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return this.designation;
    }

    @Override
    public float calculateSalary() {
        float additionalPay = 0;
        if (this.designation.equals("Accountant")) {
            additionalPay = 10000f;
        } else if (this.designation.equals("Clerk")) {
            additionalPay = 7000f;
        } else if (this.designation.equals("Peon")) {
            additionalPay = 4500f;
        }

        return getBasicSalary() + (getBasicSalary() * getBonusPercentage() / 100) + (getBasicSalary() * getCarAllowancePercentage() / 100) + additionalPay;
    }
       public double calculateSalary(){
        
    }
}

class Teacher extends Faculty {
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    @Override
    public float calculateSalary() {
        float additionalPay = 0;
        if (this.qualification.equals("Doctoral")) {
            additionalPay = 20000f;
        } else if (this.qualification.equals("Masters")) {
            additionalPay = 18000f;
        } else if (this.qualification.equals("Bachelors")) {
            additionalPay = 15500f;
        } else if (this.qualification.equals("Associate")) {
            additionalPay = 10000f;
        }

        return getBasicSalary() + (getBasicSalary() * getBonusPercentage() / 100) + (getBasicSalary() * getCarAllowancePercentage() / 100) + additionalPay;
    }
    
    public double calculateSalary(){
        
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return this.qualification;
    }
}

class Tester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
        teacher.setBonusPercentage(10f);
        teacher.setCarAllowancePercentage(5f);
        
        OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
        officeStaff.setBonusPercentage(8f);
        officeStaff.setCarAllowancePercentage(4f);

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Qualification: " + teacher.getQualification());
        System.out.printf("Total salary: $%.2f\n", teacher.calculateSalary());
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: " + officeStaff.getName());
        System.out.println("Designation: " + officeStaff.getDesignation());
        System.out.printf("Total salary: $%.2f\n", officeStaff.calculateSalary());

        // Create more objects for testing your code
    }
}
