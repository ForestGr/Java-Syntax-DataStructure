package typeConvert;

public class ConvertAscii {

  public static void main(String args[]){
    String str ="Hello";
    for(int i = 0; i < str.length(); i++){
      System.out.println(str.toLowerCase().charAt(i) - 'a');
    }
  }

}