import org.w3c.dom.ls.LSOutput;

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
        System.out.println(stack.isEmpty());
        MyLinkedListStack <Integer> stackL = new MyLinkedListStack<>();
        stackL.push(1);
        stackL.push(3);
        stackL.push(2);
        stackL.push(9);
        System.out.println("peek of linked list " + stackL.peek() + " the size " + stackL.size());
        stackL.pop();
        System.out.println("peek after pop " + stackL.peek() +" the size " + stackL.size() );
        stackL.isEmpty();
    }

    }
