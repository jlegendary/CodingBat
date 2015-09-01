public boolean startHi(String str) {
 
  // if less than 2 string, return false
  if (str.length() < 2)
    return false;
  
  // Get firstTwo character
  String firstTwo = str.substring(0,2);
  
  // Return true if firstTwo equals hi, else false
  return (firstTwo.equals("hi"));
}
