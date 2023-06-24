import java.util.Collections;
import java.util.LinkedList;

public class HomeWork1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        System.out.println(integerLinkedList);
        Collections.reverse(integerLinkedList);
        System.out.println(integerLinkedList);
        for (int i = 0; i < integerLinkedList.size() + 3; i++) {
            System.out.print(integerLinkedList.pop());
        }


    }
}
