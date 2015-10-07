public int[] fizzArray3(int start, int end) {
   int num = end-start;
   int[] result = new int[num];
   
   for (int i=0; i<num; i++)
      result[i] = start++;
   return result;
}
