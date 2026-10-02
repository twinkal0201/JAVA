import org.w3c.dom.Node;

public class NthNodeFromEnd {
    static Node nthFromEnd(Node head, int n) {

    Node first = head;
    Node second = head;

    for (int i = 0; i < n; i++) {
        if (first == null) {
            return null;
        }

        first = first.next;
    }

    while (first != null) {

        first = first.next;
        second = second.next;
    }

    return second;
}
}
