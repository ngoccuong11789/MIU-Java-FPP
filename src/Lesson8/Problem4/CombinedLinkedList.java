package Lesson8.Problem4;

public class CombinedLinkedList {
    Node header;

    CombinedLinkedList() {
        header = new Node();
    }

    public void addFirst(String item) {
        Node n = new Node(item);
        if (header.next == null) {
            header.next = n;
            n.previous = header;
        } else {
            Node first = header.next;
            header.next = n;
            n.previous = header;
            n.next = first;
            first.previous = n;
        }
    }

    public void addLast(String item) {
        Node n = new Node(item);
        if (header.next == null) {
            header.next = n;
            n.previous = header;
        } else {
            Node current = header;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
            n.previous = current;
        }
    }

    public boolean deleteFirst() {
        if (header.next == null) {
            return false; // List is empty, nothing to delete
        }

        Node firstNode = header.next; // The first node (after the header)
        Node secondNode = firstNode.next; // The second node (after the first node)

        if (secondNode != null) {
            secondNode.previous = header; // Link the second node to the header
        }

        header.next = secondNode; // Link the header to the second node

        firstNode.next = null;
        firstNode.previous = null;

        return true;
    }

    public boolean deleteLast() {
        // if list is empty, return false
        if (header.next == null) {
            return false;
        }

        Node current = header;
        // traverse the list until current.next is null
        while (current.next != null) {
            current = current.next;
        }
        // now current.next == null, so current is the last node
        Node previous = current.previous;
        // previous is not null since current is not header
        previous.next = null;
        current.previous = null;

        return true;
    }

    public boolean delete(String item) {
        Node current = header.next;
        while (current != null) {
            if (current.value.equals(item)) {
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return header.next == null;
    }

    //determines whether the input string is in the list
    public boolean search(String s) {
        Node next = header.next;
        while(next != null && !next.value.equals(s)) {
            next = next.next;
        }
        //either next == null or next.value is s
        if(next == null) return false;
        else {//next.value.equals(s)
            return true;
        }
    }

    public int size() {
        int count = 0;
        Node current = header.next;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void printList() {
        Node current = header.next;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    class Node {
        String value;
        Node next;
        Node previous;

        Node() {
        }

        Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        CombinedLinkedList list = new CombinedLinkedList();
        list.printList(); // Empty list

        list.addFirst("Bob");
        list.addFirst("Harry");
        list.addFirst("Steve");
        list.printList(); // Steve Harry Bob

        list.addLast("Alice");
        list.printList(); // Steve Harry Bob Alice

        System.out.println("Deleted first: " + list.deleteFirst());
        list.printList(); // Harry Bob Alice

        System.out.println("Deleted last: " + list.deleteLast());
        list.printList(); // Harry Bob

        System.out.println("Deleted Bob: " + list.delete("Bob"));
        list.printList(); // Harry

        System.out.println("List is empty: " + list.isEmpty());

        System.out.println("Size of the list: " + list.size());

        //System.out.println("Found Harry: " + (list.find("Harry") != null));
    }
}
