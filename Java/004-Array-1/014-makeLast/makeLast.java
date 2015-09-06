public int[] makeLast(int[] nums) {
   int[] newArry = new int[2*nums.length];
   
   newArry[newArry.length-1] = nums[nums.length-1];
   
   return newArry;
} 
