public class sorted_insert {

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

    public void sort_in(int data) {
        Node new_node = new Node(data);
        if (head == null || head.data >= new_node.data) {
            new_node.next = head;
            head = new_node;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data <= new_node.data) {
            curr = curr.next;
        }
        new_node.next = curr.next;
        curr.next = new_node;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        sorted_insert si = new sorted_insert();
        si.add_ele(10);
        si.add_ele(20);
        si.add_ele(30);
        si.add_ele(40);
        si.add_ele(50);

        
        si.display();
        System.out.println();

        si.sort_in(100);
        si.display();
        System.out.println();
        si.sort_in(34);
        si.display();
    }

}
