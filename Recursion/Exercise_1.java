class Tester{
    
    public static int findReverse(int num, int temp){
	    //Implement your code here and change the return value accordingly
	    if(num == 0) return temp;
	    else{
	        int n = num % 10;
	        temp = temp*10 + n;
	        num /= 10;
	        return findReverse(num, temp);
	    }
	}
	
	public static void main(String args[]){
	    int num = 12321;
        int reverseNum = findReverse(num,0);
        if(num == reverseNum)
            System.out.println(num +" is a palindrome!");
        else
            System.out.println(num +" is not a palindrome!");
	}
}
