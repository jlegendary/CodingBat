public String minCat(String a, String b) {
   int lengthA = a.length();
   int lengthB = b.length();
   
   if (lengthA == lengthB) return a+b;
   
   if (lengthA > lengthB) return a.substring(lengthA-lengthB) + b;
   
   return a + b.substring(lengthB-lengthA);
}
