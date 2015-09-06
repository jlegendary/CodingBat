public int maxTriple(int[] nums) {
   int mid = nums.length/2;
   int end = nums.length-1;
   int highest = nums[0];
   
   if (nums[mid]>highest) highest =nums[mid];
   if (nums[end]> highest) highest =nums[end];
   
   return highest;
} 
