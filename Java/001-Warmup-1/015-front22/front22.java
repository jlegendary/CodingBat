public String front22(String str) {
  int firstTwo = 2;
  
  // if there is more than 2 character in a string, make 2 the firstTwo
  if (firstTwo > str.length()) {
    firstTwo = str.length();
  }
  
  // begin is the 0 index to 2 index
  String begin = str.substring(0, firstTwo);
  
  // if no begin, just return str
  // if begin, return begin+str+begin
  return begin + str + begin;
}