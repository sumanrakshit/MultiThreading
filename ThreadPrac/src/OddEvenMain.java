public class OddEvenMain {
    public static void main(String[] args) {
        Runnable even=()->
        {
            try
            {
                for(int i=1;i<10;i++)
                {
                    synchronized (Object.class)
                    {
                        if(i%2==0)
                        {
                            System.out.println(Thread.currentThread().getName() +"- "+ i);
                        }

                    }
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        };
        Runnable odd=()->
        {
            try
            {
                for(int i=1;i<10;i++)
                {
                    synchronized (Object.class)
                    {
                        if(i%2!=0)
                        {
                            System.out.println(Thread.currentThread().getName() +"- "+ i);
                        }

                    }
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        };

        Thread the=new Thread(even);
        Thread tho=new Thread(odd);
        the.start();
        tho.start();
    }
}
