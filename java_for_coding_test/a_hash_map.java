package java_for_coding_test;

import java.util.HashMap;

class HashMapPractice {
    public static void main(String args[]){

        //declaration
        HashMap<String,Integer> map = new HashMap<>();

        //insert
        map.put("apple",2);
        map.put("banana",3);
        map.put("tomato",2);
        System.out.println(map);

        //get
        int appleValue = map.get("apple");
        System.out.println(appleValue);

        //check if contains key
        //check if contains value containsValue
        if (map.containsKey("apple")) {
            System.out.println("yes apple");
        }

        // enhanced for loop
        // keySet(),values()
        for (String key : map.keySet()){
            System.out.println(map.get(key));
        }

        //entrySet()
        for (HashMap.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        //remove using key
        map.remove("apple");

        // size
        int size = map.size();
        System.out.println(size);

        // getOrDefault
        map.getOrDefault("cherry",0);
        System.out.println(map);
    }
}