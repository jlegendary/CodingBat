public boolean haveThree(int[] nums) {
   int count = 0;
   int posit = -2;
   
   for (int i=0; i<nums.length; i++) {
      if (nums[i] == 3) {
         count++;
         if (i-posit == 1) return false;
         posit = i;
      }
   }
   
   return count == 3;
}
