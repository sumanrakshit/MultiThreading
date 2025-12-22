import java.util.concurrent.Callable;

public class MainThread {
    public static void main(String[] args) {

//        Runnable represents the task, Thread represents the worker.


        Thread th=new Thread(new MyThreadRun());
        th.start();

        Runnable a=()->
        {
            try
            {
                for(int i=1;i<5;i++) {
                    System.out.println(Thread.currentThread().getName() + "-" +i);

                }
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }

        };
        Thread tha=new Thread( a);
        tha.start();


       Thread theadA=new Thread(()->
       {
           for(int i=6;i<9;i++)
           {
               try
               {
                   System.out.println("Thared a"+ Thread.currentThread().getName()+ "-"+ i);
               }
               catch (Exception ex)
               {
                   System.out.println(ex.getMessage());
               }
           }
       });

 theadA.start();



Thread th1=new Thread(a);
 Thread th2=new  Thread(a);
 th1.start();
 th1.start();


    }
}
