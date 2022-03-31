public class in1 {
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

    public void insert_at_beggining(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            new_node.next = head;
            head = new_node;
            tail = head.next;

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

        in1 begin = new in1();
        begin.insert_at_beggining(10);
        begin.insert_at_beggining(20);
        begin.insert_at_beggining(30);
        begin.insert_at_beggining(40);

        begin.display();

    }

}
