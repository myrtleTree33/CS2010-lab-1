import java.awt.AlphaComposite;
import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;


public class TestIsId
{
  public static void main( String [ ] args )
  {
    Scanner scan = new Scanner(System.in);
    String s;
    while (scan.hasNext()) {  
      s = scan.next();
      if (isId(s)) {
        System.out.println(s + " is an identifier");
      } else {
        System.out.println(s + " is not an identifier");
      }
    }
    return;
  }
  public TestIsId() {
    // TODO Auto-generated constructor stub
  } 
  
  public static boolean isAlphabet(char ch) {
    return Character.isUpperCase(ch) || Character.isLowerCase(ch);
  }
  
  public static boolean isUnderscore(char ch) {
    return ch == '_';
  }
  
  public static boolean isId( String s )
  {
    if (s.length() == 0) {
      return true;
    }

    char ch = s.charAt(s.length() - 1);

    if ( (s.length() == 1) && (!isAlphabet(ch)) && (!isUnderscore(ch)) ) {
      return false;
    }
    
    if (!isAlphabet(ch)) {
      if (!isUnderscore(ch)) {
        if (!Character.isDigit(ch)) {
          System.out.println(s);
          return false;
        }
      }
    }
    
    String nextString = s.substring(0, s.length() - 1);
    return isId(nextString);
  }
}
