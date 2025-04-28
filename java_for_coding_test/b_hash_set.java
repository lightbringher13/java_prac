package java_for_coding_test;
import java.util.HashSet;

class HashSetPrac {
    public static void main(String args[]) {
        HashSet<Integer> set  = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);                    
        set.add(3);
        System.out.println(set);  

        set.remove(2);

        if (set.contains(3)){
            System.out.println("3 in nums");
        }

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);set1.add(2); set1.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2); set2.add(3); set2.add(4);  

        set1.retainAll(set2);                 // set1에 교집합만 남김
        System.out.println(set1);             

        set1.addAll(set2);                    // set1 = set1 ∪ set2
        System.out.println(set1);  

    }
}