import java.util.Stack;
import java.util.Vector;

public class MyVectorAndStack {
    public static void main(String[] args) {
        System.out.println("Vector");
        Vector<String> vector = new Vector<String>();
        vector.add("hello");
        vector.add("hola");
        vector.add("你好");
        for(String i : vector) {
            System.out.println(i);
        }


        System.out.println("Stack");
        Stack<String> stack = new Stack<String>();

        stack.push("hello");
        stack.push("hola");
        stack.push("你好");
        for(String i : stack) {
            System.out.println(i);
        }
    }
}
