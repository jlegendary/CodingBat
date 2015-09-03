public int intMax(int a, int b, int c) {
  int highestInt;

  if ((a>b) && (a>c)){
     highestInt = a;
  }else if((b>a) && (b>c)){
  
     highestInt = b;
  }else{
     highestInt = c;
  }

  return highestInt;
}