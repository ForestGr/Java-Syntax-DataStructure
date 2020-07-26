package typeConvert;

public class IntCharConvert {
  public static void main(String[] args) {
    /* 1. convert char to int (int value of char) */
    char ch = '3'; //char value
    int a = ch - '0'; //int value of ch method1
    int b = Integer.parseInt(String.valueOf(ch));//int value of ch method2
    int c = Character.getNumericValue(ch); //int value of ch method3
    int d = (int)ch; //ASCII decimal value of ch

    System.out.println("char value of ch: " + ch);
    System.out.println("int value of ch (method 1): " + a);
    System.out.println("int value of ch (method 2): " + b);
    System.out.println("int value of ch (method 3): " + c);
    System.out.println("ASCII decimal value of ch: " + d);

    System.out.println("_____________________________________");
    /* 2. convert int to char */
    int x = 1;
    char y = (char)(x + '0'); //method1
    char z = (char)(a); //wrong way

    //method2
    int m = '1';//这是和wrong way的区别
    char n = (char)m;

    System.out.println("int value of char x is: " + y);
    System.out.println("int value of char x is: " + z + "  //wrong way, print nothing");
    System.out.println("int value of char m is: " + n);
  }
}
