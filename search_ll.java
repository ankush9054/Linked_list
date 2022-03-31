public class search_ll {

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

    // add node function

    public void addNode(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void searchNode(int data) {
        Node curr = head;
        boolean flag = false;
        int i = 1;

        if (head == null) {
            System.out.print("List is empty");
        } else {
            while (curr != null) {
                if (curr.data == data) {
                    flag = true;
                    break;
                }
                i++;
                curr = curr.next;
            }
        }
        if (flag == true) {
            System.out.print("Element is present at the postion: " + i + "\n");
        } else {
            System.out.print("Element is not present in the list");
        }

    }

    public static void main(String[] args) {
        search_ll slist = new search_ll();

        slist.addNode(10);
        slist.addNode(20);
        slist.addNode(30);
        slist.addNode(40);
        slist.addNode(50);

        slist.searchNode(40);
        slist.searchNode(20);
    }

}
