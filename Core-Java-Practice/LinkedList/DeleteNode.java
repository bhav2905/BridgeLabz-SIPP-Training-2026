public class DeleteNode {

    public static Node removeNode(Node head, int value) {

        if (head == null)
            return null;

        if (head.data == value)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != value) {

            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
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

        head = removeNode(head, 20);

        display(head);
    }
}