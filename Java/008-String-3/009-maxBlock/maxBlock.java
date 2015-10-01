public int maxBlock(String str) {
   int max = 0;
   for (int i=0; i<str.length(); i++) {
      int count = 0;
      for (int k = i; k<str.length(); k++) {
         if (str.charAt(i) == str.charAt(k)) count++;
         else break;
      }
      if (count>max) max=count;
   }
   return max;
}
