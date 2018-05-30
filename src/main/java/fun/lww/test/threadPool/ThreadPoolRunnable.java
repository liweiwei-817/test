package fun.lww.test.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Create by liweiwei on 18/5/30
 * 线程池测试 执行Runnable任务
 */
public class ThreadPoolRunnable {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i=0; i<5; i++) {
            executorService.execute(new TestRunnable());
        }

        executorService.shutdown();
    }


    static class TestRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "线程被调用");
        }
    }

}
