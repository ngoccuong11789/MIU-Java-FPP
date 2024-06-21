package Lesson9.StackQueue.Learning;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackAndQueueLearning {
    public static void main(String[] args) {
//        Stack<String> digitString = new Stack<String>();
//        System.out.println("Input a new String");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        while (x>0) {
//            int digit = x % 2;
//            System.out.println("digit : " + digit);
//            digitString.push(digit + "");
//            x = x / 2;
//            System.out.println("x : " + x);
//        }
//        System.out.println("Values : ");
//        int n = digitString.size();
//        for(int i = 0; i < n ; i++) {
//            System.out.print(digitString.pop());
//        }

//        Stack<Integer> stack = new Stack<>();
//
//        // Thêm phần tử vào ngăn xếp
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        // Hiển thị phần tử đầu tiên
//        System.out.println("Top element: " + stack.peek());
//
//        // Lấy phần tử ra khỏi ngăn xếp
//        System.out.println("Popped element: " + stack.pop());
//
//        // Kiểm tra ngăn xếp
//        System.out.println("Is stack empty? " + stack.isEmpty());

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        // Hiển thị phần tử đầu tiên
        System.out.println("Front element: " + queue.peek());

        // Lấy phần tử ra khỏi hàng đợi
        System.out.println("Polled element: " + queue.poll());

        // Kiểm tra hàng đợi
        System.out.println("Is queue empty? " + queue.isEmpty());


    }
}
