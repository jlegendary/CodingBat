public String deFront(String str) {    
   if (str.charAt(0)=='a' && str.charAt(1)!='b')
      return str.charAt(0) + str.substring(2);
      
   if (str.charAt(0)!='a' && str.charAt(1)=='b')
      return str.substring(1);
      
   if (str.charAt(0)=='a' && str.charAt(1)=='b')
      return str;
      
   return str.substring(2);
}
