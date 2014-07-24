public class _Node {
    public static void main(String[] args) {
        Node tail = val(1,2);
        System.out.println(toString(tail));
        //System.out.println(toString(addLast.addlast(tail, 1)));
       // System.out.println(toString(addLast.addLastRec(tail, 2)));
        //System.out.println(toString(addInPosition.addInPosition(tail, 2, 9)));
        System.out.println(toString(remove.removeFirst(tail)));
        System.out.println(toString(remove.removeLast(tail)));

    }

    private static String toString(Node tail) {
        return tail == null? "*": tail.value + "->" + toString(tail.next);
    }

    public static Node val(int... values){
       return values.length == 0? null: new Node(values[0], val(Arrays.copyOfRange(values, 1, values.length)));
    }
}
