package ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-23:2019
 * Des:
 */
public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        test test1 = new test("测试线程1");
        test test2 = new test("测试线程2");
        test test3 = new test("测试线程3");
        executorService.execute(test1);
        executorService.execute(test2);
        executorService.execute(test3);
    }
}

class test implements Runnable{
    private String name;
    public test(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"开始运行");
    }
}
