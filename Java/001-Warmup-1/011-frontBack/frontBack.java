public String frontBack(String str) {
    // Don't switch if it's one or less character string
    if (str.length() <= 1) return str;
    
    // String middle extends from 2nd to 2nd to last character in string
    String middle = str.substring(1, str.length()-1);
    
    // return with switched position of last and beginning usign charAt
    return str.charAt(str.length()-1) + middle + str.charAt(0);
}