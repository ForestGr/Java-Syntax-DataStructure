package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterate {
  public static void main(String[] args) {
    Set<String> programmingLanguages = new HashSet<>();
    programmingLanguages.add("C");
    programmingLanguages.add("C++");
    programmingLanguages.add("Java");
    programmingLanguages.add("Python");
    programmingLanguages.add("PHP");
    programmingLanguages.add("Ruby");

    System.out.println("=== using simple for-each loop ===");
    for(String programmingLanguage: programmingLanguages) {
      System.out.print(programmingLanguage + " ");
    }

    System.out.println("\n=== using iterator() ===");
    Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
    while (programmingLanguageIterator.hasNext()) {
      String programmingLanguage = programmingLanguageIterator.next();
      System.out.print(programmingLanguage + " ");
    }

    System.out.println("\n=== using Java 8 forEach and lambda ===");
    programmingLanguages.forEach(programmingLanguage -> {
      System.out.print(programmingLanguage + " ");
    });

    System.out.println("\n=== using iterator() and Java 8 forEachRemaining() method ===");
    programmingLanguageIterator = programmingLanguages.iterator();
    programmingLanguageIterator.forEachRemaining(programmingLanguage -> {
      System.out.print(programmingLanguage + " ");
    });
  }
}