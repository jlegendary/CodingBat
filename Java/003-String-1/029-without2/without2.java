public String without2(String str) {
   int strLen = str.length();
   
   if (strLen==0 || strLen == 2) return "";
   
   if (strLen==1) return str;
   
   if (str.substring(strLen-2).equals(str.substring(0,2)))
      return str.substring(2);
   
   return str;
}
