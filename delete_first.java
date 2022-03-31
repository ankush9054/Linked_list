public class delete_first {

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

    public void add_node(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void delete_f() {
        if (head == null) {
            System.out.print("the list is empty");
            return;
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }

    public void display() {
        Node curr = head;
        if (head == null) {
            System.out.print("The lsit is empty");
        }

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        delete_first delete_list = new delete_first();

        delete_list.add_node(10);
        delete_list.add_node(20);
        delete_list.add_node(30);
        delete_list.add_node(40);
        delete_list.add_node(50);
        delete_list.display();

        delete_list.delete_f();
        delete_list.delete_f();

        delete_list.display();

    }

}
