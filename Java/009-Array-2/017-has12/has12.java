public boolean has12(int[] nums) {
   int one = 0;
   int two = 0;
   
   for (int i=0; i<nums.length; i++) {
      if (nums[i] == 1) one = i;
      if (nums[i] == 2) two = i;
   }
   
   return two > one;
}
