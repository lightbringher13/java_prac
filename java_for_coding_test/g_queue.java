package java_for_coding_test;

import java.util.*;

class QueuePrac {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());   // 1 (맨 앞 확인)
        System.out.println(q.poll());   // 1 (꺼내고 제거)
        System.out.println(q.poll());   // 2
        System.out.println(q.isEmpty()); // false (아직 3 있음)
        System.out.println(q.poll());   // 3
        System.out.println(q.isEmpty()); // true (비었음)

    }
}