package fun.lww.test.a;

public class PriorityDemo {

    public static void main(String[] args) throws InterruptedException {
        PriorityTask priorityTask = new PriorityTask();

        Thread t1 = new Thread(priorityTask, "t1");
        Thread t2 = new Thread(priorityTask, "t2");
        Thread t3 = new Thread(priorityTask, "t3");
        t1.start();
        t2.start();
        t3.start();

    }
}

class PriorityTask implements Runnable {

    @Override
    public void run() {
        int[] str = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : str) {
            Thread.yield();
            System.out.println(Thread.currentThread()+"-----"+i);
        }
    }
}
