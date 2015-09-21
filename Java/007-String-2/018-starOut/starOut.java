public String starOut(String str) {
   while (str.indexOf('*') != -1) {
      if (str.equals("*")) return "";
      int starPosition = str.indexOf('*');
      int secondStarPosition = str.indexOf('*', starPosition+1);
      if (secondStarPosition-starPosition == 1) {
         str = str.substring(0,starPosition) + str.substring(secondStarPosition);
         continue;
      }
      if (starPosition==0) str=str.substring(starPosition+2);
      else if (starPosition==str.length()-1)
         str = str.substring(0, str.length()-2);
      else str = str.substring(0, starPosition-1) + str.substring(starPosition+2);
   }
   return str;
}