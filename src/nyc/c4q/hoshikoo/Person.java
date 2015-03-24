package nyc.c4q.ac21;

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

    public void Person(String name){
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
        String childRegistration = "Person "+parent.childName+" = new Person(""+parent.childName +""", "parent.city", "\"+parent.phoneNumber+"\");



        return childRegistration;
    }


    public static void main(String[] args) {
       Person hoshiko = new Person("hoshiko", "Brooklyn");
        Person cosmos = new Person("cosmos", "Chicago", "773-510-2073", "abc");
        System.out.println(checkSameCity(hoshiko, cosmos));
        System.out.println(registerChild(cosmos));
    }

}
