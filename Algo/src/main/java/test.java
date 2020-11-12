import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();

// empile deux éléments
        deque.push("élément 1");
        deque.push("élément 2");

// lit le premier élément de la file sans l'enlever
        System.out.println(deque.peekFirst()); // élément 2
    }
}
