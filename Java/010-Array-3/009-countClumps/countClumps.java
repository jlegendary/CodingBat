public int countClumps(int[] nums) {
   int count=0;
   for (int i=0; i<nums.length-1; i++)
      if (nums[i] == nums[i+1]) {
         count++;
         for (int j=i+1; j<nums.length; j++)
            if (nums[j]==nums[i]) i++;
            else break;
      }
   return count;
}