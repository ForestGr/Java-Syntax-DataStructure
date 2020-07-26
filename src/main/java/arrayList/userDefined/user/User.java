package arrayList.userDefined.user;

/**
 * Since ArrayList supports generics, we can create an ArrayList of any type. It can be of simple
 * types like Integer, String, Double or complex types like an ArrayList of ArrayLists,or an ArrayList
 * of HashMaps or an ArrayList of any user defined objects.
 * The following example shows how to create an ArrayList of user defined objects.
 * Source: https://www.callicoder.com/java-arraylist/
 */
class User {
  private String name;
  private int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "{" + "name=" + name + ", age=" + age + '}';
  }
}
