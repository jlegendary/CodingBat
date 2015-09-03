public String stringX(String str) {
   String finalString = "";
   
   for (int i=0; i<str.length(); i++) {
      if (!(i>0 && i<(str.length()-1) && str.substring(i, i+1).equals("x"))) {
         finalString+=str.substring(i, i+1);
      }
   }
   
   return finalString;
}
