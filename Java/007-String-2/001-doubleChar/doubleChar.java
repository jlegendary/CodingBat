public String doubleChar(String str) {
   String finalString = "";
   
   for (int i=0; i<str.length(); i++){
      char addStr = str.charAt(i);
      result += "" + addStr + addStr;
   }
   
   return finalString;
}
