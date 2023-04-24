public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> link = new MyLinkedList<>();
        MyArrayLIst<Integer> arr = new MyArrayLIst<>();
        arr.add(9);
        arr.add(213);
        arr.add(2);
        arr.add(3);
        for(int i = 0; i < 4; i++){
            System.out.println(arr.get(i));
        }
        System.out.println("After sort");
        arr.sort();
        for(int i = 0; i < 4; i++){
            System.out.println(arr.get(i));
        }

        }

    }
