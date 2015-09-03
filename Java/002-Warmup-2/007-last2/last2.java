public int last2(String str) {
   // Quit program if String is less than 2
   if (str.length() < 2) return 0;
   
   // The last two character in the string
   String lastTwo = str.substring(str.length()-2);
   
   int count = 0;
   
   for (int i=0; i<str.length()-2; i++){
      String twoChar = str.substring(i, i+2);
      // Compare each two character
      if (twoChar.equals(lastTwo)) {
         count++;
      }
   }
   
   return count;
}
