public class delete_lase {

    class Node {
        int data;
        Node next = null;

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

    public void remove_l() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        } else {
            if (head != tail) {
                Node curr = head;

                while (curr.next != tail) {
                    curr = curr.next;
                }
                tail = curr;
                tail.next = null;
            } else {
                head = tail = null; // if list contain only one element
            }
        }
    }

    public void diplay() {
        Node curr = head;
        if (head == null) {
            System.out.print("The list is empty");
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        delete_lase last = new delete_lase();

        last.add_ele(10);
        last.add_ele(20);
        last.add_ele(30);
        last.add_ele(40);
        last.add_ele(50);

        last.diplay();

        last.remove_l();
        last.remove_l();
        last.diplay();
    }

}
