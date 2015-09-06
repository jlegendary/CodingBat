public int[] swapEnds(int[] nums) {
   int firstArr = nums[0];
   int lastArr = nums[nums.length-1];
   
   nums[0] = lastArr;
   nums[nums.length-1] = firstArr;
   
   return nums;
}
