package University;

public class Person {

    protected int personID;
    protected String personName;

    public Person(int id, String name) {
        this.personID = id;
        this.personName = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", personName='" + personName + '\'' +
                '}';
    }
}