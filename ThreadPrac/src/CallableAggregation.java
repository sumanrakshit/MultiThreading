import java.util.List;
import java.util.concurrent.*;

public class CallableAggregation {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        List<Callable<Integer>> task=List.of(
                ()->10,
                ()->20,
                ()->80
        );

        List<Future<Integer>> futures=executorService.invokeAll(task);
        int sum=0;
        for(Future<Integer> ts:futures)
        {
            sum +=ts.get();
        }
        System.out.println("result  "+sum);

        executorService.shutdown();
    }
}
