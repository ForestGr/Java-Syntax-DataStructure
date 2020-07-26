package arrayList.userDefined.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*the element of arrayList is the class(object) 'user' */
public class UserDefinedObject {
  public static void main(String[] args) {
    List<User> users = new ArrayList<>();
    users.add(new User("John", 25));
    users.add(new User("Andy", 34));
    users.add(new User("Steve", 29));

    users.forEach(user -> {
      System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
    });

    /**
     * Sort an ArrayList of Objects using custom Comparator
     */

    // Sort People by their Age
    users.sort((person1, person2) -> {
      return person1.getAge() - person2.getAge();
    });

    // A more concise way of writing the above sorting function
    users.sort(Comparator.comparingInt(User::getAge));

    System.out.println("Sorted Person List by Age: " + users);

    // You can also sort using Collections.sort() method by passing the custom Comparator
    Collections.sort(users, Comparator.comparing(User::getName));
    System.out.println("Sorted Person List by Name: " + users);
  }
}
