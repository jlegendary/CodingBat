public String stringBits(String str) {
   String finalString = "";
   
   for (int i=0; i<str.length(); i+=2){
      finalString+=str.substring(i, i+1);
   }
   return finalString;
}
