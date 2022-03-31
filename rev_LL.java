public class rev_LL {
    public Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void add_ele(int new_data) {
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

    public void rev() {

        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
        return;
    }

    public void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {

        rev_LL r = new rev_LL();
        r.add_ele(10);
        r.add_ele(20);
        r.add_ele(30);
        r.add_ele(40);
        r.add_ele(50);

        r.display();
        r.rev();
        r.display();

    }

}
