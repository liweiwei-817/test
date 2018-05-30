package fun.lww.test.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Create by liweiwei on 18/5/30
 * 自定义线程池测试
 */
public class CustomThreadPool {

    public static void main(String[] args) {

        //创建等待队列
        BlockingQueue<Runnable> bqueue = new ArrayBlockingQueue<>(20);
        Queue<Runnable> queue = new SynchronousQueue<Runnable>();

        //创建线程池，池中保存的线程数为3，允许的最大线程数为5
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,5,50, TimeUnit.MILLISECONDS,bqueue);
        System.out.println("核心线程数=" + pool.getCorePoolSize());

        //创建任务
        List<Runnable> list = new ArrayList<Runnable>();
        for (int i=0; i<25; i++) {
            Runnable runnable = new MyThread();
            list.add(runnable);
        }

        //每个任务会在一个线程上执行
        list.forEach(runnable -> pool.execute(runnable));

        //关闭线程池
        pool.shutdown();

    }

    static class MyThread implements Runnable{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + "正在执行。。。");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
