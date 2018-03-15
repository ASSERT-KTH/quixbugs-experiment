package qfevotest.generator.multithread;

import java.util.concurrent.*;
class ThreadIdTest {

  public static void main(String[] args) {

    final int numThreads = 5;
    ExecutorService exec = Executors.newFixedThreadPool(numThreads);

    for (int i=0; i<10; i++) {
      exec.execute(new Runnable() {
        public void run() {
          long threadId = Thread.currentThread().getId();
          System.out.println("I am thread " + threadId + " of " + numThreads);
        }
      });
    }

    exec.shutdown();
  }
}