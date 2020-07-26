package typeConvert;

/**
 * 两种方法：1. Integer.parseInt(String str) -> return an integer type.
 * 2. Integer.valueOf(String str) -> return a primitive int
 * 见test class
*/

public class StringIntegerConvert {
  public static boolean isPositiveInteger1(String value) {
    if (value == null) {
      return false;
    }

    try {
      return Integer.parseInt(value.trim()) > 0;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static boolean isPositiveInteger2(String value) {
    if (value == null) {
      return false;
    }

    try {
      return Integer.valueOf(value) > 0;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    /**
     * you can have 'Integer.valueOf("2").getClass(), but
     * if you try to have 'Integer.parseInt("2").getClass(), system
     * will indicate an error.
     */
    System.out.println(Integer.valueOf("2") + "as an Integer");
    System.out.println(Integer.parseInt("2") + "as a primitive int");
  }
}
