public class nth_from_end {
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

    public void nth_end(int n) {
        int len = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        if (len < n) {
            return;
        }
        curr = head;
        for (int i = 1; i < len - n + 1; i++) {
            curr = curr.next;
        }
        System.out.print(curr.data);
    }

    public void add_ele_end(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public static void main(String[] args) {

        nth_from_end en = new nth_from_end();
        en.add_ele_end(10);
        en.add_ele_end(20);
        en.add_ele_end(30);
        en.add_ele_end(40);
        en.add_ele_end(50);

        en.nth_end(2);

    }

}
