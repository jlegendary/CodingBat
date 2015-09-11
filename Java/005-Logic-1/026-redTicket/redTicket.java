public int redTicket(int a, int b, int c) {
   if (a==b && b==c) return (c==2) ? 10 : 5;
   
   if (a!=b && a!=c) return 1;
   
   return 0;
}
