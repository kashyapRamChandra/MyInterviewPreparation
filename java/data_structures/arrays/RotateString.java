class RotateString {
    
    
public static void main(String[]args){
boolean result=new RotateString().rotateString("abcde","cdeab");
       System.out.println(result);

}
    public boolean rotateString(String A, String B) {
        
        int length=A.length();
        boolean isValid=false;
        for(int i=0;i<length;i++){
            //perform shift operation.
            isValid=generateLeftShif(A,i).equals(B) ;
            if(isValid)
                break;
            }
        return isValid;
    }
    
    private String generateLeftShif(String a,int k){
	
	String leftPart = a.substring(0,k);
	String restPart = a.substring(k,a.length()); 

        
	     

        String value= restPart + leftPart;
	System.out.println(value + ": K="+k +" leftPart:"+leftPart+" :Right part:"+restPart);
        return value;
        
    }
}
