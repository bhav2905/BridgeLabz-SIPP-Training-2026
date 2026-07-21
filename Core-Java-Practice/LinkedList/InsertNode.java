public class InsertNode {

    public static void insertAfter(Node current, int value) {

        if (current == null)
            return;

        Node newNode = new Node(value);

        newNode.next = current.next;

        current.next = newNode;
    }

    public static void display(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        insertAfter(head.next, 25);

        display(head);
    }
}