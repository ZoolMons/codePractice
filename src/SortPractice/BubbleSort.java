package SortPractice;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-16
 *
 */

/**
 * 思路：每次内循环把最大的数冒泡到最右边
 *  其中的flag用来优化，当一轮下来如果没有发生交换则代表已经排好序直接退出循环
 */
public class BubbleSort {
    public static Integer[] bubbleSort(Integer[] dataSources) {
        Integer temp;
        for(int i = 1; i < dataSources.length ; i++){
            boolean flag = true;
            for (int j = 0; j < dataSources.length -i ; j++){
                if (dataSources[j] > dataSources[j+1]){
                    temp = dataSources[j+1];
                    dataSources[j+1] = dataSources[j];
                    dataSources[j] = temp;
                    flag = false;
                }
                }
            if (flag) {
                break;
            }
        }
            return dataSources;
    }



}
