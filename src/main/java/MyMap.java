import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        System.out.println("LinkedHashMap");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("hello", "1");
        linkedHashMap.put("world", "2");
        linkedHashMap.put("hola", "3");

        System.out.println("LinkedHashMap");
        for(String i : linkedHashMap.keySet()) {
            System.out.println(i + ": " + linkedHashMap.get(i));
        }

        System.out.println("HashMap");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("hello", "1");
        hashMap.put("world", "2");
        hashMap.put("hola", "3");


        for(String i : hashMap.keySet()) {
            System.out.println(i + ": " + hashMap.get(i));
        }

        System.out.println("TreeMap");
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("hello", "1");
        treeMap.put("world", "2");
        treeMap.put("hola", "3");
        for(String i : treeMap.keySet()) {
            System.out.println(i + ": " + treeMap.get(i));
        }

    }
}
