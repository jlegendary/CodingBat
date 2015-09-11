public int sumLimit(int a, int b) {
   String sum = String.valueOf(a+b);
   String aLength = String.valueOf(a);
   
   return (sum.length()==aLength.length()) ? a+b : a;
}
