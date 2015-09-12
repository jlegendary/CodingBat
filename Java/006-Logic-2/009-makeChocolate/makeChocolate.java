public int makeChocolate(int small, int big, int goal) {
   int bigBars = goal/5;
   
   if (big> bigBars)
      return (goal<=5* bigBars +small) ? (goal-5* bigBars) : -1;
   return (goal<=5*big+small) ? (goal-5*big) : -1;
}
