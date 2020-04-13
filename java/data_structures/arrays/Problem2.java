/*
Find the missing number in an Array of size n.



*/


class Problem2{

	public int getMissingNo(int[] array,int n){
		int total=((n+2)*(n+1))/2;
		for(int i=0;i<n;i++){
			total-=array[i];
		}
		return total;		
		
	}


	public static void main(String[] args){

		Problem2 p2 = new Problem2();
		int[] array=new int[]{1,2,3,4,6};
		int missingNo = p2.getMissingNo(array,5);
		System.out.println(missingNo);
		
	}


}
