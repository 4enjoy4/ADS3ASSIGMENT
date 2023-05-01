import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        MyArrayListStack <Integer> stack = new MyArrayListStack<>();
        System.out.println("Array list stack: ");
        stack.push(1);
        stack.push(2);
        stack.push(2323);
        stack.push(3);
        System.out.println("peek " + stack.peek() + ", the size " + stack.size());
        stack.pop();
        System.out.println("peek after pop " + stack.peek() +", the size " + stack.size() );
        System.out.println(stack.isEmpty());
        MyLinkedListStack <Integer> stackL = new MyLinkedListStack<>();
        System.out.println("Linked list stack: ");
        stackL.push(1);
        stackL.push(3);
        stackL.push(2);
        stackL.push(9);
        System.out.println("peek of linked list " + stackL.peek() + ", the size " + stackL.size());
        stackL.pop();
        System.out.println("peek after pop " + stackL.peek() +", the size " + stackL.size() );
        System.out.println(stackL.isEmpty());

        MyArrayLIstQueue<Integer> queue = new MyArrayLIstQueue<>();
        System.out.println("Array list queue");
        queue.enqueue(1);
        queue.enqueue(24);
        queue.enqueue(34);
        queue.enqueue(4);
        queue.enqueue(67);
        System.out.println(queue.sizeQueue());
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.sizeQueue());

        MyLinkedListQueue<Integer> q = new MyLinkedListQueue<>();
        System.out.println("Linked list queue: ");
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(25);
        q.enqueue(30);
        System.out.println(q.sizequeue());
        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
        q.enqueue(40);
        System.out.println(q.sizequeue());
    }

    }
