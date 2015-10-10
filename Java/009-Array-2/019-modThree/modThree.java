public boolean modThree(int[] nums) {
   for (int i=0; i<=nums.length-3; i++) {
      boolean conditionOne = nums[i]%2==0 
                        && nums[i+1]%2==0
                        && nums[i+2]%2==0;
      boolean conditionTwo = nums[i]%2==1
                        && nums[i+1]%2==1
                        && nums[i+2]%2==1;
      if (conditionOne || conditionTwo) return true;
   }
   
   return false;                   
}
