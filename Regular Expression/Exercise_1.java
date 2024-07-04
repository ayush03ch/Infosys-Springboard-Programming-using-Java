class Tester {

    public static boolean checkNameValidity(String name) {
        // Regular expression to validate the name
        String regex = "^[A-Z][a-zA-Z]*(\\s[A-Z][a-zA-Z]*)*$";
        if (name.length() < 2 || name.length() > 30) {
            return false;
        }
        return name.matches(regex);
    }
    
    public static void main(String[] args) {
        String name = "Roger Federer";
        System.out.println("The name is " + (checkNameValidity(name) ? "valid!" : "invalid!"));
    }
}
