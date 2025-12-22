public class DeadLockDemo {

    private  static Object lock1=new Object();
    private  static  Object lock2=new Object();
    public static void main(String[] args) {

        Thread th=new Thread(()->
        {
            synchronized (lock1)
            {
                System.out.println("Thread 1 acquire lock1");
                try
                {
                    Thread.sleep(100);

                }
                catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
                synchronized (lock2)
                {
                    System.out.println("Thread 1 accquire lock2");
                }
            }
        });
        Thread th1=new Thread(()->
        {
            synchronized (lock2)
            {
                System.out.println("Thread 2 acquire lock2");
                try
                {
                    Thread.sleep(100);
                }
                catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
                synchronized (lock1)
                {
                    System.out.println("Thread 1 accquire lock1");
                }
            }
        });

        th.start();
        th1.start();
    }
}
