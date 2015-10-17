public int maxMirror(int[] nums) {
   int[] copy = new int[nums.length];
   for (int i=nums.length-1, j=0; i>=0; i--, j++)
      copy[j] = nums[i];
      
   int max = 0;
   for (int i=0; i<nums.length; i++) {
      int count = 0;
      int onePos = i;
      int twoPos = 0;
      boolean flag = false;
      
      while (onePos<nums.length && twoPos<nums.length) {
         if (!flag) {
            if (nums[onePos]!=copy[twoPos]) twoPos++;
            else {
               flag = true;
               count = 1;
               onePos++;
               twoPos++;
            }
         } else {
            if (nums[onePos] == copy[twoPos]) {
               count++;
               onePos++;
               twoPos++;
            } else {
               if (count>max) max = count;
               onePos = i;
               flag = false;
            }
         }
         if (count>max) max = count;
      }
   }
   return max;
}