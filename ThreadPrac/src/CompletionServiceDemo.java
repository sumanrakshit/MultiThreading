import java.util.concurrent.*;

public class CompletionServiceDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        CompletionService<Integer> cs= new ExecutorCompletionService<>(executorService);
        cs.submit(()->10);
        cs.submit(()->20);
        cs.submit(()->100);

        int sum=0;
        for(int i=0;i<3;i++)
        {
            sum +=cs.take().get();
        }

        System.out.println("Result sum "+ sum);
    }
}
