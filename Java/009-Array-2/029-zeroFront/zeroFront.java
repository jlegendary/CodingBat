public int[] zeroFront(int[] nums) {
   int[] result = new int[nums.length];
   int zeroPosit = 0;
   int nonZeroPos = result.length-1;
   
   for (int i=0; i<nums.length; i++)
      if (nums[i] == 0)
         result[zeroPosit++] = 0;
      else
         result[nonZeroPos--] = nums[i];
         
   return result;
}
