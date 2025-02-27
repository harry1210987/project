class gcdString{
    public static void main(String[] args){
        String str1 = "ABCABC";
        String str2 = "ABC";
        
        gcdString m1 = new gcdString();
        String ans = m1.findString(str1,str2);
        System.out.println("your answer is "+ans);
       /* System.out.println("your answer is "+str1 + str2);
        System.out.println("your answer is "+ str2 + str1);*/
    }
    public String findString(String str1 , String str2){
        StringBuilder sb = new StringBuilder(); //mutable string class  
        
        int n1 = str1.length();     //length of the both string 
        int n2 = str2.length();
        
        if(str1 + str2 == str2 + str1){
            int ans = 0 ;
            for(int i = 1; i <= Math.min(n1 ,n2) ; i++){
                if(n1 % i == 0 && n2 % i == 0){
                  ans = i;
                  break;
                  
                }
            }
            
            for(int j = 0 ; j <= ans ; j++){
                sb.append(str1.charAt(j));
            }
            
            
        }
     
        return sb.toString();
    }
}