package java_for_coding_test;

import java.util.*;

class PriorityQueuePrac {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq  = new PriorityQueue<>((a,b) -> b -a );
        pq.add(5);
        pq.add(1);
        pq.add(3);
        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        maxPq.add(5);
        maxPq.add(1);
        maxPq.add(3);
        
        while (!maxPq.isEmpty()) {
            System.out.println(maxPq.poll());
        }
    }
}