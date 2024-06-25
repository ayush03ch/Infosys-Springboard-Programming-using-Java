class Restaurant  {
    String restaurantName;
    long restaurantContact;
    String restaurantAddress;
    float rating;

    public void displayRestaurantDetails() {
        System.out.println("Restaurant Details");
        System.out.println("******************");
        System.out.println("Restaurant Name   : " + this.restaurantName);
        System.out.println("Restaurant Rating : " + this.rating);
        System.out.println("Restaurant Contact: " + this.restaurantContact);
        System.out.println("Restaurant Address: " + this.restaurantAddress);
    }
}

public class Methods_Assignment_2 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.restaurantName = "McDonald's";
        restaurant.rating = 4.1f;
        restaurant.restaurantContact = 9988676767l;
        restaurant.restaurantAddress = "SH1109, Carolina Street, Springfield";
        
        restaurant.displayRestaurantDetails();
    }
}
