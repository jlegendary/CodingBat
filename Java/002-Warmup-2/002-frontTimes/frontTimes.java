public String frontTimes(String str, int n) {
   int firstThree = 3;
   
   if (firstThree>str.length()){
      firstThree = str.length();
   }
   
   String frontThreeChar = str.substring(0, firstThree);
   
   String finalString = "";
   for (int i=0; i<n; i++) {
      finalString+=frontThreeChar;
   }
   
   return finalString;
}
