class Tester {
    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();
      
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseWord(word);
            reversedStr.append(reversedWord);
          
            if (i < words.length - 1) {
                reversedStr.append(" ");
            }
        }
        return reversedStr.toString();
    }

  
    private static String reverseWord(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        
        //  reverse the word
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        
        return new String(chars);
    }
    
    public static void main(String args[]) {
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str));
    }
}
