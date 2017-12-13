
import java.util.*;
import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    private int id;
    public MyCallable(int id) {
        this.id = id;
    }
    public String call() {
        return String.valueOf(id);
    }
}
public class CallableFuture {
    public static void main(String[] args) {
        MyCallable mc = new MyCallable(1);
        FutureTask<String> task = new FutureTask<String>(mc);
        new Thread(task).start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
