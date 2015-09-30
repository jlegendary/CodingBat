public String mirrorEnds(String string) {
   String result = "";
   int len = string.length();
   for (int i=0, k=len-1; i<len; i++, k--)
      if (string.charAt(i) == string.charAt(k))
         result += string.charAt(i);
      else break;
   return result;
}
