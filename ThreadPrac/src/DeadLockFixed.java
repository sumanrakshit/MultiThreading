public class DeadLockFixed {
    private  static Object lock1=new Object();
    private  static  Object lock2=new Object();
    public static void main(String[] args) {

        Thread th=new Thread(()->
        {
            synchronized (lock1)
            {
                synchronized (lock2)
                {
                    System.out.println("Thread 1 accquire lock2");
                }
            }
        });
        Thread th1=new Thread(()->
        {
            synchronized (lock1)
            {

                synchronized (lock2)
                {
                    System.out.println("Thread 2 accquire lock1");
                }
            }
        });

        th.start();
        th1.start();

    }
}
