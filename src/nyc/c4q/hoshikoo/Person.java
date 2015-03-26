package nyc.c4q.hoshikoo;

/**
 * A Person class
 */
public class Person {

    private String name;
    private String phoneNumber;
    private String city;
    private String childName;


    public Person(String name, String city, String phoneNumber, String childName){
        this.name=name;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.childName = childName;
    }

    public Person(String name, String city, String phoneNumber){
        this.name=name;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
    public Person(String name, String city){
        this.name=name;
        this.city = city;
    }

    public Person(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static boolean checkSameCity(Person i, Person j){
        String iCity = i.getCity();
       // iCity=iCity.toLowerCase();
        String jCity = j.getCity();
        //jCity=jCity.toLowerCase();

        if (iCity.equalsIgnoreCase(jCity)){
            return true;
        }else{
            return false;
        }

    }

    public static String registerChild(Person parent){
        String childName = parent.childName;
        String childCity = parent.city;
        String ChildPhoneNum = parent.phoneNumber;

        String childRegistration = "Person "+childName+" = new Parson(\""+childName+"\",  \""+childCity+"\",  \""+ChildPhoneNum+");";

        return childRegistration;
    }

    public static void main(String[] args) {

        Person hoshiko = new Person("hoshiko", "Brooklyn");
        Person parent = new Person("ParentName", "Chicago", "773-555-2073", "KidName");
        System.out.println(checkSameCity(hoshiko, parent));
        System.out.println(registerChild(parent));

    }


}
