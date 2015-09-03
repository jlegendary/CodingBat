public String endUp(String str) {
   if (str.length()<=3) return str.toUpperCase();
   
   int cutOffPoint = str.length()-3;
   
   String firstHalf = str.substring(0, cutOffPoint);
   String secondHalf = str.substring(cutOffPoint);
   
   return firstHalf + secondHalf.toUpperCase();
}
