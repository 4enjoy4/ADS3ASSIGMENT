import java.util.NoSuchElementException;
public class MyLinkedListQueue<E> extends MyLinkedList<E> {
    public MyLinkedListQueue() {
        super();
    }
    public boolean empty() {
        return size() == 0;
    }

    public int size() {
        return super.size();
    }

    public E peek() {
        if (empty()) {
            return null;
        }
        return getFirst();
    }

    public void enqueue(E element) {
        addLast(element);
    }

    public E dequeue() {
        if (empty()) {
            throw new NoSuchElementException();
        }
        return removeFirst();
    }
}

