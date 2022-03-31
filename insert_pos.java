public class insert_pos {

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

    public void add_element(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void in_pos(int pos, int data) {

        Node new_node = new Node(data);

        if (pos < 1) {
            System.out.print("Position must be greater than  1");
        } else if (pos == 1) {
            new_node.next = head;
            head = new_node;
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                new_node.next = temp.next;
                temp.next = new_node;
            } else {
                System.out.print("Previous node is null");
            }
        }
    }

    public void display() {
        Node curr = head;
        if (head == null) {
            System.out.print("the list if empty");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert_pos position = new insert_pos();
        position.add_element(10);
        position.add_element(20);
        position.add_element(30);
        position.add_element(40);
        position.add_element(50);
        position.display();

        position.in_pos(4, 100);

        position.display();
    }

}
