public String everyNth(String str, int n) {
   String finalString = "";
   
   for (int i=0; i<str.length(); i=i+n){
      finalString = finalString + str.charAt(i);
   }
   
   return finalString;
}
