public boolean gHappy(String str) {
   str = "X" + str + "X";
   for (int i=1; i<str.length()-1; i++)
      if (str.charAt(i) == 'g' && str.charAt(i-1)!='g'
             && str.charAt(i+1) != 'g')
         return false;
      return true;
}
