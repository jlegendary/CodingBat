public String[] fizzBuzz(int start, int end) {
   int dif = end - start;
   String[] res = new String[dif];
   int posit = 0;
   
   for (int i=start; i<end; i++) {
      boolean fizz = i % 3 == 0;
      boolean buzz = i % 5 == 0;
      
      if (fizz&&buzz) res[posit] = "FizzBuzz";
      else if (fizz) res[posit] = "Fizz";
      else if (buzz) res[posit] = "Buzz";
      else res[posit] = String.valueOf(i);
      posit++;
   }
   
   return res;
}
 