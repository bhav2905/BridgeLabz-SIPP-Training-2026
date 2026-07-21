import java.util.Scanner;

public class UndoBuffer {

    private String[] data;
    private int top;

    public UndoBuffer(int capacity) {
        data = new String[capacity];
        top = -1;
    }

    public boolean push(String edit) {

        if (top == data.length - 1) {
            System.out.println("Undo Buffer Full");
            return false;
        }

        data[++top] = edit;
        return true;
    }

    public String pop() {

        if (isEmpty())
            throw new RuntimeException("Nothing to Undo");

        return data[top--];
    }

    public String peek() {

        if (isEmpty())
            throw new RuntimeException("Stack Empty");

        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        UndoBuffer undo = new UndoBuffer(5);

        undo.push("Typed Hello");
        undo.push("Typed World");
        undo.push("Deleted Line");

        System.out.println("Latest Edit : " + undo.peek());

        System.out.println("Undo : " + undo.pop());

        System.out.println("Latest Edit : " + undo.peek());
    }
}