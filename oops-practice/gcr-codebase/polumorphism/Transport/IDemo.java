package Transport;
//Interfcace is a coding aptitude amig two classes
public interface IDemo {
    void add();

}
//class DemoTwo{
//    public static void main(String[] args) {
//        IDemo d = new IDemo() {
//        }
//    }
//}

class DemoTwoImpl implements IDemo{
    public void add(){
        System.out.println("add");
    }

}