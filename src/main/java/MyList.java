import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("你好");
        arrayList.add("hola");

        for(String i : arrayList) {
            System.out.println(i);
        }
        System.out.println(arrayList.get(1));


        System.out.println("LinkedList");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("你好");
        linkedList.add("hola");
        for(String i : linkedList) {
            System.out.println(i);
        }
        System.out.println(linkedList.get(1));
    }
}
