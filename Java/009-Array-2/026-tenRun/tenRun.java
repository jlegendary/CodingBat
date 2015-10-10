public int[] tenRun(int[] nums) {
   boolean change = false;
   int multiple = 0;
   
   for (int i=0; i<nums.length; i++) {
      if (nums[i] % 10 == 0) {
         if (!change) {
            change = true;
            multiple = nums[i];
         } else
            multiple = nums[i];
      }
      if (nums[i]%10!=0 && change) nums[i] = multiple;
   }
   return nums;
}
