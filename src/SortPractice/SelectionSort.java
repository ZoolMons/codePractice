package SortPractice;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-16:2019
 * Des:选择排序 每次固定把最大或者最小的数选出来放在最后
 */
public class SelectionSort {
    public static Integer[] selectionSort(Integer[] dataSources) {
        for (int i = 0; i < dataSources.length -1 ; i++) {
            //初始化最小指针的index
            int minIndex = i;
            int temp;
            for (int j = i+1; j < dataSources.length ; j++) {
                if (dataSources[j] < dataSources[minIndex]){
                    minIndex = j;
                }
            }
            //将当前i的指针和minIndex互换
            if (minIndex != i){
                temp = dataSources[i];
                dataSources[i] = dataSources[minIndex];
                dataSources[minIndex] = temp;
            }
        }
        return dataSources;
    }

}
