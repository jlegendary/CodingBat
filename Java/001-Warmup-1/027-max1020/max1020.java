public int max1020(int a, int b) {
   if (a<b) {
      int temporary=a;
      a=b;
      b=temporary;
   }
   
   if (a>=10 && a<=20) return a;
   if (b>=10 && b<=20) return b;
   
   return 0;
}
