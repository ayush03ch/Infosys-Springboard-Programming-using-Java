class Booking {
    // Implement your code here
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    static {
        seatsAvailable = 400;
    }

    public Booking(String customerEmail, int seatsRequired) {
        this.customerEmail = customerEmail;
        this.seatsRequired = seatsRequired;
        if (seatsRequired <= seatsAvailable) {
            this.isBooked = true;
            seatsAvailable -= seatsRequired;
        } else {
            this.isBooked = false;
        }
    }

    // Customer Email
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    // Seats Required
    public void setSeatsRequired(int seatsRequired) {
        this.seatsRequired = seatsRequired;
    }

    public int getSeatsRequired() {
        return seatsRequired;
    }

    // Is Booked
    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean isBooked() {
        return isBooked;
    }

    // Seats Available
    public static void setSeatsAvailable(int seatsAvailable) {
        Booking.seatsAvailable = seatsAvailable;
    }

    public static int getSeatsAvailable() {
        return seatsAvailable;
    }
}

class Tester {
    public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);

        // Create more objects and add them to the bookings array for testing your code
        Booking booking3 = new Booking("john@email.com", 50);

        Booking[] bookings = { booking1, booking2, booking3 };

        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired() + " seats successfully booked for " + booking.getCustomerEmail());
            } else {
                System.out.println("Sorry " + booking.getCustomerEmail() + ", required number of seats are not available!");
                System.out.println("Seats available: " + Booking.getSeatsAvailable());
            }
        }
    }
}
