public class insert_end {

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

    public void insert_at_end(int data) {
        Node new_Node = new Node(data);

        if (head == null) {
            head = new_Node;
            tail = new_Node;
        } else {
            tail.next = new_Node;
            tail = new_Node;
        }
    }

    public void display() {
        if (head == null) {
            System.out.print("List is empty");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        insert_end end = new insert_end();

        end.insert_at_end(10);
        end.insert_at_end(20);
        end.insert_at_end(30);
        end.insert_at_end(40);
        end.insert_at_end(50);

        end.display();
    }

}
