public String extraEnd(String str) {
   int stringLength = str.length();
   
   return str.substring(stringLength-2) + str.substring(stringLength-2) + str.substring(stringLength-2);
}
