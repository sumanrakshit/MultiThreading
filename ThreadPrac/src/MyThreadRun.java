public class MyThreadRun  implements Runnable{
    @Override
    public void run() {

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

    }
}
