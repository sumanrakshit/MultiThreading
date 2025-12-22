import java.util.concurrent.*;

public class CompletableFutureMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        Future<String > future=executorService.submit(new MyCallable());
        String res=future.get();
        System.out.println("received  "+ res);
        executorService.shutdown();


        CompletableFuture<Integer> cf=CompletableFuture.supplyAsync(()->10).thenApply(result->result*10).thenApply(result->result+20);
        cf.thenAccept(System.out::println);

        CompletableFuture.supplyAsync(()->
        {
            throw new RuntimeException("Error");
        }).exceptionally(ex->
        {
            System.out.println(ex.getCause());
            return 0;
        });

        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> combined =
                f1.thenCombine(f2, Integer::sum);

        combined.thenAccept(System.out::println);
    }
}
