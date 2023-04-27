public class MyArrayListStack<T> extends MyArrayLIst {
    private MyArrayLIst<T> arr;
    public MyArrayListStack(){
        arr = new MyArrayLIst<>();
    }
    public void push(T item){
        arr.addFirst(item);
    }
}
