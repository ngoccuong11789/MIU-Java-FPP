package Lesson9.StackQueue.Problem2;

public class SinglyLinkedListStack {
    private Node top;

    private class Node {
        Integer data;
        Node next;
        public Node(Integer data) {
            this.data = data;
        }
    }

    public SinglyLinkedListStack() {
        top = null;
    }

    public void push(Integer x) {
        if(x == null) return;
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    public Integer peek() {
        return (top == null) ? null : top.data;
    }

    public Integer pop() {
        Integer ret = peek();
        if(ret != null) {
            top = top.next;
        }
        return ret;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public String toString() {
        if (top == null) return "<empty>";
        StringBuilder sb = new StringBuilder();
        Node temp = top;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SinglyLinkedListStack st = new SinglyLinkedListStack();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println(String.format("Size = %d", st.size()));
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }

}
