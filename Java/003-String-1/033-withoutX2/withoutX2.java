public String withoutX2(String str) {
   if (str.length() < 2) return "";
   
   String finalString = "";
   if (str.charAt(0) != 'x') finalString+=str.charAt(0);
   if (str.charAt(1) != 'x') finalString+=str.charAt(1);
   finalString+=str.substring(2);
   
   return finalString;
}
