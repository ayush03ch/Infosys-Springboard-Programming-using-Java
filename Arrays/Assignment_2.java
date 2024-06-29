class Tester {
    
    public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
        double aboveAverage = 0;
        double belowAverage = 0;
        
        double salarySum = Arrays.stream(salary).sum();
        double average = salarySum / salary.length();
        
        for(double entry : salary){
            if(entry > average) aboveAverage++;
            if(entry < average) belowAverage++;
        }        
        
        return new double[]{average, aboveAverage, belowAverage};     
    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
