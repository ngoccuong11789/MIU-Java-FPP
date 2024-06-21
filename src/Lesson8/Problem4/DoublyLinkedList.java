package Lesson8.Problem4;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
    }


    public void addLast(String item){
        Node n = new Node();
        n.value = item;
        if(header.next == null) {
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

    // 2. Remove by passing object
    //boolean remove(String s)
//    This method takes the String s and check if the linked list contains s then remove the element and return true.
//    If the element is not in the list return false.
    public boolean remove(String item){

        //Implement
        Node current = header.next;
        while (current.next != null) {
            if(current.value.equals(item)) {
                if(current.next != null) {
                    current.next.previous = current.previous;
                }
                if(current.previous != null) {
                    current.previous.next = current.next;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

//
//    // 3. Remove the First Node
//
//    public boolean removeFirst() {
//        // Implement
//    }
public boolean removeFirst() {
    if (header.next == null) {
        return false; // Danh sách rỗng, không có gì để xóa
    }

    Node firstNode = header.next; // Nút đầu tiên (nút sau header)
    Node secondNode = firstNode.next; // Nút thứ hai (nút sau nút đầu tiên)

    if (secondNode != null) {
        secondNode.previous = header; // Liên kết nút thứ hai với header
    }

    header.next = secondNode; // Liên kết header với nút thứ hai

    firstNode.next = null; // Xóa liên kết của nút đầu tiên
    firstNode.previous = null; // Xóa liên kết của nút đầu tiên

    return true; // Đã xóa thành công
}

    //
//
//    // 4. Prints the list from last to first
//    public void printReverse() {
//
//        // Implement
//    }

    public void printReverse() {
        StringBuilder sb = new StringBuilder("[ ");
        Node current = header;
        // Di chuyển đến phần tử cuối cùng
        while (current.next != null) {
            current = current.next;
        }
        // Bắt đầu từ phần tử cuối cùng và di chuyển ngược lại đầu danh sách
        while (current != header) {
            sb.append(current.value);
            if (current.previous != header) {
                sb.append(" ");
            }
            current = current.previous;
        }
        sb.append(" ]");
        System.out.println(sb.toString());
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();

//        List<String> a = new ArrayList<>();
        //List<int> a = new ArrayList<>();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("Before adding " + list);
        list.addLast("Tom");
        list.addLast("Carol");
        System.out.println("List after adding 'Tom' and 'Carol': " + list);
        // Call all your implemented Methods
        //remove element
        list.remove("Tom");
        System.out.println("List after remove 'Tom'" + list);
        list.printReverse();
    }
}
