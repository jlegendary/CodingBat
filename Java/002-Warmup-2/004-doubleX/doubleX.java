boolean doubleX(String str) {
   int z = str.indexOf("x");
   if (z==-1) return false;
   
   String xFollowedByAnother = str.substring(z);
   return xFollowedByAnother.startsWith("xx");
}