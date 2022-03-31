public class print_middle {
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

    public void print_m(){
        if(head==null) return;
        Node slow = head, fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.data);
    }

    public static void main(String[] args) {
        print_middle m = new print_middle();

        m.add_ele(10);
        m.add_ele(20);
        m.add_ele(30);
        
        m.add_ele(40);
        m.add_ele(50);
        m.add_ele(60);

        m.print_m();
    }

}
