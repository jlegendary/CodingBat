public String middleThree(String str) {
   int strLen = str.length();
   
   if (strLen==3) return str;
   
   return str.substring(strLen/2 - 1, strLen/2 + 2);
}
