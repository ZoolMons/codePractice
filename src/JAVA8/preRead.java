package JAVA8;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-27:2019
 * Des:
 */
public class preRead {
    public static void main(String[] args) {
        Integer[] Integer1 = new Integer[] {1,2,3,4,5,6,7,8};
        Integer[] Integer2 = new Integer[] {9,12,13,14,15,16,17,18};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(Integer1));
        priorityQueue.addAll(Arrays.asList(Integer2));
        Integer past = 0;
        Integer result =0;
        String a = "111111";
        String b = "2222222";
        Random random = new Random();
        int hu = random.nextInt(2);
        System.out.println(hu);
        while (past !=10) {
            result = priorityQueue.poll();
            priorityQueue.poll();
            past++;
        }
        System.out.println(result);
    }

}

