import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {
  public static void main(String [] args){
    HashSet<String> countriesSet = new HashSet<String>();
    countriesSet.add("America");
    countriesSet.add("Taiwan");
    countriesSet.add("Japan");
    countriesSet.add("Mexico");
    countriesSet.add("Russia");
    countriesSet.add("Canada");

    for (String elem : countriesSet){
      System.out.println(elem);
    }
    System.out.println();

    ArrayList<String> countriesAL = new ArrayList<String>();
    countriesAL.add("America");
    countriesAL.add("Taiwan");
    countriesAL.add("Japan");
    countriesAL.add("Mexico");
    countriesAL.add("Russia");
    countriesAL.add("Canada");

    for (String elem : countriesAL){
      System.out.println(elem);
    }
    System.out.println();

    Collections.sort(countriesAL);

    for (String elem : countriesAL){
      System.out.println(elem);
    }
    System.out.println();

  }
}
