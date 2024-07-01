abstract class Payment {
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;
    public abstract double payBill(double amount);

    public Payment(int customerId) {
        this.customerId = customerId;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(double serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
}




class DebitCardPayment extends Payment {
    private static int counter = 1000;
    private double discountPercentage;

    public DebitCardPayment(int customerId) {
        super(customerId);
        generatePaymentId();
    }

    private void generatePaymentId() {
        this.paymentId = "D" + counter++;
    }

    public double payBill(double amount) {
        if(amount <= 500){
            serviceTaxPercentage = 2.5;
            discountPercentage = 1;
        }
        else if(amount > 500 && amount <= 1000){
            serviceTaxPercentage = 4;
            discountPercentage = 2;
        }
        else if(amount > 1000){
            serviceTaxPercentage = 5;
            discountPercentage = 3;
        }

        // double serviceTaxAmount = (amount * serviceTaxPercentage) / 100;
        // double discountAmount = (amount * discountPercentage) / 100;

        double finalBillAmount = amount + serviceTaxAmount - discountAmount;
        return finalBillAmount;
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public static int getCounter(){
        return DebitCardPayment.counter;
    }
    public static void setCounter(int counter){
        DebitCardPayment.counter = counter;
    }
}




class CreditCardPayment extends Payment {
    private static int counter = 1000;
    private String paymentId;
    private double rewardPoints;

    public CreditCardPayment(int customerId) {
        super(customerId);
        generatePaymentId();
    }

    private void generatePaymentId() {
        this.paymentId = "C" + counter++;
    }

    @Override
    public double payBill(double amount) {
       if(amount <= 500){
            serviceTaxPercentage = 3;
        }
        else if(amount > 500 && amount <= 1000){
            serviceTaxPercentage = 5;
        }
        else if(amount > 1000){
            serviceTaxPercentage = 6;
        }
        double serviceTaxAmount = (amount * serviceTaxPercentage) / 100;
        double discountAmount = (amount * discountPercentage) / 100; 
        
        double finalBillAmount = amount + serviceTaxAmount;
        return finalBillAmount;
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }

    public double getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(double rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
    public static int getCounter(){
        return CreditCardPayment.counter;
    }
    public static void setCounter(int counter){
        CreditCardPayment.counter = counter;
    }
}



class Tester {
    public static void main(String[] args) {
        DebitCardPayment payment1 = new DebitCardPayment(101);
        DebitCardPayment payment2 = new DebitCardPayment(102);

        double amount1 = 1000.0;
        double amount2 = 500.0;

        System.out.println("Payment ID: " + payment1.getPaymentId());
        System.out.println("Final Bill Amount: $" + payment1.payBill(amount1));

        System.out.println("Payment ID: " + payment2.getPaymentId());
        System.out.println("Final Bill Amount: $" + payment2.payBill(amount2));
    }
}
