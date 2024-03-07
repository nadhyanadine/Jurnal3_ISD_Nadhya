public class linklist {
    private Node head;

    public linklist() {
        this.head = null;
    }

    public void addFirst(Book data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addLast(Book data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteFirst() {
        if (this.head == null) {
            System.out.println("List is empty");
            return;
        }
        this.head = this.head.next;
    }

    public void deleteLast() {
        if (this.head == null) {
            System.out.println("List is empty");
            return;
        }
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        Node current = this.head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void printList() {
        Node current = this.head;
        while (current != null) {
            current.data.display();
            current = current.next;
    }
    }
}