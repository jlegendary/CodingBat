public boolean unlucky1(int[] nums) {
   int arrLength = nums.length;
   if (arrLength <= 1) return false;
   
   for (int i=0; i<=1; i++) {
      if (nums[i]==1 && nums[i+1]==3)
         return true;
      if (arrLength<3) break;
   }
   
   return nums[arrLength-2]==1 && nums[arrLength-1]==3;
}
