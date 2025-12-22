import java.util.concurrent.Semaphore;

public class SemaporeDemo {
    private static final Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {


        Runnable worker=()->
        {
                try
                {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() +"  Acquire  permit");
                    Thread.sleep(1000);

                }
                catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
                finally {
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + " released");
                }

        };
        for(int i=1;i<8;i++)
        {
            new Thread(worker ,"Worker-" + i).start();
        }

    }
}
