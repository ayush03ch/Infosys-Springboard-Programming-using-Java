class Tester {
    
    public static int countSubstring(String inputString, String substring, int count) {
        //Implement your code here and change the return value 
        if (inputString.length() < substring.length()) {
            return count;
        }
    
        if (inputString.startsWith(substring)) {
            count++;
            return countSubstring(inputString.substring(substring.length()), substring, count);
        } else {
            return countSubstring(inputString.substring(1), substring, count);
        }
    }

    public static void main(String[] args) {
        int count = countSubstring("I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn't really happy", "happy", 0);
        System.out.println(count);
    }
}
