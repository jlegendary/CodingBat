public int[] seriesUp(int n) {
   int[] result = new int[n*(n+1)/2];
   int pos = 0;
   int i = 1;
   
   while (i<=n+1) {
      for (int j=1; j<i; j++) result[pos++]=j;
      i++;
   }
   
   return result;
}
