public String stringSplosion(String str) {
   String finalString = "";
   
   for (int i=0; i<str.length(); i++){
      finalString+=str.substring(0, i+1);
   }
   
   return finalString;
}
