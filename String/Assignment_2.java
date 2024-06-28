class Tester {
    public static boolean checkPalindrome(String str) {
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) { 
            char c = str.charAt(i);
            reverse.append(c);
        }
        return str.equals(reverse.toString());
    }

    public static void main(String args[]) {
        String str = "radar";
        if (checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}
