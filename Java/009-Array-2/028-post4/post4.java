public int[] post4(int[] nums) {
   int last4 = 0;
   for (int i=0; i<nums.length; i++)
      if (nums[i] == 4) last4 = i;
      
   int[] result = new int[nums.length - (last4+1)];
   for (int i=last4+1, j=0; i<nums.length; i++, j++)
      result[j] = nums[i];
   return result;
}
