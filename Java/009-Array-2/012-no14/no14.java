public boolean no14(int[] nums) {
   int oneCounts = 0;
   int fourCounts = 0;
   
   for (int i=0; i<nums.length; i++) {
      if (nums[i] == 1) oneCounts++;
      if (nums[i] == 4) fourCounts++;
   }
   
   return oneCounts==0 || fourCounts==0;
}
