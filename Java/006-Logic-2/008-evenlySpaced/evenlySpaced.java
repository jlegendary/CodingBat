public boolean evenlySpaced(int a, int b, int c) {
   int small = Math.min(Math.min(a,b),c);
   int mid = Math.max(Math.min(a,b),c);
   int mid2 = Math.min(Math.max(a,b),c);
   int larg = Math.max(Math.max(a,b),c);
   
   return Math.abs(mid-small)==Math.abs(mid-larg) || Math.abs(mid2-small)==Math.abs(mid2-larg);
}
