public boolean linearIn(int[] outer, int[] inner) {
   int innerIndex = 0;
   int outerIndex = 0;
   
   while (innerIndex<inner.length && outerIndex<outer.length) {
      if (outer[outerIndex] == inner[innerIndex]) {
         outerIndex++;
         innerIndex++;
      } else outerIndex++;
   }
   
   return (innerIndex == inner.length);
}
