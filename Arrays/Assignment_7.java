class Tester{
    public static String[] findPermutations(String str){
        //Implement your code here and change the return value accordingly
        String[] permutations = new String[6];
        int index=0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j) continue;
                for(int k=0; k<3; k++){
                    if(i==j || j==k) continue;
                    permutations[index++] = "" + str.charAt(i) + str.charAt(j) + str.charAt(i);
                }
            }
        }
        return pemutations;
    }
    
    public static void main(String args[]){
        String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}


