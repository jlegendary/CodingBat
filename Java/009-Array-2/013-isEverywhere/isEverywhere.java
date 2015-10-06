public boolean isEverywhere(int[] nums, int val) {
   boolean pairOne = true;
   boolean pairTwo = true;
   
   for (int i=0; i<nums.length; i+=2)
      if (nums[i]!=val) pairOne = false;
   for (int i=0; i<nums.length-1; i+=2)
      if (nums[i+1]!=val) pairTwo = false;
      
   return pairOne || pairTwo;
}
