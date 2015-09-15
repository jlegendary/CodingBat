public boolean xyBalance(String str) {
   int xLast = str.lastIndexOf("x");
   int yLast = str.lastIndexOf("y");
   
   if (xLast==-1 && yLast==-1) return true;
   return (xLast < yLast);
}
