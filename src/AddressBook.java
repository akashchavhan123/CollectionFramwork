import java.util.Hashtable;

public class AddressBook {
    public static void main(String[] args) {
        Person p = new Person("A", "B", "c", "d", "440033", 3923923);
        Person p1 = new Person("sd", "zz", "dsa", "dff", "44003", 3923925);
        Hashtable<Integer, Person> a = new Hashtable<>();
        a.put(1, new Person(p.getAddress(), p.getCity(), p.getState(), p.getName(), p.getZipCode(), p.getPhoneNumber()));
        a.put(2, new Person(p1.getAddress(), p1.getCity(), p1.getState(), p1.getName(), p1.getZipCode(), p1.getPhoneNumber()));
        System.out.println(a);
        a.forEach((k,v)->{
            System.out.println(k+" "+v);
        });



    }
}
