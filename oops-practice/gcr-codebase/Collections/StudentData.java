public class StusentData {

    int id;
    String name;
    int age;
    String branch;

    public StusentData(int id, String name, int age, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                '}';
    }
}