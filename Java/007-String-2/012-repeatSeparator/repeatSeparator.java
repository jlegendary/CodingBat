public String repeatSeparator(String word, String sep, int count) {
   String finalStr = "";
   
   if (count==0) return "";
   while (count>1) {
      finalStr += word+sep;
      count--;
   }
   finalStr += word;

   return finalStr;
}
