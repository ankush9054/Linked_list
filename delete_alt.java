public class delete_alt {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void append1(int new_data) {
        Node new_Node = new Node(new_data);

        if (head == null) {
            head = new_Node;
            return;
        }
        new_Node.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_Node;
        return;
    }

    public void printlist() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void delete() {
        if (head == null || head.next == null) {
            System.out.print(head);
        }
        Node curr = head;
        while (curr != null && curr.next != null) {
            curr.next = curr.next.next;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        delete_alt d = new delete_alt();
        d.append1(10);
        d.append1(100);
        d.append1(104);
        d.append1(102);
        d.append1(101);
        d.append1(109);
        d.printlist();
        d.delete();
        System.out.println();
        d.printlist();

    }

}
