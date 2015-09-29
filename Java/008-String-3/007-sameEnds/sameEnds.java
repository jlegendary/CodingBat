public String sameEnds(String string) {
   String finalString = "";
   int stringLen = string.length();
   for (int i=0; i<= stringLen/2; i++)
      for (int j= stringLen/2; j<stringLen; j++)
         if (string.substring(0,i).equals(string.substring(j)))
            finalString = string.substring(0, i);
   return finalString;
}
