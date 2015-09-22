public String wordEnds(String str, String word) {
   String finalString = "";
   int position = str.indexOf(word);
   while (position != -1) {
      if (position != 0) finalString+=str.charAt(position-1);
      if (position +word.length() == str.length()) break;
      finalString += str.charAt(position+word.length());
      position = str.indexOf(word, position+1);
   }
   return finalString;
}
