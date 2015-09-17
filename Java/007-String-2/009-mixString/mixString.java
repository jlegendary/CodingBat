public String mixString(String a, String b) {
   String biggerString = "";
   
   for (int i=0; i<Math.min(a.length(), b.length()); i++)
      biggerString += "" + a.charAt(i) + b.charAt(i);
      
   if (a.length() > b.length())
      return biggerString + a.substring(b.length());
   return biggerString + b.substring(a.length());
}
