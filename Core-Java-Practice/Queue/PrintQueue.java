import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    Deque<Integer> queue = new ArrayDeque<>();

    public void submitJob(int jobId) {

        queue.addLast(jobId);

        System.out.println("Normal Job Added : " + jobId);
    }

    public void submitUrgentJob(int jobId) {

        queue.addFirst(jobId);

        System.out.println("Urgent Job Added : " + jobId);
    }

    public int printNextJob() {

        if (queue.isEmpty())
            throw new RuntimeException("No Jobs");

        return queue.removeFirst();
    }

    public static void main(String[] args) {

        PrintQueue printer = new PrintQueue();

        printer.submitJob(101);
        printer.submitJob(102);

        printer.submitUrgentJob(999);

        System.out.println("Printing : " + printer.printNextJob());

        System.out.println("Printing : " + printer.printNextJob());

        System.out.println("Printing : " + printer.printNextJob());
    }
}