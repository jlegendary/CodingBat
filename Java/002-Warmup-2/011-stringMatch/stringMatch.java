public int stringMatch(String a, String b) {
   int stringDifference = Math.min(a.length(), b.length());
   int twoCharEqual = 0;
   
   for (int i=0; i<stringDifference-1; i++) {
      String aSubString = a.substring(i, i+2);
      String bSubString = b.substring(i, i+2);
      if (aSubString.equals(bSubString)) {
         twoCharEqual++;
      }
   } 
   
   return twoCharEqual;
}
