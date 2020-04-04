
//Find a pairs in an array whose sum is x;
/*
 ex: [1,2,3,4,5,6,7]
x =5
pair will be (1,4),(2,3)

     step 1:
             5-1 =4 in set no add 1 to set.
	     5-2 =3 in set no add 2 to set.
             5-3 =2 in set yes return (2,3)
	     5-4 =1 in set yes return (1,4)
	     5-5 =0 in set no add 5 to set.
	     
*/
import java.util.*;



class Problem1{
	
	public List<String> getPairs(int[] array,int x){
		List<String> pairs = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		for(int a : array){
			if(set.contains(x-a)){
				String msg = "("+(x-a)+","+a+")";
				pairs.add(msg);
			}else{
				set.add(a);
			}		
		}
		
		return pairs;
	}
	public static void main(String[] args){
		Problem1 problem1 = new Problem1();	
		int[] array =new int[]{1,2,3,4,5,6,7};
		int x = 5;
		
		for(String pair:problem1.getPairs(array,x)){
			
			System.out.println(pair);
		}
	}

}
