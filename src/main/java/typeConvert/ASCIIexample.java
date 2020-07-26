package typeConvert;

public class ASCIIexample {
  public static void main(String[] args) {
    String str = "h";
    String newStr = str.toUpperCase();
    char ch = 'h';
    //ASCII decimal value等同于int value(数学中的整数值)
    //ASCII decimal value of char 'h' is 104
    //ASCII decimal value of char '0' is 48
    //ASCII decimal value of char '1' is 49

    System.out.println(newStr + 1); //H1
    System.out.println(newStr + str); //Hh
    System.out.println(newStr + ch); //Hh
    System.out.println(ch + 1); //105
    System.out.println(ch + '1'); //153
    System.out.println(ch + '0' + 1); //153
    System.out.println(ch + '0' + '1'); //201
    System.out.println(ch + ch); //208
  }
}
