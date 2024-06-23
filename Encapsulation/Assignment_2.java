class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats) {
        setMovieId(movieId);
        setNoOfSeats(noOfSeats);
        setCostPerTicket(movieId);
    }

    // Getter methods
    public int getMovieId() {
        return movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    // Setter methods
    public void setMovieId(int movieId){
        this.movieId = movieId;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setCostPerTicket(double costPerTicket) {
        int mID = (int) this.movieId;
        switch (mID) {
            case 111:
                this.costPerTicket = 7.0;
                break;
            case 112:
                this.costPerTicket = 8.0;
                break;
            case 113:
                this.costPerTicket = 8.5;
                break;
            default:
                this.costPerTicket = 0.0;
                break;
        }
    }

    public double calculateTotalAmount() {
        double cpt = getCostPerTicket();
        int nos = getNoOfSeats();
        double price = cpt * nos;
        double totalAmount = price * 1.02;
        totalAmount = Math.round(totalAmount);
        return totalAmount; 
    }
}

class Tester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount == 0)
            System.out.println("Sorry! Please enter a valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking: $" + amount);
    }
}
