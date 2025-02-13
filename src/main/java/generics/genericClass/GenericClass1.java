package generics.genericClass;

public class GenericClass1 {

  public static void main(String a[]){

    //we are going to create SimpleGeneric object with String as type parameter
    SimpleGeneric<String> sgs = new SimpleGeneric<String>("JAVA2NOVICE");
    sgs.printType();
    //we are going to create SimpleGeneric object with Boolean as type parameter
    SimpleGeneric<Boolean> sgb = new SimpleGeneric<Boolean>(Boolean.TRUE);
    sgb.printType();
  }
}
/**
 * Here T is a type parameter, and it will be replaced with
 * actual type when the object got created.
 */
class SimpleGeneric<T> {
  //declaration of object type T
  private T objRef = null;

  //constructor to accept type parameter T
  public SimpleGeneric(T param) {
    this.objRef = param;
  }

  public T getObjRef() {
    return this.objRef;
  }

  //this method prints the holding parameter type
  public void printType() {
    System.out.println("Type: " + objRef.getClass().getName());
  }
}
