public boolean loneTeen(int a, int b) {
  boolean ifAIsTeen = (a>=13 && a<=19);
  boolean ifBIsTeen = (b>=13 && b<=19);
  
  return (ifAIsTeen && !ifBIsTeen) || (!ifAIsTeen && ifBIsTeen);
}
