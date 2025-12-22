import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{

    private  CountDownLatch latch;
    private  int id;
    public Worker(CountDownLatch latch, int id)
    {
        this.latch=latch;
        this.id=id;

    }
    @Override
    public void run() {

        try {
            System.out.println("Worker "+ id +"start");
            Thread.sleep(100);
            System.out.println("Worker completed");

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            latch.countDown(); // signal completion
        }
    }
}
