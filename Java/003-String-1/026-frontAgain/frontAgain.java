public boolean frontAgain(String str) {
   int strLen = str.length();
   if (strLen<2) return false;
   
   return str.substring(0,2).equals(str.substring(strLen-2));
}
