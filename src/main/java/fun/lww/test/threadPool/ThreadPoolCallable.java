package fun.lww.test.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Create by liweiwei on 18/5/30
 * 线程池测试 执行Callable任务
 */
public class ThreadPoolCallable {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> list = new ArrayList<Future<String>>();

        //创建10个任务并执行
        for (int i=0; i<10; i++) {
            Future<String> future = executorService.submit(new TestCallable(i));
            list.add(future);
        }

        System.out.println("----------遍历执行结果----------");
        //遍历执行结果
        list.forEach(future -> {
            //Future返回如果没有完成，则一直循环等待，直到Future返回完成
            while (!future.isDone());
            try {
                //打印各个线程（任务）执行的结果
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                //启动一次顺序关闭，执行以前提交的任务，但不接受新任务
                executorService.shutdown();
            }
        });
    }

    static class TestCallable implements Callable<String> {

        private int id;

        public TestCallable(int id) {
            this.id = id;
        }

        /**
         * 任务的具体过程，一旦任务传给ExecutorService的submit方法，
         * 则该方法自动在一个线程上执行
         */
        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName() + " call() 方法被调用");
            Thread.sleep(10000);
            return "call()方法被自动调用，任务返回的结果是：" + id + "    " + Thread.currentThread().getName();
        }
    }
}
