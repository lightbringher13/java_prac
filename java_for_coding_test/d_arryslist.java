package java_for_coding_test;
import java.util.ArrayList;
class ArraysListPrac {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2,34); // index value
        System.out.println(list);

        list.remove(2);
        list.remove(Integer.valueOf(10)); // value
        
        list.add(10);
        list.add(10);
        //lambda expression
        list.removeIf(n->n==10); // using condition 
        list.add(34);
        System.out.println(list);
    }
}