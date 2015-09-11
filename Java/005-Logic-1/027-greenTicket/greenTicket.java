public int greenTicket(int a, int b, int c) {
   if (a!=b && b!=c && a!=c) return 0;
   
   return (a==b && b==c && a==c) ? 20 : 10;
}
