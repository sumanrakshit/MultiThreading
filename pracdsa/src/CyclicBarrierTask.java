import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTask implements Runnable{

    private CyclicBarrier cyclicBarrier;
    public  CyclicBarrierTask(CyclicBarrier cyclicBarrier)
    {
        this.cyclicBarrier=cyclicBarrier;
    }
    @Override
    public void run() {

        try
        {
            System.out.println(Thread.currentThread().getName()+ " reached barrier");
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + " Passed barrier");

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
