public class insert_b {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add_ele(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            tail = new_node;

        } else {
            tail.next = new_node;
            tail = new_node;

        }
    }

    public void insert_begin(int data) {
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
            tail = new_Node;
        } else {
            Node temp = head;
            head = new_Node;
            head.next = temp;
        }
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        insert_b inbll = new insert_b();

        inbll.add_ele(10);
        inbll.add_ele(20);
        inbll.add_ele(30);
        inbll.add_ele(40);
        inbll.add_ele(50);

        inbll.insert_begin(100);
        inbll.insert_begin(200);
        inbll.insert_begin(300);

        inbll.display();
    }

}
