public class nthnodefromend {

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

    public void nth(int n) {
        int len =0;
        Node curr=head;

        while(curr !=null){
            curr = curr.next;
            len++; 
        }

        if(len<n){
            return;
        }
        curr = head;

        for(int i=1;i<len-n+1;i++){
            curr = curr.next;
        }
        System.out.print(curr.data);
        
    }

    public static void main(String[] args) {

        nthnodefromend llist = new nthnodefromend();
        
        llist.add_ele(10);
        llist.add_ele(20);
        llist.add_ele(30);
        llist.add_ele(40);
        llist.add_ele(50);

        llist.nth(3);

    }

}
