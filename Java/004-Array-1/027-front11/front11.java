public int[] front11(int[] a, int[] b) {
   int[] firstArr = new int[1];
   int[] seconArr = new int[2];
   
   if (a.length==0 && b.length==0) {
      return a;
   }
   
   if (a.length>=1 && b.length==0) {
      firstArr[0] = a[0];
      return firstArr;
   }
   
   if (a.length==0 && b.length>=1) {
      firstArr[0] = b[0];
      return firstArr;
   }
   
   if (a.length>=1 && b.length>=1) {
      seconArr[0] = a[0];
      seconArr[1] = b[0];
      return seconArr;
   }

   return a;
}