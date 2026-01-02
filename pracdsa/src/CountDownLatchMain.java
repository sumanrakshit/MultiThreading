import java.util.concurrent.CountDownLatch;

public class CountDownLatchMain {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(3);

        new Thread(new CountDownLatchService(countDownLatch),"Db Service started").start();
        new Thread(new CountDownLatchService(countDownLatch),"cache Service started").start();
        new Thread(new CountDownLatchService(countDownLatch),"Auth Service started").start();
   countDownLatch.await();
        System.out.println("All thread up");

    }
}
