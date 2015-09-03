public String altPairs(String str) {
   String finalString = "";
   
   for (int i=0; i<str.length(); i+=4) {
      int AppendChar = i+2;
      if (AppendChar > str.length()) {
         AppendChar = str.length();
      }
      finalString+=str.substring(i, AppendChar);
   }
   
   return finalString;
}
