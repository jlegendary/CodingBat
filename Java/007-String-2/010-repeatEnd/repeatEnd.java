public String repeatEnd(String str, int n) {
   String finalString = "";
   
   for (int i=0; i<n; i++)
      finalString += str.substring(str.length()-n);
   return finalString;
}
