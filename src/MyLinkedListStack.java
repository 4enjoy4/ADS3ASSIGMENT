import java.util.EmptyStackException;
public class MyLinkedListStack <E> extends MyLinkedList{
    private MyLinkedList<E> list;
    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }
}
