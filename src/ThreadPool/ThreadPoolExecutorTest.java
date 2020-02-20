package ThreadPool;

import java.io.IOException;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-16:2019
 * Des:测试学习threaPoolExcutor的一些基本操作
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException, IOException, ExecutionException {
        Object block  = new Object();

        int corePoolSize = 2;
        int maximumPoolSize = 4;
        long keepAliveTime = 10;
        //超时单位
        TimeUnit unit = TimeUnit.SECONDS;
        //线程等待队列
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(3);
        //线程创建工厂
        ThreadFactory threadFactory = new NameTreadFactory();
        //拒绝策略
        RejectedExecutionHandler handler = new MyIgnorePolicy();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit,
                workQueue, threadFactory, handler);
        // 预启动所有核心线程
        executor.prestartAllCoreThreads();
        for (int i = 1; i <= 10; i++) {
            MyTask task = new MyTask(String.valueOf(i));
            executor.execute(task);
        }

        //测试callable
        for (int i = 1; i <= 10; i++) {
           MyCall call = new MyCall(String.valueOf(i));
            FutureTask futureTask = new FutureTask(call);
            executor.submit(futureTask);
            System.out.println(futureTask.get());
        }


        System.in.read(); //阻塞主线程
    }

    static class NameTreadFactory implements ThreadFactory {

        private final AtomicInteger mThreadNum = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, "my-thread-" + mThreadNum.getAndIncrement());
            System.out.println(t.getName() + " has been created");
            return t;
        }
    }

    /**
     * 拒绝策略
     */
    public static class MyIgnorePolicy implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            doLog(r, executor);
        }

        private void doLog(Runnable r, ThreadPoolExecutor e) {
            // 可做日志记录等
            System.err.println( r.toString() + " rejected");
//          System.out.println("completedTaskCount: " + e.getCompletedTaskCount());
        }
    }


    /**
     * 包装的runable接口
     */
    static class MyTask implements Runnable {
        private String name;

        public MyTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(this.toString() + " is running!");
                Thread.sleep(3000); //让任务执行慢点
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "MyTask [name=" + name + "]";
        }
    }

    /**
     * 包装的callable接口
     */
    static class MyCall implements Callable{
        private  String name;

        public MyCall(String name) {
            this.name = name;
        }

        @Override
        public String call() throws Exception {
            return "hello task"+name+"is done.";
        }
    }
}
