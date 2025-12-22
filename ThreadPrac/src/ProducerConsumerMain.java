public class ProducerConsumerMain {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer=new ProducerConsumer();

        Runnable producer=()->
        {
            try
            {
                for (int i=0;i<7;i++)
                {
                    producerConsumer.producesData();
                }

            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        };
        Runnable consumer=()->
        {
            try
            {
                for (int i=0;i<7;i++)
                {
                    producerConsumer.consumerdata();
                }

            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        };

        Thread thp=new Thread(producer);
        Thread thc=new Thread(consumer);
        thp.start();
        thc.start();
    }
}
