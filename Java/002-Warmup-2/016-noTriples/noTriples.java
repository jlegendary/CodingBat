public boolean noTriples(int[] nums) {
   for (int i=0; i<(nums.length-2); i++) {
      int firstNum = nums[i];
      if (nums[i+1]==firstNum && nums[i+2]==firstNum) return false;
   }
   
   return true;
}
