public boolean arrayFront9(int[] nums) {
   int firstFourInt = nums.length;
   if (firstFourInt > 4) firstFourInt = 4;
   
   for (int i=0; i<firstFourInt; i++) {
      if (nums[i] == 9) return true;
   }
   
   return false;
 }
