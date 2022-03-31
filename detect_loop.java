public class detect_loop {

    public Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void add_ele(int new_data) {
        Node new_Node = new Node(new_data);

        if (head == null) {
            head = new_Node;
            return;
        }
        new_Node.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_Node;
        return;
    }

    public void loop(){
        
    }
    
}
