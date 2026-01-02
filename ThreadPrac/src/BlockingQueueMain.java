public class BlockingQueueMain {
    public static void main(String[] args) {
        BlockingQueuePC pc = new BlockingQueuePC();

        Thread producer=new Thread(()->
        {
            try {
                for (int i = 0; i < 7; i++) {
                    pc.produce();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 7; i++) {
                    pc.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
