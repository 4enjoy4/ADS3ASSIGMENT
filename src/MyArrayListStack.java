import java.util.EmptyStackException;
public class MyArrayListStack<T> extends MyArrayLIst {
    private MyArrayLIst<T> arr;
    public MyArrayListStack(){
        arr = new MyArrayLIst<>();
    }
    public void push(T item){
        arr.addFirst(item);
    }
    public T pop(){
        T element = peek(); // get the element at the top of the stack
        removeFirst(); // remove the element at the top of the stack
        return element; // return the element that was removed
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
