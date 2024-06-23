class Tester{

    public static String removeWhiteSpaces(String str){
		str = str.replaceAll("\\s","");
        return str;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}
