public int scoresAverage(int[] scores) {
   int first = average(scores, 0, scores.length/2);
   int second = average(scores, scores.length/2, scores.length);
   return Math.max(first, second);
}

private int average(int[] scores, int start, int end) {
   int sum = 0;
   int count = 0;
   for (int i=start; i<end; i++) {
      sum += scores[i];
      count++;
   }
   return sum/count;
}
