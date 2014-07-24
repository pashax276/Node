
public class Remove {
    public static Node removeFirst(Node tail) {
        if (tail != null) {
            return tail.next;
        } else {
            return new Node(tail.value, removeFirst(tail.next));
        }
    }

    public static Node removeLast(Node tail) {
        if (tail.next == null) {
            return tail.next;
        } else {
            return new Node(tail.value, removeFirst(tail.next));
        }
    }
}
