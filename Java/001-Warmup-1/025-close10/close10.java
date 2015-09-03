public int close10(int a, int b) { 

  int aDifference = Math.abs(a-10);
  int bDifference = Math.abs(b-10);
  
  if (aDifference < bDifference){
    return a; 
  }
  else if (bDifference < aDifference) {
    return b;
  }
  else {
    return 0;
  }
}
