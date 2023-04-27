import java.util.EmptyStackException;
public class MyLinkedListStack <E> extends MyLinkedList{
    private MyLinkedList<E> list;
    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }
    public void push(E item){
        list.addFirst(item);
    }
    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
