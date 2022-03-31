public class add_last {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    public void append1(int new_data){
        Node new_Node = new Node(new_data);

        if(head==null){
            head=new_Node;
            return;
        }
        new_Node.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_Node;
        return;    
    }

    public void printlist(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        add_last llist = new add_last();
        llist.append1(6);
        llist.append1(60);
        llist.append1(600);
        llist.append1(688);
        llist.append1(67);

        llist.printlist();

    }

}
