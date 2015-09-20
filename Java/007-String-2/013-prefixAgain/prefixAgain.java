public boolean prefixAgain(String str, int n) {
   String pref = str.substring(0, n);
   for (int i=n; i<=str.length()-pref.length(); i++)
      if (str.substring(i, i+pref.length()).equals(pref))
         return true;
   return false;
}
