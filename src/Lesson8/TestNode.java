package Lesson8;

public class TestNode {
    public static void main(String[] args) {
        Node s = new Node(10);
        Node n1 = new Node(20);
        s.next = n1;
        n1.previous = s;

        System.out.println(s); //10
        System.out.println(s.next); //20
        System.out.println(n1.previous); //10

        Node n0 = new Node(15);
        n0.next = n1;
        n0.previous = s;
        s.next = n0;
        n1.previous = n0;
        System.out.println(s.next.next);//20
        System.out.println(s.next.previous);

        // Access Nodes one by one
        Node current = s;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        int sum = 0;
        for(Node current1 = s; current1 != null; current1 = current1.next) {
            sum += current1.value;

        }

    }
}
