public class LinkListA {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head pointer
    Node head;
    Node tail;
    static int size;

    // add - First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // add - index
    public void add(int idx, int data) {
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // print LL
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // delete - first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // delete - last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondlastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlastNode = secondlastNode.next;
        }
        secondlastNode.next = null;
        size--;
    }

    //search element
    public int itrSearch(int key){
        int i = 0;
        Node temp = head;
        while (temp!= null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkListA list = new LinkListA();
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(2);
        // list.deleteLast();
        // list.deleteFirst();
        list.add(2, 10);

        list.printList();
        System.out.println(size);
        System.out.println(list.itrSearch(0));
    }
}