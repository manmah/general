package collections;

import java.util.*;

public class ColectionsTypes {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("hi1");   arrayList.add("hi2");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hi1");  linkedList.add("hi2");

        Set<String> set = new HashSet<>();
        set.add("hi1");   set.add("hi2");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("hi1");   treeSet.add("hi2");

        Map<String, String> map = new HashMap<>();
        map.put("key1" , "value1"); map.put("key2" , "value2");

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("key1" , "value1"); treeMap.put("key2" , "value2");

        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("key1" , "value1");




    }
}
