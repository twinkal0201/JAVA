
public class DetectAndBreakCycle {
    static void removeCycle(Node head) {

    Node slow = head;
    Node fast = head;

    // Detect cycle
    while (fast != null && fast.next != null) {

        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            break;
        }
    }

    // No cycle
    if (fast == null || fast.next == null) {
        return;
    }

    // Find beginning of cycle
    slow = head;

    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }

    // Find last node of cycle
    Node temp = slow;

    while (temp.next != slow) {
        temp = temp.next;
    }

    temp.next = null;
}
}
