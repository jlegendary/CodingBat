public boolean endOther(String a, String b) {
   a = a.toLowerCase();
   b = b.toLowerCase();
   
   boolean testOne = a.length()>= b.length() && 
                a.substring(a.length()-b.length()).equals(b);
   boolean testTwo = b.length()>=a.length() &&
                b.substring(b.length()-a.length()).equals(a);
   
   return testOne || testTwo;
}
