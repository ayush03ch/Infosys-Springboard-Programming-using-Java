class Tester {

    public static String moveSpecialCharacters(String str) {
        // Create two StringBuilder objects to separate special characters and other characters
        StringBuilder specialChars = new StringBuilder();
        StringBuilder otherChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // special character
            if (!Character.isLetterOrDigit(c)) {
                specialChars.append(c);
            } else {
                otherChars.append(c);
            }
        }
        otherChars.append(specialChars);

        return otherChars.toString();
    }

    public static void main(String args[]) {
        String str = "He@#$llo!*&";
        System.out.println(moveSpecialCharacters(str));
    }
}
