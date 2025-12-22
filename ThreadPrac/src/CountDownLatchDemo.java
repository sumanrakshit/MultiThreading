import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {


    public static void main(String[] args) throws InterruptedException {
        int workers=3;
        CountDownLatch latch=new CountDownLatch(workers);
        for(int i=0;i<workers;i++)
        {
            new Thread(new Worker(latch,i)).start();
        }
        System.out.println(Thread.currentThread().getName());
        latch.await();
        System.out.println(Thread.currentThread().getName());
        System.out.println("All workers finished. Main thread continues.");
        System.out.println(Thread.currentThread().getName());

    }
}
