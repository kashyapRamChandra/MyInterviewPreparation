import java.util.*;
import java.lang.*;
import java.io.*;

class SubArraySum {
	public static void main (String[] args) {
		//code
		
	
	    Scanner s = new Scanner(System.in);
	    //int testCases= s.nextInt();
	    int n = s.nextInt();
	    int sum = s.nextInt();
	    int[] array=new int[n]; 
	    for(int i=0;i<n;i++)
	        array[i]=s.nextInt();
	        
	    boolean bFlag=false;
	    for(int i=0;i<n;i++){
	        int subArraySum=0;
	        
	        
	        for(int j=i;j<n;j++){
	            
	            subArraySum+=array[j];
	            if(subArraySum==sum){
	                ///i,j;
			  System.out.println(""+(i+1)+""+(j+1));
			bFlag=true;
			break;
	            }
	        }
		if(bFlag)
                   break;
	    }
	    
	        
	    
	    
		
	}
}
