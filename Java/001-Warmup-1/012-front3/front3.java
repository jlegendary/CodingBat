public String front3(String str) {
  String front;
  
  // if more than 3 strings return first three character
  if (str.length() >=3) {
     front = str.substring(0,3);
  }
  else {  // if less than 3, return whatever string is there
     front = str;
  }
  
  // output front three times
  return front + front + front;
}
