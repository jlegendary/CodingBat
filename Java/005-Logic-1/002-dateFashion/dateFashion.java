public int dateFashion(int you, int date) {
   if (you<=2 || date<=2) 
      return 0;
   
   return (you>=8 || date>=8) ? 2 : 1;
}