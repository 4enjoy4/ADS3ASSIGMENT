import java.util.Comparator;
public class MyArrayLIst<T> implements MyList<T> {
    private T[] arr;
    private int size;
    private Comparator<T> comparator;
    public T[] Arr;
    MyArrayLIst(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public void IndexChecker(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T item) {
        if (size == arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
    }

    @Override
    public void add(T item, int index) {
        if (size == arr.length) {
            increaseBuffer();
        }
        arr[index] = (T) item;
        size++;
    }
    public void addFirst(T item){
        if(size == arr.length){ // Check if the array is full, and increase its size if necessary
            increaseBuffer();
        }
        for (int i = size; i > 0; i--) { // Shift all existing elements to the right
            arr[i] = arr[i-1];
        }
        arr[0] = item; // Insert the new element at the beginning of the array
        size++; // Increment the size of the ArrayList
    }

    @Override
    public void remove(T item) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (!arr[i].equals(item)) {
                arr[newIndex++] = arr[i];
            }
            size--;
        }
    }

    @Override
    public void remove(int index) {
        IndexChecker(index);
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public T get(int index) {
        IndexChecker(index);
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        int index1 = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                index1 = i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public void sort() {
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) arr[j]).compareTo(arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}
