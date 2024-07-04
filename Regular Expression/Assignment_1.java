import java.util.regex.*;

class Tester {
        public static boolean checkPasswordValidity(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%&*_])[a-zA-Z\\d!@#$%&*_]{8,20}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
        String password = "P@$sW0rd";
        System.out.println("The password is " + (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }
}
