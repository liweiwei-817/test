package fun.lww.test.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Create by liweiwei on 18/5/30
 * 线程池测试
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

        //创建线程池 方法一
        //newFixedThreadPool创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);

        //创建线程池 方法二
        //newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程
        ExecutorService executorService2 = Executors.newCachedThreadPool();

        //创建线程池 方法三
        //newScheduledThreadPool创建一个定长线程池，支持定时及周期性任务执行
        ScheduledExecutorService executorService3 = Executors.newScheduledThreadPool(5);

        //创建线程池 方法四
        //newSingleThreadExecutor创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
        //只会创建一个线程，当上一个执行完之后才会执行第二个
        ExecutorService executorService4 = Executors.newSingleThreadExecutor();

        for (int i=0; i<20; i++) {
            final int finalI = i;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "---" + finalI);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            //executorService1.execute(runnable);

            //executorService2.execute(runnable);

            //schedule(Runnable command,long delay, TimeUnit unit)创建并执行在给定延迟后启用的一次性操作
            //executorService3.schedule(runnable, 10000, TimeUnit.MILLISECONDS);

            //scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnitunit)
            //创建并执行一个在给定初始延迟后首次启用的定期操作，后续操作具有给定的周期；也就是将在 initialDelay 后开始执行，
            // 然后在initialDelay+period 后执行，接着在 initialDelay + 2 * period 后执行，依此类推
            //executorService3.scheduleAtFixedRate(runnable, 5000, 3000, TimeUnit.MILLISECONDS);

            //scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)
            //创建并执行一个在给定初始延迟后首次启用的定期操作，随后，在每一次执行终止和下一次执行开始之间都存在给定的延迟
            //executorService3.scheduleWithFixedDelay(runnable, 5000, 3000, TimeUnit.MILLISECONDS);

            executorService4.execute(runnable);
        }

        executorService1.shutdown();
        executorService2.shutdown();
        executorService3.shutdown();
        executorService4.shutdown();
    }

}
