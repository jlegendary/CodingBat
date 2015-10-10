public int[] evenOdd(int[] nums) {
   int[] res = new int[nums.length];
   int evenPosit = 0;
   int oddPosit = res.length-1;
   
   for (int i=0; i<nums.length; i++)
      if (nums[i] % 2 == 0)
         res[evenPosit++] = nums[i];
      else
         res[oddPosit--] = nums[i];
   return res;
}
 