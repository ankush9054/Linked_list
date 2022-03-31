public class kth_reverse {

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

    public void revk(int k) {
        Node prev = null;
        Node next = null;
        Node curr = head;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
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

    public void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        kth_reverse kr = new kth_reverse();
        kr.add_ele_end(10);
        kr.add_ele_end(20);
        kr.add_ele_end(30);
        kr.add_ele_end(40);
        kr.add_ele_end(50);
        kr.add_ele_end(60);
        kr.add_ele_end(70);

        kr.revk(3);
        kr.display();
    }

}
