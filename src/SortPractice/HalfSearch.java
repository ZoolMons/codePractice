package SortPractice;

import java.util.Random;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-23:2019
 * Des:折半查找
 */
public class HalfSearch {
    public static void main(String[] args) {
        Integer[] dataSouce = CommonAndMain.RamdomArray();
        dataSouce = BubbleSort.bubbleSort(dataSouce);
        Random random = new Random();
        Integer integer = random.nextInt(50);
        System.out.println(integer);
        System.out.println(halfFind(dataSouce,integer));
    }

    public static Boolean halfFind(Integer[] sortrdArray, Integer target){
        Integer high = sortrdArray.length-1;
        Integer low = 0;
        Integer middle = (high - low)/2 + low;
        while (middle > low && middle < high){
            if (target.equals(sortrdArray[middle])){
                return true;
            } else if (target < sortrdArray[middle]) {
                high = middle;
                middle = (high - low) / 2 +low;
            }else {
                low = middle;
                middle = (high - low) / 2 +low;
            }
        }
        return false;
    }
}
