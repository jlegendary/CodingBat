public boolean mixStart(String str) {
  if (str.length()<3) return false;
  
  String takeIX = str.substring(1,3);
  
  return (takeIX.equals("ix"));
}
