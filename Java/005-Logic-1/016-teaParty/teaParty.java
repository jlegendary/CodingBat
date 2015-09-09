public int teaParty(int tea, int candy) {
   if (tea<5 || candy<5) 
      return 0;
   if (candy>=5 && tea>=5 && (candy>=2*tea || tea>=2*candy)) 
      return 2;
   return 1;
}