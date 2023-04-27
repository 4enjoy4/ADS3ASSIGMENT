public class MyArrayListStack<T> extends MyArrayLIst {
    private MyArrayLIst<T> arr;
    public MyArrayListStack(){
        arr = new MyArrayLIst<>();
    }
    public void oush(T item){
        arr.addFirst(item);
    }
}
