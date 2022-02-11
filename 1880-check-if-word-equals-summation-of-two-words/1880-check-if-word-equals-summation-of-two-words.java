class Solution {
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord){
            String a = null;
            for(int i =0;i<firstWord.length();i++){
                  a += String.valueOf(findIntFromChar(firstWord.charAt(i)));
            }
            
            String b = null;
            for(int i =0;i<secondWord.length();i++){
                  b += String.valueOf(findIntFromChar(secondWord.charAt(i)));
            }
      
            String c = null;
            for(int i =0;i<targetWord.length();i++){
                  c += String.valueOf(findIntFromChar(targetWord.charAt(i)));
            }
            c = Integer.toString(Integer.parseInt(c.replaceAll("null", "")));
            String d = Integer.toString(Integer.parseInt(a.replaceAll("null", ""))+Integer.parseInt(b.replaceAll("null", "")));
            System.out.println(d);
            System.out.println(c);
      
            return c.equals(d);
      
      
      }
            
      
      
      public static int findIntFromChar(char c){
            return switch (c) {
                  case 'a' -> 0;
                  case 'b' -> 1;
                  case 'c' -> 2;
                  case 'd' -> 3;
                  case 'e' -> 4;
                  case 'f' -> 5;
                  case 'g' -> 6;
                  case 'h' -> 7;
                  case 'i' -> 8;
                  case 'j' -> 9;
                  default -> -1;
            };
      }
      public static char findCharFromInt(int c){
            return switch (c) {
                  case 0 -> 'a';
                  case 1 -> 'b';
                  case 2 -> 'c';
                  case 3 -> 'd';
                  case 4 -> 'e';
                  case 5 -> 'f';
                  case 6 -> 'g';
                  case 7 -> 'h';
                  case 8 -> 'i';
                  case 9 -> 'j';
                  default -> 'z';
            };
      }
}