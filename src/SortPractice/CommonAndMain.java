package SortPractice;

import java.util.*;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-16
 * Copyright 2019 by Landray
 */
public class CommonAndMain {
    public static final Integer ROMDOMSIZE = 10;

    /**
     * 获取随机数组作为测试源
     * @return
     */
    public static Integer[] RamdomArray(){
        Integer[] ramdom = new Integer[ROMDOMSIZE];
        Random random = new Random();
        for (int i = 0; i< ROMDOMSIZE; i++){
            ramdom[i] = random.nextInt(ROMDOMSIZE);
        }
        return ramdom;
    }


    private static List sortMapLIst(List list){
        Collections.sort(list);
        return list;
    }

    /**
     * 尝试对象锁
     */
    private void test(){
        CommonAndMain commonAndMain = new CommonAndMain();
        synchronized (this){
            synchronized (commonAndMain){
            System.out.println("fuck you");
            }
        }
    }

    public static void main(String[] args) {
        Integer[] dataSources = CommonAndMain.RamdomArray();
        System.out.println("获取长度为10的随机数组：");
        Arrays.stream(dataSources).forEach(a -> {
            System.out.print(a + "  ");
        });
        System.out.println();
        System.out.println("经过排序后的有序数组：");
        dataSources = QuickSort.sort(dataSources);
        Arrays.stream(dataSources).forEach(a->{
            System.out.print(a + "  ");
        });
    }
}
