public class MyArrayLIstQueue<T> extends MyArrayLIst {
    private MyArrayLIst<T> arr;
    public MyArrayLIstQueue(){
        arr = new MyArrayLIst<>();
    }
    public void enqueue(T item){
        arr.add(item);
    }
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        else{
            return arr.removeLast();
        }
    }
    public T peek(){

    }

}
