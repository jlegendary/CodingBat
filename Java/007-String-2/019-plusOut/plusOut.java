public String plusOut(String str, String word) {
   int beg = 0;
   int end = str.indexOf(word);
   while (end != -1) {
      for (int i = beg; i<end; i++)
         str = str.substring(0,i) + "+" + str.substring(i+1);
      beg = end+word.length();
      end = str.indexOf(word,beg);
   }
   
   for (int i=beg; i<str.length(); i++)
      str = str.substring(0,i) + "+" + str.substring(i+1);
   return str;
}
