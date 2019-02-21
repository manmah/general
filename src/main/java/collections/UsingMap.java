package collections;

import java.util.*;

public class UsingMap {
    public static void main(String[] args) {

        Map<String , String> map = new HashMap<>();
        map.put("444", "abc");  map.put("222", "ggg");  map.put("333", "ggg");
 //       map.replaceAll((m,n) -> n.toUpperCase());
        map.putIfAbsent("111" , ("ddd"));
        System.out.println(map);
        map.replace("222" , "ggg" , "GGG");


        map.values().removeIf(m -> m.equals("ggg"));
        System.out.println(map);
        for(Map.Entry<String, String> s : map.entrySet()){
            System.out.println(s.getKey() + s.getValue());
        }
        map.forEach((m,n) -> System.out.println(m + " : " + n));


        /** Sort depending on the Key value */
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("key2" , "value1");sortedMap.put("key1" , "value2");
        sortedMap.forEach((m,n) -> System.out.println(m + " : " + n));





    }
}
