public class in2 {

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
        if(head==null) return;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        in2 end = new in2();
        end.add_ele_end(10);
        end.add_ele_end(20);
        end.add_ele_end(30);
        end.add_ele_end(40);

        end.display();
    }

}
