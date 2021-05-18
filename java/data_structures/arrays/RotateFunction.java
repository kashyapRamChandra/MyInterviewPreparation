class RotateFunction{

public int maxRotateFunction(int[] A) {
        
        
        //rotate the array for all possibles;
        
	int[] array=new int[A.length];
        for(int i=0;i<A.length;i++){
		array[i]=rotateArrayAndSigma(A,i);
        }
	

	int maxValue=array[0];
	for(int x:array){
		maxValue=maxValue>x?maxValue:x;	
	}
        return maxValue;	        
   }
    private int rotateArrayAndSigma(int[] a,int k){
        
        //left shift the array;
        int firstValue=a[0];
        for(int i=1;i<a.length;i++){
             a[i-1]=a[i];
        }
        a[a.length-1]=firstValue;
        int result=0;
        
        for(int i=0;i<a.length;i++){
            result+=(a[i]*i);
        }
        
        return result;
    }

	public static void main(String []args){
		RotateFunction rf =new RotateFunction();

                System.out.println(rf.maxRotateFunction(new int[]{-2147483648,-2147483648}));
//		System.out.println(rf.maxRotateFunction(new int[]{4,3,2,6}));
	}

}
