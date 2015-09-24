public String withoutString(String base, String remove) {
   String finalString = "";
   int index = base.toLowerCase().indexOf(remove.toLowerCase());
   
   while (index != -1) {
      finalString += base.substring(0, index);
      base = base.substring(index + remove.length());
      index = base.toLowerCase().indexOf(remove.toLowerCase());
   }
   finalString += base;
   
   return finalString;
}
