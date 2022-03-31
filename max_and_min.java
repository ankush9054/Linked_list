public class max_and_min {

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

    public void min() {
        Node curr = head;
        int min;

        if (head == null) {
            System.out.print("list is empty");
        } else {
            min = head.val;

            while (curr != null) {
                if (min < curr.val) {
                    min = curr.val;
                }
                curr = curr.next;
            }
            System.out.print("minimum value in the node is " + min+"\n");
        }

    }

    public void max(){
        Node curr = head;
        int max;
        if(head==null){
            System.out.print("List is empty");
        }else{
            max = head.val;

            while(curr!=null){
                if(max>curr.val){
                    max = curr.val;
                }
                curr = curr.next;
            }
            System.out.print("maximum value in the node is "+ max+"\n");
        }
    }

    public static void main(String[] args) {

        max_and_min m = new max_and_min();

        m.add_ele(10);
        m.add_ele(678);
        m.add_ele(45);
        m.add_ele(23);
        m.add_ele(585);

        m.max();
        m.min();

    }

}
