class Node {

    int trackId;
    Node next;

    Node(int trackId) {
        this.trackId = trackId;
        this.next = null;
    }
}

public class Insertion {

    // Insert a new track after the current track
    public void insertAfter(Node current, int trackId) {

        if (current == null) {
            System.out.println("Current track does not exist.");
            return;
        }

        Node newNode = new Node(trackId);

        // Step 1: Save the remaining queue
        newNode.next = current.next;

        // Step 2: Link current node to new node
        current.next = newNode;
    }

    // Display Insertion
    public void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.trackId + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Insertion playlist = new Insertion();

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);

        System.out.println("Original Playlist");

        playlist.display(head);

        // Insert after second track
        playlist.insertAfter(head.next, 104);

        System.out.println("After Insertion");

        playlist.display(head);
    }
}