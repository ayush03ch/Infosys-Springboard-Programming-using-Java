class Shipment {
    public boolean checkProductNameValidity(String productName) {
        String regex = "^[A-Za-z]+( [A-Za-z]+){1,2}$";
        return productName.matches(regex);
    }

    public boolean checkProductIdValidity(String productId) {
        String regex = "^[a-zA-Z0-9]{2,20}$";
        return productId.matches(regex);
    }

    public boolean checkTrackerIdValidity(String trackerId) {
        String regex = "^[A-Z]:[A-Z]{4}:[a-z]{3}:[0-9]{2}$";
        return trackerId.matches(regex);
    }
}

class Tester {
    public static void main(String[] args) {
        Shipment shipment = new Shipment();

        String productName = "Digital Camera";
        System.out.println("The product name is " + (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));

        String productId = "DC1911";
        System.out.println("The product Id is " + (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));

        String trackerId = "D:CMDC:cmd:23";
        System.out.println("The tracker Id is " + (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));
    }
}
