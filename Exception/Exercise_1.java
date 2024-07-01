// Implement user defined exception classes 

class Applicant {

    private String name;
    private String jobProfile;
    private int age;

    public String getName() {
        return name;
    }
      
    public void setName(String name) {
        this.name = name;
    }
      
    public String getJobProfile() {
         return jobProfile;
    }
      
    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
      
    public int getAge() {
        return age;
    }
      
    public void setAge(int age) {
        this.age = age;
    }
}


class Validator{
    //Implement your code here
}

class Tester {

    public static void main(String[] args) {
            
        try {
            Applicant applicant= new Applicant();
            applicant.setName("Jenny");
            applicant.setJobProfile("Clerk");
            applicant.setAge(25);
            
            Validator validator = new Validator();
                  
            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
        } 
        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
