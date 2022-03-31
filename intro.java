public class intro {

    // represent Single Node

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // represent the head and tail of a link list

    public Node head = null;
    public Node tail = null;

    // add a new Node
    public void addNode(int data) {
        // create a new node
        Node new_Node = new Node(data);

        // check if the list is empty
        if (head == null) {
            // if list is empty both head and tail will point to the same new Node
            head = new_Node;
            tail = new_Node;
        } else {
            // new Node will be added to the tail
            tail.next = new_Node;
            // new node will be the tail of the list
            tail = new_Node;
        }
    }

    // Now display will diplay all the node in the list
    public void display() {
        // Node current will point to head
        Node curr = head;
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        System.out.print("Nodes of the single link list are :");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        intro llist = new intro();

        // add nodes to the list
        llist.addNode(10);
        llist.addNode(20);
        llist.addNode(30);
        llist.addNode(40);
        llist.addNode(50);

        // display the node

        llist.display();
    }

}
