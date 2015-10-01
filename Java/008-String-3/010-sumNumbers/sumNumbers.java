public int sumNumbers(String str) {
   int sum = 0;
   for (int i=0; i<str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
         int count = 0;
         for (int k=i; k<str.length(); k++) {
            if (Character.isDigit(str.charAt(k))) count++;
            else break;
         }
         sum += Integer.parseInt(str.substring(i, i+count));
         i += count;
      }
   }
   return sum;
}
