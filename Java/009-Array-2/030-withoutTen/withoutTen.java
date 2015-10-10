public int[] withoutTen(int[] nums) {
   int[] copy = new int[nums.length];
   int index = 0;
   
   for (int i=0; i<nums.length; i++)
      if (nums[i] != 10) {
         copy[index] = nums[i];
         index++;
      }
   return copy; 
}
