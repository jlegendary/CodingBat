public String repeatFront(String str, int n) {
   String finalStr = "";
   for (int i=n; i>0; i--)
      finalStr += str.substring(0,i);
   return finalStr;
}
