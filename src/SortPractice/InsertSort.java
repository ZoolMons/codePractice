package SortPractice;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-16:2019
 * Des:插入排序
 */
public class InsertSort {
    public  static Integer[] InsertSort(Integer[] dataSource){
    //创建临时变量存储小的值
        int temp;
        //遍历第一层循环，分割有序和无序数组
        for (int i = 1;  i < dataSource.length ; i++){
            //如果无序数组的最后一个元素大于有序数组的最后一个元素，意味着需要插入
            temp = dataSource[i];
            if (temp < dataSource[i - 1]){
                //遍历有序数组找到应该插入的位置
                for (int j = i; j >= 0; j--){
                    if ( j>0 && dataSource[j-1] > temp) {
                        //向后移动
                        dataSource[j] = dataSource[j-1];
                    }else {
                        dataSource[j] = temp;
                        break;
                    }
                }
            }
        }
        return dataSource;
    }
}
