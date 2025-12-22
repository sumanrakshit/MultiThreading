import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class CallableMain {



    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {


        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<String> future=executorService.submit(new MyCallable());
        try
        {
            System.out.println("do something");
             Thread.sleep(1000);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        String res=future.get();
        System.out.println("Received "+ res);
        executorService.shutdown();






        //Exception handle
        Future<Integer> future1 = executorService.submit(() -> {
            throw new IOException("File error");
        });

        try {
            future.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause(); // IOException
        }


    }

}
