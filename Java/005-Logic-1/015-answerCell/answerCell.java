public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
   if (isAsleep) return false;
   if (!isMom && isMorning) return false;
   return true;
}
