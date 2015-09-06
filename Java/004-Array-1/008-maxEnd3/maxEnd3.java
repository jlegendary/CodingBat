public int[] maxEnd3(int[] nums) {
   if (nums[2] > nums[0]) {
      nums[0] = nums[2];
      nums[1] = nums[2];
   } else {
      nums[1] = nums[0];
      nums[2] = nums[0];
   }
   return nums;
}
