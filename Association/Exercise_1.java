class CabServiceProvider {
    // Implement your code here
    private String cabServiceName;
    private int totalCabs;

    public CabServiceProvider(String cabServiceName, int totalCabs){
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }

    public void setCabServiceName(String cabServiceName){
        this.cabServiceName = cabServiceName;
    }
    public String getCabServiceName(){
        return this.cabServiceName;
    }

    public void setTotalCabs(int totalCabs){
        this.totalCabs = totalCabs;
    }
    public int getTotalCabs(){
        return this.totalCabs;
    }

    public double calculateRewardPrice(Driver driver){
        double rewardPrice = 0;
        if(this.cabServiceName.equals("Halo")){
            double rating = driver.getAverageRating();
            if(rating <= 5 && rating >= 4.5) rewardPrice = rating * 10;
            else if(rating < 4.5 && rating >= 4) rewardPrice = rating * 5;
        }
        else if(this.cabServiceName.equals("Aber")){
            double rating = driver.getAverageRating();
            if(rating <= 5 && rating >= 4.5) rewardPrice = rating * 8;
            else if(rating < 4.5 && rating >= 4) rewardPrice = rating * 3;
        }
        // Round off to 2 decimal places
        rewardPrice = Math.round(rewardPrice * 100.0) / 100.0;
        return rewardPrice;
    }
}

class Driver {
    private String driverName;
    private float averageRating;

    public Driver(String driverName, float averageRating){
        this.driverName = driverName;
        this.averageRating = averageRating;
    }

    public String getDriverName(){
        return this.driverName;
    }

    public void setDriverName(String driverName){
        this.driverName = driverName;
    }

    public float getAverageRating(){
        return this.averageRating;
    }

    public void setAverageRating(float averageRating){
        this.averageRating = averageRating;
    }

    // DO NOT MODIFY THE METHOD
    // Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

class Tester {
    public static void main(String args[]){
        CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

        Driver driver1 = new Driver("Luke", 4.8);
        Driver driver2 = new Driver("Mark", 4.2);
        Driver driver3 = new Driver("David", 3.9);

        Driver[] driversList = { driver1, driver2, driver3 };
        for (Driver driver : driversList) {
            System.out.println("Driver Name: "+driver.getDriverName());
            double bonus = cabServiceProvider1.calculateRewardPrice(driver);
            if (bonus > 0)
                System.out.println("Bonus: $"+bonus+"\n");
            else
                System.out.println("Sorry, bonus is not available!");
        }

        // Create more objects of CabServiceProvider and Driver classes for testing your code
        CabServiceProvider cabServiceProvider2 = new CabServiceProvider("Aber", 40);

        Driver driver4 = new Driver("Steve", 4.7);
        Driver driver5 = new Driver("Peter", 4.3);
        Driver driver6 = new Driver("John", 3.8);

        Driver[] moreDriversList = { driver4, driver5, driver6 };
        for (Driver driver : moreDriversList) {
            System.out.println("Driver Name: "+driver.getDriverName());
            double bonus = cabServiceProvider2.calculateRewardPrice(driver);
            if (bonus > 0)
                System.out.println("Bonus: $"+bonus+"\n");
            else
                System.out.println("Sorry, bonus is not available!");
        }
    }
}
