import java.util.NoSuchElementException;
public class MyLinkedListQueue<E> extends MyLinkedList<E> {
    public MyLinkedListQueue() {
        super();
    }
    public boolean emptyqueue() {
        return isEmpty();
    }

    public int sizequeue() {
        return super.size();
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return getFirst();
    }

    public void enqueue(E element) {
        addLast(element);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return removeFirst();
    }
}

