class RotateArray {

    public static void main(String []args){
        RotateArray r = new RotateArray();

        r.rotate(new int[]{1,2,3,4,5,6,7},3);

    }


    public void rotate(int[] nums, int k) {
         int rotations=0;
        int size = nums.length-1;

        while(rotations<k){
              int lastIndexValue = nums[size];
	
            
              for(int i=size-1;i>-1;i--){
                      nums[i+1]=nums[i];
              }
              nums[0]=lastIndexValue;
              rotations++;
          }


for(int i :nums)
	System.out.print(i);
    }
}
