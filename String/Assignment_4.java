class Tester {

	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
		Map<Character, Integer> occurenceMap = new HashMap<>();
		for(char ch : str.toCharArray()){
		    if(ch != ' '){
		        occurenceMap.put(ch, occurenceMap.getOrDefault(ch, 0) + 1);
		    }
		}
		
		char highestChar = '\0';
		int maxFrequency = 0;
		for(Map.Entry<Character, Integer> entry : occurenceMap.entrySet()){
		    if(entry.getValue() > maxFrequency){
		        highestChar = entry.getKey();
		        maxFrequency = entry.getValue();
		    }
		}
        return highestChar;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
