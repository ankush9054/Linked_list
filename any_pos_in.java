public class any_pos_in {
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

    public void any_position(Node prev_node,int new_data){
        if(prev_node==null){
            System.out.print("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    public void display(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        any_pos_in any = new any_pos_in();
        any.add_ele_end(10);
        any.add_ele_end(20);
        any.add_ele_end(30);
        any.add_ele_end(40);

        any.any_position(any.head.next, 90);
        any.display();
        
    }

}
