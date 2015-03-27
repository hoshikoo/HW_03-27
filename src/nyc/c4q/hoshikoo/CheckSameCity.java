package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/22/15.
 */
public class CheckSameCity {
    public static void main(String[] args) {

        Person hoshiko = new Person("hoshiko", "Brooklyn");
        Person parent = new Person("ParentName", "Chicago", "773-555-2073", "KidName");
        System.out.println(Person.checkSameCity(hoshiko, parent));
        System.out.println(Person.registerChild(parent));

    }
}
