public int[] make2(int[] a, int[] b) {
   int[] finalArr = new int[2];
   
   if (a.length == 0) {
      finalArr[0] = b[0];
      finalArr[1] = b[1];
   } else if (a.length == 1) {
      finalArr[0] = a[0];
      finalArr[1] = b[0];
   } else {
      finalArr[0] = a[0];
      finalArr[1] = a[1];
   }
   
   return finalArr;
}
