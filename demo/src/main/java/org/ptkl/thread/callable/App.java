package org.ptkl.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class App {
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

class MyCallable implements Callable<String> {
    private int id;
    public MyCallable(int id) {
        this.id = id;
    }
    public String call() {
        return String.valueOf(id);
    }
}