public boolean more14(int[] nums) {
   int countOnes = 0;
   int countFours = 0;
   
   for (int i=0; i<nums.length; i++) {
      if (nums[i]==1) countOnes++;
      if (nums[i]==4) countFours++;
   }
   return countOnes > countFours; 
}
