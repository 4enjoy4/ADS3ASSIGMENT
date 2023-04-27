import java.util.EmptyStackException;
public class MyArrayListStack<T> extends MyArrayLIst {
    private MyArrayLIst<T> arr;
    public MyArrayListStack(){
        arr = new MyArrayLIst<>();
    }
    public void push(T item){
        arr.addFirst(item);
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
