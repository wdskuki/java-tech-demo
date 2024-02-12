import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        System.out.println("HashSet");
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("hello");
        hashSet.add("hello");
        hashSet.add("你好");
        hashSet.add("hola");
        for(String i : hashSet) {
            System.out.println(i);
        }

        System.out.println("LinkedHashSet");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("hello");
        linkedHashSet.add("hello");
        linkedHashSet.add("你好");
        linkedHashSet.add("hola");
        for(String i : linkedHashSet) {
            System.out.println(i);
        }

        System.out.println("TreeSet");

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("hello");
        treeSet.add("hello");
        treeSet.add("你好");
        treeSet.add("hola");
        for(String i : treeSet) {
            System.out.println(i);
        }

    }
}
