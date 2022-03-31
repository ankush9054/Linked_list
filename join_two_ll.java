public class join_two_ll {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add_ele(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = null;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
        return;

    }

    public void print(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        join_two_ll j = new join_two_ll();
        j.add_ele(54);
        j.add_ele(85);
        j.add_ele(12);
        j.add_ele(90);
        j.add_ele(43);

        j.print();
    }

}
