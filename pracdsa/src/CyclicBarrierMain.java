import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {
    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(3,
                () -> System.out.println("All threads reached barrier. Proceeding...")
        );

        new Thread(new CyclicBarrierTask(barrier), "Thread1").start();
        new Thread(new CyclicBarrierTask(barrier), "Thread2").start();
        new Thread(new CyclicBarrierTask(barrier), "Thread3").start();
    }
}
