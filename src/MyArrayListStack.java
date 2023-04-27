import java.util.EmptyStackException;
import java.util.NoSuchElementException;
public class MyArrayListStack<T> extends MyArrayLIst {
    private MyArrayLIst<T> arr;
    public MyArrayListStack(){
        arr = new MyArrayLIst<>();
    }
    public void push(T item){
        arr.addFirst(item);
    }
    public T pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return arr.removeFirst();
    }
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return arr.getFirst();
    }
    public int size(){
        return arr.size();
    }
    public boolean isEmpty(){
        return arr.isEmpty();
    }
}
