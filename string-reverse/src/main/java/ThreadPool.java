import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService threadPool = Executors.newFixedThreadPool(6);

        // Submit tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            final int taskId = i;
            threadPool.submit(() -> {
                System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(50);  // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutdown the thread pool
        threadPool.shutdown();
    }
}