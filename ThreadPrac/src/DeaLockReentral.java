import java.util.concurrent.locks.ReentrantLock;

public class DeaLockReentral {
    private static ReentrantLock lock1=new ReentrantLock();
    private static ReentrantLock lock2=new ReentrantLock();

    public static void main(String[] args) {

        Runnable rb=()->
        {
            try
            {
                if(lock1.tryLock())
                {
                    try
                    {
                        if(lock2.tryLock())
                        {
                            try {
                                System.out.println("work done");
                            }finally {
                                lock2.unlock();
                            }
                        }
                    }finally {
                        lock1.unlock();
                    }
                }
            }
            catch (Exception ex)
            {

            }
        };


        new Thread(rb).start();
        new Thread(rb).start();

    }
}
