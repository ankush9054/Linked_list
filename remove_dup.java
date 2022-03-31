public class remove_dup {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public void add_element(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void remove(){
        if(head==null) return;
        Node ptr1 = head;
        Node ptr2 = head.next;
        while(ptr2.next!=null){
            if(ptr2.data==ptr1.data){
                ptr1.next = ptr2.next;
                ptr2 = ptr2.next;
            }
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }

    }

    public void display() {
        if (head == null) {
            System.out.print("List is empty");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        remove_dup re = new remove_dup();
        re.add_element(10);
        re.add_element(20);
        re.add_element(30);
        re.add_element(30);
        re.add_element(40);
        re.add_element(50);
        re.display();
        System.out.println();
        re.remove();
        re.display();
    }
    
}
