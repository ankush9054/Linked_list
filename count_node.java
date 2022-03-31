public class count_node {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add_ele(int val) {
        Node new_node = new Node(val);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void count() {
        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
            
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        count_node c = new count_node();

        c.add_ele(10);
        c.add_ele(20);
        c.add_ele(30);
        c.add_ele(40);

        c.count();

    }

}
