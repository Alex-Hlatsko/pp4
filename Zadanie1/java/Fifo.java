import java.util.PriorityQueue;

public class Fifo{
    public static void main(String[] args) {
        PriorityQueue<Integer> queueNumbers = new PriorityQueue<>();

        //Add some numbers
        queueNumbers.add(1);
        queueNumbers.add(2);
        queueNumbers.add(3);
        queueNumbers.add(4);
        queueNumbers.add(5);

        System.out.println("Our queue");
        for(int i : queueNumbers){
            System.err.println(i);
        }

        //Remove 2 numbers
        queueNumbers.remove(1);
        queueNumbers.remove(2);

        System.out.println("After removing");
        for(int i : queueNumbers){
            System.err.println(i);
        }

        //Add 2 numbers
        queueNumbers.offer(6);
        queueNumbers.offer(7);

        System.out.println("After adding");
        for(int i : queueNumbers){
            System.err.println(i);
        }
    }
}