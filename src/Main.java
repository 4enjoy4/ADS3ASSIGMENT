public class Main {
    public static void main(String[] args) {
        MyArrayListStack <Integer> stack = new MyArrayListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(2323);
        stack.push(3);
        System.out.println("peek " + stack.peek() + " the size" + stack.size());
        stack.pop();
        System.out.println("peek after pop " + stack.peek() +" the size " + stack.size() );
        }

    }
