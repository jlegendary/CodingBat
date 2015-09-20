public boolean xyzMiddle(String str) {
   int len = str.length();
   
   if (len<3) return false;
   if (len%2 ==1)
      return str.substring(len/2-1, len/2+2).equals("xyz");
   return str.substring(len/2-2, len/2+1).equals("xyz") ||
          str.substring(len/2-1, len/2+2).equals("xyz");
}
