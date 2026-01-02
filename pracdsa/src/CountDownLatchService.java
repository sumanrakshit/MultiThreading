import java.util.concurrent.CountDownLatch;

public class CountDownLatchService implements Runnable{
    private CountDownLatch countDownLatch;
    public CountDownLatchService(CountDownLatch countDownLatch)
    {

        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {
        try
        {
            System.out.println(Thread.currentThread().getName() +"starting...");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "started");

        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            countDownLatch.countDown();
        }

    }
}
