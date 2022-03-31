public class sum_node {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
  
    public void add_ele(int val) { 
        Node new_node = new Node(val);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void sum(){
        Node curr = head;
        int sum = 0;    
        while(curr!=null){
            sum +=curr.val;
            curr = curr.next;            
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {

        sum_node s = new sum_node();

        s.add_ele(10);
        s.add_ele(20);
        s.add_ele(30);
        s.add_ele(40);
        s.add_ele(50);

        s.sum();

    }

}
