import java.util.NoSuchElementException;

public class MyArrayLIstQueue<T> extends MyArrayLIst {
    public MyArrayLIstQueue(){
        super();
    }
    public int sizeQueue(){
        return super.size();
    }
    public boolean isEmptyQueue(){
        return super.isEmpty();
    }
    public void enqueue(T item){
        super.add(item);
    }
    public T dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return (T) super.removeFirst();
    }
    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else{
           return (T) super.getLast();
        }
    }

}
