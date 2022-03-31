public class search {

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

    public void search(int in) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.val == in) {
                System.out.print(count);
            }
            count++;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        search s = new search();

        s.add_ele(10);
        s.add_ele(20);
        s.add_ele(30);
        s.add_ele(40);
        s.add_ele(50);

        s.search(40);
    }

}
