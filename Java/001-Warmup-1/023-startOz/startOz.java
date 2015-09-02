public String startOz(String str) {
  String yieldWord = "";
  
  if (str.length()>=1 && str.charAt(0)=='o') {
     yieldWord +=str.charAt(0);
  }
  
  if (str.length()>=2 && str.charAt(1)=='z') {
     yieldWord +=str.charAt(1);
  }
  
  return yieldWord;
}
