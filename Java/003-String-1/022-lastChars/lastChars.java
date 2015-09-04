public String lastChars(String a, String b) {
   if (a.length()==0 && b.length()!=0)
      return "@" + "" + b.charAt(b.length()-1);
      
   if (b.length()==0 && a.length()!=0)
      return a.charAt(0) + "@";
      
   if (a.length()==0 && b.length()==0)
      return "@@";
      
   return a.charAt(0) + "" + b.charAt(b.length()-1);
}
