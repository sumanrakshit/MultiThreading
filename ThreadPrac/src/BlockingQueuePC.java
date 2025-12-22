import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueuePC {

    BlockingQueue<Integer>queue=new ArrayBlockingQueue<>(5);

    public void produce() throws InterruptedException {
        int item = (int) (Math.random() * 100);
        queue.put(item);  // blocks if queue is full
        System.out.println("Produced: " + item);
    }

    public void consume() throws InterruptedException {
        int item = queue.take();  // blocks if queue is empty
        System.out.println("Consumed: " + item);
    }
}
