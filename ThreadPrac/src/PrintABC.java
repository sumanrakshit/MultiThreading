public class PrintABC {

    private static Object lock=new Object();
    private static int state=0;
    private final static int max_loop=5;

    private static void print(String ch, int targetState)
    {
        for(int i=0;i<6;)
        {
            synchronized (lock)
            {
                if(state %3==targetState)
                {
                    try
                    {
                        System.out.println(ch);
                        Thread.sleep(500);

                        state++;
                        i++;
                        lock.notifyAll();

                    }
                    catch (Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }


                }

                else
                {
                    try {
                        lock.wait();

                    }catch (Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread tha=new Thread(()->print("A",0));
        Thread thb=new Thread(()->print("B",1));
        Thread thc=new Thread(()->print("C",2));
        tha.start();
        thb.start();
        thc.start();

    }
}
