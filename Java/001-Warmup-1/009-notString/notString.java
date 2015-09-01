public String notString(String word) {
  if (word.length() >= 3 && word.substring(0,3).equals("not")) {
     return word;
  }
  return "not " + word;
}