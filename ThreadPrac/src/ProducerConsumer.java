import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private int mx_size=5;
    Queue<Integer> message=new LinkedList<>();

    public  synchronized void producesData()
    {

            try
            {
                while(message.size()==mx_size)
                {
                    System.out.println("Queue fulll ");
                    wait();
                }
                int item=(int) (Math.random()*100);
                System.out.println("Prodecued "+ item);
                message.offer(item);
                notifyAll();
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }




    }
    
    public  synchronized void consumerdata()
    {

            try
            {
                while(message.isEmpty())
                {
                    System.out.println("Message Queue empty");
                    wait();
                }
                int item=message.poll();
                System.out.println("Consume item "+ item);
                notifyAll();

            }catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }



    }
}
