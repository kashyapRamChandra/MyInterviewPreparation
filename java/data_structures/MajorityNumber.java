import java.util.*;
import java.io.*;
class MajorityNumber {
    
    public int majorityElement(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int majority=-1;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(map.containsKey(n)){
                int count=map.get(n)+1;
		System.out.println("Count:"+count);
                if(count>(nums.length/2)){
                    majority= n;
			System.out.println("majority:"+majority);
System.out.println(map);
			break;
                }else{
			System.out.println("map.put:"+n+":"+(count+1));
                	map.put(n,count+1);
                }
            }else{
		System.out.println("map.put:"+n+":"+"1");
                map.put(n,1);
            }
if(majority!=-1){
break;
}
        }

return majority;
        
        
    }

public static void main(String []args){
          MajorityNumber mn=new MajorityNumber();

System.out.println(mn.majorityElement(new int[]{2,2,1,1,1,2,2}));

}
}
