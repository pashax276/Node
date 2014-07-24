public class addLast {
    public static Node addlast(Node tail, int value) {
        if (tail == null) {
            return new Node(value, null);
        } else {
            return new Node(tail.value, addlast(tail.next, value));
        }
    }

    public static Node addLastRec(Node tail, int value) {
        return tail == null ? new Node(value, null) : new Node(tail.value, addLastRec(tail.next, value));
    }
}
